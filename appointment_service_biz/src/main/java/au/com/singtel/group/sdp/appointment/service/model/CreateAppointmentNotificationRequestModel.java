
package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;

import au.com.singtel.group.cdm.v4_0_0.cdm.Appointment;
import au.com.singtel.group.cdm.v4_0_0.cdm.BaseDto;


public class CreateAppointmentNotificationRequestModel
    extends BaseDto implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Appointment customerSelectedAppointment;
    protected Appointment mustDoAppointment;

    /**
     * Gets the value of the customerSelectedAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link Appointment }
     *     
     */
    public Appointment getCustomerSelectedAppointment() {
        return customerSelectedAppointment;
    }

    /**
     * Sets the value of the customerSelectedAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appointment }
     *     
     */
    public void setCustomerSelectedAppointment(Appointment value) {
        this.customerSelectedAppointment = value;
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
