package com.sap.services;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.security.um.user.PersistenceException;
import com.sap.security.um.user.UnsupportedUserAttributeException;

/**
 * Servlet implementation class SFTest
 */
@WebServlet("/SFTest")
public class SFTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOG = LoggerFactory.getLogger(CUserService.class);		
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SFTest() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/** 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		CConnectorService oConnector= new CConnectorService();
		
		//CUserService userService = new CUserService();
		
		/*try {
			response.getOutputStream().println(userService.getUserAttributes(request.getUserPrincipal()));
		} catch (PersistenceException e) {
			// TODO Auto-generated catch block
			LOG.error("1");
			e.printStackTrace();
		} catch (UnsupportedUserAttributeException e) {
			// TODO Auto-generated catch block
			LOG.error("2");			
			e.printStackTrace();
		}*/
		 
		//CGoalsService oGoalsService = new CGoalsService(oConnector);
		
		//List goals = oGoalsService.getGoals();
	
		 
		/*for(int i=0; i<goals.size();i++)
		{
			response.getOutputStream().println(goals.get(i).toString());			
		}*/
		


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  doGet(request, response);
 
	}

}



