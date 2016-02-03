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
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
{ "taskId", "format" })
@XmlRootElement(name = "getJobResultMTOMRQ")
public class GetJobResultMTOMRQ
{
	
	@XmlElement(required = true) protected String taskId;
	protected String format;
	
	
	/**
	 * Gets the value of the taskId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaskId()
	{
		return taskId;
	}
	
	
	/**
	 * Sets the value of the taskId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaskId(String value)
	{
		this.taskId = value;
	}
	
	
	/**
	 * Gets the value of the format property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFormat()
	{
		return format;
	}
	
	
	/**
	 * Sets the value of the format property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFormat(String value)
	{
		this.format = value;
	}
	
}
