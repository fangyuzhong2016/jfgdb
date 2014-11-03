//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.21 at 09:16:28 AM CEST 
//


package org.fgdbapi.thindriver.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ESRI Index Object.
 * 
 * <p>Java class for Index complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Index">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsUnique" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsAscending" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Fields" type="{http://www.esri.com/schemas/ArcGIS/10.1}Fields"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Index", propOrder = {
    "name",
    "isUnique",
    "isAscending",
    "fields"
})
public class Index {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "IsUnique")
    protected boolean isUnique = false;
    @XmlElement(name = "IsAscending")
    protected boolean isAscending = false;
    @XmlElement(name = "Fields", required = true)
    protected Fields fields;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the isUnique property.
     * 
     */
    public boolean isIsUnique() {
        return isUnique;
    }

    /**
     * Sets the value of the isUnique property.
     * 
     */
    public void setIsUnique(boolean value) {
        this.isUnique = value;
    }

    /**
     * Gets the value of the isAscending property.
     * 
     */
    public boolean isIsAscending() {
        return isAscending;
    }

    /**
     * Sets the value of the isAscending property.
     * 
     */
    public void setIsAscending(boolean value) {
        this.isAscending = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link Fields }
     *     
     */
    public Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fields }
     *     
     */
    public void setFields(Fields value) {
        this.fields = value;
    }

}
