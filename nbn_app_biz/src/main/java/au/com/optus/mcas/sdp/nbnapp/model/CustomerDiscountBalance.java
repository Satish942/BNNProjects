
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerDiscountBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDiscountBalance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerBillingCreditBalance">
 *       &lt;sequence>
 *         &lt;element name="customerDiscountBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDiscountBalance", propOrder = {
    "customerDiscountBalance"
})
public class CustomerDiscountBalance
    extends CustomerBillingCreditBalance
{

    protected String customerDiscountBalance;

    /**
     * Gets the value of the customerDiscountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerDiscountBalance() {
        return customerDiscountBalance;
    }

    /**
     * Sets the value of the customerDiscountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerDiscountBalance(String value) {
        this.customerDiscountBalance = value;
    }

}
