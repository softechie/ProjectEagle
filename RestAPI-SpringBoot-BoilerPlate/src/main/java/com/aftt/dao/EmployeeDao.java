package com.aftt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aftt.dto.Employee;
import com.aftt.main.EmployeeRepository;

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