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
 * The Geometric Network Membership object.
 * 
 * <p>Java class for GeometricNetworkMembership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeometricNetworkMembership">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.esri.com/schemas/ArcGIS/10.1}ControllerMembership">
 *       &lt;sequence>
 *         &lt;element name="GeometricNetworkName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EnabledFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AncillaryRoleFieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetworkClassAncillaryRole" type="{http://www.esri.com/schemas/ArcGIS/10.1}esriNetworkClassAncillaryRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometricNetworkMembership", propOrder = {
    "geometricNetworkName",
    "enabledFieldName",
    "ancillaryRoleFieldName",
    "networkClassAncillaryRole"
})
public class GeometricNetworkMembership
    extends ControllerMembership
{

    @XmlElement(name = "GeometricNetworkName", required = true)
    protected String geometricNetworkName;
    @XmlElement(name = "EnabledFieldName", required = true)
    protected String enabledFieldName;
    @XmlElement(name = "AncillaryRoleFieldName")
    protected String ancillaryRoleFieldName;
    @XmlElement(name = "NetworkClassAncillaryRole")
    protected EsriNetworkClassAncillaryRole networkClassAncillaryRole;

    /**
     * Gets the value of the geometricNetworkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeometricNetworkName() {
        return geometricNetworkName;
    }

    /**
     * Sets the value of the geometricNetworkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeometricNetworkName(String value) {
        this.geometricNetworkName = value;
    }

    /**
     * Gets the value of the enabledFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabledFieldName() {
        return enabledFieldName;
    }

    /**
     * Sets the value of the enabledFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabledFieldName(String value) {
        this.enabledFieldName = value;
    }

    /**
     * Gets the value of the ancillaryRoleFieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncillaryRoleFieldName() {
        return ancillaryRoleFieldName;
    }

    /**
     * Sets the value of the ancillaryRoleFieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncillaryRoleFieldName(String value) {
        this.ancillaryRoleFieldName = value;
    }

    /**
     * Gets the value of the networkClassAncillaryRole property.
     * 
     * @return
     *     possible object is
     *     {@link EsriNetworkClassAncillaryRole }
     *     
     */
    public EsriNetworkClassAncillaryRole getNetworkClassAncillaryRole() {
        return networkClassAncillaryRole;
    }

    /**
     * Sets the value of the networkClassAncillaryRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsriNetworkClassAncillaryRole }
     *     
     */
    public void setNetworkClassAncillaryRole(EsriNetworkClassAncillaryRole value) {
        this.networkClassAncillaryRole = value;
    }

}
