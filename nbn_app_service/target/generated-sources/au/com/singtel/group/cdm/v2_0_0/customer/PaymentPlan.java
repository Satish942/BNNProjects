
package au.com.singtel.group.cdm.v2_0_0.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentPlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentPlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paymentPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="directDebit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="creditCardPM" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CreditCardPM" minOccurs="0"/>
 *         &lt;element name="cashPM" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CashPM" minOccurs="0"/>
 *         &lt;element name="thirdPartyCollectionPM" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}ThirdPartyCollectionPM" minOccurs="0"/>
 *         &lt;element name="customerPayment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerAccount" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentPlan", propOrder = {
    "id",
    "priority",
    "paymentPlanType",
    "status",
    "directDebit",
    "creditCardPM",
    "cashPM",
    "thirdPartyCollectionPM",
    "customerPayment",
    "customerAccount"
})
public class PaymentPlan {

    protected String id;
    protected Integer priority;
    protected String paymentPlanType;
    protected Boolean status;
    protected Boolean directDebit;
    protected CreditCardPM creditCardPM;
    protected CashPM cashPM;
    protected ThirdPartyCollectionPM thirdPartyCollectionPM;
    protected List<CustomerPayment> customerPayment;
    protected CustomerAccount customerAccount;

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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the paymentPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPlanType() {
        return paymentPlanType;
    }

    /**
     * Sets the value of the paymentPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPlanType(String value) {
        this.paymentPlanType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the directDebit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectDebit() {
        return directDebit;
    }

    /**
     * Sets the value of the directDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectDebit(Boolean value) {
        this.directDebit = value;
    }

    /**
     * Gets the value of the creditCardPM property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardPM }
     *     
     */
    public CreditCardPM getCreditCardPM() {
        return creditCardPM;
    }

    /**
     * Sets the value of the creditCardPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardPM }
     *     
     */
    public void setCreditCardPM(CreditCardPM value) {
        this.creditCardPM = value;
    }

    /**
     * Gets the value of the cashPM property.
     * 
     * @return
     *     possible object is
     *     {@link CashPM }
     *     
     */
    public CashPM getCashPM() {
        return cashPM;
    }

    /**
     * Sets the value of the cashPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashPM }
     *     
     */
    public void setCashPM(CashPM value) {
        this.cashPM = value;
    }

    /**
     * Gets the value of the thirdPartyCollectionPM property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyCollectionPM }
     *     
     */
    public ThirdPartyCollectionPM getThirdPartyCollectionPM() {
        return thirdPartyCollectionPM;
    }

    /**
     * Sets the value of the thirdPartyCollectionPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyCollectionPM }
     *     
     */
    public void setThirdPartyCollectionPM(ThirdPartyCollectionPM value) {
        this.thirdPartyCollectionPM = value;
    }

    /**
     * Gets the value of the customerPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPayment }
     * 
     * 
     */
    public List<CustomerPayment> getCustomerPayment() {
        if (customerPayment == null) {
            customerPayment = new ArrayList<CustomerPayment>();
        }
        return this.customerPayment;
    }

    /**
     * Gets the value of the customerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount }
     *     
     */
    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Sets the value of the customerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount }
     *     
     */
    public void setCustomerAccount(CustomerAccount value) {
        this.customerAccount = value;
    }

}
