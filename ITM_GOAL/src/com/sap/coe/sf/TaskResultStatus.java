package com.sap.coe.sf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for TaskResultStatus complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TaskResultStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskResultId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastFinishTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validUntil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:sfobject.sfapi.successfactors.com}TaskResultStatusEnum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskResultStatus", propOrder =
{ "taskResultId", "lastFinishTime", "lastStartTime", "validUntil", "errorCode",
		"message", "status" })
public class TaskResultStatus
{
	
	@XmlElement(required = true) protected String taskResultId;
	protected String lastFinishTime;
	protected String lastStartTime;
	protected String validUntil;
	protected String errorCode;
	protected String message;
	@XmlElement(required = true) protected TaskResultStatusEnum status;
	
	
	/**
	 * Gets the value of the taskResultId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaskResultId()
	{
		return taskResultId;
	}
	
	
	/**
	 * Sets the value of the taskResultId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaskResultId(String value)
	{
		this.taskResultId = value;
	}
	
	
	/**
	 * Gets the value of the lastFinishTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastFinishTime()
	{
		return lastFinishTime;
	}
	
	
	/**
	 * Sets the value of the lastFinishTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastFinishTime(String value)
	{
		this.lastFinishTime = value;
	}
	
	
	/**
	 * Gets the value of the lastStartTime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastStartTime()
	{
		return lastStartTime;
	}
	
	
	/**
	 * Sets the value of the lastStartTime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastStartTime(String value)
	{
		this.lastStartTime = value;
	}
	
	
	/**
	 * Gets the value of the validUntil property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValidUntil()
	{
		return validUntil;
	}
	
	
	/**
	 * Sets the value of the validUntil property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValidUntil(String value)
	{
		this.validUntil = value;
	}
	
	
	/**
	 * Gets the value of the errorCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrorCode()
	{
		return errorCode;
	}
	
	
	/**
	 * Sets the value of the errorCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setErrorCode(String value)
	{
		this.errorCode = value;
	}
	
	
	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMessage()
	{
		return message;
	}
	
	
	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMessage(String value)
	{
		this.message = value;
	}
	
	
	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link TaskResultStatusEnum }
	 * 
	 */
	public TaskResultStatusEnum getStatus()
	{
		return status;
	}
	
	
	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link TaskResultStatusEnum }
	 * 
	 */
	public void setStatus(TaskResultStatusEnum value)
	{
		this.status = value;
	}
	
}
