
package au.com.singtel.group.cdm.v2_0_0.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import au.com.singtel.group.cdm.v2_0_0.common.TimePeriod;


/**
 * <p>Java class for CustomerBillingCycle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerBillingCycle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingDate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="chargeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="paymentDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerBillingCycleSpecification" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerBillingCycleSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerBillingCycle", propOrder = {
    "billingDate",
    "chargeDate",
    "paymentDueDate",
    "id",
    "customerBillingCycleSpecification"
})
public class CustomerBillingCycle {

    protected TimePeriod billingDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar chargeDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDueDate;
    protected String id;
    protected CustomerBillingCycleSpecification customerBillingCycleSpecification;

    /**
     * Gets the value of the billingDate property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setBillingDate(TimePeriod value) {
        this.billingDate = value;
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
     * Gets the value of the customerBillingCycleSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerBillingCycleSpecification }
     *     
     */
    public CustomerBillingCycleSpecification getCustomerBillingCycleSpecification() {
        return customerBillingCycleSpecification;
    }

    /**
     * Sets the value of the customerBillingCycleSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerBillingCycleSpecification }
     *     
     */
    public void setCustomerBillingCycleSpecification(CustomerBillingCycleSpecification value) {
        this.customerBillingCycleSpecification = value;
    }

}
