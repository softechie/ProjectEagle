package com.aftt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Component;

import com.aftt.dto.Employee;
import com.aftt.main.EmployeeRepository;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

@Component
public class EmployeeDao  {

	@Autowired
	private EmployeeRepository repository;
	@Autowired
	private Environment env;
	
	List<Employee> empList = new ArrayList<Employee>();
	
	public List<Employee> getEmployees(){
		empList = new ArrayList<Employee>();
		String host = env.getProperty("spring.data.mongodb.host");
		String dbName = env.getProperty("spring.data.mongodb.database");
		Integer port = Integer.parseInt(env.getProperty("spring.data.mongodb.port"));
		
		for (Employee emp : repository.findAllByOrderByEmpIdAsc()) {
			empList.add(emp);
		}
//		MongoClient client = new MongoClient(new ServerAddress(host, port));
//		MongoOperations mongoOps = new MongoTemplate(new SimpleMongoDbFactory(client, dbName));
//		empList = mongoOps.findAll(Employee.class);
		
		return empList;
	}

}