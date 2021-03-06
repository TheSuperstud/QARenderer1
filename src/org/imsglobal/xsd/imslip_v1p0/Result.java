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
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}comment" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}interpretscore"/&gt;
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}score"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imslip_v1p0}result" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "comment",
    "results",
    "interpretscoresAndScores"
})
@XmlRootElement(name = "result")
public class Result {

    protected Comment comment;
    @XmlElement(name = "result")
    protected List<Result> results;
    @XmlElements({
        @XmlElement(name = "interpretscore", type = Interpretscore.class),
        @XmlElement(name = "score", type = Score.class)
    })
    protected List<Object> interpretscoresAndScores;

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
     * Gets the value of the interpretscoresAndScores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interpretscoresAndScores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterpretscoresAndScores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Interpretscore }
     * {@link Score }
     * 
     * 
     */
    public List<Object> getInterpretscoresAndScores() {
        if (interpretscoresAndScores == null) {
            interpretscoresAndScores = new ArrayList<Object>();
        }
        return this.interpretscoresAndScores;
    }

}
