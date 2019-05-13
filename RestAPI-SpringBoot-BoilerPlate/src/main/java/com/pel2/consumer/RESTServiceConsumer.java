package com.pel2.consumer;

//import java.util.HashMap;


import org.springframework.web.client.RestTemplate;

/**
 * @author mbaransln
 * Sample code to call the Rest API from consumer applications
 *
 */
public class RESTServiceConsumer {

    public static void consumer() {
        RestTemplate restTemplate = new RestTemplate();
        
        String consumeJSONString = restTemplate.getForObject("http://localhost:8098/employee/all", String.class);
        System.out.println("JSON String: "+consumeJSONString);      
    }

}

