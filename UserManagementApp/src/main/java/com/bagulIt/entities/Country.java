package com.bagulIt.entities;

public class Country {

	Integer countryID;
	String countryName;
	public Integer getCountryID() {
		return countryID;
	}
	public void setCountryID(Integer countryID) {
		this.countryID = countryID;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "Country [countryID=" + countryID + ", countryName=" + countryName + "]";
	}
	
	
}
