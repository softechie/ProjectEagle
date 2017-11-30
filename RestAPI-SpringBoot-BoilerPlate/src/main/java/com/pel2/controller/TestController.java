/**
 * 
 */
package com.pel2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pel2.dto.Employee;
import com.pel2.service.TestService;

/**
 * @author mbaransln
 * Below is the test Controller to create other controller classes based on your requirements.
 *
 */
@RestController
@RequestMapping( value = "/employee")
public class TestController {	
	
	//Service class implements the Business logic and interact with other services/DAO based on the requirement.
	@Autowired
	TestService testService;	
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Employee> getEmployees(){
		return testService.getEmployees();
	}
	
	@RequestMapping(value = "/details" , method = RequestMethod.POST)
	public Employee getEmployee(@RequestBody String id){
		return testService.getEmployee(id);
	}
	

	
}
