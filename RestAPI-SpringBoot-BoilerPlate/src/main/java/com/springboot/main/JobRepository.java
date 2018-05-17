package com.springboot.main;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.dto.Job;

/** Inherited class from MongoRepository, automatically connects and queries the MongoDB
 * Uses dynamically created methods by MongoRepository that allows specific querying based on the naming of the methods
 * Additional documentation found here: https://docs.spring.io/spring-data/mongodb/docs/1.2.0.RELEASE/reference/html/mongo.repositories.html
 * @author aprieger */
public interface JobRepository extends MongoRepository<Job, String> {

	public List<Job> findAll();
	public Job findByRef(String ref);
	public Job findById(String id);
}