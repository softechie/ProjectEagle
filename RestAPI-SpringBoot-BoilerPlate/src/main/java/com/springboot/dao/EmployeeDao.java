package com.springboot.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.springboot.dto.Employee;

@Component
public class EmployeeDao  {
	
	/** Environment object that is created and managed as a bean by spring that allows the usage of data from application.properties */
	@Autowired
	private Environment env;
	private List<Employee> empList;
	
	public List<Employee> getAllEmployees(){
		empList = new ArrayList<>();
		try {
			//These details will be used to explicitly connect to the MongoDB, and they are found in src/main/resources/application.properties
			String mongoHost = env.getProperty("spring.data.mongodb.host");
			String mongoDBName = env.getProperty("spring.data.mongodb.database");
			Integer mongoPort = Integer.parseInt(env.getProperty("spring.data.mongodb.port"));
			
//			//If the MongoDB requires a username and password to login to access, use the MongoCredential object to feed into the MongoClient
//			String mongoUser = "testUsername";
//			char[] mongoPwd = "testPassword".toCharArray();
//			MongoCredential credential = MongoCredential.createCredential(mongoUser, mongoDBName, mongoPwd);
//			MongoClient client = new MongoClient(new ServerAddress(mongoHost, mongoPort), Arrays.asList(credential));
			
			//If we do not need to login for access, we will just create a Client with the name of the Host an the Port number
			MongoClient client = new MongoClient(new ServerAddress(mongoHost, mongoPort));
			
			//The MongoOperations will be used to interact with the Collection by creating queries and aggregates
			MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(client, mongoDBName));
			Query findAllOrderByEmpIdAsc = new Query();
			findAllOrderByEmpIdAsc.with(new Sort(Sort.Direction.ASC, "age"));
			empList = mongoOps.find(findAllOrderByEmpIdAsc, Employee.class);
		}
		catch (Exception e) {
			
		}
		return empList;
	}
}