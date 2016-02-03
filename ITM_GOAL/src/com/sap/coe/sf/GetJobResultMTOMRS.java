package com.sap.coe.sf;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
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
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
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
{ "result" })
@XmlRootElement(name = "getJobResultMTOMRS")
public class GetJobResultMTOMRS
{
	
	@XmlElement(required = true) @XmlMimeType("application/octet-stream") protected DataHandler result;
	
	
	/**
	 * Gets the value of the result property.
	 * 
	 * @return possible object is {@link DataHandler }
	 * 
	 */
	public DataHandler getResult()
	{
		return result;
	}
	
	
	/**
	 * Sets the value of the result property.
	 * 
	 * @param value
	 *            allowed object is {@link DataHandler }
	 * 
	 */
	public void setResult(DataHandler value)
	{
		this.result = value;
	}
	
}
