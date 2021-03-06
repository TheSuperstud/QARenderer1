//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.12 at 03:51:03 AM CET 
//


package org.imsglobal.xsd.imslip_v1p0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="mediamode" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="Text"/&gt;
 *             &lt;enumeration value="Image"/&gt;
 *             &lt;enumeration value="Video"/&gt;
 *             &lt;enumeration value="Audio"/&gt;
 *             &lt;enumeration value="Applet"/&gt;
 *             &lt;enumeration value="Application"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="contentreftype" default="Base-64"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="uri"/&gt;
 *             &lt;enumeration value="entityref"/&gt;
 *             &lt;enumeration value="Base-64"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="mimetype" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "media")
public class Media {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "mediamode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mediamode;
    @XmlAttribute(name = "contentreftype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contentreftype;
    @XmlAttribute(name = "mimetype", required = true)
    protected String mimetype;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the mediamode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediamode() {
        return mediamode;
    }

    /**
     * Sets the value of the mediamode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediamode(String value) {
        this.mediamode = value;
    }

    /**
     * Gets the value of the contentreftype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentreftype() {
        if (contentreftype == null) {
            return "Base-64";
        } else {
            return contentreftype;
        }
    }

    /**
     * Sets the value of the contentreftype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentreftype(String value) {
        this.contentreftype = value;
    }

    /**
     * Gets the value of the mimetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimetype() {
        return mimetype;
    }

    /**
     * Sets the value of the mimetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimetype(String value) {
        this.mimetype = value;
    }

}
