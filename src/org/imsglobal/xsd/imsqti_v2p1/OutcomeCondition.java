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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outcomeCondition.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outcomeCondition.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}outcomeCondition.ContentGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outcomeCondition.Type", propOrder = {
    "outcomeIf",
    "outcomeElseIves",
    "outcomeElse"
})
@XmlRootElement(name = "outcomeCondition")
public class OutcomeCondition {

    @XmlElement(required = true)
    protected OutcomeIf outcomeIf;
    @XmlElement(name = "outcomeElseIf")
    protected List<OutcomeElseIf> outcomeElseIves;
    protected OutcomeElse outcomeElse;

    /**
     * Gets the value of the outcomeIf property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeIf }
     *     
     */
    public OutcomeIf getOutcomeIf() {
        return outcomeIf;
    }

    /**
     * Sets the value of the outcomeIf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeIf }
     *     
     */
    public void setOutcomeIf(OutcomeIf value) {
        this.outcomeIf = value;
    }

    /**
     * Gets the value of the outcomeElseIves property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outcomeElseIves property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutcomeElseIves().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutcomeElseIf }
     * 
     * 
     */
    public List<OutcomeElseIf> getOutcomeElseIves() {
        if (outcomeElseIves == null) {
            outcomeElseIves = new ArrayList<OutcomeElseIf>();
        }
        return this.outcomeElseIves;
    }

    /**
     * Gets the value of the outcomeElse property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeElse }
     *     
     */
    public OutcomeElse getOutcomeElse() {
        return outcomeElse;
    }

    /**
     * Sets the value of the outcomeElse property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeElse }
     *     
     */
    public void setOutcomeElse(OutcomeElse value) {
        this.outcomeElse = value;
    }

}
