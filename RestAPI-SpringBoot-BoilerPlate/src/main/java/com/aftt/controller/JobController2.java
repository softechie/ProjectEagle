package com.aftt.controller;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.aftt.dao.JobDao2;
import com.aftt.dto.Job2;

@RestController
@RequestMapping( value = "/job2")
public class JobController2 {	
	
	//Service class implements the Business logic and interact with other services/DAO based on the requirement.
	@Autowired
	private JobDao2 jobDao2;
	
//	@RequestMapping(value = "/all", method = RequestMethod.GET)
//	public List<Employee> getEmployees(){
//		return testService.getEmployees();
//	}
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Job2> getJobs(){
		return jobDao2.getJobs();
	}
	
//	@RequestMapping(value = "/details" , method = RequestMethod.POST)
//	public Employee getEmployee(@RequestBody String id){
//		Employee responseObj = testService.getEmployee(id);
//		System.out.println("TestController.getEmployee()"+responseObj.toString());
//		return responseObj;
//	}
	
	@PostMapping(value = "/add")
    public List<Job2> addJobs(@RequestBody List<Job2> jobList) throws SQLException {
		jobDao2.addJobs(jobList);
		return this.getJobs();
    }
	
	@PostMapping(value = "/delete/all")
    public List<Job2> deleteAllJobs() throws SQLException {
		jobDao2.deleteAllJobs();
		return this.getJobs();
    }
	
}
