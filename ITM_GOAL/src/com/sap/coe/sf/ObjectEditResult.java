package com.sap.coe.sf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for ObjectEditResult complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectEditResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="editStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectEditResult", propOrder =
{ "id", "errorStatus", "editStatus", "index", "message" })
public class ObjectEditResult
{
	
	protected String id;
	@XmlElement(required = true) protected String errorStatus;
	@XmlElement(required = true) protected String editStatus;
	@XmlElement(required = true, type = Integer.class, nillable = true) protected Integer index;
	@XmlElement(required = true, nillable = true) protected String message;
	
	
	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId()
	{
		return id;
	}
	
	
	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value)
	{
		this.id = value;
	}
	
	
	/**
	 * Gets the value of the errorStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrorStatus()
	{
		return errorStatus;
	}
	
	
	/**
	 * Sets the value of the errorStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setErrorStatus(String value)
	{
		this.errorStatus = value;
	}
	
	
	/**
	 * Gets the value of the editStatus property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEditStatus()
	{
		return editStatus;
	}
	
	
	/**
	 * Sets the value of the editStatus property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEditStatus(String value)
	{
		this.editStatus = value;
	}
	
	
	/**
	 * Gets the value of the index property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getIndex()
	{
		return index;
	}
	
	
	/**
	 * Sets the value of the index property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setIndex(Integer value)
	{
		this.index = value;
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
	
}
