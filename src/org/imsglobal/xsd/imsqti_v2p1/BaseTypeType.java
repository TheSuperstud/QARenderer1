//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.12 at 03:51:03 AM CET 
//


package org.imsglobal.xsd.imsqti_v2p1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseType.Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="baseType.Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="directedPair"/&gt;
 *     &lt;enumeration value="duration"/&gt;
 *     &lt;enumeration value="file"/&gt;
 *     &lt;enumeration value="float"/&gt;
 *     &lt;enumeration value="identifier"/&gt;
 *     &lt;enumeration value="integer"/&gt;
 *     &lt;enumeration value="pair"/&gt;
 *     &lt;enumeration value="point"/&gt;
 *     &lt;enumeration value="string"/&gt;
 *     &lt;enumeration value="uri"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "baseType.Type")
@XmlEnum
public enum BaseTypeType {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("directedPair")
    DIRECTED_PAIR("directedPair"),
    @XmlEnumValue("duration")
    DURATION("duration"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("identifier")
    IDENTIFIER("identifier"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("pair")
    PAIR("pair"),
    @XmlEnumValue("point")
    POINT("point"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("uri")
    URI("uri");
    private final String value;

    BaseTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaseTypeType fromValue(String v) {
        for (BaseTypeType c: BaseTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
