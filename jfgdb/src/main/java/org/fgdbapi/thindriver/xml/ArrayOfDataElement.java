//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.09.21 at 09:16:28 AM CEST
//

package org.fgdbapi.thindriver.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Generic array of objects.
 *
 * <p>Java class for ArrayOfDataElement complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ArrayOfDataElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataElement" type="{http://www.esri.com/schemas/ArcGIS/10.1}DataElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
  name = "ArrayOfDataElement",
  propOrder = {"dataElement"}
)
public class ArrayOfDataElement {

  @XmlElement(name = "DataElement")
  protected List<DataElement> dataElement;

  /**
   * Gets the value of the dataElement property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the dataElement property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getDataElement().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link DataElement }
   */
  public List<DataElement> getDataElement() {
    if (dataElement == null) {
      dataElement = new ArrayList<DataElement>();
    }
    return this.dataElement;
  }
}
