
package au.com.optus.mcas.sdp.nbnapp.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * From SID 12
 * 
 * <p>Java class for Appointment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Appointment">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteraction">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appointmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appointmentReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appointmentCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appointmentDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appointmentContactDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appointmentLeadTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noOfSlots" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="appointmentSlot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appointmentSlotCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appointmentPaymentMethodType" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PaymentMethodTypeEnum" minOccurs="0"/>
 *         &lt;element name="appointmentPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appointmentIsAssociatedWithCalendarEntry" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}CalendarEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specification" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Specification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="place" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Place" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="skill" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Skill" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Appointment", propOrder = {
    "status",
    "statusCode",
    "statusDescription",
    "appointmentType",
    "appointmentReason",
    "appointmentCategory",
    "appointmentDetails",
    "appointmentContactDetails",
    "appointmentLeadTime",
    "noOfSlots",
    "appointmentSlot",
    "appointmentSlotCode",
    "appointmentPaymentMethodType",
    "appointmentPriority",
    "appointmentIsAssociatedWithCalendarEntry",
    "specification",
    "place",
    "skill"
})
public class Appointment
    extends BusinessInteraction
{

    protected String status;
    protected String statusCode;
    protected String statusDescription;
    protected String appointmentType;
    protected String appointmentReason;
    protected String appointmentCategory;
    protected String appointmentDetails;
    protected String appointmentContactDetails;
    protected String appointmentLeadTime;
    protected BigInteger noOfSlots;
    protected String appointmentSlot;
    protected String appointmentSlotCode;
    protected PaymentMethodTypeEnum appointmentPaymentMethodType;
    protected String appointmentPriority;
    protected List<CalendarEntry> appointmentIsAssociatedWithCalendarEntry;
    protected List<Specification> specification;
    protected List<Place> place;
    protected List<Skill> skill;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the appointmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentType() {
        return appointmentType;
    }

    /**
     * Sets the value of the appointmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentType(String value) {
        this.appointmentType = value;
    }

    /**
     * Gets the value of the appointmentReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentReason() {
        return appointmentReason;
    }

    /**
     * Sets the value of the appointmentReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentReason(String value) {
        this.appointmentReason = value;
    }

    /**
     * Gets the value of the appointmentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentCategory() {
        return appointmentCategory;
    }

    /**
     * Sets the value of the appointmentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentCategory(String value) {
        this.appointmentCategory = value;
    }

    /**
     * Gets the value of the appointmentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentDetails() {
        return appointmentDetails;
    }

    /**
     * Sets the value of the appointmentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentDetails(String value) {
        this.appointmentDetails = value;
    }

    /**
     * Gets the value of the appointmentContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentContactDetails() {
        return appointmentContactDetails;
    }

    /**
     * Sets the value of the appointmentContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentContactDetails(String value) {
        this.appointmentContactDetails = value;
    }

    /**
     * Gets the value of the appointmentLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentLeadTime() {
        return appointmentLeadTime;
    }

    /**
     * Sets the value of the appointmentLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentLeadTime(String value) {
        this.appointmentLeadTime = value;
    }

    /**
     * Gets the value of the noOfSlots property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNoOfSlots() {
        return noOfSlots;
    }

    /**
     * Sets the value of the noOfSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNoOfSlots(BigInteger value) {
        this.noOfSlots = value;
    }

    /**
     * Gets the value of the appointmentSlot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentSlot() {
        return appointmentSlot;
    }

    /**
     * Sets the value of the appointmentSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentSlot(String value) {
        this.appointmentSlot = value;
    }

    /**
     * Gets the value of the appointmentSlotCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentSlotCode() {
        return appointmentSlotCode;
    }

    /**
     * Sets the value of the appointmentSlotCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentSlotCode(String value) {
        this.appointmentSlotCode = value;
    }

    /**
     * Gets the value of the appointmentPaymentMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodTypeEnum }
     *     
     */
    public PaymentMethodTypeEnum getAppointmentPaymentMethodType() {
        return appointmentPaymentMethodType;
    }

    /**
     * Sets the value of the appointmentPaymentMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodTypeEnum }
     *     
     */
    public void setAppointmentPaymentMethodType(PaymentMethodTypeEnum value) {
        this.appointmentPaymentMethodType = value;
    }

    /**
     * Gets the value of the appointmentPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentPriority() {
        return appointmentPriority;
    }

    /**
     * Sets the value of the appointmentPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentPriority(String value) {
        this.appointmentPriority = value;
    }

    /**
     * Gets the value of the appointmentIsAssociatedWithCalendarEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointmentIsAssociatedWithCalendarEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointmentIsAssociatedWithCalendarEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalendarEntry }
     * 
     * 
     */
    public List<CalendarEntry> getAppointmentIsAssociatedWithCalendarEntry() {
        if (appointmentIsAssociatedWithCalendarEntry == null) {
            appointmentIsAssociatedWithCalendarEntry = new ArrayList<CalendarEntry>();
        }
        return this.appointmentIsAssociatedWithCalendarEntry;
    }

    /**
     * Gets the value of the specification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Specification }
     * 
     * 
     */
    public List<Specification> getSpecification() {
        if (specification == null) {
            specification = new ArrayList<Specification>();
        }
        return this.specification;
    }

    /**
     * Gets the value of the place property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the place property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Place }
     * 
     * 
     */
    public List<Place> getPlace() {
        if (place == null) {
            place = new ArrayList<Place>();
        }
        return this.place;
    }

    /**
     * Gets the value of the skill property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the skill property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSkill().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Skill }
     * 
     * 
     */
    public List<Skill> getSkill() {
        if (skill == null) {
            skill = new ArrayList<Skill>();
        }
        return this.skill;
    }

}
