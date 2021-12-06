package com.bagulIt.entities;

public class City {

	Integer cityID;
	String cityName;
	public Integer getCityID() {
		return cityID;
	}
	public void setCityID(Integer cityID) {
		this.cityID = cityID;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "City [cityID=" + cityID + ", cityName=" + cityName + "]";
	}
	
	
}
