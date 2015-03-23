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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._1998.math.mathml.Math;
import org.w3._2001.xinclude.Include;


/**
 * <p>Java class for td.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="td.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}td.ContentGroup"/&gt;
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}td.AttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "td.Type", propOrder = {
    "content"
})
@XmlRootElement(name = "td")
public class Td {

    @XmlElementRefs({
        @XmlElementRef(name = "ol", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Ol.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Acronym.class, required = false),
        @XmlElementRef(name = "endAttemptInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = EndAttemptInteraction.class, required = false),
        @XmlElementRef(name = "drawingInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = DrawingInteraction.class, required = false),
        @XmlElementRef(name = "pre", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Pre.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Cite.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Address.class, required = false),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = Math.class, required = false),
        @XmlElementRef(name = "graphicOrderInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = GraphicOrderInteraction.class, required = false),
        @XmlElementRef(name = "textEntryInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = TextEntryInteraction.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Big.class, required = false),
        @XmlElementRef(name = "p", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = P.class, required = false),
        @XmlElementRef(name = "mediaInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = MediaInteraction.class, required = false),
        @XmlElementRef(name = "graphicGapMatchInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = GraphicGapMatchInteraction.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Var.class, required = false),
        @XmlElementRef(name = "associateInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = AssociateInteraction.class, required = false),
        @XmlElementRef(name = "printedVariable", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = PrintedVariable.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Br.class, required = false),
        @XmlElementRef(name = "feedbackBlock", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = FeedbackBlock.class, required = false),
        @XmlElementRef(name = "rubricBlock", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = RubricBlock.class, required = false),
        @XmlElementRef(name = "h3", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = H3 .class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Tt.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Ul.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Small.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Img.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Abbr.class, required = false),
        @XmlElementRef(name = "customInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = CustomInteraction.class, required = false),
        @XmlElementRef(name = "matchInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = MatchInteraction.class, required = false),
        @XmlElementRef(name = "include", namespace = "http://www.w3.org/2001/XInclude", type = Include.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Q.class, required = false),
        @XmlElementRef(name = "feedbackInline", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = FeedbackInline.class, required = false),
        @XmlElementRef(name = "choiceInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = ChoiceInteraction.class, required = false),
        @XmlElementRef(name = "sliderInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = SliderInteraction.class, required = false),
        @XmlElementRef(name = "hottext", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Hottext.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Sub.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Dfn.class, required = false),
        @XmlElementRef(name = "selectPointInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = SelectPointInteraction.class, required = false),
        @XmlElementRef(name = "h5", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = H5 .class, required = false),
        @XmlElementRef(name = "gapMatchInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = GapMatchInteraction.class, required = false),
        @XmlElementRef(name = "hotspotInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = HotspotInteraction.class, required = false),
        @XmlElementRef(name = "templateBlock", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = TemplateBlock.class, required = false),
        @XmlElementRef(name = "uploadInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = UploadInteraction.class, required = false),
        @XmlElementRef(name = "templateInline", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = TemplateInline.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Samp.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = B.class, required = false),
        @XmlElementRef(name = "h1", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = H1 .class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = I.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Em.class, required = false),
        @XmlElementRef(name = "orderInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = OrderInteraction.class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Hr.class, required = false),
        @XmlElementRef(name = "h2", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = H2 .class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Blockquote.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Code.class, required = false),
        @XmlElementRef(name = "h6", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = H6 .class, required = false),
        @XmlElementRef(name = "h4", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = H4 .class, required = false),
        @XmlElementRef(name = "dl", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Dl.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Sup.class, required = false),
        @XmlElementRef(name = "inlineChoiceInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = InlineChoiceInteraction.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Kbd.class, required = false),
        @XmlElementRef(name = "extendedTextInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = ExtendedTextInteraction.class, required = false),
        @XmlElementRef(name = "graphicAssociateInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = GraphicAssociateInteraction.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Span.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = org.imsglobal.xsd.imsqti_v2p1.Object.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Table.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = A.class, required = false),
        @XmlElementRef(name = "hottextInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = HottextInteraction.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Strong.class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = Div.class, required = false)
    })
    @XmlMixed
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "headers")
    protected List<String> headers;
    @XmlAttribute(name = "scope")
    protected TableCellScopeType scope;
    @XmlAttribute(name = "abbr")
    protected String abbr;
    @XmlAttribute(name = "axis")
    protected String axis;
    @XmlAttribute(name = "rowspan")
    protected Integer rowspan;
    @XmlAttribute(name = "colspan")
    protected Integer colspan;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlAttribute(name = "class")
    protected List<String> clazzs;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "label")
    protected String label;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ol }
     * {@link Acronym }
     * {@link EndAttemptInteraction }
     * {@link DrawingInteraction }
     * {@link Pre }
     * {@link Cite }
     * {@link Address }
     * {@link Math }
     * {@link GraphicOrderInteraction }
     * {@link TextEntryInteraction }
     * {@link Big }
     * {@link P }
     * {@link MediaInteraction }
     * {@link GraphicGapMatchInteraction }
     * {@link Var }
     * {@link AssociateInteraction }
     * {@link PrintedVariable }
     * {@link Br }
     * {@link FeedbackBlock }
     * {@link RubricBlock }
     * {@link H3 }
     * {@link Tt }
     * {@link Ul }
     * {@link Small }
     * {@link Img }
     * {@link Abbr }
     * {@link CustomInteraction }
     * {@link MatchInteraction }
     * {@link Include }
     * {@link Q }
     * {@link FeedbackInline }
     * {@link ChoiceInteraction }
     * {@link SliderInteraction }
     * {@link Hottext }
     * {@link Sub }
     * {@link Dfn }
     * {@link SelectPointInteraction }
     * {@link H5 }
     * {@link GapMatchInteraction }
     * {@link HotspotInteraction }
     * {@link TemplateBlock }
     * {@link UploadInteraction }
     * {@link TemplateInline }
     * {@link Samp }
     * {@link B }
     * {@link String }
     * {@link H1 }
     * {@link I }
     * {@link Em }
     * {@link OrderInteraction }
     * {@link Hr }
     * {@link H2 }
     * {@link Blockquote }
     * {@link Code }
     * {@link H6 }
     * {@link H4 }
     * {@link Dl }
     * {@link Sup }
     * {@link InlineChoiceInteraction }
     * {@link Kbd }
     * {@link ExtendedTextInteraction }
     * {@link GraphicAssociateInteraction }
     * {@link Span }
     * {@link org.imsglobal.xsd.imsqti_v2p1.Object }
     * {@link Table }
     * {@link A }
     * {@link HottextInteraction }
     * {@link Strong }
     * {@link Div }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the headers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<String>();
        }
        return this.headers;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link TableCellScopeType }
     *     
     */
    public TableCellScopeType getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableCellScopeType }
     *     
     */
    public void setScope(TableCellScopeType value) {
        this.scope = value;
    }

    /**
     * Gets the value of the abbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbr() {
        return abbr;
    }

    /**
     * Sets the value of the abbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbr(String value) {
        this.abbr = value;
    }

    /**
     * Gets the value of the axis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAxis() {
        return axis;
    }

    /**
     * Sets the value of the axis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAxis(String value) {
        this.axis = value;
    }

    /**
     * Gets the value of the rowspan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowspan() {
        return rowspan;
    }

    /**
     * Sets the value of the rowspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowspan(Integer value) {
        this.rowspan = value;
    }

    /**
     * Gets the value of the colspan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColspan() {
        return colspan;
    }

    /**
     * Sets the value of the colspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColspan(Integer value) {
        this.colspan = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clazzs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazzs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazzs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClazzs() {
        if (clazzs == null) {
            clazzs = new ArrayList<String>();
        }
        return this.clazzs;
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

}
