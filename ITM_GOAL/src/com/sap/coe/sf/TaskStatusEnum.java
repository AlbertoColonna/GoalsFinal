package com.sap.coe.sf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;



/**
 * <p>
 * Java class for TaskStatusEnum.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="TaskStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unsubmitted"/>
 *     &lt;enumeration value="submitted"/>
 *     &lt;enumeration value="processing"/>
 *     &lt;enumeration value="finished"/>
 *     &lt;enumeration value="failed"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="cancelled"/>
 *     &lt;enumeration value="deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskStatusEnum")
@XmlEnum
public enum TaskStatusEnum
{
	
	@XmlEnumValue("unsubmitted") UNSUBMITTED("unsubmitted"),
	@XmlEnumValue("submitted") SUBMITTED("submitted"),
	@XmlEnumValue("processing") PROCESSING("processing"),
	@XmlEnumValue("finished") FINISHED("finished"),
	@XmlEnumValue("failed") FAILED("failed"),
	@XmlEnumValue("undefined") UNDEFINED("undefined"),
	@XmlEnumValue("cancelled") CANCELLED("cancelled"),
	@XmlEnumValue("deleted") DELETED("deleted");
	private final String value;
	
	
	TaskStatusEnum(String v)
	{
		value = v;
	}
	
	
	public String value()
	{
		return value;
	}
	
	
	public static TaskStatusEnum fromValue(String v)
	{
		for (TaskStatusEnum c : TaskStatusEnum.values())
		{
			if (c.value.equals(v))
			{
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
	
}
