
package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;

import au.com.singtel.group.cdm.v4_0_0.cdm.BaseDto;

public class GetAppointmentsByOrderRequestModel
    extends BaseDto implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String purchaseOrderNumber;

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNumber(String value) {
        this.purchaseOrderNumber = value;
    }

}
