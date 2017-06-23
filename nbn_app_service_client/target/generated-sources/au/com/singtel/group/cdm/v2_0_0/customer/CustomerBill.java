
package au.com.singtel.group.cdm.v2_0_0.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import au.com.singtel.group.cdm.v2_0_0.common.Money;


/**
 * <p>Java class for CustomerBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerBill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billAmount" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Money" minOccurs="0"/>
 *         &lt;element name="billDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="chargeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mailingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="paymentDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="relationshipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overdueAmount" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Money" minOccurs="0"/>
 *         &lt;element name="amountDue" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Money" minOccurs="0"/>
 *         &lt;element name="lastPaymentAmmount" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Money" minOccurs="0"/>
 *         &lt;element name="lastPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="paymentItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerBillingCycle" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerBillingCycle" minOccurs="0"/>
 *         &lt;element name="customerBillSpec" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerBillSpec" minOccurs="0"/>
 *         &lt;element name="appliedCustomerBillingRate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}AppliedCustomerBillingRate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBill", propOrder = {
    "billNo",
    "billAmount",
    "billDate",
    "chargeDate",
    "creditDate",
    "mailingDate",
    "paymentDueDate",
    "relationshipType",
    "id",
    "overdueAmount",
    "amountDue",
    "lastPaymentAmmount",
    "lastPaymentDate",
    "paymentItem",
    "customerBillingCycle",
    "customerBillSpec",
    "appliedCustomerBillingRate"
})
public class CustomerBill {

    protected String billNo;
    protected Money billAmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar billDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar chargeDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creditDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mailingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDueDate;
    protected String relationshipType;
    protected String id;
    protected Money overdueAmount;
    protected Money amountDue;
    protected Money lastPaymentAmmount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPaymentDate;
    protected String paymentItem;
    protected CustomerBillingCycle customerBillingCycle;
    protected CustomerBillSpec customerBillSpec;
    protected List<AppliedCustomerBillingRate> appliedCustomerBillingRate;

    /**
     * Gets the value of the billNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * Sets the value of the billNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNo(String value) {
        this.billNo = value;
    }

    /**
     * Gets the value of the billAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBillAmount() {
        return billAmount;
    }

    /**
     * Sets the value of the billAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBillAmount(Money value) {
        this.billAmount = value;
    }

    /**
     * Gets the value of the billDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDate() {
        return billDate;
    }

    /**
     * Sets the value of the billDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDate(XMLGregorianCalendar value) {
        this.billDate = value;
    }

    /**
     * Gets the value of the chargeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChargeDate() {
        return chargeDate;
    }

    /**
     * Sets the value of the chargeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChargeDate(XMLGregorianCalendar value) {
        this.chargeDate = value;
    }

    /**
     * Gets the value of the creditDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditDate() {
        return creditDate;
    }

    /**
     * Sets the value of the creditDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditDate(XMLGregorianCalendar value) {
        this.creditDate = value;
    }

    /**
     * Gets the value of the mailingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMailingDate() {
        return mailingDate;
    }

    /**
     * Sets the value of the mailingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMailingDate(XMLGregorianCalendar value) {
        this.mailingDate = value;
    }

    /**
     * Gets the value of the paymentDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDueDate() {
        return paymentDueDate;
    }

    /**
     * Sets the value of the paymentDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDueDate(XMLGregorianCalendar value) {
        this.paymentDueDate = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipType(String value) {
        this.relationshipType = value;
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
     * Gets the value of the overdueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getOverdueAmount() {
        return overdueAmount;
    }

    /**
     * Sets the value of the overdueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setOverdueAmount(Money value) {
        this.overdueAmount = value;
    }

    /**
     * Gets the value of the amountDue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmountDue(Money value) {
        this.amountDue = value;
    }

    /**
     * Gets the value of the lastPaymentAmmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLastPaymentAmmount() {
        return lastPaymentAmmount;
    }

    /**
     * Sets the value of the lastPaymentAmmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLastPaymentAmmount(Money value) {
        this.lastPaymentAmmount = value;
    }

    /**
     * Gets the value of the lastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPaymentDate() {
        return lastPaymentDate;
    }

    /**
     * Sets the value of the lastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPaymentDate(XMLGregorianCalendar value) {
        this.lastPaymentDate = value;
    }

    /**
     * Gets the value of the paymentItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentItem() {
        return paymentItem;
    }

    /**
     * Sets the value of the paymentItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentItem(String value) {
        this.paymentItem = value;
    }

    /**
     * Gets the value of the customerBillingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillingCycle }
     *     
     */
    public CustomerBillingCycle getCustomerBillingCycle() {
        return customerBillingCycle;
    }

    /**
     * Sets the value of the customerBillingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillingCycle }
     *     
     */
    public void setCustomerBillingCycle(CustomerBillingCycle value) {
        this.customerBillingCycle = value;
    }

    /**
     * Gets the value of the customerBillSpec property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillSpec }
     *     
     */
    public CustomerBillSpec getCustomerBillSpec() {
        return customerBillSpec;
    }

    /**
     * Sets the value of the customerBillSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillSpec }
     *     
     */
    public void setCustomerBillSpec(CustomerBillSpec value) {
        this.customerBillSpec = value;
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

}
