package com.springboot.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.JobDao;
import com.springboot.dto.Job;

@RestController
@RequestMapping( value = "/jobs")
public class JobController {	
	
	@Autowired
	private JobDao jobDao;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Job> getJobs(){
		return jobDao.getJobs();
	}
	
	@PostMapping(value = "/add")
    public List<Job> addJobs(@RequestBody List<Job> jobList) throws SQLException {
		jobDao.addJobs(jobList);
		return this.getJobs();
    }
	
	@PostMapping(value = "/delete/all")
    public List<Job> deleteAllJobs() throws SQLException {
		jobDao.deleteAllJobs();
		return this.getJobs();
    }
}
