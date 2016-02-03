package com.sap.coe.sf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for DeleteResult complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objectEditResult" type="{urn:sfobject.sfapi.successfactors.com}ObjectEditResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteResult", propOrder =
{ "jobStatus", "message", "objectEditResult" })
public class DeleteResult
{
	
	@XmlElement(required = true) protected String jobStatus;
	@XmlElement(required = true, nillable = true) protected String message;
	@XmlElement(nillable = true) protected List<ObjectEditResult> objectEditResult;
	
	
	/**
	 * Gets the value of the jobStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getJobStatus()
	{
		return jobStatus;
	}
	
	
	/**
	 * Sets the value of the jobStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setJobStatus(String value)
	{
		this.jobStatus = value;
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
	 * Gets the value of the objectEditResult property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the objectEditResult property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getObjectEditResult().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ObjectEditResult }
	 * 
	 * 
	 */
	public List<ObjectEditResult> getObjectEditResult()
	{
		if (objectEditResult == null)
		{
			objectEditResult = new ArrayList<ObjectEditResult>();
		}
		return this.objectEditResult;
	}
	
}
