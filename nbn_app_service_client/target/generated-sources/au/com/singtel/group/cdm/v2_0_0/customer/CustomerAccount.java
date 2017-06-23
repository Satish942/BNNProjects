
package au.com.singtel.group.cdm.v2_0_0.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAccountCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="billingAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billingAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAccountRelationshipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="privacyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerAccountInteractionRole" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="customerAccountProductInvolvement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appliedCustomerBillingRate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}AppliedCustomerBillingRate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerBillingCredit" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerBillingCredit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerAllowance" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerAllowance" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerAccountContact" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerAccountContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerAccountRelationshipHas" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerPaymentForCustomerAccount" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerPayment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerBill" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerBill" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccount", propOrder = {
    "id",
    "name",
    "accountType",
    "accountStatus",
    "creditLimit",
    "pin",
    "accountNumber",
    "customerAccountCreationDate",
    "billingAccountType",
    "alternateIdentifier",
    "billingAccountNumber",
    "reasonCode",
    "marketCode",
    "serviceProvider",
    "customerAccountRelationshipType",
    "pinStatus",
    "sourceSystem",
    "privacyType",
    "customerAccountInteractionRole",
    "customerAccountProductInvolvement",
    "appliedCustomerBillingRate",
    "customerBillingCredit",
    "customerAllowance",
    "customerAccountContact",
    "customerAccountRelationshipHas",
    "customerPaymentForCustomerAccount",
    "customerBill"
})
public class CustomerAccount {

    protected String id;
    protected String name;
    protected String accountType;
    protected String accountStatus;
    protected Long creditLimit;
    protected String pin;
    protected String accountNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customerAccountCreationDate;
    protected String billingAccountType;
    protected String alternateIdentifier;
    protected String billingAccountNumber;
    protected String reasonCode;
    protected String marketCode;
    protected String serviceProvider;
    protected String customerAccountRelationshipType;
    protected String pinStatus;
    protected String sourceSystem;
    protected String privacyType;
    protected Long customerAccountInteractionRole;
    protected List<String> customerAccountProductInvolvement;
    protected List<AppliedCustomerBillingRate> appliedCustomerBillingRate;
    protected List<CustomerBillingCredit> customerBillingCredit;
    protected List<CustomerAllowance> customerAllowance;
    protected List<CustomerAccountContact> customerAccountContact;
    protected List<CustomerAccount> customerAccountRelationshipHas;
    protected List<CustomerPayment> customerPaymentForCustomerAccount;
    protected List<CustomerBill> customerBill;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditLimit(Long value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPin(String value) {
        this.pin = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the customerAccountCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerAccountCreationDate() {
        return customerAccountCreationDate;
    }

    /**
     * Sets the value of the customerAccountCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerAccountCreationDate(XMLGregorianCalendar value) {
        this.customerAccountCreationDate = value;
    }

    /**
     * Gets the value of the billingAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountType() {
        return billingAccountType;
    }

    /**
     * Sets the value of the billingAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountType(String value) {
        this.billingAccountType = value;
    }

    /**
     * Gets the value of the alternateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateIdentifier() {
        return alternateIdentifier;
    }

    /**
     * Sets the value of the alternateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateIdentifier(String value) {
        this.alternateIdentifier = value;
    }

    /**
     * Gets the value of the billingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAccountNumber() {
        return billingAccountNumber;
    }

    /**
     * Sets the value of the billingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAccountNumber(String value) {
        this.billingAccountNumber = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the marketCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketCode() {
        return marketCode;
    }

    /**
     * Sets the value of the marketCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketCode(String value) {
        this.marketCode = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProvider(String value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the customerAccountRelationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountRelationshipType() {
        return customerAccountRelationshipType;
    }

    /**
     * Sets the value of the customerAccountRelationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountRelationshipType(String value) {
        this.customerAccountRelationshipType = value;
    }

    /**
     * Gets the value of the pinStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinStatus() {
        return pinStatus;
    }

    /**
     * Sets the value of the pinStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinStatus(String value) {
        this.pinStatus = value;
    }

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the privacyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyType() {
        return privacyType;
    }

    /**
     * Sets the value of the privacyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyType(String value) {
        this.privacyType = value;
    }

    /**
     * Gets the value of the customerAccountInteractionRole property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerAccountInteractionRole() {
        return customerAccountInteractionRole;
    }

    /**
     * Sets the value of the customerAccountInteractionRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerAccountInteractionRole(Long value) {
        this.customerAccountInteractionRole = value;
    }

    /**
     * Gets the value of the customerAccountProductInvolvement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerAccountProductInvolvement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAccountProductInvolvement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomerAccountProductInvolvement() {
        if (customerAccountProductInvolvement == null) {
            customerAccountProductInvolvement = new ArrayList<String>();
        }
        return this.customerAccountProductInvolvement;
    }

    /**
     * Gets the value of the appliedCustomerBillingRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedCustomerBillingRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedCustomerBillingRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedCustomerBillingRate }
     * 
     * 
     */
    public List<AppliedCustomerBillingRate> getAppliedCustomerBillingRate() {
        if (appliedCustomerBillingRate == null) {
            appliedCustomerBillingRate = new ArrayList<AppliedCustomerBillingRate>();
        }
        return this.appliedCustomerBillingRate;
    }

    /**
     * Gets the value of the customerBillingCredit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerBillingCredit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerBillingCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerBillingCredit }
     * 
     * 
     */
    public List<CustomerBillingCredit> getCustomerBillingCredit() {
        if (customerBillingCredit == null) {
            customerBillingCredit = new ArrayList<CustomerBillingCredit>();
        }
        return this.customerBillingCredit;
    }

    /**
     * Gets the value of the customerAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAllowance }
     * 
     * 
     */
    public List<CustomerAllowance> getCustomerAllowance() {
        if (customerAllowance == null) {
            customerAllowance = new ArrayList<CustomerAllowance>();
        }
        return this.customerAllowance;
    }

    /**
     * Gets the value of the customerAccountContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerAccountContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAccountContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAccountContact }
     * 
     * 
     */
    public List<CustomerAccountContact> getCustomerAccountContact() {
        if (customerAccountContact == null) {
            customerAccountContact = new ArrayList<CustomerAccountContact>();
        }
        return this.customerAccountContact;
    }

    /**
     * Gets the value of the customerAccountRelationshipHas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerAccountRelationshipHas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAccountRelationshipHas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAccount }
     * 
     * 
     */
    public List<CustomerAccount> getCustomerAccountRelationshipHas() {
        if (customerAccountRelationshipHas == null) {
            customerAccountRelationshipHas = new ArrayList<CustomerAccount>();
        }
        return this.customerAccountRelationshipHas;
    }

    /**
     * Gets the value of the customerPaymentForCustomerAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerPaymentForCustomerAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerPaymentForCustomerAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerPayment }
     * 
     * 
     */
    public List<CustomerPayment> getCustomerPaymentForCustomerAccount() {
        if (customerPaymentForCustomerAccount == null) {
            customerPaymentForCustomerAccount = new ArrayList<CustomerPayment>();
        }
        return this.customerPaymentForCustomerAccount;
    }

    /**
     * Gets the value of the customerBill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerBill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerBill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerBill }
     * 
     * 
     */
    public List<CustomerBill> getCustomerBill() {
        if (customerBill == null) {
            customerBill = new ArrayList<CustomerBill>();
        }
        return this.customerBill;
    }

}
