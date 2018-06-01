package com.springboot.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.springboot.dto.Employee;

/** DAO class that connects to the MongoDB and makes queries to the Employee collection 
 * @author aprieger 
 * @Component -- indicates this class is a Spring component.
 * */
@Component
public class EmployeeDao  {
	
	/** Environment object that is created and managed as a bean by spring that allows the usage of data from application.properties 
	 *  @Autowired -- this annotation can be used on field, constructor, or setter method, and will inject object
	 *  dependency implicitly. 
	 * */
	@Autowired
	private Environment env;
	
	/** LOG object to log info and errors to from the system */
	private static Logger log = LoggerFactory.getLogger(EmployeeDao.class);

	/** Method to connect to the MongoDB manually, then get all the employees sorted by EmpId Ascending
	 * @return sorted list of Employees from the MongoDB */
	public List<Employee> getAllEmployees(){
		List<Employee> empList = new ArrayList<>();
		//These details will be used to explicitly connect to the MongoDB, and they are found in src/main/resources/application.properties
		log.info("Connecting to the MongoDB...");
		String mongoHost = env.getProperty("spring.data.mongodb.host");
		String mongoDBName = env.getProperty("spring.data.mongodb.database");
		Integer mongoPort = Integer.parseInt(env.getProperty("spring.data.mongodb.port"));
		
		/**	//If the MongoDB requires a username and password to login to access, use the MongoCredential object to feed into the MongoClient
			String mongoUser = "testUsername";
			char[] mongoPwd = "testPassword".toCharArray();
			MongoCredential credential = MongoCredential.createCredential(mongoUser, mongoDBName, mongoPwd);
			MongoClient client = new MongoClient(new ServerAddress(mongoHost, mongoPort), Arrays.asList(credential)); */
		
		//If we do not need to login for access, we will just create a Client with the name of the Host an the Port number
		try (MongoClient client = new MongoClient(new ServerAddress(mongoHost, mongoPort))) {
			log.info("Connection Successful.");
			//The MongoOperations will be used to interact with the Collection by creating queries and aggregates
			MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(client, mongoDBName));
			log.info("Querying the MongoDB...");
			Query findAllOrderByEmpIdAsc = new Query();
			findAllOrderByEmpIdAsc.with(new Sort(Sort.Direction.ASC, "age"));
			empList = mongoOps.find(findAllOrderByEmpIdAsc, Employee.class);
			log.info("Query Complete, Results Count: %d", empList.size());
		}
		catch (Exception e) {
			log.error("Error: %s", Arrays.toString(e.getStackTrace()));
		}
		return empList;
	}
}