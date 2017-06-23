
package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import au.com.singtel.group.cdm.v4_0_0.cdm.Appointment;

public class GetAppointmentsByOrderWrapper implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected List<Appointment> appointment;

    /**
     * Gets the value of the appointment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Appointment }
     * 
     * 
     */
    public List<Appointment> getAppointment() {
        if (appointment == null) {
            appointment = new ArrayList<Appointment>();
        }
        return this.appointment;
    }

}
