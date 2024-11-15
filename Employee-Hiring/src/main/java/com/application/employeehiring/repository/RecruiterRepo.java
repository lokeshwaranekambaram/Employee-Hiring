package com.application.employeehiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.employeehiring.model.Recruiter;

@Repository
public interface RecruiterRepo extends JpaRepository<Recruiter, Long> {

}
