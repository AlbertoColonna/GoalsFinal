package com.sap.coe.sf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for QueryResult complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sfobject" type="{urn:sfobject.sfapi.successfactors.com}SFObject" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hasMore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="querySessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResult", propOrder =
{ "sfobject", "numResults", "hasMore", "querySessionId" })
public class QueryResult
{
	
	protected List<SFObject> sfobject;
	protected int numResults;
	protected boolean hasMore;
	@XmlElement(required = true, nillable = true) protected String querySessionId;
	
	
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
	 * Gets the value of the numResults property.
	 * 
	 */
	public int getNumResults()
	{
		return numResults;
	}
	
	
	/**
	 * Sets the value of the numResults property.
	 * 
	 */
	public void setNumResults(int value)
	{
		this.numResults = value;
	}
	
	
	/**
	 * Gets the value of the hasMore property.
	 * 
	 */
	public boolean isHasMore()
	{
		return hasMore;
	}
	
	
	/**
	 * Sets the value of the hasMore property.
	 * 
	 */
	public void setHasMore(boolean value)
	{
		this.hasMore = value;
	}
	
	
	/**
	 * Gets the value of the querySessionId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQuerySessionId()
	{
		return querySessionId;
	}
	
	
	/**
	 * Sets the value of the querySessionId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQuerySessionId(String value)
	{
		this.querySessionId = value;
	}
	
}
