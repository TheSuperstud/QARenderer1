//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.12 at 03:51:03 AM CET 
//


package org.imsglobal.xsd.imslip_v1p0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}countrycode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}areacode"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}indnumber"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "countrycode",
    "areacode",
    "indnumber"
})
@XmlRootElement(name = "pager")
public class Pager {

    protected String countrycode;
    @XmlElement(required = true)
    protected String areacode;
    @XmlElement(required = true)
    protected String indnumber;

    /**
     * Gets the value of the countrycode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * Sets the value of the countrycode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrycode(String value) {
        this.countrycode = value;
    }

    /**
     * Gets the value of the areacode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * Sets the value of the areacode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreacode(String value) {
        this.areacode = value;
    }

    /**
     * Gets the value of the indnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndnumber() {
        return indnumber;
    }

    /**
     * Sets the value of the indnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndnumber(String value) {
        this.indnumber = value;
    }

}
