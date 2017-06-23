
package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import au.com.singtel.group.cdm.v4_0_0.cdm.Appointment;
import au.com.singtel.group.cdm.v4_0_0.cdm.CustomerFacingService;
import au.com.singtel.group.cdm.v4_0_0.cdm.Product;
import au.com.singtel.group.cdm.v4_0_0.cdm.Resource;

public class GetAppointmentByIdWrapper implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected List<Appointment> appointment;
    protected CustomerFacingService customerFacingService;
    protected List<Appointment> linkedAppointment;
    protected Product product;
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
