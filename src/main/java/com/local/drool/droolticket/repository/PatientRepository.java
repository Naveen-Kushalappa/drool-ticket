package com.local.drool.droolticket.repository;

import com.local.drool.droolticket.domain.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient,Integer> {





} 
