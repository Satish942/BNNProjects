
package au.com.singtel.group.appointmentservice.v2_0.appointmentservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.Appointment;
import au.com.singtel.group.cdm.v2_0_0.common.BaseDto;


/**
 * <p>Java class for cancelAppointmentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cancelAppointmentRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="customerBookedAppointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" minOccurs="0"/>
 *         &lt;element name="customerRequestedAppointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" minOccurs="0"/>
 *         &lt;element name="serviceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceIdentifierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelAppointmentRequest", propOrder = {
    "customerBookedAppointment",
    "customerRequestedAppointment",
    "serviceIdentifier",
    "serviceIdentifierType",
    "identification",
    "identificationType"
})
public class CancelAppointmentRequest
    extends BaseDto
{

    protected Appointment customerBookedAppointment;
    protected Appointment customerRequestedAppointment;
    protected String serviceIdentifier;
    protected String serviceIdentifierType;
    protected String identification;
    protected String identificationType;

    /**
     * Gets the value of the customerBookedAppointment property.
     * 
     * @return
     *     possible object is
     *     {@link Appointment }
     *     
     */
    public Appointment getCustomerBookedAppointment() {
        return customerBookedAppointment;
    }

    /**
     * Sets the value of the customerBookedAppointment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appointment }
     *     
     */
    public void setCustomerBookedAppointment(Appointment value) {
        this.customerBookedAppointment = value;
    }

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

    /**
     * Gets the value of the serviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * Sets the value of the serviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdentifier(String value) {
        this.serviceIdentifier = value;
    }

    /**
     * Gets the value of the serviceIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdentifierType() {
        return serviceIdentifierType;
    }

    /**
     * Sets the value of the serviceIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdentifierType(String value) {
        this.serviceIdentifierType = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentification(String value) {
        this.identification = value;
    }

    /**
     * Gets the value of the identificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationType() {
        return identificationType;
    }

    /**
     * Sets the value of the identificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationType(String value) {
        this.identificationType = value;
    }

}
