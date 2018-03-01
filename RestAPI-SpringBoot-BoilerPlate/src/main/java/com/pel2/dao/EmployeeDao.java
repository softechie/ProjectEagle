package com.pel2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pel2.dto.Employee;
import com.pel2.main.EmployeeRepository;

@Component
public class EmployeeDao  {

	@Autowired
	private EmployeeRepository repository;
	
	List<Employee> empList = new ArrayList<Employee>();
	
	public List<Employee> getEmployees(){
		empList = new ArrayList<Employee>();
		
		for (Employee emp : repository.findAll()) {
			empList.add(emp);
		}
		return empList;
	}

}