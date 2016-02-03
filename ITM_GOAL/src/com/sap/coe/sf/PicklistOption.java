package com.sap.coe.sf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for PicklistOption complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PicklistOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="label" type="{urn:sfobject.sfapi.successfactors.com}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="externalCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PicklistOption", propOrder =
{ "id", "label", "status", "value", "externalCode" })
public class PicklistOption
{
	
	protected long id;
	protected List<Label> label;
	@XmlElement(required = true, nillable = true) protected String status;
	protected double value;
	@XmlElement(required = true, nillable = true) protected String externalCode;
	
	
	/**
	 * Gets the value of the id property.
	 * 
	 */
	public long getId()
	{
		return id;
	}
	
	
	/**
	 * Sets the value of the id property.
	 * 
	 */
	public void setId(long value)
	{
		this.id = value;
	}
	
	
	/**
	 * Gets the value of the label property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the label property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLabel().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Label }
	 * 
	 * 
	 */
	public List<Label> getLabel()
	{
		if (label == null)
		{
			label = new ArrayList<Label>();
		}
		return this.label;
	}
	
	
	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus()
	{
		return status;
	}
	
	
	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value)
	{
		this.status = value;
	}
	
	
	/**
	 * Gets the value of the value property.
	 * 
	 */
	public double getValue()
	{
		return value;
	}
	
	
	/**
	 * Sets the value of the value property.
	 * 
	 */
	public void setValue(double value)
	{
		this.value = value;
	}
	
	
	/**
	 * Gets the value of the externalCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExternalCode()
	{
		return externalCode;
	}
	
	
	/**
	 * Sets the value of the externalCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExternalCode(String value)
	{
		this.externalCode = value;
	}
	
}
