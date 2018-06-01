package com.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dao.JobDao;
import com.springboot.dto.Job;

/** Rest Controller to handle the requests for getting and posting of Job data in the MongoDB 
 * @author aprieger 
 * @RestController -- Marks the class as a RestController
 * @RequestMapping -- When used at the class level, this annotation creates a base URI for the controller. RequestMapping
 * used at method level to perform different operations like a Dao request or gather information.
 * */
@RestController
@RequestMapping( value = "/jobs")
public class JobController {	
	
	/** LOG object to log info and errors to from the system */
	private static Logger log = LoggerFactory.getLogger(JobController.class);
	
	/** JobDao object created and managed as a bean by Spring Boot to query the Job MongoDB Collection 
	 *  @Autowired -- this annotation can be used on field, constructor, or setter method, and will inject object
	 *  dependency implicitly. 
	 * */
	@Autowired
	private JobDao jobDao;

	/** Maps the request to return all the Employees found in the MongoDB Collection 
	 * @return List of all Jobs*/
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Job> getJobs(){
		log.info("GET Request: /jobs/all...");
		return jobDao.getJobs();
	}
	
	/** Maps the POST request to add new Employees to the MongoDB Collection 
	 * @param List of new Jobs
	 * @return List of all Jobs*/
	@PostMapping(value = "/add")
    public List<Job> addJobs(@RequestBody List<Job> jobList){
		log.info("POST Request: /jobs/add...");
		jobDao.addJobs(jobList);
		return this.getJobs();
    }
	
	/** Maps the POST request to delete new Employees to the MongoDB Collection 
	 * @return List of all Jobs*/
	@PostMapping(value = "/delete/all")
    public List<Job> deleteAllJobs(){
		log.info("POST Request: /jobs/delete/all...");
		jobDao.deleteAllJobs();
		return this.getJobs();
    }
	
	/** Maps the POST request to delete new Employees to the MongoDB Collection 
	 * @return List of all Jobs*/
	@PostMapping(value = "/delete/single")
    public List<Job> deleteSingleJob(@RequestBody Job job){
		log.info("POST Request: /jobs/delete/single...");
		jobDao.deleteSingleJob(job);
		return this.getJobs();
    }
	
	@PostMapping(value = "/edit")
	public List<Job> editJob(@RequestBody Job job) {
		log.info("POST Request: /jobs/edit..");
		jobDao.editJob(job);
		return this.getJobs();
	}
}
