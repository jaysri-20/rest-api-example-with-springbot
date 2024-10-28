package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
	@Column
private String fname;
	@Column
private String lname;
	@Column
private int age;
	@Column
private String occupation;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}

}
