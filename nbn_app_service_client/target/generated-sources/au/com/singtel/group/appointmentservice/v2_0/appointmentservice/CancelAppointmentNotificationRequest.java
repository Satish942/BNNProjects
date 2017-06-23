
package au.com.singtel.group.appointmentservice.v2_0.appointmentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.Appointment;
import au.com.singtel.group.cdm.v2_0_0.common.BaseDto;


/**
 * <p>Java class for cancelAppointmentNotificationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelAppointmentNotificationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="customerBookedAppointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" minOccurs="0"/>
 *         &lt;element name="customerRequestedAppointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" minOccurs="0"/>
 *         &lt;element name="mustDoAppointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelAppointmentNotificationRequest", propOrder = {
    "customerBookedAppointment",
    "customerRequestedAppointment",
    "mustDoAppointment"
})
public class CancelAppointmentNotificationRequest
    extends BaseDto
{

    protected Appointment customerBookedAppointment;
    protected Appointment customerRequestedAppointment;
    protected Appointment mustDoAppointment;

    /**
     * Gets the value of the customerBookedAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link Appointment }
     *     
     */
    public Appointment getCustomerBookedAppointment() {
        return customerBookedAppointment;
    }

    /**
     * Sets the value of the customerBookedAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appointment }
     *     
     */
    public void setCustomerBookedAppointment(Appointment value) {
        this.customerBookedAppointment = value;
    }

    /**
     * Gets the value of the customerRequestedAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link Appointment }
     *     
     */
    public Appointment getCustomerRequestedAppointment() {
        return customerRequestedAppointment;
    }

    /**
     * Sets the value of the customerRequestedAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appointment }
     *     
     */
    public void setCustomerRequestedAppointment(Appointment value) {
        this.customerRequestedAppointment = value;
    }

    /**
     * Gets the value of the mustDoAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link Appointment }
     *     
     */
    public Appointment getMustDoAppointment() {
        return mustDoAppointment;
    }

    /**
     * Sets the value of the mustDoAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appointment }
     *     
     */
    public void setMustDoAppointment(Appointment value) {
        this.mustDoAppointment = value;
    }

}
