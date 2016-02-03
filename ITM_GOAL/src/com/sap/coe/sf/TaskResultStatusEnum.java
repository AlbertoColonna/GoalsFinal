package com.sap.coe.sf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for TaskResultStatusEnum.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="TaskResultStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="running"/>
 *     &lt;enumeration value="finished"/>
 *     &lt;enumeration value="failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskResultStatusEnum")
@XmlEnum
public enum TaskResultStatusEnum
{
	
	@XmlEnumValue("running") RUNNING("running"),
	@XmlEnumValue("finished") FINISHED("finished"),
	@XmlEnumValue("failed") FAILED("failed");
	private final String value;
	
	
	TaskResultStatusEnum(String v)
	{
		value = v;
	}
	
	
	public String value()
	{
		return value;
	}
	
	
	public static TaskResultStatusEnum fromValue(String v)
	{
		for (TaskResultStatusEnum c : TaskResultStatusEnum.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
}
