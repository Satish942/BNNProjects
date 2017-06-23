
package au.com.singtel.group.cdm.v2_0_0.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDiscount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDiscount">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerBillingCredit">
 *       &lt;sequence>
 *         &lt;element name="customerDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountProdPriceAlteration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDiscount", propOrder = {
    "customerDiscount",
    "discountProdPriceAlteration"
})
public class CustomerDiscount
    extends CustomerBillingCredit
{

    protected String customerDiscount;
    protected String discountProdPriceAlteration;

    /**
     * Gets the value of the customerDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDiscount() {
        return customerDiscount;
    }

    /**
     * Sets the value of the customerDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDiscount(String value) {
        this.customerDiscount = value;
    }

    /**
     * Gets the value of the discountProdPriceAlteration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountProdPriceAlteration() {
        return discountProdPriceAlteration;
    }

    /**
     * Sets the value of the discountProdPriceAlteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountProdPriceAlteration(String value) {
        this.discountProdPriceAlteration = value;
    }

}
