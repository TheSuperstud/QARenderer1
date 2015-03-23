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


/**
 * <p>Java class for assessmentItem.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentItem.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}assessmentItem.ContentGroup"/&gt;
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}assessmentItem.AttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentItem.Type", propOrder = {
    "responseDeclarations",
    "outcomeDeclarations",
    "templateDeclarations",
    "templateProcessing",
    "stylesheets",
    "itemBody",
    "responseProcessing",
    "modalFeedbacks"
})
@XmlRootElement(name = "assessmentItem")
public class AssessmentItem {

    @XmlElement(name = "responseDeclaration")
    protected List<ResponseDeclaration> responseDeclarations;
    @XmlElement(name = "outcomeDeclaration")
    protected List<OutcomeDeclaration> outcomeDeclarations;
    @XmlElement(name = "templateDeclaration")
    protected List<TemplateDeclaration> templateDeclarations;
    protected TemplateProcessing templateProcessing;
    @XmlElement(name = "stylesheet")
    protected List<Stylesheet> stylesheets;
    protected ItemBody itemBody;
    protected ResponseProcessing responseProcessing;
    @XmlElement(name = "modalFeedback")
    protected List<ModalFeedback> modalFeedbacks;
    @XmlAttribute(name = "identifier", required = true)
    protected String identifier;
    @XmlAttribute(name = "title", required = true)
    protected String title;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "adaptive", required = true)
    protected boolean adaptive;
    @XmlAttribute(name = "timeDependent", required = true)
    protected boolean timeDependent;
    @XmlAttribute(name = "toolName")
    protected String toolName;
    @XmlAttribute(name = "toolVersion")
    protected String toolVersion;

    /**
     * Gets the value of the responseDeclarations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseDeclarations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseDeclarations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseDeclaration }
     * 
     * 
     */
    public List<ResponseDeclaration> getResponseDeclarations() {
        if (responseDeclarations == null) {
            responseDeclarations = new ArrayList<ResponseDeclaration>();
        }
        return this.responseDeclarations;
    }

    /**
     * Gets the value of the outcomeDeclarations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outcomeDeclarations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutcomeDeclarations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutcomeDeclaration }
     * 
     * 
     */
    public List<OutcomeDeclaration> getOutcomeDeclarations() {
        if (outcomeDeclarations == null) {
            outcomeDeclarations = new ArrayList<OutcomeDeclaration>();
        }
        return this.outcomeDeclarations;
    }

    /**
     * Gets the value of the templateDeclarations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateDeclarations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateDeclarations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateDeclaration }
     * 
     * 
     */
    public List<TemplateDeclaration> getTemplateDeclarations() {
        if (templateDeclarations == null) {
            templateDeclarations = new ArrayList<TemplateDeclaration>();
        }
        return this.templateDeclarations;
    }

    /**
     * Gets the value of the templateProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateProcessing }
     *     
     */
    public TemplateProcessing getTemplateProcessing() {
        return templateProcessing;
    }

    /**
     * Sets the value of the templateProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateProcessing }
     *     
     */
    public void setTemplateProcessing(TemplateProcessing value) {
        this.templateProcessing = value;
    }

    /**
     * Gets the value of the stylesheets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stylesheets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStylesheets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stylesheet }
     * 
     * 
     */
    public List<Stylesheet> getStylesheets() {
        if (stylesheets == null) {
            stylesheets = new ArrayList<Stylesheet>();
        }
        return this.stylesheets;
    }

    /**
     * Gets the value of the itemBody property.
     * 
     * @return
     *     possible object is
     *     {@link ItemBody }
     *     
     */
    public ItemBody getItemBody() {
        return itemBody;
    }

    /**
     * Sets the value of the itemBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemBody }
     *     
     */
    public void setItemBody(ItemBody value) {
        this.itemBody = value;
    }

    /**
     * Gets the value of the responseProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseProcessing }
     *     
     */
    public ResponseProcessing getResponseProcessing() {
        return responseProcessing;
    }

    /**
     * Sets the value of the responseProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseProcessing }
     *     
     */
    public void setResponseProcessing(ResponseProcessing value) {
        this.responseProcessing = value;
    }

    /**
     * Gets the value of the modalFeedbacks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modalFeedbacks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModalFeedbacks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModalFeedback }
     * 
     * 
     */
    public List<ModalFeedback> getModalFeedbacks() {
        if (modalFeedbacks == null) {
            modalFeedbacks = new ArrayList<ModalFeedback>();
        }
        return this.modalFeedbacks;
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the adaptive property.
     * 
     */
    public boolean isAdaptive() {
        return adaptive;
    }

    /**
     * Sets the value of the adaptive property.
     * 
     */
    public void setAdaptive(boolean value) {
        this.adaptive = value;
    }

    /**
     * Gets the value of the timeDependent property.
     * 
     */
    public boolean isTimeDependent() {
        return timeDependent;
    }

    /**
     * Sets the value of the timeDependent property.
     * 
     */
    public void setTimeDependent(boolean value) {
        this.timeDependent = value;
    }

    /**
     * Gets the value of the toolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolName() {
        return toolName;
    }

    /**
     * Sets the value of the toolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolName(String value) {
        this.toolName = value;
    }

    /**
     * Gets the value of the toolVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolVersion() {
        return toolVersion;
    }

    /**
     * Sets the value of the toolVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolVersion(String value) {
        this.toolVersion = value;
    }

}