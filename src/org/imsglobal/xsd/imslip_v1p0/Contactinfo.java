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
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}typename" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}comment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}contentype" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}telephone"/&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}facsimile"/&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}mobile"/&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}pager"/&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}email"/&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}web"/&gt;
 *         &lt;/choice&gt;
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
    "typename",
    "comment",
    "contentype",
    "web",
    "email",
    "pager",
    "mobile",
    "facsimile",
    "telephone"
})
@XmlRootElement(name = "contactinfo")
public class Contactinfo {

    protected Typename typename;
    protected Comment comment;
    protected Contentype contentype;
    protected String web;
    protected String email;
    protected Pager pager;
    protected Mobile mobile;
    protected Facsimile facsimile;
    protected Telephone telephone;

    /**
     * Gets the value of the typename property.
     * 
     * @return
     *     possible object is
     *     {@link Typename }
     *     
     */
    public Typename getTypename() {
        return typename;
    }

    /**
     * Sets the value of the typename property.
     * 
     * @param value
     *     allowed object is
     *     {@link Typename }
     *     
     */
    public void setTypename(Typename value) {
        this.typename = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Comment }
     *     
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comment }
     *     
     */
    public void setComment(Comment value) {
        this.comment = value;
    }

    /**
     * Gets the value of the contentype property.
     * 
     * @return
     *     possible object is
     *     {@link Contentype }
     *     
     */
    public Contentype getContentype() {
        return contentype;
    }

    /**
     * Sets the value of the contentype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contentype }
     *     
     */
    public void setContentype(Contentype value) {
        this.contentype = value;
    }

    /**
     * Gets the value of the web property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeb() {
        return web;
    }

    /**
     * Sets the value of the web property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeb(String value) {
        this.web = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link Pager }
     *     
     */
    public Pager getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pager }
     *     
     */
    public void setPager(Pager value) {
        this.pager = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link Mobile }
     *     
     */
    public Mobile getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mobile }
     *     
     */
    public void setMobile(Mobile value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the facsimile property.
     * 
     * @return
     *     possible object is
     *     {@link Facsimile }
     *     
     */
    public Facsimile getFacsimile() {
        return facsimile;
    }

    /**
     * Sets the value of the facsimile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Facsimile }
     *     
     */
    public void setFacsimile(Facsimile value) {
        this.facsimile = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link Telephone }
     *     
     */
    public Telephone getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telephone }
     *     
     */
    public void setTelephone(Telephone value) {
        this.telephone = value;
    }

}
