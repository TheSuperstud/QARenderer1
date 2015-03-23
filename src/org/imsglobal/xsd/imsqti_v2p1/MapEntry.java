//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.12 at 03:51:03 AM CET 
//


package org.imsglobal.xsd.imsqti_v2p1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mapEntry.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mapEntry.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}mapEntry.AttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mapEntry.Type")
@XmlRootElement(name = "mapEntry")
public class MapEntry {

    @XmlAttribute(name = "mapKey", required = true)
    protected String mapKey;
    @XmlAttribute(name = "mappedValue", required = true)
    protected double mappedValue;

    /**
     * Gets the value of the mapKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapKey() {
        return mapKey;
    }

    /**
     * Sets the value of the mapKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapKey(String value) {
        this.mapKey = value;
    }

    /**
     * Gets the value of the mappedValue property.
     * 
     */
    public double getMappedValue() {
        return mappedValue;
    }

    /**
     * Sets the value of the mappedValue property.
     * 
     */
    public void setMappedValue(double value) {
        this.mappedValue = value;
    }

}