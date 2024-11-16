package com.application.employeehiring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.employeehiring.model.Recruiter;
import com.application.employeehiring.repository.RecruiterRepo;

@Service
public class RecruiterService {
     @Autowired
     private RecruiterRepo recruiterRepo;

     public Recruiter addRecruiter(Recruiter r)
     {
          return recruiterRepo.save(r);
     }
     public List<Recruiter>findAllRecruiter()
     {
          return recruiterRepo.findAll();
     }
     public Optional<Recruiter>getById(long id)
     {
          return recruiterRepo.findById(id);
     }
          

}
