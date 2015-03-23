//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.12 at 03:51:03 AM CET 
//


package org.imsglobal.xsd.imsqti_v2p1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for fieldValue.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fieldValue.Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}fieldValue.ContentGroup"/&gt;
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}fieldValue.AttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldValue.Type", propOrder = {
    "delete",
    "fieldValue",
    "truncate",
    "sum",
    "lte",
    "match",
    "numberCorrect",
    "isNull",
    "randomInteger",
    "or",
    "outcomeMinimum",
    "equal",
    "containerSize",
    "inside",
    "_default",
    "baseValue",
    "numberResponded",
    "round",
    "anyN",
    "outcomeMaximum",
    "durationGTE",
    "subtract",
    "integerModulus",
    "variable",
    "stringMatch",
    "randomFloat",
    "mapResponse",
    "mapResponsePoint",
    "power",
    "numberPresented",
    "product",
    "patternMatch",
    "numberSelected",
    "correct",
    "lt",
    "member",
    "contains",
    "durationLT",
    "gte",
    "integerDivide",
    "testVariables",
    "index",
    "_null",
    "integerToFloat",
    "multiple",
    "equalRounded",
    "not",
    "substring",
    "numberIncorrect",
    "random",
    "customOperator",
    "divide",
    "ordered",
    "gt",
    "and"
})
@XmlRootElement(name = "fieldValue")
public class FieldValue {

    protected Delete delete;
    protected FieldValue fieldValue;
    protected Truncate truncate;
    protected Sum sum;
    protected Lte lte;
    protected Match match;
    protected NumberCorrect numberCorrect;
    protected IsNull isNull;
    protected RandomInteger randomInteger;
    protected Or or;
    protected OutcomeMinimum outcomeMinimum;
    protected Equal equal;
    protected ContainerSize containerSize;
    protected Inside inside;
    @XmlElement(name = "default")
    protected Default _default;
    protected BaseValue baseValue;
    protected NumberResponded numberResponded;
    protected Round round;
    protected AnyN anyN;
    protected OutcomeMaximum outcomeMaximum;
    protected DurationGTE durationGTE;
    protected Subtract subtract;
    protected IntegerModulus integerModulus;
    protected Variable variable;
    protected StringMatch stringMatch;
    protected RandomFloat randomFloat;
    protected MapResponse mapResponse;
    protected MapResponsePoint mapResponsePoint;
    protected Power power;
    protected NumberPresented numberPresented;
    protected Product product;
    protected PatternMatch patternMatch;
    protected NumberSelected numberSelected;
    protected Correct correct;
    protected Lt lt;
    protected Member member;
    protected Contains contains;
    protected DurationLT durationLT;
    protected Gte gte;
    protected IntegerDivide integerDivide;
    protected TestVariables testVariables;
    protected Index index;
    @XmlElement(name = "null")
    protected Null _null;
    protected IntegerToFloat integerToFloat;
    protected Multiple multiple;
    protected EqualRounded equalRounded;
    protected Not not;
    protected Substring substring;
    protected NumberIncorrect numberIncorrect;
    protected Random random;
    protected CustomOperator customOperator;
    protected Divide divide;
    protected Ordered ordered;
    protected Gt gt;
    protected And and;
    @XmlAttribute(name = "fieldIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fieldIdentifier;

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Delete }
     *     
     */
    public Delete getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delete }
     *     
     */
    public void setDelete(Delete value) {
        this.delete = value;
    }

    /**
     * Gets the value of the fieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link FieldValue }
     *     
     */
    public FieldValue getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets the value of the fieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldValue }
     *     
     */
    public void setFieldValue(FieldValue value) {
        this.fieldValue = value;
    }

    /**
     * Gets the value of the truncate property.
     * 
     * @return
     *     possible object is
     *     {@link Truncate }
     *     
     */
    public Truncate getTruncate() {
        return truncate;
    }

    /**
     * Sets the value of the truncate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Truncate }
     *     
     */
    public void setTruncate(Truncate value) {
        this.truncate = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link Sum }
     *     
     */
    public Sum getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sum }
     *     
     */
    public void setSum(Sum value) {
        this.sum = value;
    }

    /**
     * Gets the value of the lte property.
     * 
     * @return
     *     possible object is
     *     {@link Lte }
     *     
     */
    public Lte getLte() {
        return lte;
    }

    /**
     * Sets the value of the lte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lte }
     *     
     */
    public void setLte(Lte value) {
        this.lte = value;
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link Match }
     *     
     */
    public Match getMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link Match }
     *     
     */
    public void setMatch(Match value) {
        this.match = value;
    }

    /**
     * Gets the value of the numberCorrect property.
     * 
     * @return
     *     possible object is
     *     {@link NumberCorrect }
     *     
     */
    public NumberCorrect getNumberCorrect() {
        return numberCorrect;
    }

    /**
     * Sets the value of the numberCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberCorrect }
     *     
     */
    public void setNumberCorrect(NumberCorrect value) {
        this.numberCorrect = value;
    }

    /**
     * Gets the value of the isNull property.
     * 
     * @return
     *     possible object is
     *     {@link IsNull }
     *     
     */
    public IsNull getIsNull() {
        return isNull;
    }

    /**
     * Sets the value of the isNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsNull }
     *     
     */
    public void setIsNull(IsNull value) {
        this.isNull = value;
    }

    /**
     * Gets the value of the randomInteger property.
     * 
     * @return
     *     possible object is
     *     {@link RandomInteger }
     *     
     */
    public RandomInteger getRandomInteger() {
        return randomInteger;
    }

    /**
     * Sets the value of the randomInteger property.
     * 
     * @param value
     *     allowed object is
     *     {@link RandomInteger }
     *     
     */
    public void setRandomInteger(RandomInteger value) {
        this.randomInteger = value;
    }

    /**
     * Gets the value of the or property.
     * 
     * @return
     *     possible object is
     *     {@link Or }
     *     
     */
    public Or getOr() {
        return or;
    }

    /**
     * Sets the value of the or property.
     * 
     * @param value
     *     allowed object is
     *     {@link Or }
     *     
     */
    public void setOr(Or value) {
        this.or = value;
    }

    /**
     * Gets the value of the outcomeMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeMinimum }
     *     
     */
    public OutcomeMinimum getOutcomeMinimum() {
        return outcomeMinimum;
    }

    /**
     * Sets the value of the outcomeMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeMinimum }
     *     
     */
    public void setOutcomeMinimum(OutcomeMinimum value) {
        this.outcomeMinimum = value;
    }

    /**
     * Gets the value of the equal property.
     * 
     * @return
     *     possible object is
     *     {@link Equal }
     *     
     */
    public Equal getEqual() {
        return equal;
    }

    /**
     * Sets the value of the equal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Equal }
     *     
     */
    public void setEqual(Equal value) {
        this.equal = value;
    }

    /**
     * Gets the value of the containerSize property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerSize }
     *     
     */
    public ContainerSize getContainerSize() {
        return containerSize;
    }

    /**
     * Sets the value of the containerSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerSize }
     *     
     */
    public void setContainerSize(ContainerSize value) {
        this.containerSize = value;
    }

    /**
     * Gets the value of the inside property.
     * 
     * @return
     *     possible object is
     *     {@link Inside }
     *     
     */
    public Inside getInside() {
        return inside;
    }

    /**
     * Sets the value of the inside property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inside }
     *     
     */
    public void setInside(Inside value) {
        this.inside = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Default }
     *     
     */
    public Default getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Default }
     *     
     */
    public void setDefault(Default value) {
        this._default = value;
    }

    /**
     * Gets the value of the baseValue property.
     * 
     * @return
     *     possible object is
     *     {@link BaseValue }
     *     
     */
    public BaseValue getBaseValue() {
        return baseValue;
    }

    /**
     * Sets the value of the baseValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseValue }
     *     
     */
    public void setBaseValue(BaseValue value) {
        this.baseValue = value;
    }

    /**
     * Gets the value of the numberResponded property.
     * 
     * @return
     *     possible object is
     *     {@link NumberResponded }
     *     
     */
    public NumberResponded getNumberResponded() {
        return numberResponded;
    }

    /**
     * Sets the value of the numberResponded property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberResponded }
     *     
     */
    public void setNumberResponded(NumberResponded value) {
        this.numberResponded = value;
    }

    /**
     * Gets the value of the round property.
     * 
     * @return
     *     possible object is
     *     {@link Round }
     *     
     */
    public Round getRound() {
        return round;
    }

    /**
     * Sets the value of the round property.
     * 
     * @param value
     *     allowed object is
     *     {@link Round }
     *     
     */
    public void setRound(Round value) {
        this.round = value;
    }

    /**
     * Gets the value of the anyN property.
     * 
     * @return
     *     possible object is
     *     {@link AnyN }
     *     
     */
    public AnyN getAnyN() {
        return anyN;
    }

    /**
     * Sets the value of the anyN property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyN }
     *     
     */
    public void setAnyN(AnyN value) {
        this.anyN = value;
    }

    /**
     * Gets the value of the outcomeMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link OutcomeMaximum }
     *     
     */
    public OutcomeMaximum getOutcomeMaximum() {
        return outcomeMaximum;
    }

    /**
     * Sets the value of the outcomeMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutcomeMaximum }
     *     
     */
    public void setOutcomeMaximum(OutcomeMaximum value) {
        this.outcomeMaximum = value;
    }

    /**
     * Gets the value of the durationGTE property.
     * 
     * @return
     *     possible object is
     *     {@link DurationGTE }
     *     
     */
    public DurationGTE getDurationGTE() {
        return durationGTE;
    }

    /**
     * Sets the value of the durationGTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationGTE }
     *     
     */
    public void setDurationGTE(DurationGTE value) {
        this.durationGTE = value;
    }

    /**
     * Gets the value of the subtract property.
     * 
     * @return
     *     possible object is
     *     {@link Subtract }
     *     
     */
    public Subtract getSubtract() {
        return subtract;
    }

    /**
     * Sets the value of the subtract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subtract }
     *     
     */
    public void setSubtract(Subtract value) {
        this.subtract = value;
    }

    /**
     * Gets the value of the integerModulus property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerModulus }
     *     
     */
    public IntegerModulus getIntegerModulus() {
        return integerModulus;
    }

    /**
     * Sets the value of the integerModulus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerModulus }
     *     
     */
    public void setIntegerModulus(IntegerModulus value) {
        this.integerModulus = value;
    }

    /**
     * Gets the value of the variable property.
     * 
     * @return
     *     possible object is
     *     {@link Variable }
     *     
     */
    public Variable getVariable() {
        return variable;
    }

    /**
     * Sets the value of the variable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Variable }
     *     
     */
    public void setVariable(Variable value) {
        this.variable = value;
    }

    /**
     * Gets the value of the stringMatch property.
     * 
     * @return
     *     possible object is
     *     {@link StringMatch }
     *     
     */
    public StringMatch getStringMatch() {
        return stringMatch;
    }

    /**
     * Sets the value of the stringMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringMatch }
     *     
     */
    public void setStringMatch(StringMatch value) {
        this.stringMatch = value;
    }

    /**
     * Gets the value of the randomFloat property.
     * 
     * @return
     *     possible object is
     *     {@link RandomFloat }
     *     
     */
    public RandomFloat getRandomFloat() {
        return randomFloat;
    }

    /**
     * Sets the value of the randomFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RandomFloat }
     *     
     */
    public void setRandomFloat(RandomFloat value) {
        this.randomFloat = value;
    }

    /**
     * Gets the value of the mapResponse property.
     * 
     * @return
     *     possible object is
     *     {@link MapResponse }
     *     
     */
    public MapResponse getMapResponse() {
        return mapResponse;
    }

    /**
     * Sets the value of the mapResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapResponse }
     *     
     */
    public void setMapResponse(MapResponse value) {
        this.mapResponse = value;
    }

    /**
     * Gets the value of the mapResponsePoint property.
     * 
     * @return
     *     possible object is
     *     {@link MapResponsePoint }
     *     
     */
    public MapResponsePoint getMapResponsePoint() {
        return mapResponsePoint;
    }

    /**
     * Sets the value of the mapResponsePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapResponsePoint }
     *     
     */
    public void setMapResponsePoint(MapResponsePoint value) {
        this.mapResponsePoint = value;
    }

    /**
     * Gets the value of the power property.
     * 
     * @return
     *     possible object is
     *     {@link Power }
     *     
     */
    public Power getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     * 
     * @param value
     *     allowed object is
     *     {@link Power }
     *     
     */
    public void setPower(Power value) {
        this.power = value;
    }

    /**
     * Gets the value of the numberPresented property.
     * 
     * @return
     *     possible object is
     *     {@link NumberPresented }
     *     
     */
    public NumberPresented getNumberPresented() {
        return numberPresented;
    }

    /**
     * Sets the value of the numberPresented property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberPresented }
     *     
     */
    public void setNumberPresented(NumberPresented value) {
        this.numberPresented = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the patternMatch property.
     * 
     * @return
     *     possible object is
     *     {@link PatternMatch }
     *     
     */
    public PatternMatch getPatternMatch() {
        return patternMatch;
    }

    /**
     * Sets the value of the patternMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatternMatch }
     *     
     */
    public void setPatternMatch(PatternMatch value) {
        this.patternMatch = value;
    }

    /**
     * Gets the value of the numberSelected property.
     * 
     * @return
     *     possible object is
     *     {@link NumberSelected }
     *     
     */
    public NumberSelected getNumberSelected() {
        return numberSelected;
    }

    /**
     * Sets the value of the numberSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberSelected }
     *     
     */
    public void setNumberSelected(NumberSelected value) {
        this.numberSelected = value;
    }

    /**
     * Gets the value of the correct property.
     * 
     * @return
     *     possible object is
     *     {@link Correct }
     *     
     */
    public Correct getCorrect() {
        return correct;
    }

    /**
     * Sets the value of the correct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Correct }
     *     
     */
    public void setCorrect(Correct value) {
        this.correct = value;
    }

    /**
     * Gets the value of the lt property.
     * 
     * @return
     *     possible object is
     *     {@link Lt }
     *     
     */
    public Lt getLt() {
        return lt;
    }

    /**
     * Sets the value of the lt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lt }
     *     
     */
    public void setLt(Lt value) {
        this.lt = value;
    }

    /**
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link Member }
     *     
     */
    public Member getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link Member }
     *     
     */
    public void setMember(Member value) {
        this.member = value;
    }

    /**
     * Gets the value of the contains property.
     * 
     * @return
     *     possible object is
     *     {@link Contains }
     *     
     */
    public Contains getContains() {
        return contains;
    }

    /**
     * Sets the value of the contains property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contains }
     *     
     */
    public void setContains(Contains value) {
        this.contains = value;
    }

    /**
     * Gets the value of the durationLT property.
     * 
     * @return
     *     possible object is
     *     {@link DurationLT }
     *     
     */
    public DurationLT getDurationLT() {
        return durationLT;
    }

    /**
     * Sets the value of the durationLT property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationLT }
     *     
     */
    public void setDurationLT(DurationLT value) {
        this.durationLT = value;
    }

    /**
     * Gets the value of the gte property.
     * 
     * @return
     *     possible object is
     *     {@link Gte }
     *     
     */
    public Gte getGte() {
        return gte;
    }

    /**
     * Sets the value of the gte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gte }
     *     
     */
    public void setGte(Gte value) {
        this.gte = value;
    }

    /**
     * Gets the value of the integerDivide property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerDivide }
     *     
     */
    public IntegerDivide getIntegerDivide() {
        return integerDivide;
    }

    /**
     * Sets the value of the integerDivide property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerDivide }
     *     
     */
    public void setIntegerDivide(IntegerDivide value) {
        this.integerDivide = value;
    }

    /**
     * Gets the value of the testVariables property.
     * 
     * @return
     *     possible object is
     *     {@link TestVariables }
     *     
     */
    public TestVariables getTestVariables() {
        return testVariables;
    }

    /**
     * Sets the value of the testVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestVariables }
     *     
     */
    public void setTestVariables(TestVariables value) {
        this.testVariables = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Index }
     *     
     */
    public Index getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Index }
     *     
     */
    public void setIndex(Index value) {
        this.index = value;
    }

    /**
     * Gets the value of the null property.
     * 
     * @return
     *     possible object is
     *     {@link Null }
     *     
     */
    public Null getNull() {
        return _null;
    }

    /**
     * Sets the value of the null property.
     * 
     * @param value
     *     allowed object is
     *     {@link Null }
     *     
     */
    public void setNull(Null value) {
        this._null = value;
    }

    /**
     * Gets the value of the integerToFloat property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerToFloat }
     *     
     */
    public IntegerToFloat getIntegerToFloat() {
        return integerToFloat;
    }

    /**
     * Sets the value of the integerToFloat property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerToFloat }
     *     
     */
    public void setIntegerToFloat(IntegerToFloat value) {
        this.integerToFloat = value;
    }

    /**
     * Gets the value of the multiple property.
     * 
     * @return
     *     possible object is
     *     {@link Multiple }
     *     
     */
    public Multiple getMultiple() {
        return multiple;
    }

    /**
     * Sets the value of the multiple property.
     * 
     * @param value
     *     allowed object is
     *     {@link Multiple }
     *     
     */
    public void setMultiple(Multiple value) {
        this.multiple = value;
    }

    /**
     * Gets the value of the equalRounded property.
     * 
     * @return
     *     possible object is
     *     {@link EqualRounded }
     *     
     */
    public EqualRounded getEqualRounded() {
        return equalRounded;
    }

    /**
     * Sets the value of the equalRounded property.
     * 
     * @param value
     *     allowed object is
     *     {@link EqualRounded }
     *     
     */
    public void setEqualRounded(EqualRounded value) {
        this.equalRounded = value;
    }

    /**
     * Gets the value of the not property.
     * 
     * @return
     *     possible object is
     *     {@link Not }
     *     
     */
    public Not getNot() {
        return not;
    }

    /**
     * Sets the value of the not property.
     * 
     * @param value
     *     allowed object is
     *     {@link Not }
     *     
     */
    public void setNot(Not value) {
        this.not = value;
    }

    /**
     * Gets the value of the substring property.
     * 
     * @return
     *     possible object is
     *     {@link Substring }
     *     
     */
    public Substring getSubstring() {
        return substring;
    }

    /**
     * Sets the value of the substring property.
     * 
     * @param value
     *     allowed object is
     *     {@link Substring }
     *     
     */
    public void setSubstring(Substring value) {
        this.substring = value;
    }

    /**
     * Gets the value of the numberIncorrect property.
     * 
     * @return
     *     possible object is
     *     {@link NumberIncorrect }
     *     
     */
    public NumberIncorrect getNumberIncorrect() {
        return numberIncorrect;
    }

    /**
     * Sets the value of the numberIncorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberIncorrect }
     *     
     */
    public void setNumberIncorrect(NumberIncorrect value) {
        this.numberIncorrect = value;
    }

    /**
     * Gets the value of the random property.
     * 
     * @return
     *     possible object is
     *     {@link Random }
     *     
     */
    public Random getRandom() {
        return random;
    }

    /**
     * Sets the value of the random property.
     * 
     * @param value
     *     allowed object is
     *     {@link Random }
     *     
     */
    public void setRandom(Random value) {
        this.random = value;
    }

    /**
     * Gets the value of the customOperator property.
     * 
     * @return
     *     possible object is
     *     {@link CustomOperator }
     *     
     */
    public CustomOperator getCustomOperator() {
        return customOperator;
    }

    /**
     * Sets the value of the customOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomOperator }
     *     
     */
    public void setCustomOperator(CustomOperator value) {
        this.customOperator = value;
    }

    /**
     * Gets the value of the divide property.
     * 
     * @return
     *     possible object is
     *     {@link Divide }
     *     
     */
    public Divide getDivide() {
        return divide;
    }

    /**
     * Sets the value of the divide property.
     * 
     * @param value
     *     allowed object is
     *     {@link Divide }
     *     
     */
    public void setDivide(Divide value) {
        this.divide = value;
    }

    /**
     * Gets the value of the ordered property.
     * 
     * @return
     *     possible object is
     *     {@link Ordered }
     *     
     */
    public Ordered getOrdered() {
        return ordered;
    }

    /**
     * Sets the value of the ordered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ordered }
     *     
     */
    public void setOrdered(Ordered value) {
        this.ordered = value;
    }

    /**
     * Gets the value of the gt property.
     * 
     * @return
     *     possible object is
     *     {@link Gt }
     *     
     */
    public Gt getGt() {
        return gt;
    }

    /**
     * Sets the value of the gt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gt }
     *     
     */
    public void setGt(Gt value) {
        this.gt = value;
    }

    /**
     * Gets the value of the and property.
     * 
     * @return
     *     possible object is
     *     {@link And }
     *     
     */
    public And getAnd() {
        return and;
    }

    /**
     * Sets the value of the and property.
     * 
     * @param value
     *     allowed object is
     *     {@link And }
     *     
     */
    public void setAnd(And value) {
        this.and = value;
    }

    /**
     * Gets the value of the fieldIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldIdentifier() {
        return fieldIdentifier;
    }

    /**
     * Sets the value of the fieldIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldIdentifier(String value) {
        this.fieldIdentifier = value;
    }

}
