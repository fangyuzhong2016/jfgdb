//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.21 at 09:16:28 AM CEST 
//


package org.fgdbapi.thindriver.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for esriMergePolicyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="esriMergePolicyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="esriMPTSumValues"/>
 *     &lt;enumeration value="esriMPTAreaWeighted"/>
 *     &lt;enumeration value="esriMPTDefaultValue"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "esriMergePolicyType")
@XmlEnum
public enum EsriMergePolicyType {


    /**
     * Sum the values merge policy.
     * 
     */
    @XmlEnumValue("esriMPTSumValues")
    ESRI_MPT_SUM_VALUES("esriMPTSumValues"),

    /**
     * Area weighted merge policy.
     * 
     */
    @XmlEnumValue("esriMPTAreaWeighted")
    ESRI_MPT_AREA_WEIGHTED("esriMPTAreaWeighted"),

    /**
     * Default value merge policy.
     * 
     */
    @XmlEnumValue("esriMPTDefaultValue")
    ESRI_MPT_DEFAULT_VALUE("esriMPTDefaultValue");
    private final String value;

    EsriMergePolicyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EsriMergePolicyType fromValue(String v) {
        for (EsriMergePolicyType c: EsriMergePolicyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
