package com.aftt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aftt.dto.Job2;
import com.aftt.main.JobRepository2;

@Component
public class JobDao2  {

	@Autowired
	private JobRepository2 repository;
	
	List<Job2> jobList = new ArrayList<Job2>();
	
	public List<Job2> getJobs(){
		final long startTime = System.currentTimeMillis();

		jobList = new ArrayList<Job2>();
				
		for (Job2 job : repository.findAll()) {
			addJobToArray(job);
		}
		
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		
		return jobList;
	}
	
	private void addJobToArray(Job2 job) {
		job = repository.findById(job.getId());
		if (job.getDependencies().size()==0) {
			if (job.getState()==0) {
				job.setState(1);
				jobList.add(job);
				repository.save(job);
			}
		}
		else {
			if (job.getState()==0) {
				for (int i=0; i < job.getDependencies().size(); i++) {
					//Job2 job2Add = repository.findByRef(new JSONObject(job.getDependencies().get(i)).getJSONObject("ref").toString());
					JSONArray depArry = job.getDependencies();
					HashMap<String, String> dep = (HashMap<String, String>) depArry.get(i);
					Job2 job2Add = repository.findByRef(dep.get("ref"));
					addJobToArray(job2Add);
				}
				job.setState(1);
				jobList.add(job);
				repository.save(job);
			}
		}
	}
	
	public void addJobs(List<Job2> jobList) {
		repository.insert(jobList);
	}
	public void deleteAllJobs() {
		repository.deleteAll();
	}
}