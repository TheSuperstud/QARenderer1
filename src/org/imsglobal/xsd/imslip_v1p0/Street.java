//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.12 at 03:51:03 AM CET 
//


package org.imsglobal.xsd.imslip_v1p0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}nonfieldedstreetaddress" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}complex" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}streetnumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}streetprefix" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}streetname" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}streetype" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}streetsuffix" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}apttype" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}aptnumprefix" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}aptnumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}aptnumsuffix" minOccurs="0"/&gt;
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
    "nonfieldedstreetaddress",
    "complex",
    "streetnumber",
    "streetprefix",
    "streetname",
    "streetype",
    "streetsuffix",
    "apttype",
    "aptnumprefix",
    "aptnumber",
    "aptnumsuffix"
})
@XmlRootElement(name = "street")
public class Street {

    protected Nonfieldedstreetaddress nonfieldedstreetaddress;
    protected Complex complex;
    protected Streetnumber streetnumber;
    protected Streetprefix streetprefix;
    protected Streetname streetname;
    protected Streetype streetype;
    protected Streetsuffix streetsuffix;
    protected Apttype apttype;
    protected Aptnumprefix aptnumprefix;
    protected Aptnumber aptnumber;
    protected Aptnumsuffix aptnumsuffix;

    /**
     * Gets the value of the nonfieldedstreetaddress property.
     * 
     * @return
     *     possible object is
     *     {@link Nonfieldedstreetaddress }
     *     
     */
    public Nonfieldedstreetaddress getNonfieldedstreetaddress() {
        return nonfieldedstreetaddress;
    }

    /**
     * Sets the value of the nonfieldedstreetaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Nonfieldedstreetaddress }
     *     
     */
    public void setNonfieldedstreetaddress(Nonfieldedstreetaddress value) {
        this.nonfieldedstreetaddress = value;
    }

    /**
     * Gets the value of the complex property.
     * 
     * @return
     *     possible object is
     *     {@link Complex }
     *     
     */
    public Complex getComplex() {
        return complex;
    }

    /**
     * Sets the value of the complex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Complex }
     *     
     */
    public void setComplex(Complex value) {
        this.complex = value;
    }

    /**
     * Gets the value of the streetnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Streetnumber }
     *     
     */
    public Streetnumber getStreetnumber() {
        return streetnumber;
    }

    /**
     * Sets the value of the streetnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Streetnumber }
     *     
     */
    public void setStreetnumber(Streetnumber value) {
        this.streetnumber = value;
    }

    /**
     * Gets the value of the streetprefix property.
     * 
     * @return
     *     possible object is
     *     {@link Streetprefix }
     *     
     */
    public Streetprefix getStreetprefix() {
        return streetprefix;
    }

    /**
     * Sets the value of the streetprefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Streetprefix }
     *     
     */
    public void setStreetprefix(Streetprefix value) {
        this.streetprefix = value;
    }

    /**
     * Gets the value of the streetname property.
     * 
     * @return
     *     possible object is
     *     {@link Streetname }
     *     
     */
    public Streetname getStreetname() {
        return streetname;
    }

    /**
     * Sets the value of the streetname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Streetname }
     *     
     */
    public void setStreetname(Streetname value) {
        this.streetname = value;
    }

    /**
     * Gets the value of the streetype property.
     * 
     * @return
     *     possible object is
     *     {@link Streetype }
     *     
     */
    public Streetype getStreetype() {
        return streetype;
    }

    /**
     * Sets the value of the streetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Streetype }
     *     
     */
    public void setStreetype(Streetype value) {
        this.streetype = value;
    }

    /**
     * Gets the value of the streetsuffix property.
     * 
     * @return
     *     possible object is
     *     {@link Streetsuffix }
     *     
     */
    public Streetsuffix getStreetsuffix() {
        return streetsuffix;
    }

    /**
     * Sets the value of the streetsuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Streetsuffix }
     *     
     */
    public void setStreetsuffix(Streetsuffix value) {
        this.streetsuffix = value;
    }

    /**
     * Gets the value of the apttype property.
     * 
     * @return
     *     possible object is
     *     {@link Apttype }
     *     
     */
    public Apttype getApttype() {
        return apttype;
    }

    /**
     * Sets the value of the apttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Apttype }
     *     
     */
    public void setApttype(Apttype value) {
        this.apttype = value;
    }

    /**
     * Gets the value of the aptnumprefix property.
     * 
     * @return
     *     possible object is
     *     {@link Aptnumprefix }
     *     
     */
    public Aptnumprefix getAptnumprefix() {
        return aptnumprefix;
    }

    /**
     * Sets the value of the aptnumprefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aptnumprefix }
     *     
     */
    public void setAptnumprefix(Aptnumprefix value) {
        this.aptnumprefix = value;
    }

    /**
     * Gets the value of the aptnumber property.
     * 
     * @return
     *     possible object is
     *     {@link Aptnumber }
     *     
     */
    public Aptnumber getAptnumber() {
        return aptnumber;
    }

    /**
     * Sets the value of the aptnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aptnumber }
     *     
     */
    public void setAptnumber(Aptnumber value) {
        this.aptnumber = value;
    }

    /**
     * Gets the value of the aptnumsuffix property.
     * 
     * @return
     *     possible object is
     *     {@link Aptnumsuffix }
     *     
     */
    public Aptnumsuffix getAptnumsuffix() {
        return aptnumsuffix;
    }

    /**
     * Sets the value of the aptnumsuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aptnumsuffix }
     *     
     */
    public void setAptnumsuffix(Aptnumsuffix value) {
        this.aptnumsuffix = value;
    }

}