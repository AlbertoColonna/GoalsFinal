package com.sap.coe.sf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for Label complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Label">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mime-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Label", propOrder =
{ "value", "locale", "mimeType" })
public class Label
{
	
	@XmlElement(required = true) protected String value;
	@XmlElement(required = true) protected String locale;
	@XmlElement(name = "mime-type", required = true, nillable = true) protected String mimeType;
	
	
	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue()
	{
		return value;
	}
	
	
	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value)
	{
		this.value = value;
	}
	
	
	/**
	 * Gets the value of the locale property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLocale()
	{
		return locale;
	}
	
	
	/**
	 * Sets the value of the locale property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLocale(String value)
	{
		this.locale = value;
	}
	
	
	/**
	 * Gets the value of the mimeType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMimeType()
	{
		return mimeType;
	}
	
	
	/**
	 * Sets the value of the mimeType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMimeType(String value)
	{
		this.mimeType = value;
	}
	
}
