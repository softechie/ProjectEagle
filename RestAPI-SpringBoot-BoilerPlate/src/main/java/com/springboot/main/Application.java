package com.springboot.main;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.springboot.*"})
public class Application {
	@Bean
	public FilterRegistrationBean someFilterRegistration() {

	    FilterRegistrationBean registration = new FilterRegistrationBean();
	    registration.setFilter(corsFilter());
	    registration.addUrlPatterns("/*");
	    registration.setName("CORSFilter");
	    registration.setOrder(1);
	    return registration;
	} 

	public Filter corsFilter() {
	    return new CORSFilter();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
