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
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}tysource" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}tyvalue"/&gt;
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
    "tysource",
    "tyvalue"
})
@XmlRootElement(name = "typename")
public class Typename {

    protected Tysource tysource;
    @XmlElement(required = true)
    protected Tyvalue tyvalue;

    /**
     * Gets the value of the tysource property.
     * 
     * @return
     *     possible object is
     *     {@link Tysource }
     *     
     */
    public Tysource getTysource() {
        return tysource;
    }

    /**
     * Sets the value of the tysource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tysource }
     *     
     */
    public void setTysource(Tysource value) {
        this.tysource = value;
    }

    /**
     * Gets the value of the tyvalue property.
     * 
     * @return
     *     possible object is
     *     {@link Tyvalue }
     *     
     */
    public Tyvalue getTyvalue() {
        return tyvalue;
    }

    /**
     * Sets the value of the tyvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tyvalue }
     *     
     */
    public void setTyvalue(Tyvalue value) {
        this.tyvalue = value;
    }

}
