package com.application.employeehiring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.employeehiring.model.Applicant;
import com.application.employeehiring.repository.ApplicantRepo;

@Service
public class ApplicantService {
     @Autowired
     private ApplicantRepo applicantRepo;

     public Applicant addApplicant(Applicant a)
     {
          return applicantRepo.save(a);
     }
     public List<Applicant>getAllApplicant()
     {
          return applicantRepo.findAll();
     }
     public Optional<Applicant>getApplicantById(long id)
     {
          return applicantRepo.findById(id);
     }
     

}
