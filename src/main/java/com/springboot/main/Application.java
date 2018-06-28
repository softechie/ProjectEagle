package com.springboot.main;

import javax.servlet.Filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/** Main class that starts the Spring Application
 * It initiates the Spring Component Scan to create the beans from all the Components and Services
 * @author aprieger 
 * @SpringBootApplication -- Used on the main application class. Tells Spring the starting point of the application
 * @SpringBootApplication adds @Configuration, @EnableAutoConfiguration, and @ComponentScan (only scans sub packages)
 * automatically to the Spring application.
 * @ComponentScan -- Used to scan all sub folders of com.springboot
 * */
@SpringBootApplication
@ComponentScan({"com.springboot.*"})
public class Application {
	/* Logger object used to log messages and errors to the system */
	private static Logger log = LoggerFactory.getLogger(Application.class);

	/** Creates filter settings to be used by the CORS filter to allow any URL patterns to access this API 
	 *  @Bean -- When used at the method level and with the @Configuration annotation, creates a Spring Bean
	 *  (@SpringBootApplication added the @Configuration annotation). */
	@Bean
	public FilterRegistrationBean someFilterRegistration() {
		log.info("Creating FilterRegistrationBean for the CORS Filter...");
	    FilterRegistrationBean registration = new FilterRegistrationBean();
	    registration.setFilter(corsFilter());
	    registration.addUrlPatterns("/*");
	    registration.setName("CORSFilter");
	    registration.setOrder(1);
	    return registration;
	} 

	/** Create a new CORSFilter */
	public Filter corsFilter() {
	    return new CORSFilter();
	}
	
	/** Start the Spring Application */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
