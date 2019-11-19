/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pel2.dao.impl.couchbase;

import com.pel2.dto.Skill;
import java.util.List;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author JOSEPH
 */

@Repository
public interface SkillRepo extends CouchbaseRepository<Skill, String>{
    public List<Skill> findAll();
    
}