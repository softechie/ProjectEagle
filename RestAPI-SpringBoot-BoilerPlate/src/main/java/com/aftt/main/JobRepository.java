package com.aftt.main;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.aftt.dto.Job;

public interface JobRepository extends MongoRepository<Job, String> {

	public List<Job> findAll();

}