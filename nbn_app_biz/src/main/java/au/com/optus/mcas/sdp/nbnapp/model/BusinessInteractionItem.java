
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessInteractionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessInteractionItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantity" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Quantity" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionItemActionEnum" minOccurs="0"/>
 *         &lt;element name="interactionDate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="interactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessInteractionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="products" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resources" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="services" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessInteractionItemFor" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessInteractionLocation" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessInteractionRole" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionRole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessInteractionItemPrice" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionItemPrice" minOccurs="0"/>
 *         &lt;element name="appointment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInteractionItem", propOrder = {
    "quantity",
    "id",
    "action",
    "interactionDate",
    "interactionStatus",
    "description",
    "type",
    "businessInteractionId",
    "products",
    "resources",
    "services",
    "businessInteractionItemFor",
    "businessInteractionLocation",
    "businessInteractionRole",
    "businessInteractionItemPrice",
    "appointment"
})
@XmlSeeAlso({
    TroubleTicketItem.class,
    WorkOrderItem.class,
    AgreementItem.class,
    ServiceOrderItem.class,
    CustomerOrderItem.class,
    ResourceOrderItem.class
})
public abstract class BusinessInteractionItem {

    protected Quantity quantity;
    protected String id;
    protected BusinessInteractionItemActionEnum action;
    protected TimePeriod interactionDate;
    protected String interactionStatus;
    protected String description;
    protected String type;
    protected String businessInteractionId;
    protected List<String> products;
    protected List<String> resources;
    protected List<String> services;
    protected List<BusinessInteractionItem> businessInteractionItemFor;
    protected List<BusinessInteractionLocation> businessInteractionLocation;
    protected List<BusinessInteractionRole> businessInteractionRole;
    protected BusinessInteractionItemPrice businessInteractionItemPrice;
    protected Appointment appointment;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

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

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInteractionItemActionEnum }
     *     
     */
    public BusinessInteractionItemActionEnum getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInteractionItemActionEnum }
     *     
     */
    public void setAction(BusinessInteractionItemActionEnum value) {
        this.action = value;
    }

    /**
     * Gets the value of the interactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getInteractionDate() {
        return interactionDate;
    }

    /**
     * Sets the value of the interactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setInteractionDate(TimePeriod value) {
        this.interactionDate = value;
    }

    /**
     * Gets the value of the interactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionStatus() {
        return interactionStatus;
    }

    /**
     * Sets the value of the interactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionStatus(String value) {
        this.interactionStatus = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the businessInteractionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessInteractionId() {
        return businessInteractionId;
    }

    /**
     * Sets the value of the businessInteractionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessInteractionId(String value) {
        this.businessInteractionId = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the products property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProducts() {
        if (products == null) {
            products = new ArrayList<String>();
        }
        return this.products;
    }

    /**
     * Gets the value of the resources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResources() {
        if (resources == null) {
            resources = new ArrayList<String>();
        }
        return this.resources;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServices() {
        if (services == null) {
            services = new ArrayList<String>();
        }
        return this.services;
    }

    /**
     * Gets the value of the businessInteractionItemFor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessInteractionItemFor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessInteractionItemFor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessInteractionItem }
     * 
     * 
     */
    public List<BusinessInteractionItem> getBusinessInteractionItemFor() {
        if (businessInteractionItemFor == null) {
            businessInteractionItemFor = new ArrayList<BusinessInteractionItem>();
        }
        return this.businessInteractionItemFor;
    }

    /**
     * Gets the value of the businessInteractionLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessInteractionLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessInteractionLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessInteractionLocation }
     * 
     * 
     */
    public List<BusinessInteractionLocation> getBusinessInteractionLocation() {
        if (businessInteractionLocation == null) {
            businessInteractionLocation = new ArrayList<BusinessInteractionLocation>();
        }
        return this.businessInteractionLocation;
    }

    /**
     * Gets the value of the businessInteractionRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessInteractionRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessInteractionRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessInteractionRole }
     * 
     * 
     */
    public List<BusinessInteractionRole> getBusinessInteractionRole() {
        if (businessInteractionRole == null) {
            businessInteractionRole = new ArrayList<BusinessInteractionRole>();
        }
        return this.businessInteractionRole;
    }

    /**
     * Gets the value of the businessInteractionItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInteractionItemPrice }
     *     
     */
    public BusinessInteractionItemPrice getBusinessInteractionItemPrice() {
        return businessInteractionItemPrice;
    }

    /**
     * Sets the value of the businessInteractionItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInteractionItemPrice }
     *     
     */
    public void setBusinessInteractionItemPrice(BusinessInteractionItemPrice value) {
        this.businessInteractionItemPrice = value;
    }

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
