
package au.com.singtel.group.cdm.v2_0_0.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.TimePeriod;


/**
 * <p>Java class for CustomerBillingCredit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillingCredit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditForPeriod" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerBillingCreditBalance" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerBillingCreditBalance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBillingCredit", propOrder = {
    "creditForPeriod",
    "id",
    "customerBillingCreditBalance"
})
@XmlSeeAlso({
    CustomerDiscount.class,
    CustomerAllowance.class
})
public abstract class CustomerBillingCredit {

    protected TimePeriod creditForPeriod;
    protected String id;
    protected List<CustomerBillingCreditBalance> customerBillingCreditBalance;

    /**
     * Gets the value of the creditForPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getCreditForPeriod() {
        return creditForPeriod;
    }

    /**
     * Sets the value of the creditForPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setCreditForPeriod(TimePeriod value) {
        this.creditForPeriod = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the customerBillingCreditBalance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerBillingCreditBalance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerBillingCreditBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerBillingCreditBalance }
     * 
     * 
     */
    public List<CustomerBillingCreditBalance> getCustomerBillingCreditBalance() {
        if (customerBillingCreditBalance == null) {
            customerBillingCreditBalance = new ArrayList<CustomerBillingCreditBalance>();
        }
        return this.customerBillingCreditBalance;
    }

}
