package com.application.employeehiring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recruiter {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     private String firstName;
     private String lastName;
     private String email;
     private String phoneNumber;
     private String address;
     private String designation;
     private String company;
     private int experience;
     public long getId() {
          return id;
     }
     public void setId(long id) {
          this.id = id;
     }
     public String getFirstName() {
          return firstName;
     }
     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }
     public String getLastName() {
          return lastName;
     }
     public void setLastName(String lastName) {
          this.lastName = lastName;
     }
     public String getEmail() {
          return email;
     }
     public void setEmail(String email) {
          this.email = email;
     }
     public String getPhoneNumber() {
          return phoneNumber;
     }
     public void setPhoneNumber(String phoneNumber) {
          this.phoneNumber = phoneNumber;
     }
     public String getAddress() {
          return address;
     }
     public void setAddress(String address) {
          this.address = address;
     }
     public String getDesignation() {
          return designation;
     }
     public void setDesignation(String designation) {
          this.designation = designation;
     }
     public String getCompany() {
          return company;
     }
     public void setCompany(String company) {
          this.company = company;
     }
     public int getExperience() {
          return experience;
     }
     public void setExperience(int experience) {
          this.experience = experience;
     }
     public Recruiter(long id, String firstName, String lastName, String email, String phoneNumber, String address,
               String designation, String company, int experience) {
          this.id = id;
          this.firstName = firstName;
          this.lastName = lastName;
          this.email = email;
          this.phoneNumber = phoneNumber;
          this.address = address;
          this.designation = designation;
          this.company = company;
          this.experience = experience;
     }
     public Recruiter() {
     }
     

}
