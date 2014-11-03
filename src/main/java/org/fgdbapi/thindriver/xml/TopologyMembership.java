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
 * The Topology Membership object.
 * 
 * <p>Java class for TopologyMembership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopologyMembership">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.esri.com/schemas/ArcGIS/10.1}ControllerMembership">
 *       &lt;sequence>
 *         &lt;element name="TopologyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="XYRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ZRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EventNotificationOnValidate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopologyMembership", propOrder = {
    "topologyName",
    "weight",
    "xyRank",
    "zRank",
    "eventNotificationOnValidate"
})
public class TopologyMembership
    extends ControllerMembership
{

    @XmlElement(name = "TopologyName", required = true)
    protected String topologyName;
    @XmlElement(name = "Weight")
    protected double weight;
    @XmlElement(name = "XYRank")
    protected int xyRank;
    @XmlElement(name = "ZRank")
    protected int zRank;
    @XmlElement(name = "EventNotificationOnValidate")
    protected boolean eventNotificationOnValidate;

    /**
     * Gets the value of the topologyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopologyName() {
        return topologyName;
    }

    /**
     * Sets the value of the topologyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopologyName(String value) {
        this.topologyName = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the xyRank property.
     * 
     */
    public int getXYRank() {
        return xyRank;
    }

    /**
     * Sets the value of the xyRank property.
     * 
     */
    public void setXYRank(int value) {
        this.xyRank = value;
    }

    /**
     * Gets the value of the zRank property.
     * 
     */
    public int getZRank() {
        return zRank;
    }

    /**
     * Sets the value of the zRank property.
     * 
     */
    public void setZRank(int value) {
        this.zRank = value;
    }

    /**
     * Gets the value of the eventNotificationOnValidate property.
     * 
     */
    public boolean isEventNotificationOnValidate() {
        return eventNotificationOnValidate;
    }

    /**
     * Sets the value of the eventNotificationOnValidate property.
     * 
     */
    public void setEventNotificationOnValidate(boolean value) {
        this.eventNotificationOnValidate = value;
    }

}
