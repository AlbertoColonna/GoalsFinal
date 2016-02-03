package com.sap.coe.sf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for TaskStatus complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TaskStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{urn:sfobject.sfapi.successfactors.com}TaskStatusEnum"/>
 *         &lt;element name="taskResult" type="{urn:sfobject.sfapi.successfactors.com}TaskResultStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskStatus", propOrder =
{ "taskId", "taskName", "createDate", "status", "taskResult" })
public class TaskStatus
{
	
	@XmlElement(required = true) protected String taskId;
	protected String taskName;
	@XmlElement(required = true) protected String createDate;
	@XmlElement(required = true) protected TaskStatusEnum status;
	protected TaskResultStatus taskResult;
	
	
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
	 * Gets the value of the taskName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTaskName()
	{
		return taskName;
	}
	
	
	/**
	 * Sets the value of the taskName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTaskName(String value)
	{
		this.taskName = value;
	}
	
	
	/**
	 * Gets the value of the createDate property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreateDate()
	{
		return createDate;
	}
	
	
	/**
	 * Sets the value of the createDate property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreateDate(String value)
	{
		this.createDate = value;
	}
	
	
	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link TaskStatusEnum }
	 * 
	 */
	public TaskStatusEnum getStatus()
	{
		return status;
	}
	
	
	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link TaskStatusEnum }
	 * 
	 */
	public void setStatus(TaskStatusEnum value)
	{
		this.status = value;
	}
	
	
	/**
	 * Gets the value of the taskResult property.
	 * 
	 * @return possible object is {@link TaskResultStatus }
	 * 
	 */
	public TaskResultStatus getTaskResult()
	{
		return taskResult;
	}
	
	
	/**
	 * Sets the value of the taskResult property.
	 * 
	 * @param value
	 *            allowed object is {@link TaskResultStatus }
	 * 
	 */
	public void setTaskResult(TaskResultStatus value)
	{
		this.taskResult = value;
	}
	
}
