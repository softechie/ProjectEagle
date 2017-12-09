package com.pel2.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.pel2.dto.Employee;

/**
 * @author mbaransln
 * This is sample DAO class to fetch the employee details. 
 * Once DB is available and tables are created, we can uncomment the below code.
 * 
 */
@Component
public class EmployeeDao  {

	/*@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public Employee getEmployee(String id){
		String sql = "Select id, name, age from employee where id = ?";
		return jdbcTemplate.queryForObject(sql, employeeMapper, new Integer(id));
	}
	
	public List<Employee> getEmployees(){
		String sql = "Select id, name, age from employee";
		return jdbcTemplate.query(sql, employeeMapper);
	}

    private static final RowMapper<Employee> employeeMapper = new RowMapper<Employee>() {
        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        	Employee employee = new Employee();
        	employee.setEmpId(rs.getString("id"));
        	employee.setName(rs.getString("name"));
            return employee;
        }
    };*/
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Value("${spring.datasource.platform}")
    private String platform;
	
		
	public void saveEmployee(final Employee employee) throws SQLException {
		System.out.println("Query employees: platform->" + platform);
		String sql = "INSERT into employee(EMPID, NAME,STATUS,TENURE,PHONE,EMAIL,JOINING_DATE,WORKLOC,CURRENTLOC,HOMELOC,ISRELOCATE,ROLEID,VERTICALID,ACCOUNTID) VALUES (? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        //jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(sql,new Object[] { employee.getEmpId(), employee.getName() , employee.getStatus(),employee.getTenure(),employee.getPhone(),employee.getEmail(),employee.getDoj(),employee.getWl(),employee.getCl(),employee.getHl(),employee.getRmid(),employee.getRoleid(),employee.getVertid(),employee.getAcctid() });
    }
}