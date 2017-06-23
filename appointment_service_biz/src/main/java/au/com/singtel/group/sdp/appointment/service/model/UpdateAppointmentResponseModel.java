
package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;

import au.com.singtel.group.cdm.v4_0_0.cdm.BaseDto;

public class UpdateAppointmentResponseModel
    extends BaseDto implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected UpdateAppointmentWrapper updateAppointmentResponse;

    /**
     * Gets the value of the updateAppointmentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAppointmentWrapper }
     *     
     */
    public UpdateAppointmentWrapper getUpdateAppointmentResponse() {
        return updateAppointmentResponse;
    }

    /**
     * Sets the value of the updateAppointmentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAppointmentWrapper }
     *     
     */
    public void setUpdateAppointmentResponse(UpdateAppointmentWrapper value) {
        this.updateAppointmentResponse = value;
    }

}
