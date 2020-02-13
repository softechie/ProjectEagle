package com.pel2.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pel2.dao.TestDataSimulator;
import com.pel2.dao.EmployeeDao;
import com.pel2.dao.SkillDAO;
import com.pel2.dto.Employee;
import java.text.ParseException;
import com.pel2.dto.Skill;
import org.springframework.stereotype.Component;

/**
 * @author mbaransln Add the business logic in this class if any and give a call
 *         to other services.
 */
@Service
public class TestService {

	/**
	 * Once Database is available, uncomment EmployeeDao class reference to get the
	 * data from DB. Currently it is retrieving the data from the simulator class
	 * "TestDataSimulator"
	 */
//	@Autowired
	// TestDataSimulator employeeDao;
	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	SkillDAO skillDAO;

	/**
	 * Add the business logic if any for get Employees.
	 * 
	 * @return
	 */
	public Iterable<Employee> getEmployees() {
		return employeeDao.getEmployees();
	}

	public Employee getEmployee(String id) {
		return employeeDao.getEmployee(id);
	}

	public int saveEmployee(Employee emp) throws SQLException, ParseException {
		/* Need to implement this in simulator */
		return employeeDao.saveEmployee(emp);
	}

	public boolean deleteEmployee(String id) throws SQLException {
		return employeeDao.deleteEmployee(id);
	}

	public boolean updateEmployee(Employee emp) throws SQLException, ParseException {
		return employeeDao.updateEmployee(emp);
	}

	public boolean delAllEmployees() {
		return employeeDao.delAllEmployees();
	}

	/*
	 * public int addAllEmployee(Employee emp) throws SQLException, ParseException{
	 * return employeeDao.addAllEmployee(emp); }
	 */

	public List<Skill> getSkills() {
		// return (List<Skill>) skillRepo.findAll();
		return skillDAO.getAllSkills();
	}

}
