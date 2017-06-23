
package au.com.singtel.group.cdm.v2_0_0.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAllowanceBalance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAllowanceBalance">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerBillingCreditBalance">
 *       &lt;sequence>
 *         &lt;element name="customerAllowanceBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAllowanceBalance", propOrder = {
    "customerAllowanceBalance"
})
public class CustomerAllowanceBalance
    extends CustomerBillingCreditBalance
{

    protected String customerAllowanceBalance;

    /**
     * Gets the value of the customerAllowanceBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAllowanceBalance() {
        return customerAllowanceBalance;
    }

    /**
     * Sets the value of the customerAllowanceBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAllowanceBalance(String value) {
        this.customerAllowanceBalance = value;
    }

}
