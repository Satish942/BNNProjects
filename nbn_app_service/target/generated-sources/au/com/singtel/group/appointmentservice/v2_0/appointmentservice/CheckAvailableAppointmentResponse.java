
package au.com.singtel.group.appointmentservice.v2_0.appointmentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.Appointment;
import au.com.singtel.group.cdm.v2_0_0.common.BaseDto;


/**
 * <p>Java class for checkAvailableAppointmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkAvailableAppointmentResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="customerRequestedAppointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" minOccurs="0"/>
 *         &lt;element name="mustDoAppointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" minOccurs="0"/>
 *         &lt;element name="firstAvailableAppointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" minOccurs="0"/>
 *         &lt;element name="availableAppointments" type="{http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService}appointmentList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkAvailableAppointmentResponse", propOrder = {
    "customerRequestedAppointment",
    "mustDoAppointment",
    "firstAvailableAppointment",
    "availableAppointments"
})
public class CheckAvailableAppointmentResponse
    extends BaseDto
{

    protected Appointment customerRequestedAppointment;
    protected Appointment mustDoAppointment;
    protected Appointment firstAvailableAppointment;
    protected AppointmentList availableAppointments;

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

    /**
     * Gets the value of the firstAvailableAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link Appointment }
     *     
     */
    public Appointment getFirstAvailableAppointment() {
        return firstAvailableAppointment;
    }

    /**
     * Sets the value of the firstAvailableAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appointment }
     *     
     */
    public void setFirstAvailableAppointment(Appointment value) {
        this.firstAvailableAppointment = value;
    }

    /**
     * Gets the value of the availableAppointments property.
     * 
     * @return
     *     possible object is
     *     {@link AppointmentList }
     *     
     */
    public AppointmentList getAvailableAppointments() {
        return availableAppointments;
    }

    /**
     * Sets the value of the availableAppointments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppointmentList }
     *     
     */
    public void setAvailableAppointments(AppointmentList value) {
        this.availableAppointments = value;
    }

}
