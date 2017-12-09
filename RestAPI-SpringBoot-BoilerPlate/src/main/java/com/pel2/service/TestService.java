package com.pel2.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pel2.dao.TestDataSimulator;
import com.pel2.dto.Employee;

/**
 * @author mbaransln
 * Add the business logic in this class if any and give a call to other services.
 */
@Service
public class TestService {
	
	/**
	 * Once DB is up and employee data available, use Employee Dao class to get the data from DB.
	 */
	@Autowired
	TestDataSimulator employeeDao;

	/**
	 * Add the business logic if any for get Employees.
	 * @return
	 */
	public List<Employee> getEmployees() {
		return employeeDao.getEmployees();
	}

	public Employee getEmployee(String id) {
		return employeeDao.getEmployee(id);
	}
	
	 
	public void saveEmployee(Employee emp) throws SQLException {
	      employeeDao.saveEmployee(emp);
	}
}
