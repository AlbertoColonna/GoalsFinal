package com.sap.coe.sf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for LoginResult complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="LoginResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msUntilPwdExpiration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="error" type="{urn:sfobject.sfapi.successfactors.com}Error" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResult", propOrder =
{ "sessionId", "msUntilPwdExpiration", "error" })
public class LoginResult
{
	
	@XmlElement(required = true, nillable = true) protected String sessionId;
	@XmlElement(required = true, type = Long.class, nillable = true) protected Long msUntilPwdExpiration;
	@XmlElement(nillable = true) protected List<Error> error;
	
	
	/**
	 * Gets the value of the sessionId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSessionId()
	{
		return sessionId;
	}
	
	
	/**
	 * Sets the value of the sessionId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSessionId(String value)
	{
		this.sessionId = value;
	}
	
	
	/**
	 * Gets the value of the msUntilPwdExpiration property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getMsUntilPwdExpiration()
	{
		return msUntilPwdExpiration;
	}
	
	
	/**
	 * Sets the value of the msUntilPwdExpiration property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setMsUntilPwdExpiration(Long value)
	{
		this.msUntilPwdExpiration = value;
	}
	
	
	/**
	 * Gets the value of the error property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the error property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getError().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Error }
	 * 
	 * 
	 */
	public List<Error> getError()
	{
		if (error == null)
		{
			error = new ArrayList<Error>();
		}
		return this.error;
	}
	
}
