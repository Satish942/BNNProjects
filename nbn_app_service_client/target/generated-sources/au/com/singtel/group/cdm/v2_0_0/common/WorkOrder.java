
package au.com.singtel.group.cdm.v2_0_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkOrder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Request">
 *       &lt;sequence>
 *         &lt;element name="requestedDeliveryDate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="revisedDeliveryDate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quotaPoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workOrderItem" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}WorkOrderItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="relatedWorkOrder" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}WorkOrder" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkOrder", propOrder = {
    "requestedDeliveryDate",
    "revisedDeliveryDate",
    "priority",
    "businessUnit",
    "businessNotes",
    "quotaPoints",
    "workOrderNumber",
    "workOrderItem",
    "relatedWorkOrder"
})
public class WorkOrder
    extends Request
{

    protected TimePeriod requestedDeliveryDate;
    protected TimePeriod revisedDeliveryDate;
    protected String priority;
    protected String businessUnit;
    protected String businessNotes;
    protected String quotaPoints;
    protected String workOrderNumber;
    protected List<WorkOrderItem> workOrderItem;
    protected List<WorkOrder> relatedWorkOrder;

    /**
     * Gets the value of the requestedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Sets the value of the requestedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setRequestedDeliveryDate(TimePeriod value) {
        this.requestedDeliveryDate = value;
    }

    /**
     * Gets the value of the revisedDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getRevisedDeliveryDate() {
        return revisedDeliveryDate;
    }

    /**
     * Sets the value of the revisedDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setRevisedDeliveryDate(TimePeriod value) {
        this.revisedDeliveryDate = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessUnit(String value) {
        this.businessUnit = value;
    }

    /**
     * Gets the value of the businessNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNotes() {
        return businessNotes;
    }

    /**
     * Sets the value of the businessNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNotes(String value) {
        this.businessNotes = value;
    }

    /**
     * Gets the value of the quotaPoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaPoints() {
        return quotaPoints;
    }

    /**
     * Sets the value of the quotaPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaPoints(String value) {
        this.quotaPoints = value;
    }

    /**
     * Gets the value of the workOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderNumber() {
        return workOrderNumber;
    }

    /**
     * Sets the value of the workOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderNumber(String value) {
        this.workOrderNumber = value;
    }

    /**
     * Gets the value of the workOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkOrderItem }
     * 
     * 
     */
    public List<WorkOrderItem> getWorkOrderItem() {
        if (workOrderItem == null) {
            workOrderItem = new ArrayList<WorkOrderItem>();
        }
        return this.workOrderItem;
    }

    /**
     * Gets the value of the relatedWorkOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedWorkOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedWorkOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkOrder }
     * 
     * 
     */
    public List<WorkOrder> getRelatedWorkOrder() {
        if (relatedWorkOrder == null) {
            relatedWorkOrder = new ArrayList<WorkOrder>();
        }
        return this.relatedWorkOrder;
    }

}
