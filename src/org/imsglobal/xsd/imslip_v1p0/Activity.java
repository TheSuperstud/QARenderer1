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
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}date" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}status" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}units" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}learningactivityref"/&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}definition"/&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}product"/&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}testimonial"/&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}evaluation"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}activity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}ext_activity" minOccurs="0"/&gt;
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
    "dates",
    "status",
    "units",
    "learningactivityrevesAndDefinitionsAndProducts",
    "description",
    "activities",
    "extActivity"
})
@XmlRootElement(name = "activity")
public class Activity {

    protected Typename typename;
    protected Comment comment;
    protected Contentype contentype;
    @XmlElement(name = "date")
    protected List<Date> dates;
    protected Status status;
    protected Units units;
    @XmlElements({
        @XmlElement(name = "learningactivityref", type = Learningactivityref.class),
        @XmlElement(name = "definition", type = Definition.class),
        @XmlElement(name = "product", type = AqurateProduct.class),
        @XmlElement(name = "testimonial", type = Testimonial.class),
        @XmlElement(name = "evaluation", type = Evaluation.class)
    })
    protected List<Object> learningactivityrevesAndDefinitionsAndProducts;
    protected Description description;
    @XmlElement(name = "activity")
    protected List<Activity> activities;
    @XmlElement(name = "ext_activity")
    protected Object extActivity;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link Units }
     *     
     */
    public Units getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link Units }
     *     
     */
    public void setUnits(Units value) {
        this.units = value;
    }

    /**
     * Gets the value of the learningactivityrevesAndDefinitionsAndProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningactivityrevesAndDefinitionsAndProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningactivityrevesAndDefinitionsAndProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Learningactivityref }
     * {@link Definition }
     * {@link AqurateProduct }
     * {@link Testimonial }
     * {@link Evaluation }
     * 
     * 
     */
    public List<Object> getLearningactivityrevesAndDefinitionsAndProducts() {
        if (learningactivityrevesAndDefinitionsAndProducts == null) {
            learningactivityrevesAndDefinitionsAndProducts = new ArrayList<Object>();
        }
        return this.learningactivityrevesAndDefinitionsAndProducts;
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
     * Gets the value of the activities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Activity }
     * 
     * 
     */
    public List<Activity> getActivities() {
        if (activities == null) {
            activities = new ArrayList<Activity>();
        }
        return this.activities;
    }

    /**
     * Gets the value of the extActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtActivity() {
        return extActivity;
    }

    /**
     * Sets the value of the extActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtActivity(Object value) {
        this.extActivity = value;
    }

}