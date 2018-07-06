package com.springboot.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.WriteResult;
import com.springboot.dto.Job;
import com.springboot.main.JobRepository;

/** DAO class that connects to the MongoDB and makes queries to the Job collection 
 * @author aprieger 
 * @Component -- indicates this class is a Spring component.
 * */
@Component
public class JobDao  {

	/* MongoRepository object that is created and managed as a bean by spring that connects and queries the MongoDB 
	 *  @Autowired -- this annotation can be used on field, constructor, or setter method, and will inject object
	 *  dependency implicitly. */
	@Autowired
	private JobRepository repository;
	/* LOG object to log info and errors to from the system */
	private static Logger log = LoggerFactory.getLogger(JobDao.class);
	/* Environment object that is created and managed as a bean by spring that allows the usage of data from application.properties */
	@Autowired
	private Environment env;
	
	/** Method to get all the Jobs using the MongoRepository
	 * @return list of Jobs from the MongoDB */
	public List<Job> getJobs(){
		return repository.findAll();
	}
	/** Method to add all the Jobs using the MongoRepository
	 * @param jobList List of jobs to add to the Collection*/
	public void addJobs(List<Job> jobList) {
		repository.insert(jobList);
	}
	/** Method to delete all the Jobs using the MongoRepository */
	public void deleteAllJobs() {
		repository.deleteAll();
	}
	/** Method to delete a single Job*/
	public void deleteSingleJob(Job job) {
		log.info("Connecting to the MongoDB...");
		String mongoHost = env.getProperty("spring.data.mongodb.host");
		String mongoDBName = env.getProperty("spring.data.mongodb.database");
		Integer mongoPort = Integer.parseInt(env.getProperty("spring.data.mongodb.port"));
		
		try (MongoClient client = new MongoClient(new ServerAddress(mongoHost, mongoPort))) {
			log.info("Connection Successful.");
			MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(client, mongoDBName));
			log.info("Querying the MongoDB...");
			Query query = new Query();
			query.addCriteria(Criteria.where("name").is(job.getName()));
			Job jobToDelete = mongoOps.findOne(query, Job.class);
			log.info("Querying the MongoRepository to delete a single job: %s", job);
			WriteResult writeResult = mongoOps.remove(jobToDelete);
			log.info("Result of deleting a single job: %s", writeResult);
		}
		catch (Exception e) {
			log.error("Error: %s", Arrays.toString(e.getStackTrace()));
		}
	}
	
	public void editJob(Job job) {
		log.info("Connecting to the MongoDB...");
		String mongoHost = env.getProperty("spring.data.mongodb.host");
		String mongoDBName = env.getProperty("spring.data.mongodb.database");
		Integer mongoPort = Integer.parseInt(env.getProperty("spring.data.mongodb.port"));
		
		try (MongoClient client = new MongoClient(new ServerAddress(mongoHost, mongoPort))) {
			log.info("Connection Successful.");
			MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(client, mongoDBName));
			Query query = new Query();
			query.addCriteria(Criteria.where("name").is(job.getName()));
			Update update = new Update();
			update.set("category", job.getCategory());
			update.set("name", job.getName());
			update.set("ref", job.getRef());
			update.set("status", job.getStatus());
			update.set("scheduled", job.getScheduled());
			update.set("dependencies", job.getDependencies());
			
			log.info("Querying the MongoRepository to edit a single job: %s", job);
			WriteResult writeResult = mongoOps.updateFirst(query, update, Job.class);
			log.info("Result of editing a single job: %s", writeResult);
		}
		catch (Exception e) {
			log.error("Error: %s", Arrays.toString(e.getStackTrace()));
		}
	}
	
	public List<Job> parseJobs(String input) {
		ArrayList<Job> newJobList = new ArrayList<>();

        String line = "";
        String delimiter = ",";
        Reader inputReader = new StringReader(input);
        
        try (BufferedReader br = new BufferedReader(inputReader)) {
            while ((line = br.readLine()) != null) {
                String[] job = line.split(delimiter);
                newJobList.add(new Job("", job[0], job[1], job[2], job[3], job[4], null));
                if (job[0].isEmpty()) {
                	System.out.println(job[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return newJobList;
	}
}