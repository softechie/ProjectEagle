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
		final long startTime = System.currentTimeMillis();

		jobList = new ArrayList<Job>();
		
		for (Job job : repository.findAll()) {
			this.addJob(job);
		}
		
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		
		return jobList;
	}
	
	private void addJob(Job job) {
		if (job.getDependencies().length==0)
			jobList.add(job);
		else {
			for (int i=0; i < job.getDependencies().length; i++)
				this.addJob(job.getDependencies()[i]);
			jobList.add(job);
		}
	}
}