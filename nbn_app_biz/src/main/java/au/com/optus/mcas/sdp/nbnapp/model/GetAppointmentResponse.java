
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAppointmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAppointmentResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="appointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerFacingService" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}CustomerFacingService" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}Product" minOccurs="0"/>
 *         &lt;element name="linkedAppointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}Resource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAppointmentResponse", propOrder = {
    "appointment",
    "customerFacingService",
    "product",
    "linkedAppointment",
    "resource"
})
public class GetAppointmentResponse
    extends BaseDto
{

    protected List<Appointment> appointment;
    protected CustomerFacingService customerFacingService;
    protected Product product;
    protected List<Appointment> linkedAppointment;
    protected Resource resource;

    /**
     * Gets the value of the appointment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Appointment }
     * 
     * 
     */
    public List<Appointment> getAppointment() {
        if (appointment == null) {
            appointment = new ArrayList<Appointment>();
        }
        return this.appointment;
    }

    /**
     * Gets the value of the customerFacingService property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerFacingService }
     *     
     */
    public CustomerFacingService getCustomerFacingService() {
        return customerFacingService;
    }

    /**
     * Sets the value of the customerFacingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerFacingService }
     *     
     */
    public void setCustomerFacingService(CustomerFacingService value) {
        this.customerFacingService = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the linkedAppointment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedAppointment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedAppointment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Appointment }
     * 
     * 
     */
    public List<Appointment> getLinkedAppointment() {
        if (linkedAppointment == null) {
            linkedAppointment = new ArrayList<Appointment>();
        }
        return this.linkedAppointment;
    }

    /**
     * Gets the value of the resource property.
     * 
     * @return
     *     possible object is
     *     {@link Resource }
     *     
     */
    public Resource getResource() {
        return resource;
    }

    /**
     * Sets the value of the resource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource }
     *     
     */
    public void setResource(Resource value) {
        this.resource = value;
    }

}
