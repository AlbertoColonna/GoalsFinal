package com.sap.coe.sf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for SFCredential complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SFCredential">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="developerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SFCredential", propOrder =
{ "companyId", "username", "password", "developerKey" })
public class SFCredential
{
	
	@XmlElement(required = true) protected String companyId;
	@XmlElement(required = true) protected String username;
	@XmlElement(required = true) protected String password;
	protected String developerKey;
	
	
	/**
	 * Gets the value of the companyId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCompanyId()
	{
		return companyId;
	}
	
	
	/**
	 * Sets the value of the companyId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCompanyId(String value)
	{
		this.companyId = value;
	}
	
	
	/**
	 * Gets the value of the username property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUsername()
	{
		return username;
	}
	
	
	/**
	 * Sets the value of the username property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUsername(String value)
	{
		this.username = value;
	}
	
	
	/**
	 * Gets the value of the password property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPassword()
	{
		return password;
	}
	
	
	/**
	 * Sets the value of the password property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPassword(String value)
	{
		this.password = value;
	}
	
	
	/**
	 * Gets the value of the developerKey property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeveloperKey()
	{
		return developerKey;
	}
	
	
	/**
	 * Sets the value of the developerKey property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeveloperKey(String value)
	{
		this.developerKey = value;
	}
	
}
