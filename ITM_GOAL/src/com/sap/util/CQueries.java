package com.sap.util;

public class CQueries {
	
	public static final String querySelectGoals     = "SELECT name,start,due,state FROM Goal$6 WHERE status <> 'deleted' AND userName = ";
	public static final String querySelectNoOfGoals = "SELECT state FROM Goal$6 WHERE status <> 'deleted' AND userName = ";	
	public static final String queryGetUser         = "SELECT id,country FROM User WHERE userName = ";	
	public static final String queryGetFormId       = "SELECT formDataId FROM pmformgoalmapping WHERE goalId = ";		
	public static final String queryGetForm         = "SELECT formStatus FROM PMForm$772 WHERE id = ";		

}
