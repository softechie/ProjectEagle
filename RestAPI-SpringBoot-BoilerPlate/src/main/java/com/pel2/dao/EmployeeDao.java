package com.pel2.dao;

import org.springframework.stereotype.Component;

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
}