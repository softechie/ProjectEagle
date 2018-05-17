package com.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.dto.Job;
import com.springboot.main.JobRepository;

/** DAO class that connects to the MongoDB and makes queries to the Job collection 
 * @author aprieger */
@Component
public class JobDao  {

	/** MongoRepository object that is created and managed as a bean by spring that connects and queries the MongoDB */
	@Autowired
	private JobRepository repository;
	
	/** Method to get all the Jobs using the MongoRepository
	 * @return list of Jobs from the MongoDB */
	public List<Job> getJobs(){
		return repository.findAll();
	}
	/** Method to add all the Jobs using the MongoRepository
	 * @param jobList List of jobs to add to the Collection*/
	public void addJobs(List<Job> jobList) {
		repository.insert(jobList);
	}
	/** Method to delete all the Jobs using the MongoRepository */
	public void deleteAllJobs() {
		repository.deleteAll();
	}
}