package com.pel2.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.pel2.dto.Job;
import com.pel2.main.JobRepository;

@Component
public class JobDao  {

	@Autowired
	private JobRepository repository;
	
	List<Job> jobList = new ArrayList<Job>();
	
	public List<Job> getJobs(){
		jobList = new ArrayList<Job>();
		
		for (Job job : repository.findAll()) {
			jobList.add(job);
		}
		return jobList;
	}
}