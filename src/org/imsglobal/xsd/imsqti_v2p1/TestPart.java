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
 * <p>Java class for testPart.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testPart.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}testPart.ContentGroup"/&gt;
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}testPart.AttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testPart.Type", propOrder = {
    "preConditions",
    "branchRules",
    "itemSessionControl",
    "timeLimits",
    "assessmentSections",
    "testFeedbacks"
})
@XmlRootElement(name = "testPart")
public class TestPart {

    @XmlElement(name = "preCondition")
    protected List<PreCondition> preConditions;
    @XmlElement(name = "branchRule")
    protected List<BranchRule> branchRules;
    protected ItemSessionControl itemSessionControl;
    protected TimeLimits timeLimits;
    @XmlElement(name = "assessmentSection", required = true)
    protected List<AssessmentSection> assessmentSections;
    @XmlElement(name = "testFeedback")
    protected List<TestFeedback> testFeedbacks;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
    @XmlAttribute(name = "navigationMode", required = true)
    protected NavigationModeType navigationMode;
    @XmlAttribute(name = "submissionMode", required = true)
    protected SubmissionModeType submissionMode;

    /**
     * Gets the value of the preConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreCondition }
     * 
     * 
     */
    public List<PreCondition> getPreConditions() {
        if (preConditions == null) {
            preConditions = new ArrayList<PreCondition>();
        }
        return this.preConditions;
    }

    /**
     * Gets the value of the branchRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchRule }
     * 
     * 
     */
    public List<BranchRule> getBranchRules() {
        if (branchRules == null) {
            branchRules = new ArrayList<BranchRule>();
        }
        return this.branchRules;
    }

    /**
     * Gets the value of the itemSessionControl property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSessionControl }
     *     
     */
    public ItemSessionControl getItemSessionControl() {
        return itemSessionControl;
    }

    /**
     * Sets the value of the itemSessionControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSessionControl }
     *     
     */
    public void setItemSessionControl(ItemSessionControl value) {
        this.itemSessionControl = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link TimeLimits }
     *     
     */
    public TimeLimits getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeLimits }
     *     
     */
    public void setTimeLimits(TimeLimits value) {
        this.timeLimits = value;
    }

    /**
     * Gets the value of the assessmentSections property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentSections property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentSections().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentSection }
     * 
     * 
     */
    public List<AssessmentSection> getAssessmentSections() {
        if (assessmentSections == null) {
            assessmentSections = new ArrayList<AssessmentSection>();
        }
        return this.assessmentSections;
    }

    /**
     * Gets the value of the testFeedbacks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testFeedbacks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestFeedbacks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestFeedback }
     * 
     * 
     */
    public List<TestFeedback> getTestFeedbacks() {
        if (testFeedbacks == null) {
            testFeedbacks = new ArrayList<TestFeedback>();
        }
        return this.testFeedbacks;
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
     * Gets the value of the navigationMode property.
     * 
     * @return
     *     possible object is
     *     {@link NavigationModeType }
     *     
     */
    public NavigationModeType getNavigationMode() {
        return navigationMode;
    }

    /**
     * Sets the value of the navigationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavigationModeType }
     *     
     */
    public void setNavigationMode(NavigationModeType value) {
        this.navigationMode = value;
    }

    /**
     * Gets the value of the submissionMode property.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionModeType }
     *     
     */
    public SubmissionModeType getSubmissionMode() {
        return submissionMode;
    }

    /**
     * Sets the value of the submissionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionModeType }
     *     
     */
    public void setSubmissionMode(SubmissionModeType value) {
        this.submissionMode = value;
    }

}
