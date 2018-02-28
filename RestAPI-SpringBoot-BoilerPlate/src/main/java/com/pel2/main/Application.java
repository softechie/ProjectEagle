package com.pel2.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author mbaransln
 * Main class to start the Spring boot application.
 *
 */
//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
//@ComponentScan
@ComponentScan({"com.pel2.*","com.pel2.main","com.pel2.repo"})
//@EnableMongoRepositories({"com.pel2.repo"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
