package com.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.EmployeeDao;
import com.springboot.dto.Employee;

/** Rest Controller to handle the requests for getting and posting of Employee data in the MongoDB 
 * @author aprieger 
 * @RestController -- Marks the class as a RestController
 * @RequestMapping -- When used at the class level, this annotation creates a base URI for the controller. RequestMapping
 * used at method level to perform different operations like a Dao request or gather information.
 * */
@RestController
@RequestMapping( value = "/employee")
public class EmployeeController {
	
	/* LOG object to log info and errors to the system */
	private static Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	/* EmployeeDao object created and managed as a bean by Spring Boot to query the Employee MongoDB Collection
	 * @Autowired -- this annotation can be used on field, constructor, or setter method, and will inject object
	 * dependency implicitly. 
	 * */
	@Autowired
	EmployeeDao empDao;	
	
	/** Maps the request to return all the Employees found in the MongoDB Collection 
	 * @return List of all Employees */
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		log.info("GET Request: /employee/all...");
		return empDao.getAllEmployees();
	}
}
