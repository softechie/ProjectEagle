package com.pel2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pel2.dto.Employee;

/**
 * @author mbaransln
 * This class is simulator of Employee Dao to get the hard coded data.
 * Once DB is up and employee data available, use Employee Dao class to load the data from DB.
 */
@Component
public class TestDataSimulator  {
		
	List<Employee> emp = new ArrayList<Employee>();
	
	public Employee getEmployee(String id) {	
            System.out.println("TestDataSimulator.getEmployee(id):: id recieved ="+id);
            Employee employee = null;
            if (emp != null) {			
                    for (int i=0;i<emp.size();i++) {
                            Employee iteratorObj = emp.get(i);
                            if (iteratorObj.getEmpId().equals(id)) {
                                    employee = iteratorObj;
                                    break;
                            }
                    }
                    return employee;
            } else			
                    return null;
	}
	
    public List<Employee> getEmployees(){		
        Employee employee1 = new Employee();
    	employee1.setEmpId("5000");
    	employee1.setName("Hunk Lawrence");    	
    	emp.add(employee1);
    	
	Employee employee2 = new Employee();
    	employee2.setEmpId("2000");
    	employee2.setName("Keith Bell");    	
    	emp.add(employee2);
    	
    	Employee employee3 = new Employee();
    	employee3.setEmpId("10000");
    	employee3.setName("John Miller");        
    	emp.add(employee3);
        return emp;
	} 

}