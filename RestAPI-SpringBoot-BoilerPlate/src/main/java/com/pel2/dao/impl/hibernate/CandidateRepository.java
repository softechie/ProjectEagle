package com.pel2.dao.impl.hibernate;

import com.pel2.dto.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
//@Service
public interface CandidateRepository extends CrudRepository<Candidate, Long> {

}
