
package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;

import au.com.singtel.group.cdm.v4_0_0.cdm.BaseDto;

public class GetAppointmentByIdRequestModel
    extends BaseDto implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
