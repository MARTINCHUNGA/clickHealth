package com.clickhealth.ClickHealth.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor 
{  
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   @Column(name="doctor_Id",nullable=false)
   private int doctorId;

   @Column(name="first_name",nullable=false)
   private String firstName;
   
   @Column(name="last_name",nullable=false)
   private String lastName;
   
   @Column(name="age",nullable=false)
   private int age;
   
   @Column(name="gender",nullable=false)
   private char gender;
   
   @Column(name="address",nullable=false)
   private String address;
   
   @Column(name="password",nullable=false)
   private String password;
   
   @Column(name="username",nullable=false)
   private String username;
   
   @Column(name="email",nullable=false)
   private String email;
   
   @ManyToMany(fetch=FetchType.EAGER)
   private List<Patient> patientList;
   
   
   
   public List<Patient> getPatientList() {
	return patientList;
}

public void setPatientList(List<Patient> patientList) {
	this.patientList = patientList;
}

public Doctor() {}

   public Doctor(
		int doctorId, 
		String firstName,
		String lastName, 
		int age, 
		char gender,
		String address, 
		String password,
		String username, 
		String email) {
	super();
	this.doctorId = doctorId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.gender = gender;
	this.address = address;
	this.password = password;
	this.username = username;
	this.email = email;
}
  
public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

public int getDoctorId() {
	return doctorId;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getFirstName() {
	return firstName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getLastName() {
	return lastName;
}

public void setAge(int age) {
	this.age = age;
}

public int getAge() {
	return age;
}

public void setGender(char gender) {
	this.gender = gender;
}

public char getGender() {
	return gender;
}

public void setAddress(String address) {
	this.address = address;
}

public String getAddress() {
	return address;
}

public void setPassword(String password) {
	this.password = password;
}

public String getPassword() {
	return password;
}

public void setUsername(String username) {
	this.username = username;
}

public String getUsername() {
	return username;
}

public void setEmail(String email) {
	this.email = email;
}

public String getEmail() {
	return email;
}

}
