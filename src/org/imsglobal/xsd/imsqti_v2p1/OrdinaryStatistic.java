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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ordinaryStatistic.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ordinaryStatistic.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}ordinaryStatistic.ContentGroup"/&gt;
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}ordinaryStatistic.AttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordinaryStatistic.Type", propOrder = {
    "targetObjects",
    "value"
})
@XmlRootElement(name = "ordinaryStatistic")
public class OrdinaryStatistic {

    @XmlElement(name = "targetObject", required = true)
    protected List<TargetObject> targetObjects;
    @XmlElement(required = true)
    protected Value value;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;
    @XmlAttribute(name = "glossary")
    protected String glossary;
    @XmlAttribute(name = "context", required = true)
    protected String context;
    @XmlAttribute(name = "caseCount")
    protected Integer caseCount;
    @XmlAttribute(name = "stdError")
    protected Double stdError;
    @XmlAttribute(name = "stdDeviation")
    protected Double stdDeviation;
    @XmlAttribute(name = "lastUpdated")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * Gets the value of the targetObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetObject }
     * 
     * 
     */
    public List<TargetObject> getTargetObjects() {
        if (targetObjects == null) {
            targetObjects = new ArrayList<TargetObject>();
        }
        return this.targetObjects;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Value }
     *     
     */
    public Value getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Value }
     *     
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the glossary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlossary() {
        return glossary;
    }

    /**
     * Sets the value of the glossary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlossary(String value) {
        this.glossary = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContext(String value) {
        this.context = value;
    }

    /**
     * Gets the value of the caseCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCaseCount() {
        return caseCount;
    }

    /**
     * Sets the value of the caseCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCaseCount(Integer value) {
        this.caseCount = value;
    }

    /**
     * Gets the value of the stdError property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStdError() {
        return stdError;
    }

    /**
     * Sets the value of the stdError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStdError(Double value) {
        this.stdError = value;
    }

    /**
     * Gets the value of the stdDeviation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStdDeviation() {
        return stdDeviation;
    }

    /**
     * Sets the value of the stdDeviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStdDeviation(Double value) {
        this.stdDeviation = value;
    }

    /**
     * Gets the value of the lastUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Sets the value of the lastUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
    }

}
