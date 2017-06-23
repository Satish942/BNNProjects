
package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;

import au.com.singtel.group.cdm.v4_0_0.cdm.BaseDto;

public class GetAppointmentsByOrderResponseModel
    extends BaseDto implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected GetAppointmentsByOrderWrapper getAppointmentsByOrderResponse;

    /**
     * Gets the value of the getAppointmentsByOrderResponse property.
     * 
     * @return
     *     possible object is
     *     {@link GetAppointmentsByOrderWrapper }
     *     
     */
    public GetAppointmentsByOrderWrapper getGetAppointmentsByOrderResponse() {
        return getAppointmentsByOrderResponse;
    }

    /**
     * Sets the value of the getAppointmentsByOrderResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAppointmentsByOrderWrapper }
     *     
     */
    public void setGetAppointmentsByOrderResponse(GetAppointmentsByOrderWrapper value) {
        this.getAppointmentsByOrderResponse = value;
    }

}
