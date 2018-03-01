package com.pel2.main;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pel2.dto.Job;

public interface JobRepository extends MongoRepository<Job, String> {

	public List<Job> findAll();

}