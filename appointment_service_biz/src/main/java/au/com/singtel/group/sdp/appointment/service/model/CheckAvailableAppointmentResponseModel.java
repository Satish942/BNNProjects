
package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;

import au.com.singtel.group.cdm.v4_0_0.cdm.BaseDto;

public class CheckAvailableAppointmentResponseModel
    extends BaseDto implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected CheckAvailableAppointmentWrapper checkAvailableAppointmentResponse;

    /**
     * Gets the value of the checkAvailableAppointmentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CheckAvailableAppointmentWrapper }
     *     
     */
    public CheckAvailableAppointmentWrapper getCheckAvailableAppointmentResponse() {
        return checkAvailableAppointmentResponse;
    }

    /**
     * Sets the value of the checkAvailableAppointmentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckAvailableAppointmentWrapper }
     *     
     */
    public void setCheckAvailableAppointmentResponse(CheckAvailableAppointmentWrapper value) {
        this.checkAvailableAppointmentResponse = value;
    }

}
