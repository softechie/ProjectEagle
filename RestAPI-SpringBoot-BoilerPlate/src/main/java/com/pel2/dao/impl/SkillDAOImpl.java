/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pel2.dao.impl;

import com.pel2.dao.SkillDAO;
import com.pel2.dao.impl.couchbase.SkillRepo;
import com.pel2.dto.Skill;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author JOSEPH
 */
@Component
//@Service
public class SkillDAOImpl implements SkillDAO {
    
    @Autowired
    SkillRepo skillRepo;

    @Autowired
    Skill skill;
    
    ArrayList<Skill> skills;

    public SkillDAOImpl() {
        skills = new ArrayList<>();
    }

    @Override
    public void updateSkill() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteSkill() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Skill addSkill(Skill skill) {
        skills.add(skill);
        return skill;
    }

    @Override
    public List<Skill> getAllSkills() {
        return (List<Skill>) skillRepo.findAll();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
