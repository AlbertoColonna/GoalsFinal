package com.sap.services;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Path;

import com.sap.security.um.service.UserManagementAccessor;
import com.sap.security.um.user.PersistenceException;
import com.sap.security.um.user.UnsupportedUserAttributeException;
import com.sap.security.um.user.User;
import com.sap.security.um.user.UserProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CUserService{
	
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	
	private static final Logger LOG = LoggerFactory.getLogger(CUserService.class);
	
	
	
	public CUserService(Principal principal)
	{
		try {
			this.getUserAttributes(principal);
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedUserAttributeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	
     //Get name and e-mail user attributes and return them as condensed string.
  
    public void getUserAttributes(Principal principal) throws PersistenceException,
            UnsupportedUserAttributeException {
        // Get user from user storage based on principal name
    	
    	LOG.error("Principal: " + principal);
        UserProvider userProvider = UserManagementAccessor.getUserProvider();
        
    	LOG.error("UserProvider: " + userProvider);        
        User user = userProvider.getUser(principal.getName());

        // Extract and return user name and e-mail address if present
        String firstName = user.getAttribute("firstname");
        String lastName  = user.getAttribute("lastname");
        String eMail	 = user.getAttribute("email");
        
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(eMail);    
        this.setUserId(principal.getName());
        
        //return (firstName != null && lastName != null ? firstName + " " + lastName + " [" + principal.getName() + "]"
        //        : principal.getName()) + (eMail != null ? " (" + eMail + ")" : "");
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
    
	 
 
}
 