package com.sap.coe.sf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for dataType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="dataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="string"/>
 *     &lt;enumeration value="date"/>
 *     &lt;enumeration value="datetime"/>
 *     &lt;enumeration value="int"/>
 *     &lt;enumeration value="long"/>
 *     &lt;enumeration value="float"/>
 *     &lt;enumeration value="double"/>
 *     &lt;enumeration value="boolean"/>
 *     &lt;enumeration value="binary"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataType")
@XmlEnum
public enum DataType
{
	
	@XmlEnumValue("string") STRING("string"),
	@XmlEnumValue("date") DATE("date"),
	@XmlEnumValue("datetime") DATETIME("datetime"),
	@XmlEnumValue("int") INT("int"),
	@XmlEnumValue("long") LONG("long"),
	@XmlEnumValue("float") FLOAT("float"),
	@XmlEnumValue("double") DOUBLE("double"),
	@XmlEnumValue("boolean") BOOLEAN("boolean"),
	@XmlEnumValue("binary") BINARY("binary");
	private final String value;
	
	
	DataType(String v)
	{
		value = v;
	}
	
	
	public String value()
	{
		return value;
	}
	
	
	public static DataType fromValue(String v)
	{
		for (DataType c : DataType.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
}
