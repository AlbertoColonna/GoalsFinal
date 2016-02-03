package com.sap.coe.sf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for featureType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="featureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="insert"/>
 *     &lt;enumeration value="update"/>
 *     &lt;enumeration value="upsert"/>
 *     &lt;enumeration value="delete"/>
 *     &lt;enumeration value="query"/>
 *     &lt;enumeration value="queryMore"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "featureType")
@XmlEnum
public enum FeatureType
{
	
	@XmlEnumValue("insert") INSERT("insert"),
	@XmlEnumValue("update") UPDATE("update"),
	@XmlEnumValue("upsert") UPSERT("upsert"),
	@XmlEnumValue("delete") DELETE("delete"),
	@XmlEnumValue("query") QUERY("query"),
	@XmlEnumValue("queryMore") QUERY_MORE("queryMore");
	private final String value;
	
	
	FeatureType(String v)
	{
		value = v;
	}
	
	
	public String value()
	{
		return value;
	}
	
	
	public static FeatureType fromValue(String v)
	{
		for (FeatureType c : FeatureType.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
}
