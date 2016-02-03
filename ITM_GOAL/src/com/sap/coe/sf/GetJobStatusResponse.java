package com.sap.coe.sf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{urn:sfobject.sfapi.successfactors.com}TaskStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder =
{ "result" })
@XmlRootElement(name = "getJobStatusResponse")
public class GetJobStatusResponse
{
	
	@XmlElement(required = true) protected TaskStatus result;
	
	
	/**
	 * Gets the value of the result property.
	 * 
	 * @return possible object is {@link TaskStatus }
	 * 
	 */
	public TaskStatus getResult()
	{
		return result;
	}
	
	
	/**
	 * Sets the value of the result property.
	 * 
	 * @param value
	 *            allowed object is {@link TaskStatus }
	 * 
	 */
	public void setResult(TaskStatus value)
	{
		this.result = value;
	}
	
}
