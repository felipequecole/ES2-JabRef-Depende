//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.20 at 09:48:37 AM BRT 
//


package net.sf.jabref.logic.importer.fileformat.mods;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dateDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dateDefinition">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.loc.gov/mods/v3>stringPlusLanguage">
 *       &lt;attribute name="encoding">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="w3cdtf"/>
 *             &lt;enumeration value="iso8601"/>
 *             &lt;enumeration value="marc"/>
 *             &lt;enumeration value="temper"/>
 *             &lt;enumeration value="edtf"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="qualifier">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="approximate"/>
 *             &lt;enumeration value="inferred"/>
 *             &lt;enumeration value="questionable"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="point">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="start"/>
 *             &lt;enumeration value="end"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="keyDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="yes" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dateDefinition", namespace = "http://www.loc.gov/mods/v3")
@XmlSeeAlso({
    TemporalDefinition.class,
    DateOtherDefinition.class
})
public class DateDefinition
    extends StringPlusLanguage
{

    @XmlAttribute(name = "encoding")
    protected String encoding;
    @XmlAttribute(name = "qualifier")
    protected String qualifier;
    @XmlAttribute(name = "point")
    protected String point;
    @XmlAttribute(name = "keyDate")
    @XmlSchemaType(name = "anySimpleType")
    protected String keyDate;

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoint(String value) {
        this.point = value;
    }

    /**
     * Gets the value of the keyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyDate() {
        if (keyDate == null) {
            return "yes";
        } else {
            return keyDate;
        }
    }

    /**
     * Sets the value of the keyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyDate(String value) {
        this.keyDate = value;
    }

}
