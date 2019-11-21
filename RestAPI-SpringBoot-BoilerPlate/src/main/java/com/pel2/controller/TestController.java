/**
 * 
 */
package com.pel2.controller;

//import java.net.URI;
import java.sql.SQLException;

//import com.pel2.dao.impl.hibernate.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pel2.dto.Employee;
import com.pel2.dto.Skill;
import com.pel2.service.TestService;

//import io.vertx.core.json.JsonObject;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author mbaransln Below is the test Controller to create other controller
 *         classes based on your requirements.
 *
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/employee")

public class TestController {

//    @Autowired
//    private EmployeeRepository employeeRepository;
	
	// Service class implements the Business logic and interact with other
	// services/DAO based on the requirement.
	@Autowired
	TestService testService;

	// To get the details of all records
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public Iterable<Employee> getEmployees() {
		return testService.getEmployees();
	}

	// To get the details of one record
	@RequestMapping(value = "/details", method = RequestMethod.POST)
	public Employee getEmployee(@RequestBody String id) {
		Employee responseObj = testService.getEmployee(id);
		System.out.println("TestController.getEmployee()" + responseObj.toString());
		return responseObj;
	}

	/*
	 * @PostMapping(value = "/emp") public ResponseEntity<Void>
	 * addEmployee(@RequestBody Employee emp) throws SQLException {
	 * 
	 * if (emp == null) return ResponseEntity.noContent().build();
	 * 
	 * testService.saveEmployee(emp);
	 * 
	 * URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
	 * "/{empId}").buildAndExpand(emp.getEmpId()).toUri();
	 * 
	 * return ResponseEntity.created(location).build();
	 * 
	 * }
	 */

	@RequestMapping(value = "/skills", method = RequestMethod.GET)
	public List<Skill> getSkills() {
		return (List<Skill>) testService.getSkills();
	}

	// To insert only one record
	@PostMapping(value = "/emp")
	public int addEmployee(@RequestBody Employee emp) throws SQLException, ParseException {
		return testService.saveEmployee(emp);
	}

	// To insert multiple records at once
	@PostMapping(value = "/addall")
	public String addallEmployee(@RequestBody Employee[] emp) throws SQLException, ParseException {

		List<Integer> generatedId = new ArrayList<>();
		// For each loop
		for (Employee e : emp) {

			generatedId.add(testService.saveEmployee(e));
		}

		return generatedId.toString();
	}

	// To update the record
	@PostMapping(value = "/update")
	public boolean updateEmployee(@RequestBody Employee emp) throws SQLException, ParseException {
		return testService.updateEmployee(emp);
	}

	// To delete the record
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public boolean delEmployee(@RequestBody String id) throws SQLException {
		// Parse id string.
		id = id.replaceAll("%22", "").replaceAll("=", "");
		return testService.deleteEmployee(id);
	}

	// To delete all records
	@RequestMapping(value = "/deleteall", method = RequestMethod.POST)
	public boolean delAllEmployees() {
		return testService.delAllEmployees();
	}

}
