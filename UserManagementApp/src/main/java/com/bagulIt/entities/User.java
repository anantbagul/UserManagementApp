package com.bagulIt.entities;

import java.time.LocalDate;

public class User {
	
	Integer userID;
	String firstName;
	String lastName;
	String eMail;
	Long phNo;
	Double dob;
	String gender;
	String country;
	String state;
	String city;
	Character activeSw;
	LocalDate createdDate;
	LocalDate updatedDate;
	Double password;
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
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
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public Long getPhNo() {
		return phNo;
	}
	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}
	public Double getDob() {
		return dob;
	}
	public void setDob(Double dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Character getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(Character activeSw) {
		this.activeSw = activeSw;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Double getPassword() {
		return password;
	}
	public void setPassword(Double password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", eMail=" + eMail
				+ ", phNo=" + phNo + ", dob=" + dob + ", gender=" + gender + ", country=" + country + ", state=" + state
				+ ", city=" + city + ", activeSw=" + activeSw + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", password=" + password + "]";
	}

}
