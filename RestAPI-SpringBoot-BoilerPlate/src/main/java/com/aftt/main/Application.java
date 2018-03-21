package com.aftt.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
//@ComponentScan
@ComponentScan({"com.aftt.*","com.aftt.main","com.aftt.repo"})
//@EnableMongoRepositories({"com.aftt.repo"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
