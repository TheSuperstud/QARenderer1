//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.12 at 03:51:03 AM CET 
//


package org.imsglobal.xsd.imslip_v1p0;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}comment" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}recformat"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}recdata"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}date" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}ext_exrefrecord" minOccurs="0"/&gt;
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
    "comment",
    "recformat",
    "recdata",
    "dates",
    "description",
    "extExrefrecord"
})
@XmlRootElement(name = "exrefrecord")
public class Exrefrecord {

    protected Comment comment;
    @XmlElement(required = true)
    protected Recformat recformat;
    @XmlElement(required = true)
    protected Recdata recdata;
    @XmlElement(name = "date")
    protected List<Date> dates;
    protected Description description;
    @XmlElement(name = "ext_exrefrecord")
    protected Object extExrefrecord;

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
     * Gets the value of the recformat property.
     * 
     * @return
     *     possible object is
     *     {@link Recformat }
     *     
     */
    public Recformat getRecformat() {
        return recformat;
    }

    /**
     * Sets the value of the recformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recformat }
     *     
     */
    public void setRecformat(Recformat value) {
        this.recformat = value;
    }

    /**
     * Gets the value of the recdata property.
     * 
     * @return
     *     possible object is
     *     {@link Recdata }
     *     
     */
    public Recdata getRecdata() {
        return recdata;
    }

    /**
     * Sets the value of the recdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recdata }
     *     
     */
    public void setRecdata(Recdata value) {
        this.recdata = value;
    }

    /**
     * Gets the value of the dates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Date }
     * 
     * 
     */
    public List<Date> getDates() {
        if (dates == null) {
            dates = new ArrayList<Date>();
        }
        return this.dates;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the extExrefrecord property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtExrefrecord() {
        return extExrefrecord;
    }

    /**
     * Sets the value of the extExrefrecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtExrefrecord(Object value) {
        this.extExrefrecord = value;
    }

}
