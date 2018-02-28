package com.pel2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.pel2.dto.Employee;
import com.pel2.main.EmployeeRepository;

@Component
public class EmployeeDao  {

	@Autowired
	private EmployeeRepository repository;
	
	List<Employee> empList = new ArrayList<Employee>();
	
	public List<Employee> getEmployees(){
		empList = new ArrayList<Employee>();
		
		for (Employee emp : repository.findAll()) {
			empList.add(emp);
		}
		return empList;
	}
	
//	@Autowired
//    private JdbcTemplate jdbcTemplate;
//
//	@Value("${spring.datasource.platform}")
//    private String platform;
//	
//		
//	
//	public Employee getEmployee(String id){
//		String sql = "Select EMPID, NAME,STATUS,TENURE,PHONE,EMAIL,JOINING_DATE,WORKLOC,CURRENTLOC,HOMELOC,ISRELOCATE,ROLEID,VERTICALID,ACCOUNTID from employee where EMPID = ?";
//		return jdbcTemplate.queryForObject(sql, employeeMapper, new Integer(id));
//	}
//	
//	public List<Employee> getEmployees(){
//		String sql = "Select EMPID, NAME,STATUS,TENURE,PHONE,EMAIL,JOINING_DATE,WORKLOC,CURRENTLOC,HOMELOC,ISRELOCATE,ROLEID,VERTICALID,ACCOUNTID from employee";
//		return jdbcTemplate.query(sql, employeeMapper);
//	}
//
//    private static final RowMapper<Employee> employeeMapper = new RowMapper<Employee>() {
//        public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//        	Employee employee = new Employee();
//        	employee.setEmpId(rs.getString("EMPID"));
//        	employee.setName(rs.getString("NAME"));
//        	employee.setStatus(rs.getString("STATUS"));
//        	employee.setTenure(rs.getString("TENURE"));
//        	employee.setPhone(rs.getString("PHONE"));
//        	employee.setEmail(rs.getString("EMAIL"));
//        	employee.setDoj(rs.getString("JOINING_DATE"));
//        	employee.setWl(rs.getString("WORKLOC"));
//        	employee.setCl(rs.getString("CURRENTLOC"));
//        	employee.setHl(rs.getString("HOMELOC"));
//        	employee.setRmid(rs.getString("ISRELOCATE"));
//        	employee.setRoleid(rs.getString("ROLEID"));
//        	employee.setVertid(rs.getString("VERTICALID"));
//        	employee.setAcctid(rs.getString("ACCOUNTID"));
//            return employee;
//        }
//    };
//	
//	
//	public void saveEmployee(final Employee employee) throws SQLException {
//		System.out.println("Query employees: platform->" + platform);
//		String sql = "INSERT into employee(EMPID, NAME,STATUS,TENURE,PHONE,EMAIL,JOINING_DATE,WORKLOC,CURRENTLOC,HOMELOC,ISRELOCATE,ROLEID,VERTICALID,ACCOUNTID) VALUES (? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//        jdbcTemplate.update(sql,new Object[] { employee.getEmpId(), employee.getName() , employee.getStatus(),employee.getTenure(),employee.getPhone(),employee.getEmail(),employee.getDoj(),employee.getWl(),employee.getCl(),employee.getHl(),employee.getRmid(),employee.getRoleid(),employee.getVertid(),employee.getAcctid() });
//    }
}