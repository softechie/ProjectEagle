package com.pel2.main;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.pel2.dto.Employee;


public interface EmployeeRepository extends MongoRepository<Employee, String> {

	public List<Employee> findAll();

}