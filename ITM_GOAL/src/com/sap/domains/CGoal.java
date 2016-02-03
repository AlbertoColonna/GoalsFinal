package com.sap.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CGoal {
	
	//attributes in json post have to have same name as in getter/setter methods
	
	private String id;
	private String name;
	private String start;
	private String due;
	private String state;
	private String userName;
	private boolean formStatus;
	
	public CGoal()
	{
		
	}
    
    public CGoal(String goalId, String goalName, String goalStart, String goalDue, String goalState, String goalUserName, boolean formStatus)
    {
    	this.setId(goalId);
    	this.setName(goalName);
    	this.setStart(goalStart);
    	this.setDue(goalDue);
    	this.setState(goalState);
    	this.setUserName(goalUserName);
    	this.setFormStatus(formStatus);
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDue() {
		return due;
	}

	public void setDue(String due) {
		this.due = due;
	}

	public String getState() {
		return state;
	}

	public void setState(String status) {
		this.state = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean getFormStatus() {
		return formStatus;
	}

	public void setFormStatus(boolean formStatus) {
		this.formStatus = formStatus;
	}

    
   
    

/*    @Override 
    public String toString() { 
        return new StringBuffer(" Date : ").append(this.datex) 
                .append(this.id).toString(); 
    } */
    	

}
