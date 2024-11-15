package com.application.employeehiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.employeehiring.model.Jobapplication;

@Repository
public interface JobapplicationRepo extends JpaRepository<Jobapplication, Long> {

}
