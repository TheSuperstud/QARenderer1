//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.12 at 03:51:03 AM CET 
//


package org.imsglobal.xsd.imsqti_v2p1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metadataProfile.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metadataProfile.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}metadataProfile.ContentGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadataProfile.Type", propOrder = {
    "imsmd",
    "lomMetadata",
    "imsqtimd"
})
@XmlRootElement(name = "metadataProfile")
public class MetadataProfile {

    protected boolean imsmd;
    protected boolean lomMetadata;
    protected boolean imsqtimd;

    /**
     * Gets the value of the imsmd property.
     * 
     */
    public boolean isImsmd() {
        return imsmd;
    }

    /**
     * Sets the value of the imsmd property.
     * 
     */
    public void setImsmd(boolean value) {
        this.imsmd = value;
    }

    /**
     * Gets the value of the lomMetadata property.
     * 
     */
    public boolean isLomMetadata() {
        return lomMetadata;
    }

    /**
     * Sets the value of the lomMetadata property.
     * 
     */
    public void setLomMetadata(boolean value) {
        this.lomMetadata = value;
    }

    /**
     * Gets the value of the imsqtimd property.
     * 
     */
    public boolean isImsqtimd() {
        return imsqtimd;
    }

    /**
     * Sets the value of the imsqtimd property.
     * 
     */
    public void setImsqtimd(boolean value) {
        this.imsqtimd = value;
    }

}
