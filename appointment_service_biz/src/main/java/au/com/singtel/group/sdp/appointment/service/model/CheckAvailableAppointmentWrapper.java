
package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import au.com.singtel.group.cdm.v4_0_0.cdm.Appointment;

public class CheckAvailableAppointmentWrapper implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected List<Appointment> availableAppointments;
    protected Appointment customerRequestedAppointment;
    protected Appointment firstAvailableAppointment;
    protected Appointment mustDoAppointment;

    /**
     * Gets the value of the availableAppointments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableAppointments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableAppointments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Appointment }
     * 
     * 
     */
    public List<Appointment> getAvailableAppointments() {
        if (availableAppointments == null) {
            availableAppointments = new ArrayList<Appointment>();
        }
        return this.availableAppointments;
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
