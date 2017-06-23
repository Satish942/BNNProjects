
package au.com.singtel.group.cdm.v2_0_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessInteraction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessInteraction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interactionDate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="interactionDateComplete" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="interactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interactionStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionActionEnum" minOccurs="0"/>
 *         &lt;element name="plannedCompletionDate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="interactionDateExpiry" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="businessInteractionItem" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessInteractionRole" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionRole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessInteractionLocation" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionLocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessInteractionRelationship" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteraction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessInteractionRequirements" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionRequirements" minOccurs="0"/>
 *         &lt;element name="businessInteractionType" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInteraction", propOrder = {
    "id",
    "description",
    "interactionDate",
    "interactionDateComplete",
    "interactionStatus",
    "interactionStatusCode",
    "action",
    "plannedCompletionDate",
    "interactionDateExpiry",
    "businessInteractionItem",
    "businessInteractionRole",
    "businessInteractionLocation",
    "businessInteractionRelationship",
    "businessInteractionRequirements",
    "businessInteractionType"
})
@XmlSeeAlso({
    Appointment.class,
    Notification.class,
    TroubleTicket.class,
    Agreement.class,
    Opportunity.class,
    Response.class,
    Request.class
})
public abstract class BusinessInteraction {

    protected String id;
    protected String description;
    protected TimePeriod interactionDate;
    protected TimePeriod interactionDateComplete;
    protected String interactionStatus;
    protected String interactionStatusCode;
    protected BusinessInteractionActionEnum action;
    protected TimePeriod plannedCompletionDate;
    protected TimePeriod interactionDateExpiry;
    protected List<BusinessInteractionItem> businessInteractionItem;
    protected List<BusinessInteractionRole> businessInteractionRole;
    protected List<BusinessInteractionLocation> businessInteractionLocation;
    protected List<BusinessInteraction> businessInteractionRelationship;
    protected BusinessInteractionRequirements businessInteractionRequirements;
    protected List<BusinessInteractionType> businessInteractionType;

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
     * Gets the value of the interactionDateComplete property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getInteractionDateComplete() {
        return interactionDateComplete;
    }

    /**
     * Sets the value of the interactionDateComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setInteractionDateComplete(TimePeriod value) {
        this.interactionDateComplete = value;
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
     * Gets the value of the interactionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionStatusCode() {
        return interactionStatusCode;
    }

    /**
     * Sets the value of the interactionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionStatusCode(String value) {
        this.interactionStatusCode = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInteractionActionEnum }
     *     
     */
    public BusinessInteractionActionEnum getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInteractionActionEnum }
     *     
     */
    public void setAction(BusinessInteractionActionEnum value) {
        this.action = value;
    }

    /**
     * Gets the value of the plannedCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getPlannedCompletionDate() {
        return plannedCompletionDate;
    }

    /**
     * Sets the value of the plannedCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setPlannedCompletionDate(TimePeriod value) {
        this.plannedCompletionDate = value;
    }

    /**
     * Gets the value of the interactionDateExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getInteractionDateExpiry() {
        return interactionDateExpiry;
    }

    /**
     * Sets the value of the interactionDateExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setInteractionDateExpiry(TimePeriod value) {
        this.interactionDateExpiry = value;
    }

    /**
     * Gets the value of the businessInteractionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessInteractionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessInteractionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessInteractionItem }
     * 
     * 
     */
    public List<BusinessInteractionItem> getBusinessInteractionItem() {
        if (businessInteractionItem == null) {
            businessInteractionItem = new ArrayList<BusinessInteractionItem>();
        }
        return this.businessInteractionItem;
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
     * Gets the value of the businessInteractionRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessInteractionRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessInteractionRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessInteraction }
     * 
     * 
     */
    public List<BusinessInteraction> getBusinessInteractionRelationship() {
        if (businessInteractionRelationship == null) {
            businessInteractionRelationship = new ArrayList<BusinessInteraction>();
        }
        return this.businessInteractionRelationship;
    }

    /**
     * Gets the value of the businessInteractionRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInteractionRequirements }
     *     
     */
    public BusinessInteractionRequirements getBusinessInteractionRequirements() {
        return businessInteractionRequirements;
    }

    /**
     * Sets the value of the businessInteractionRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInteractionRequirements }
     *     
     */
    public void setBusinessInteractionRequirements(BusinessInteractionRequirements value) {
        this.businessInteractionRequirements = value;
    }

    /**
     * Gets the value of the businessInteractionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessInteractionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessInteractionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessInteractionType }
     * 
     * 
     */
    public List<BusinessInteractionType> getBusinessInteractionType() {
        if (businessInteractionType == null) {
            businessInteractionType = new ArrayList<BusinessInteractionType>();
        }
        return this.businessInteractionType;
    }

}
