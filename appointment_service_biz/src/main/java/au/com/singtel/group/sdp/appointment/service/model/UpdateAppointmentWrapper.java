
package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;

import au.com.singtel.group.cdm.v4_0_0.cdm.Appointment;

public class UpdateAppointmentWrapper implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Appointment customerBookedAppointment;
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
