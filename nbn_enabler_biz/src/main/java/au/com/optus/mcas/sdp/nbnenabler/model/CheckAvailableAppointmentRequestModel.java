
package au.com.optus.mcas.sdp.nbnenabler.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v4_0_0.cdm.Appointment;
import au.com.singtel.group.cdm.v4_0_0.cdm.BaseDto;


/**
 * <p>Java class for checkAvailableAppointmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkAvailableAppointmentRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v4_0_0/cdm}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="customerRequestedAppointment" type="{http://www.group.singtel.com.au/cdm/v4_0_0/cdm}Appointment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkAvailableAppointmentRequest", propOrder = {
    "customerRequestedAppointment"
})
public class CheckAvailableAppointmentRequestModel
    extends BaseDto
{

    protected Appointment customerRequestedAppointment;

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

}
