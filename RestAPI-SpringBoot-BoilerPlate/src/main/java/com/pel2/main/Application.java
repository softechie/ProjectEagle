package com.pel2.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author mbaransln
 * Main class to start the Spring boot application.
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.pel2" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

