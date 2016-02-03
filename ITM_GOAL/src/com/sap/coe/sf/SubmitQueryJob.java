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
 *         &lt;element name="queryString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="param" type="{urn:sfobject.sfapi.successfactors.com}SFParameter" maxOccurs="unbounded" minOccurs="0"/>
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
{ "queryString", "param" })
@XmlRootElement(name = "submitQueryJob")
public class SubmitQueryJob
{
	
	@XmlElement(required = true) protected String queryString;
	protected List<SFParameter> param;
	
	
	/**
	 * Gets the value of the queryString property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQueryString()
	{
		return queryString;
	}
	
	
	/**
	 * Sets the value of the queryString property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQueryString(String value)
	{
		this.queryString = value;
	}
	
	
	/**
	 * Gets the value of the param property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the param property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getParam().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link SFParameter }
	 * 
	 * 
	 */
	public List<SFParameter> getParam()
	{
		if (param == null)
		{
			param = new ArrayList<SFParameter>();
		}
		return this.param;
	}
	
}
