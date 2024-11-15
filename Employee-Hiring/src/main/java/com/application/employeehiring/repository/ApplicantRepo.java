package com.application.employeehiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.employeehiring.model.Applicant;

@Repository
public interface ApplicantRepo extends JpaRepository<Applicant,Long> {

}
