/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pel2.dao.impl;

import com.pel2.dao.SkillDAO;
import com.pel2.dto.Skill;
import java.util.ArrayList;

/**
 *
 * @author JOSEPH
 */
public class SkillDAOImpl implements SkillDAO {
    ArrayList<Skill> skills;

    public SkillDAOImpl() {
        skills = new ArrayList<>();
    }
        
    @Override
    public void getAllSkills() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
