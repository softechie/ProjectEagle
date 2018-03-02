package com.pel2.dao;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.pel2.dto.Job2;
import com.pel2.main.JobRepository2;

@Component
public class JobDao2  {

	@Autowired
	private JobRepository2 repository;
	
	List<Job2> jobList = new ArrayList<Job2>();
	
	public List<Job2> getJobs(){
		final long startTime = System.currentTimeMillis();

		jobList = new ArrayList<Job2>();
				
		for (Job2 job : repository.findAll()) {
			addJob(job);
		}
		
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		
		for (Job2 job : repository.findAll()) {
			job.setState(0);
			repository.save(job);
		}
		
		return jobList;
	}
	
	private void addJob(Job2 job) {
		job = repository.findById(job.getId());
		if (job.getDependencies().length==0) {
			if (job.getState()==0) {
				job.setState(1);
				jobList.add(job);
				repository.save(job);
			}
		}
		else {
			if (job.getState()==0) {
				for (int i=0; i < job.getDependencies().length; i++) {
					Job2 job2Add = repository.findByRef(new JSONObject(job.getDependencies()[i]).getString("ref"));
						addJob(job2Add);
				}
				job.setState(1);
				jobList.add(job);
				repository.save(job);
			}
		}
	}
}