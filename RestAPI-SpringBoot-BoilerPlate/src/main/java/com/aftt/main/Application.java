package com.aftt.main;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.filter.CorsFilter;


//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
//@ComponentScan
@ComponentScan({"com.aftt.*","com.aftt.main","com.aftt.repo"})
//@EnableMongoRepositories({"com.aftt.repo"})
public class Application {
	
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurerAdapter() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**");
//			}
//		};
//	}
	
	@Bean
	public FilterRegistrationBean someFilterRegistration() {

	    FilterRegistrationBean registration = new FilterRegistrationBean();
	    registration.setFilter(corsFilter());
	    registration.addUrlPatterns("/*");
	    ///registration.addInitParameter("paramName", "paramValue");
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
