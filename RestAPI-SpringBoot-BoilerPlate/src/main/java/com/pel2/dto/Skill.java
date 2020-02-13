/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pel2.dto;

import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

/**
 *
 * @author JOSEPH
 */

@Component
@Document
public class Skill {
	
	@Id
	@Field
    private String id;
	
	@Field
    private String name;
    
    public Skill() {
    }

    public Skill(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}
