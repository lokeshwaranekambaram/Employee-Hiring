package com.application.employeehiring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.employeehiring.model.Applicant;
import com.application.employeehiring.service.ApplicantService;


@RestController
@RequestMapping("/Applicant")
public class ApplicantController {
     @Autowired
          private ApplicantService applicantService;

     @PostMapping("/addApplicant")
     public String addApplicant(@RequestBody Applicant applicant) 
     {
          applicantService.addApplicant(applicant);
          return "Applicant Added Successfully";
     }
     

}
