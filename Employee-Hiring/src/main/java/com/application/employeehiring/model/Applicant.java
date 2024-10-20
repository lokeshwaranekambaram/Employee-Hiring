package com.application.employeehiring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Applicant {
     @Id
     private int id;
     private String name;
     private String email;
     private String phone;
     private String location;
     private String jobTitle;
     private int pastExperience;
     public int getId() {
          return id;
     }
     public void setId(int id) {
          this.id = id;
     }
     public String getName() {
          return name;
     }
     public void setName(String name) {
          this.name = name;
     }
     public String getEmail() {
          return email;
     }
     public void setEmail(String email) {
          this.email = email;
     }
     public String getPhone() {
          return phone;
     }
     public void setPhone(String phone) {
          this.phone = phone;
     }
     public String getLocation() {
          return location;
     }
     public void setLocation(String location) {
          this.location = location;
     }
     public String getJobTitle() {
          return jobTitle;
     }
     public void setJobTitle(String jobTitle) {
          this.jobTitle = jobTitle;
     }
     public int getPastExperience() {
          return pastExperience;
     }
     public void setPastExperience(int pastExperience) {
          this.pastExperience = pastExperience;
     }
     public Applicant(int id, String name, String email, String phone, String location, String jobTitle,
               int pastExperience) {
          this.id = id;
          this.name = name;
          this.email = email;
          this.phone = phone;
          this.location = location;
          this.jobTitle = jobTitle;
          this.pastExperience = pastExperience;
     }
     public Applicant() {
     }


}
