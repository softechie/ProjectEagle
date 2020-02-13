package com.pel2.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pel2.dao.TestDataSimulator;
import com.pel2.dao.impl.couchbase.AirportRepo;
import com.pel2.dao.EmployeeDao;
import com.pel2.dao.SkillDAO;
import com.pel2.dto.Airport;
import com.pel2.dto.Employee;
import java.text.ParseException;
import com.pel2.dto.Skill;
import org.springframework.stereotype.Component;

/**
 * @author softechie (Suresh V)
 * Service Class to add any business logic as required before the data is responded back to the Request
 */
@Service
public class LearnCouchbaseService {
	
	@Autowired
	AirportRepo airportDAO;

     
        public List<Airport> getAllAirports() {        	
        	List<Airport> results = airportDAO.findAll();	
    	    System.out.println("LearnCouchbaseController:getAllFromBucket() - Returned Results = "+results.toString());
            return results; 	
        }
	}

