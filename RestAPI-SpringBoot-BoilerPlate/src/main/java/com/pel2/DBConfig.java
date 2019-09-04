package com.pel2;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@PropertySource("classpath:configprops.properties")
public class DBConfig {
	@Bean
	//@Qualifier("mysqldataSource")
	@ConfigurationProperties(prefix = "mysql")
	  public DataSource mysqldataSource() {
	    return DataSourceBuilder.create().build();
	  }
	@Bean
	//@Qualifier("postgredataSource")
	@Primary
	@ConfigurationProperties(prefix = "postgre")
	  public DataSource postgredataSource() {
	    return DataSourceBuilder.create().build();
	  }
	

}
