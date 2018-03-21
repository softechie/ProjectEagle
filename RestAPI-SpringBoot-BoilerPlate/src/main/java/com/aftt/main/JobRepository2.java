package com.aftt.main;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.aftt.dto.Job2;

public interface JobRepository2 extends MongoRepository<Job2, String> {

	public List<Job2> findAll();
	public Job2 findByRef(String ref);
	public Job2 findById(String id);
}