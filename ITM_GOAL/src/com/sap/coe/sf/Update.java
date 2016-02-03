package com.sap.coe.sf;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sfobject" type="{urn:sfobject.sfapi.successfactors.com}SFObject" maxOccurs="unbounded"/>
 *         &lt;element name="processingParam" type="{urn:sfobject.sfapi.successfactors.com}SFParameter" maxOccurs="unbounded" minOccurs="0"/>
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
{ "type", "sfobject", "processingParam" })
@XmlRootElement(name = "update")
public class Update
{
	
	@XmlElement(required = true) protected String type;
	@XmlElement(required = true) protected List<SFObject> sfobject;
	protected List<SFParameter> processingParam;
	
	
	/**
	 * Gets the value of the type property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getType()
	{
		return type;
	}
	
	
	/**
	 * Sets the value of the type property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setType(String value)
	{
		this.type = value;
	}
	
	
	/**
	 * Gets the value of the sfobject property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the sfobject property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSfobject().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link SFObject }
	 * 
	 * 
	 */
	public List<SFObject> getSfobject()
	{
		if (sfobject == null)
		{
			sfobject = new ArrayList<SFObject>();
		}
		return this.sfobject;
	}
	
	
	/**
	 * Gets the value of the processingParam property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the processingParam property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getProcessingParam().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link SFParameter }
	 * 
	 * 
	 */
	public List<SFParameter> getProcessingParam()
	{
		if (processingParam == null)
		{
			processingParam = new ArrayList<SFParameter>();
		}
		return this.processingParam;
	}
	
}
