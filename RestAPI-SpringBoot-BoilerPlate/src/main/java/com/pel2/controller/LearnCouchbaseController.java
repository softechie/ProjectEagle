/**
 * 
 */
package com.pel2.controller;

//import java.net.URI;
import java.sql.SQLException;

//import com.pel2.dao.impl.hibernate.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pel2.dto.Airport;
import com.pel2.dto.Employee;
import com.pel2.dto.Skill;
import com.pel2.service.LearnCouchbaseService;
import com.pel2.service.TestService;

//import io.vertx.core.json.JsonObject;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;


/**
 * @author softechie (Suresh V)
 * Controller with end points to learn all different operations of using Couchbase NoSQL DB 
 *
 */
@RestController
@CrossOrigin
@RequestMapping( value = "/learnCB")
public class LearnCouchbaseController {	


	@Autowired
	LearnCouchbaseService learnCBService;

    
    @RequestMapping(value = "/getAllRecordsFromBucket", method = RequestMethod.GET)
    public List<Airport> getAllFromBucket() {
    	List<Airport> results = learnCBService.getAllAirports();
    	    System.out.println("LearnCouchbaseController:getAllFromBucket() - Returned Results = "+results.toString());
    	    
            return results;
    }   
   
}


