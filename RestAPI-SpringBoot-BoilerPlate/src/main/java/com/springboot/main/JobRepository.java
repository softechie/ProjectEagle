package com.springboot.main;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.dto.Job;

public interface JobRepository extends MongoRepository<Job, String> {

	public List<Job> findAll();
	public Job findByRef(String ref);
	public Job findById(String id);
}