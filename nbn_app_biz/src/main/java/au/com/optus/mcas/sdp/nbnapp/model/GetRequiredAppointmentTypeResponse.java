
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRequiredAppointmentTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRequiredAppointmentTypeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="appointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRequiredAppointmentTypeResponse", propOrder = {
    "appointment"
})
public class GetRequiredAppointmentTypeResponse
    extends BaseDto
{

    protected Appointment appointment;

    /**
     * Gets the value of the appointment property.
     * 
     * @return
     *     possible object is
     *     {@link Appointment }
     *     
     */
    public Appointment getAppointment() {
        return appointment;
    }

    /**
     * Sets the value of the appointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appointment }
     *     
     */
    public void setAppointment(Appointment value) {
        this.appointment = value;
    }

}
