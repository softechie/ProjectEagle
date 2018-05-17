package com.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.dto.Job;
import com.springboot.main.JobRepository;

@Component
public class JobDao  {

	@Autowired
	private JobRepository repository;
	
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