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


/**
 * <p>Java class for outcomeVariable.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outcomeVariable.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}outcomeVariable.ContentGroup"/&gt;
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}outcomeVariable.AttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomeVariable.Type", propOrder = {
    "values"
})
@XmlRootElement(name = "outcomeVariable")
public class OutcomeVariable {

    @XmlElement(name = "value")
    protected List<Value> values;
    @XmlAttribute(name = "view")
    protected List<ViewType> views;
    @XmlAttribute(name = "interpretation")
    protected String interpretation;
    @XmlAttribute(name = "longInterpretation")
    protected String longInterpretation;
    @XmlAttribute(name = "normalMaximum")
    protected Double normalMaximum;
    @XmlAttribute(name = "normalMinimum")
    protected Double normalMinimum;
    @XmlAttribute(name = "masteryValue")
    protected Double masteryValue;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
    @XmlAttribute(name = "cardinality", required = true)
    protected CardinalityType cardinality;
    @XmlAttribute(name = "baseType")
    protected BaseTypeType baseType;

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Value }
     * 
     * 
     */
    public List<Value> getValues() {
        if (values == null) {
            values = new ArrayList<Value>();
        }
        return this.values;
    }

    /**
     * Gets the value of the views property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the views property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViews().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewType }
     * 
     * 
     */
    public List<ViewType> getViews() {
        if (views == null) {
            views = new ArrayList<ViewType>();
        }
        return this.views;
    }

    /**
     * Gets the value of the interpretation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretation() {
        return interpretation;
    }

    /**
     * Sets the value of the interpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretation(String value) {
        this.interpretation = value;
    }

    /**
     * Gets the value of the longInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongInterpretation() {
        return longInterpretation;
    }

    /**
     * Sets the value of the longInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongInterpretation(String value) {
        this.longInterpretation = value;
    }

    /**
     * Gets the value of the normalMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNormalMaximum() {
        return normalMaximum;
    }

    /**
     * Sets the value of the normalMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNormalMaximum(Double value) {
        this.normalMaximum = value;
    }

    /**
     * Gets the value of the normalMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNormalMinimum() {
        return normalMinimum;
    }

    /**
     * Sets the value of the normalMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNormalMinimum(Double value) {
        this.normalMinimum = value;
    }

    /**
     * Gets the value of the masteryValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMasteryValue() {
        return masteryValue;
    }

    /**
     * Sets the value of the masteryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMasteryValue(Double value) {
        this.masteryValue = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the cardinality property.
     * 
     * @return
     *     possible object is
     *     {@link CardinalityType }
     *     
     */
    public CardinalityType getCardinality() {
        return cardinality;
    }

    /**
     * Sets the value of the cardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardinalityType }
     *     
     */
    public void setCardinality(CardinalityType value) {
        this.cardinality = value;
    }

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link BaseTypeType }
     *     
     */
    public BaseTypeType getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseTypeType }
     *     
     */
    public void setBaseType(BaseTypeType value) {
        this.baseType = value;
    }

}