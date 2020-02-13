package com.pel2.dao.impl;

import com.pel2.dao.EmployeeDao;
import com.pel2.dto.Employee;
import com.pel2.encryption.AES;
import enums.EnumIsRelocate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

//Made service to make sure that EmployeeDao uses this implementation in @Autowires
@Component
//@Service
public class EmployeeDAOImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Value("${spring.datasource.platform}")
	private String platform;

	private static final String secretKey = "pR0!3c7-3@g13";

	public Employee getEmployee(String id) {
		String sql = "Select EMPID, NAME,STATUS,TENURE,PHONE,EMAIL,JOINING_DATE,"
				+ "WORKLOC,CURRENTLOC,HOMELOC,ISRELOCATE,ROLEID,VERTICALID,ACCOUNTID"
				+ " from employee where EMPID = ?";

		return jdbcTemplate.queryForObject(sql, employeeMapper, new Integer(id));
	}

	public List<Employee> getEmployees() {
		String sql = "Select EMPID, NAME,STATUS,TENURE,PHONE,EMAIL,JOINING_DATE,WORKLOC,"
				+ "CURRENTLOC,HOMELOC,ISRELOCATE,ROLEID,VERTICALID,ACCOUNTID from employee";

		return jdbcTemplate.query(sql, employeeMapper);
	}

	private static final RowMapper<Employee> employeeMapper = new RowMapper<Employee>() {
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee employee = new Employee();
			employee.setEmpId(rs.getString("EMPID"));
			employee.setName(AES.decrypt(rs.getString("NAME"), secretKey));
			employee.setStatus(rs.getString("STATUS"));
			employee.setTenure(rs.getString("TENURE"));
			employee.setPhone(rs.getString("PHONE") != null ? AES.decrypt(rs.getString("PHONE"), secretKey) : null);
			employee.setEmail(rs.getString("EMAIL") != null ? AES.decrypt(rs.getString("EMAIL"), secretKey) : null);
			employee.setDoj(rs.getString("JOINING_DATE"));
			employee.setWl(rs.getString("WORKLOC") != null ? AES.decrypt(rs.getString("WORKLOC"), secretKey) : null);
			employee.setCl(
					rs.getString("CURRENTLOC") != null ? AES.decrypt(rs.getString("CURRENTLOC"), secretKey) : null);
			employee.setHl(rs.getString("HOMELOC") != null ? AES.decrypt(rs.getString("HOMELOC"), secretKey) : null);
			employee.setRmid(rs.getString("ISRELOCATE"));
			employee.setRoleid(rs.getString("ROLEID"));
			employee.setVertid(rs.getString("VERTICALID"));
			employee.setAcctid(rs.getString("ACCOUNTID"));
			return employee;
		}
	};

	public int saveEmployee(final Employee employee) throws SQLException, ParseException {
		System.out.println("Query employees: platform->" + platform);
		Integer generatedId = null;
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		/*
		 * String sql = "INSERT into employee(NAME,STATUS,TENURE,PHONE," +
		 * "EMAIL,JOINING_DATE,WORKLOC,CURRENTLOC,HOMELOC,ISRELOCATE," +
		 * "ROLEID,VERTICALID,ACCOUNTID) VALUES (?, CAST(? as STATUS)," +
		 * " ?, ?, ?, ?, ?, ?, ?, CAST(? as ISRELOCATE), ?, ?, ?)";
		 */

		String sql = "INSERT into employee(NAME,STATUS,TENURE,PHONE,"
				+ "EMAIL,JOINING_DATE,WORKLOC,CURRENTLOC,HOMELOC,ISRELOCATE,"
				+ "ROLEID,VERTICALID,ACCOUNTID) VALUES (?,?," + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		Connection connection = jdbcTemplate.getDataSource().getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		preparedStatement.setString(1, employee.getName() != null ? AES.encrypt(employee.getName(), secretKey) : null);
		preparedStatement.setString(2, Enum.valueOf(EnumIsRelocate.class, employee.getStatus()).toString());
		preparedStatement.setInt(3, new Integer(employee.getTenure()));
		preparedStatement.setString(4,
				employee.getPhone() != null ? AES.encrypt(employee.getPhone(), secretKey) : null);
		preparedStatement.setString(5,
				employee.getEmail() != null ? AES.encrypt(employee.getEmail(), secretKey) : null);
		if (employee.getDoj() != null)
			preparedStatement.setDate(6, new java.sql.Date(formatter.parse(employee.getDoj()).getTime()));
		else
			preparedStatement.setNull(6, java.sql.Types.DATE);
		preparedStatement.setString(7, employee.getWl() != null ? AES.encrypt(employee.getWl(), secretKey) : null);
		preparedStatement.setString(8, employee.getCl() != null ? AES.encrypt(employee.getCl(), secretKey) : null);
		preparedStatement.setString(9, employee.getHl() != null ? AES.encrypt(employee.getHl(), secretKey) : null);
		preparedStatement.setString(10, Enum.valueOf(EnumIsRelocate.class, employee.getRmid()).toString());
		if (employee.getRoleid() != null)
			preparedStatement.setInt(11, new Integer(employee.getRoleid()));
		else
			preparedStatement.setNull(11, java.sql.Types.INTEGER);
		if (employee.getVertid() != null)
			preparedStatement.setInt(12, new Integer(employee.getVertid()));
		else
			preparedStatement.setNull(12, java.sql.Types.INTEGER);

		if (employee.getAcctid() != null)
			preparedStatement.setInt(13, new Integer(employee.getAcctid()));
		else
			preparedStatement.setNull(13, java.sql.Types.INTEGER);

		preparedStatement.executeUpdate();
		ResultSet keys = preparedStatement.getGeneratedKeys();

		if (keys.next())
			generatedId = keys.getInt(1); // id returned after insert execution

		 return generatedId;
	}

	
	public boolean updateEmployee(final Employee employee) throws SQLException, ParseException {
		/*
		 * String sql = "UPDATE employee SET NAME = ?, STATUS = CAST(? as STATUS), " +
		 * " TENURE = ?, PHONE = ?, EMAIL = ?, JOINING_DATE = ?, WORKLOC = ?, " +
		 * " CURRENTLOC = ?, HOMELOC = ?, ISRELOCATE = CAST(? AS ISRELOCATE)," +
		 * " ROLEID = ?, VERTICALID = ?, ACCOUNTID = ? WHERE EMPID = ?";
		 */

		String sql = "UPDATE employee SET  NAME = ?, STATUS = ?, "
				+ " TENURE = ?, PHONE = ?, EMAIL = ?, JOINING_DATE = ?, WORKLOC = ?, "
				+ " CURRENTLOC = ?, HOMELOC = ?, ISRELOCATE = ?,"
				+ " ROLEID = ?, VERTICALID = ?, ACCOUNTID = ? WHERE EMPID = ?";

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		int rows = jdbcTemplate.update(sql,
				new Object[] { employee.getName() != null ? AES.encrypt(employee.getName(), secretKey) : null,
						Enum.valueOf(EnumIsRelocate.class, employee.getStatus()).toString(),
						new Integer(employee.getTenure()),
						employee.getPhone() != null ? AES.encrypt(employee.getPhone(), secretKey) : null,
						AES.encrypt(employee.getEmail(), secretKey),
						employee.getDoj() != null ? new java.sql.Date(formatter.parse(employee.getDoj()).getTime())
								: null,
						employee.getWl() != null ? AES.encrypt(employee.getWl(), secretKey) : null,
						employee.getCl() != null ? AES.encrypt(employee.getCl(), secretKey) : null,
						employee.getHl() != null ? AES.encrypt(employee.getHl(), secretKey) : null,
						Enum.valueOf(EnumIsRelocate.class, employee.getRmid()).toString(),
						employee.getRoleid() != null ? new Integer(employee.getRoleid()) : null,
						employee.getVertid() != null ? new Integer(employee.getVertid()) : null,
						employee.getAcctid() != null ? new Integer(employee.getAcctid()) : null,
						new Integer(employee.getEmpId()) });

		return rows == 1;
	}

	public boolean deleteEmployee(String empid) throws SQLException {
		String query = "DELETE from employee where EMPID = ?";
		int rows = jdbcTemplate.update(query, new Object[] { new Integer(empid) });
		return rows == 1;
	}

	public boolean delAllEmployees() {
		String query = "DELETE from employee";
		int rows = jdbcTemplate.update(query);

		return true;

	}

	
}
