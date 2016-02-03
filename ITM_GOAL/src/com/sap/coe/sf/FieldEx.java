package com.sap.coe.sf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;



/**
 * <p>
 * Java class for FieldEx complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="FieldEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataType" type="{urn:sfobject.sfapi.successfactors.com}dataType"/>
 *         &lt;element name="picklist" type="{urn:sfobject.sfapi.successfactors.com}Picklist" minOccurs="0"/>
 *         &lt;element name="label" type="{urn:sfobject.sfapi.successfactors.com}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxlength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldEx", propOrder =
{ "name", "dataType", "picklist", "label", "maxlength", "required", "any" })
public class FieldEx
{
	
	@XmlElement(required = true) protected String name;
	@XmlElement(required = true) protected DataType dataType;
	protected Picklist picklist;
	protected List<Label> label;
	protected Integer maxlength;
	protected boolean required;
	@XmlAnyElement(lax = true) protected List<Object> any;
	
	
	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName()
	{
		return name;
	}
	
	
	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value)
	{
		this.name = value;
	}
	
	
	/**
	 * Gets the value of the dataType property.
	 * 
	 * @return possible object is {@link DataType }
	 * 
	 */
	public DataType getDataType()
	{
		return dataType;
	}
	
	
	/**
	 * Sets the value of the dataType property.
	 * 
	 * @param value
	 *            allowed object is {@link DataType }
	 * 
	 */
	public void setDataType(DataType value)
	{
		this.dataType = value;
	}
	
	
	/**
	 * Gets the value of the picklist property.
	 * 
	 * @return possible object is {@link Picklist }
	 * 
	 */
	public Picklist getPicklist()
	{
		return picklist;
	}
	
	
	/**
	 * Sets the value of the picklist property.
	 * 
	 * @param value
	 *            allowed object is {@link Picklist }
	 * 
	 */
	public void setPicklist(Picklist value)
	{
		this.picklist = value;
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
	 * Gets the value of the maxlength property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMaxlength()
	{
		return maxlength;
	}
	
	
	/**
	 * Sets the value of the maxlength property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMaxlength(Integer value)
	{
		this.maxlength = value;
	}
	
	
	/**
	 * Gets the value of the required property.
	 * 
	 */
	public boolean isRequired()
	{
		return required;
	}
	
	
	/**
	 * Sets the value of the required property.
	 * 
	 */
	public void setRequired(boolean value)
	{
		this.required = value;
	}
	
	
	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element }
	 * {@link Object }
	 * 
	 * 
	 */
	public List<Object> getAny()
	{
		if (any == null)
		{
			any = new ArrayList<Object>();
		}
		return this.any;
	}
	
}
