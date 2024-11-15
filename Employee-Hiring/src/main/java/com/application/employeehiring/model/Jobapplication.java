package com.application.employeehiring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jobapplication {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long jobId;
     private String companyName;
     private String companyAddress;
     private String jobTitle;
     private String jobDescription;
     private String jobType;
     private String jobLocation;
     private int salary;
     private String jobRequirements;
     private String jobResponsibilities;
     private String jobSkills;
     private int jobExperience;
     private String jobEducation;
     public long getJobId() {
          return jobId;
     }
     public void setJobId(long jobId) {
          this.jobId = jobId;
     }
     public String getCompanyName() {
          return companyName;
     }
     public void setCompanyName(String companyName) {
          this.companyName = companyName;
     }
     public String getCompanyAddress() {
          return companyAddress;
     }
     public void setCompanyAddress(String companyAddress) {
          this.companyAddress = companyAddress;
     }
     public String getJobTitle() {
          return jobTitle;
     }
     public void setJobTitle(String jobTitle) {
          this.jobTitle = jobTitle;
     }
     public String getJobDescription() {
          return jobDescription;
     }
     public void setJobDescription(String jobDescription) {
          this.jobDescription = jobDescription;
     }
     public String getJobType() {
          return jobType;
     }
     public void setJobType(String jobType) {
          this.jobType = jobType;
     }
     public String getJobLocation() {
          return jobLocation;
     }
     public void setJobLocation(String jobLocation) {
          this.jobLocation = jobLocation;
     }
     public int getSalary() {
          return salary;
     }
     public void setSalary(int salary) {
          this.salary = salary;
     }
     public String getJobRequirements() {
          return jobRequirements;
     }
     public void setJobRequirements(String jobRequirements) {
          this.jobRequirements = jobRequirements;
     }
     public String getJobResponsibilities() {
          return jobResponsibilities;
     }
     public void setJobResponsibilities(String jobResponsibilities) {
          this.jobResponsibilities = jobResponsibilities;
     }
     public String getJobSkills() {
          return jobSkills;
     }
     public void setJobSkills(String jobSkills) {
          this.jobSkills = jobSkills;
     }
     public int getJobExperience() {
          return jobExperience;
     }
     public void setJobExperience(int jobExperience) {
          this.jobExperience = jobExperience;
     }
     public String getJobEducation() {
          return jobEducation;
     }
     public void setJobEducation(String jobEducation) {
          this.jobEducation = jobEducation;
     }
     public Jobapplication(long jobId, String companyName, String companyAddress, String jobTitle,
               String jobDescription, String jobType, String jobLocation, int salary, String jobRequirements,
               String jobResponsibilities, String jobSkills, int jobExperience, String jobEducation) {
          this.jobId = jobId;
          this.companyName = companyName;
          this.companyAddress = companyAddress;
          this.jobTitle = jobTitle;
          this.jobDescription = jobDescription;
          this.jobType = jobType;
          this.jobLocation = jobLocation;
          this.salary = salary;
          this.jobRequirements = jobRequirements;
          this.jobResponsibilities = jobResponsibilities;
          this.jobSkills = jobSkills;
          this.jobExperience = jobExperience;
          this.jobEducation = jobEducation;
     }
     public Jobapplication() {
     }

}
