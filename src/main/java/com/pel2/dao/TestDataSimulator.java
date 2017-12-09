package com.pel2.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pel2.dto.Employee;

/**
 * @author mbaransln
 * This class is simulator of Employee Dao to get the hard coded data.
 * Once DB is up and employee data available, use Employee Dao class to load the data from DB.
 */
@Component
public class TestDataSimulator  {
	
	@Autowired
	EmployeeDao employeeDaoImpl;
	
	public Employee getEmployee(String id){
		Employee employee = new Employee();
    	employee.setEmpId("10000");
    	employee.setName("Jhon Miller");
        return employee;
	}
	
	public List<Employee> getEmployees(){
		
		List<Employee> emp = new ArrayList<Employee>();
		Employee employee1 = new Employee();
    	employee1.setEmpId("5000");
    	employee1.setName("Hunk Luner");
    	
    	emp.add(employee1);
    	
		Employee employee2 = new Employee();
    	employee2.setEmpId("2000");
    	employee2.setName("Kethie Bell");
    	
    	emp.add(employee2);
    	
        return emp;
	}

	public void saveEmployee(Employee emp) throws SQLException {
		employeeDaoImpl.saveEmployee(emp);
	}
}