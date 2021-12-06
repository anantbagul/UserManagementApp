package com.bagulIt.entities;

public class State {

	Integer stateID;
	String stateName;
	public Integer getStateID() {
		return stateID;
	}
	public void setStateID(Integer stateID) {
		this.stateID = stateID;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "State [stateID=" + stateID + ", stateName=" + stateName + "]";
	}
	
	
}
