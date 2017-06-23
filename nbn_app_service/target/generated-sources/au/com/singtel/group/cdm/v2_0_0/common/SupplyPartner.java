
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplyPartner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplyPartner">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PartyRole">
 *       &lt;sequence>
 *         &lt;element name="supplyPartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplyPartner", propOrder = {
    "supplyPartner"
})
public class SupplyPartner
    extends PartyRole
{

    protected String supplyPartner;

    /**
     * Gets the value of the supplyPartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplyPartner() {
        return supplyPartner;
    }

    /**
     * Sets the value of the supplyPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplyPartner(String value) {
        this.supplyPartner = value;
    }

}
