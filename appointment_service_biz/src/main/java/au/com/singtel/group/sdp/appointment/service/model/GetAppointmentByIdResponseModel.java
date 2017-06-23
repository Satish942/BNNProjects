
package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;

import au.com.singtel.group.cdm.v4_0_0.cdm.BaseDto;

public class GetAppointmentByIdResponseModel
    extends BaseDto implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected GetAppointmentByIdWrapper getAppointmentByIdResponse;

    /**
     * Gets the value of the getAppointmentByIdResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetAppointmentByIdWrapper }
     *     
     */
    public GetAppointmentByIdWrapper getGetAppointmentByIdResponse() {
        return getAppointmentByIdResponse;
    }

    /**
     * Sets the value of the getAppointmentByIdResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAppointmentByIdWrapper }
     *     
     */
    public void setGetAppointmentByIdResponse(GetAppointmentByIdWrapper value) {
        this.getAppointmentByIdResponse = value;
    }

}
