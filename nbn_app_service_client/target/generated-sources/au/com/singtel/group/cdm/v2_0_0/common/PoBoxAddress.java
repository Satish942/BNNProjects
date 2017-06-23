
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PoBoxAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PoBoxAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PostalDeliveryAddress">
 *       &lt;sequence>
 *         &lt;element name="boxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="boxNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoBoxAddress", propOrder = {
    "boxType",
    "boxNr"
})
public class PoBoxAddress
    extends PostalDeliveryAddress
{

    protected String boxType;
    protected String boxNr;

    /**
     * Gets the value of the boxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxType() {
        return boxType;
    }

    /**
     * Sets the value of the boxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxType(String value) {
        this.boxType = value;
    }

    /**
     * Gets the value of the boxNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxNr() {
        return boxNr;
    }

    /**
     * Sets the value of the boxNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxNr(String value) {
        this.boxNr = value;
    }

}
