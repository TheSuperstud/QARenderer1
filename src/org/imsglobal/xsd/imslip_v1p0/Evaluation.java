//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.12 at 03:51:03 AM CET 
//


package org.imsglobal.xsd.imslip_v1p0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}evaluationid" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}date" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}evalmetadata" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}objectives" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}status" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}noofattempts" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}duration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}result" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}evaluation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}ext_evaluation" minOccurs="0"/&gt;
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
    "evaluationid",
    "dates",
    "evalmetadata",
    "objectives",
    "status",
    "noofattempts",
    "durations",
    "results",
    "description",
    "evaluations",
    "extEvaluation"
})
@XmlRootElement(name = "evaluation")
public class Evaluation {

    protected Typename typename;
    protected Comment comment;
    protected Contentype contentype;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String evaluationid;
    @XmlElement(name = "date")
    protected List<Date> dates;
    protected Evalmetadata evalmetadata;
    protected List<Objectives> objectives;
    protected Status status;
    protected BigInteger noofattempts;
    @XmlElement(name = "duration")
    protected List<Duration> durations;
    @XmlElement(name = "result")
    protected List<Result> results;
    protected Description description;
    @XmlElement(name = "evaluation")
    protected List<Evaluation> evaluations;
    @XmlElement(name = "ext_evaluation")
    protected Object extEvaluation;

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
     * Gets the value of the evaluationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationid() {
        return evaluationid;
    }

    /**
     * Sets the value of the evaluationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationid(String value) {
        this.evaluationid = value;
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
     * Gets the value of the evalmetadata property.
     * 
     * @return
     *     possible object is
     *     {@link Evalmetadata }
     *     
     */
    public Evalmetadata getEvalmetadata() {
        return evalmetadata;
    }

    /**
     * Sets the value of the evalmetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Evalmetadata }
     *     
     */
    public void setEvalmetadata(Evalmetadata value) {
        this.evalmetadata = value;
    }

    /**
     * Gets the value of the objectives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Objectives }
     * 
     * 
     */
    public List<Objectives> getObjectives() {
        if (objectives == null) {
            objectives = new ArrayList<Objectives>();
        }
        return this.objectives;
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
     * Gets the value of the noofattempts property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoofattempts() {
        return noofattempts;
    }

    /**
     * Sets the value of the noofattempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoofattempts(BigInteger value) {
        this.noofattempts = value;
    }

    /**
     * Gets the value of the durations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the durations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Duration }
     * 
     * 
     */
    public List<Duration> getDurations() {
        if (durations == null) {
            durations = new ArrayList<Duration>();
        }
        return this.durations;
    }

    /**
     * Gets the value of the results property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the results property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Result }
     * 
     * 
     */
    public List<Result> getResults() {
        if (results == null) {
            results = new ArrayList<Result>();
        }
        return this.results;
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
     * Gets the value of the evaluations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evaluations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvaluations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Evaluation }
     * 
     * 
     */
    public List<Evaluation> getEvaluations() {
        if (evaluations == null) {
            evaluations = new ArrayList<Evaluation>();
        }
        return this.evaluations;
    }

    /**
     * Gets the value of the extEvaluation property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtEvaluation() {
        return extEvaluation;
    }

    /**
     * Sets the value of the extEvaluation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtEvaluation(Object value) {
        this.extEvaluation = value;
    }

}
