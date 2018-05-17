package com.springboot.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.dto.Job;
import com.springboot.main.JobRepository;

@Component
public class JobDao  {

	@Autowired
	private JobRepository repository;
	
	List<Job> jobList = new ArrayList<Job>();
	
	public List<Job> getJobs(){
		return repository.findAll();
	}
	
	public void addJobs(List<Job> jobList) {
		repository.insert(jobList);
	}
	public void deleteAllJobs() {
		repository.deleteAll();
	}
}