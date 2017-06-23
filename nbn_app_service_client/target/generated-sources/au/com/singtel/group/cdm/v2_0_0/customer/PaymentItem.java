
package au.com.singtel.group.cdm.v2_0_0.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.Money;


/**
 * <p>Java class for PaymentItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appliedAmount" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Money" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appliedCustomerBillingRate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}AppliedCustomerBillingRate" minOccurs="0"/>
 *         &lt;element name="customerBill" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerBill" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentItem", propOrder = {
    "appliedAmount",
    "id",
    "customerPayment",
    "appliedCustomerBillingRate",
    "customerBill"
})
public class PaymentItem {

    protected Money appliedAmount;
    protected String id;
    protected String customerPayment;
    protected AppliedCustomerBillingRate appliedCustomerBillingRate;
    protected CustomerBill customerBill;

    /**
     * Gets the value of the appliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Sets the value of the appliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAppliedAmount(Money value) {
        this.appliedAmount = value;
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
     * Gets the value of the customerPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPayment() {
        return customerPayment;
    }

    /**
     * Sets the value of the customerPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPayment(String value) {
        this.customerPayment = value;
    }

    /**
     * Gets the value of the appliedCustomerBillingRate property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedCustomerBillingRate }
     *     
     */
    public AppliedCustomerBillingRate getAppliedCustomerBillingRate() {
        return appliedCustomerBillingRate;
    }

    /**
     * Sets the value of the appliedCustomerBillingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedCustomerBillingRate }
     *     
     */
    public void setAppliedCustomerBillingRate(AppliedCustomerBillingRate value) {
        this.appliedCustomerBillingRate = value;
    }

    /**
     * Gets the value of the customerBill property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBill }
     *     
     */
    public CustomerBill getCustomerBill() {
        return customerBill;
    }

    /**
     * Sets the value of the customerBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBill }
     *     
     */
    public void setCustomerBill(CustomerBill value) {
        this.customerBill = value;
    }

}
