/**
 * 
 */
package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.EmployeeDao;
import com.springboot.dto.Employee;

@RestController
@RequestMapping( value = "/employee")
public class EmployeeController {	
	
	/**EmployeeDao object created and mangaged as a bean by Spring Boot to query the Employee MongoDB Collection */
	@Autowired
	EmployeeDao empDao;	
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return empDao.getAllEmployees();
	}
	
//	@RequestMapping(value = "/details" , method = RequestMethod.POST)
//	public Employee getEmployee(@RequestBody String id){
//		Employee responseObj = testService.getEmployee(id);
//		System.out.println("TestController.getEmployee()"+responseObj.toString());
//		return responseObj;
//	}
	
//	@PostMapping(value = "/emp")
//    public ResponseEntity<Void> addEmployee(@RequestBody Employee emp) throws SQLException {
//				 
//		if (emp == null)
//			return ResponseEntity.noContent().build();
//		
//		testService.saveEmployee(emp);
//		
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
//				"/{empId}").buildAndExpand(emp.getEmpId()).toUri();
//
//		return ResponseEntity.created(location).build();
//		
//   }
}
