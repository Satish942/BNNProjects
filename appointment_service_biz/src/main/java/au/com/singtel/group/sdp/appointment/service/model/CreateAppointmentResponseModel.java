
package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;

import au.com.singtel.group.cdm.v4_0_0.cdm.BaseDto;

public class CreateAppointmentResponseModel
    extends BaseDto implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected CreateAppointmentWrapper createAppointmentResponse;

    /**
     * Gets the value of the createAppointmentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CreateAppointmentWrapper }
     *     
     */
    public CreateAppointmentWrapper getCreateAppointmentResponse() {
        return createAppointmentResponse;
    }

    /**
     * Sets the value of the createAppointmentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateAppointmentWrapper }
     *     
     */
    public void setCreateAppointmentResponse(CreateAppointmentWrapper value) {
        this.createAppointmentResponse = value;
    }

}
