package com.pel2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mbaransln
 * Main class to start the Spring boot application.
 *
 */
@SpringBootApplication
//@ComponentScan(basePackages = { "com.pel2", "com.pel2.repository" },basePackageClasses = EmployeeRepository.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

