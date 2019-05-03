/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pel2.dao;

import com.pel2.dto.Skill;

/**
 *
 * @author JOSEPH
 */
public interface SkillDAO {
    public void getAllSkills();
    public void updateSkill();
    public void deleteSkill();
    public Skill addSkill(Skill skill);
    
    
}
