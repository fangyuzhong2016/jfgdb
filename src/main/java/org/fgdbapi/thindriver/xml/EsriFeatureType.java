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
 * <p>Java class for esriFeatureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="esriFeatureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="esriFTSimple"/>
 *     &lt;enumeration value="esriFTSimpleJunction"/>
 *     &lt;enumeration value="esriFTSimpleEdge"/>
 *     &lt;enumeration value="esriFTComplexJunction"/>
 *     &lt;enumeration value="esriFTComplexEdge"/>
 *     &lt;enumeration value="esriFTAnnotation"/>
 *     &lt;enumeration value="esriFTCoverageAnnotation"/>
 *     &lt;enumeration value="esriFTDimension"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "esriFeatureType")
@XmlEnum
public enum EsriFeatureType {


    /**
     * Simple Feature.
     * 
     */
    @XmlEnumValue("esriFTSimple")
    ESRI_FT_SIMPLE("esriFTSimple"),

    /**
     * Simple Junction Feature.
     * 
     */
    @XmlEnumValue("esriFTSimpleJunction")
    ESRI_FT_SIMPLE_JUNCTION("esriFTSimpleJunction"),

    /**
     * Simple Edge Feature.
     * 
     */
    @XmlEnumValue("esriFTSimpleEdge")
    ESRI_FT_SIMPLE_EDGE("esriFTSimpleEdge"),

    /**
     * Complex Junction Feature.
     * 
     */
    @XmlEnumValue("esriFTComplexJunction")
    ESRI_FT_COMPLEX_JUNCTION("esriFTComplexJunction"),

    /**
     * Complex Edge Feature.
     * 
     */
    @XmlEnumValue("esriFTComplexEdge")
    ESRI_FT_COMPLEX_EDGE("esriFTComplexEdge"),

    /**
     * Annotation Feature.
     * 
     */
    @XmlEnumValue("esriFTAnnotation")
    ESRI_FT_ANNOTATION("esriFTAnnotation"),

    /**
     * Coverage Annotation Feature.
     * 
     */
    @XmlEnumValue("esriFTCoverageAnnotation")
    ESRI_FT_COVERAGE_ANNOTATION("esriFTCoverageAnnotation"),

    /**
     * Dimension Feature.
     * 
     */
    @XmlEnumValue("esriFTDimension")
    ESRI_FT_DIMENSION("esriFTDimension");
    private final String value;

    EsriFeatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EsriFeatureType fromValue(String v) {
        for (EsriFeatureType c: EsriFeatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
