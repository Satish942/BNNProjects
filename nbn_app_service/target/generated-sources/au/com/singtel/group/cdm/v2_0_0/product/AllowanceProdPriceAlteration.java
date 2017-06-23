
package au.com.singtel.group.cdm.v2_0_0.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.Quantity;


/**
 * <p>Java class for AllowanceProdPriceAlteration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllowanceProdPriceAlteration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProdPriceAlteration">
 *       &lt;sequence>
 *         &lt;element name="quantity" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Quantity" minOccurs="0"/>
 *         &lt;element name="allowanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowanceProdPriceAlteration", propOrder = {
    "quantity",
    "allowanceType"
})
public class AllowanceProdPriceAlteration
    extends ProdPriceAlteration
{

    protected Quantity quantity;
    protected String allowanceType;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the allowanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceType() {
        return allowanceType;
    }

    /**
     * Sets the value of the allowanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceType(String value) {
        this.allowanceType = value;
    }

}
