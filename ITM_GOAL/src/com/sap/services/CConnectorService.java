package com.sap.services;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.namespace.QName;
//import javax.xml.rpc.ServiceException;
import javax.xml.ws.BindingProvider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.coe.sf.LoginResult;
import com.sap.coe.sf.SFAPI;
import com.sap.coe.sf.SFAPIService;
import com.sap.coe.sf.SFCredential;
import com.sap.coe.sf.SFParameter;
import com.sap.coe.sf.SFWebServiceFaultException_Exception;
import com.sap.core.connectivity.api.DestinationFactory;
import com.sap.core.connectivity.api.DestinationNotFoundException;
import com.sap.core.connectivity.api.http.HttpDestination;



public class CConnectorService {
	
	  private static final Logger LOG = LoggerFactory.getLogger(CConnectorService.class);	
	
	  private HttpDestination               m_oSFcon;
	  private SFAPIService                  m_oSFSrvc;
	  private SFAPI                         m_oSFapi;
	  private SFCredential                  m_oSFcred;	
	  
	  static {
		    System.setProperty("https.proxySet", "true");
		    System.setProperty("https.proxyHost", "proxy");    
		    System.setProperty("https.proxyPort", "8080"); 
		  } 	  
	  
	  /**
	   * a list of default parameters send to SF system.
	   * 
	   */
	  public static final List<SFParameter> SF_DEFAULT_PARAM;
	  static {
	    SFParameter oMaxRow = new SFParameter();
	    oMaxRow.setName("maxRows");
	    oMaxRow.setValue(String.valueOf(800));

	    List<SFParameter> oParamLst = new ArrayList<SFParameter>();
	    oParamLst.add(oMaxRow);

	    SF_DEFAULT_PARAM = Collections.unmodifiableList(oParamLst);
	  }	  
	  
	  public CConnectorService(){

		    init();

		  }	  
	

	  private void init() {
		   
		  
		 lookUpDestination();
	    
		 
	    try {
	      URL oEndPoint = m_oSFcon.getURI().toURL();
	      
			m_oSFSrvc = new SFAPIService(oEndPoint, new QName("urn:server.sfapi.successfactors.com", "SFAPIService"));	

			m_oSFapi = m_oSFSrvc.getSFAPI();
           

	      BindingProvider oBindingProvider = (BindingProvider) m_oSFapi;

	      LOG.debug("SF API created successfully");

	      Map<String, Object> oReqCtxt = oBindingProvider.getRequestContext();
	      oReqCtxt.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, oEndPoint.toExternalForm());
	      oReqCtxt.put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);
	      
	    }
	    catch (MalformedURLException oX1) {
	      LOG.error("SF Invalid session: " + oX1.getMessage());       
	    }
	    catch (URISyntaxException oX1) {
	      LOG.error("SF Invalid SF session: " + oX1.getMessage());        
	    }   

	    m_oSFcred = new SFCredential();
	      
	       //TODO fetch these data from the environment! 
	       
	      m_oSFcred.setUsername("hcp_goals_sfapi");
	      m_oSFcred.setCompanyId("SAPTest");
	      m_oSFcred.setPassword("saphcp123"); 

		  LoginResult oLoginResult;
		try {
			oLoginResult = m_oSFapi.login(m_oSFcred, null);
			

		    LOG.info("SF Called SF valid session check");
		    LOG.error("Login:"+ oLoginResult.getSessionId());			
		} catch (SFWebServiceFaultException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	           	     

	  }	
	  
	  private void lookUpDestination() { 
		  
		    try {
		      InitialContext oCtxt = new InitialContext();
		      DestinationFactory oDestFactory = (DestinationFactory) oCtxt.lookup(DestinationFactory.JNDI_NAME);
		      if (oDestFactory != null) {
		        try {
		          m_oSFcon = oDestFactory.getDestination("SF_API");
		          LOG.info("SF destination found"); 
		          
		        }
		        catch (DestinationNotFoundException oX) {
		          LOG.error("SF Destination NOT found", oX);       
		        } 
		      }
		      else {
		        LOG.error("No destination factory!");      
		      }
		    }
		    catch (NamingException oX) { 
		      LOG.error("SF Destination", oX);   
		    }
		     
		    
		  }	  
	  
	  public SFAPI getAPI() 
	  {
		  return m_oSFapi;
	  }

}
