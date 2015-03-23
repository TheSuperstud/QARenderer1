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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sum.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sum.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}sum.ContentGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sum.Type", propOrder = {
    "andsAndGtsAndOrdereds"
})
@XmlRootElement(name = "sum")
public class Sum {

    @XmlElements({
        @XmlElement(name = "and", type = And.class),
        @XmlElement(name = "gt", type = Gt.class),
        @XmlElement(name = "ordered", type = Ordered.class),
        @XmlElement(name = "divide", type = Divide.class),
        @XmlElement(name = "customOperator", type = CustomOperator.class),
        @XmlElement(name = "random", type = Random.class),
        @XmlElement(name = "numberIncorrect", type = NumberIncorrect.class),
        @XmlElement(name = "substring", type = Substring.class),
        @XmlElement(name = "not", type = Not.class),
        @XmlElement(name = "equalRounded", type = EqualRounded.class),
        @XmlElement(name = "multiple", type = Multiple.class),
        @XmlElement(name = "integerToFloat", type = IntegerToFloat.class),
        @XmlElement(name = "null", type = Null.class),
        @XmlElement(name = "index", type = Index.class),
        @XmlElement(name = "testVariables", type = TestVariables.class),
        @XmlElement(name = "integerDivide", type = IntegerDivide.class),
        @XmlElement(name = "gte", type = Gte.class),
        @XmlElement(name = "durationLT", type = DurationLT.class),
        @XmlElement(name = "contains", type = Contains.class),
        @XmlElement(name = "member", type = Member.class),
        @XmlElement(name = "lt", type = Lt.class),
        @XmlElement(name = "correct", type = Correct.class),
        @XmlElement(name = "numberSelected", type = NumberSelected.class),
        @XmlElement(name = "patternMatch", type = PatternMatch.class),
        @XmlElement(name = "product", type = Product.class),
        @XmlElement(name = "numberPresented", type = NumberPresented.class),
        @XmlElement(name = "power", type = Power.class),
        @XmlElement(name = "mapResponsePoint", type = MapResponsePoint.class),
        @XmlElement(name = "mapResponse", type = MapResponse.class),
        @XmlElement(name = "randomFloat", type = RandomFloat.class),
        @XmlElement(name = "stringMatch", type = StringMatch.class),
        @XmlElement(name = "variable", type = Variable.class),
        @XmlElement(name = "integerModulus", type = IntegerModulus.class),
        @XmlElement(name = "subtract", type = Subtract.class),
        @XmlElement(name = "durationGTE", type = DurationGTE.class),
        @XmlElement(name = "outcomeMaximum", type = OutcomeMaximum.class),
        @XmlElement(name = "anyN", type = AnyN.class),
        @XmlElement(name = "round", type = Round.class),
        @XmlElement(name = "numberResponded", type = NumberResponded.class),
        @XmlElement(name = "baseValue", type = BaseValue.class),
        @XmlElement(name = "default", type = Default.class),
        @XmlElement(name = "inside", type = Inside.class),
        @XmlElement(name = "containerSize", type = ContainerSize.class),
        @XmlElement(name = "equal", type = Equal.class),
        @XmlElement(name = "outcomeMinimum", type = OutcomeMinimum.class),
        @XmlElement(name = "or", type = Or.class),
        @XmlElement(name = "randomInteger", type = RandomInteger.class),
        @XmlElement(name = "isNull", type = IsNull.class),
        @XmlElement(name = "numberCorrect", type = NumberCorrect.class),
        @XmlElement(name = "match", type = Match.class),
        @XmlElement(name = "lte", type = Lte.class),
        @XmlElement(name = "sum", type = Sum.class),
        @XmlElement(name = "truncate", type = Truncate.class),
        @XmlElement(name = "fieldValue", type = FieldValue.class),
        @XmlElement(name = "delete", type = Delete.class)
    })
    protected List<java.lang.Object> andsAndGtsAndOrdereds;

    /**
     * Gets the value of the andsAndGtsAndOrdereds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the andsAndGtsAndOrdereds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAndsAndGtsAndOrdereds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link And }
     * {@link Gt }
     * {@link Ordered }
     * {@link Divide }
     * {@link CustomOperator }
     * {@link Random }
     * {@link NumberIncorrect }
     * {@link Substring }
     * {@link Not }
     * {@link EqualRounded }
     * {@link Multiple }
     * {@link IntegerToFloat }
     * {@link Null }
     * {@link Index }
     * {@link TestVariables }
     * {@link IntegerDivide }
     * {@link Gte }
     * {@link DurationLT }
     * {@link Contains }
     * {@link Member }
     * {@link Lt }
     * {@link Correct }
     * {@link NumberSelected }
     * {@link PatternMatch }
     * {@link Product }
     * {@link NumberPresented }
     * {@link Power }
     * {@link MapResponsePoint }
     * {@link MapResponse }
     * {@link RandomFloat }
     * {@link StringMatch }
     * {@link Variable }
     * {@link IntegerModulus }
     * {@link Subtract }
     * {@link DurationGTE }
     * {@link OutcomeMaximum }
     * {@link AnyN }
     * {@link Round }
     * {@link NumberResponded }
     * {@link BaseValue }
     * {@link Default }
     * {@link Inside }
     * {@link ContainerSize }
     * {@link Equal }
     * {@link OutcomeMinimum }
     * {@link Or }
     * {@link RandomInteger }
     * {@link IsNull }
     * {@link NumberCorrect }
     * {@link Match }
     * {@link Lte }
     * {@link Sum }
     * {@link Truncate }
     * {@link FieldValue }
     * {@link Delete }
     * 
     * 
     */
    public List<java.lang.Object> getAndsAndGtsAndOrdereds() {
        if (andsAndGtsAndOrdereds == null) {
            andsAndGtsAndOrdereds = new ArrayList<java.lang.Object>();
        }
        return this.andsAndGtsAndOrdereds;
    }

}
