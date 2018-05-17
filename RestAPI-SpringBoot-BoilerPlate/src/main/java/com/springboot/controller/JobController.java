package com.springboot.controller;

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

import com.springboot.dao.JobDao;
import com.springboot.dto.Job;

@RestController
@RequestMapping( value = "/jobs")
public class JobController {	
	
	@Autowired
	private JobDao jobDao2;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Job> getJobs(){
		return jobDao2.getJobs();
	}
	
//	@RequestMapping(value = "/details" , method = RequestMethod.POST)
//	public Employee getEmployee(@RequestBody String id){
//		Employee responseObj = testService.getEmployee(id);
//		System.out.println("TestController.getEmployee()"+responseObj.toString());
//		return responseObj;
//	}
	
	@PostMapping(value = "/add")
    public List<Job> addJobs(@RequestBody List<Job> jobList) throws SQLException {
		jobDao2.addJobs(jobList);
		return this.getJobs();
    }
	
	@PostMapping(value = "/delete/all")
    public List<Job> deleteAllJobs() throws SQLException {
		jobDao2.deleteAllJobs();
		return this.getJobs();
    }
	
}
