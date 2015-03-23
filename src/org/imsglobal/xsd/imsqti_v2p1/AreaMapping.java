//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.12 at 03:51:03 AM CET 
//


package org.imsglobal.xsd.imsqti_v2p1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for areaMapping.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="areaMapping.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}areaMapping.ContentGroup"/&gt;
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}areaMapping.AttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "areaMapping.Type", propOrder = {
    "areaMapEntries"
})
@XmlRootElement(name = "areaMapping")
public class AreaMapping {

    @XmlElement(name = "areaMapEntry", required = true)
    protected List<AreaMapEntry> areaMapEntries;
    @XmlAttribute(name = "lowerBound")
    protected Double lowerBound;
    @XmlAttribute(name = "upperBound")
    protected Double upperBound;
    @XmlAttribute(name = "defaultValue", required = true)
    protected double defaultValue;

    /**
     * Gets the value of the areaMapEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaMapEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaMapEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaMapEntry }
     * 
     * 
     */
    public List<AreaMapEntry> getAreaMapEntries() {
        if (areaMapEntries == null) {
            areaMapEntries = new ArrayList<AreaMapEntry>();
        }
        return this.areaMapEntries;
    }

    /**
     * Gets the value of the lowerBound property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLowerBound() {
        return lowerBound;
    }

    /**
     * Sets the value of the lowerBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLowerBound(Double value) {
        this.lowerBound = value;
    }

    /**
     * Gets the value of the upperBound property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUpperBound() {
        return upperBound;
    }

    /**
     * Sets the value of the upperBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUpperBound(Double value) {
        this.upperBound = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     */
    public double getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     */
    public void setDefaultValue(double value) {
        this.defaultValue = value;
    }

}
