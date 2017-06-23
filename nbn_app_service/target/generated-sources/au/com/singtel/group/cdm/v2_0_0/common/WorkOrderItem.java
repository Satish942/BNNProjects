
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WorkOrderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkOrderItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionItem">
 *       &lt;sequence>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="workOrderItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkOrderItemInvolvesWork" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Work" minOccurs="0"/>
 *         &lt;element name="WorkOrderItemInvolvesWorkSpec" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}WorkSpecification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkOrderItem", propOrder = {
    "notes",
    "provisionDate",
    "workOrderItemNumber",
    "workOrderItemInvolvesWork",
    "workOrderItemInvolvesWorkSpec"
})
public class WorkOrderItem
    extends BusinessInteractionItem
{

    protected String notes;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar provisionDate;
    protected String workOrderItemNumber;
    @XmlElement(name = "WorkOrderItemInvolvesWork")
    protected Work workOrderItemInvolvesWork;
    @XmlElement(name = "WorkOrderItemInvolvesWorkSpec")
    protected WorkSpecification workOrderItemInvolvesWorkSpec;

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the provisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProvisionDate() {
        return provisionDate;
    }

    /**
     * Sets the value of the provisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProvisionDate(XMLGregorianCalendar value) {
        this.provisionDate = value;
    }

    /**
     * Gets the value of the workOrderItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderItemNumber() {
        return workOrderItemNumber;
    }

    /**
     * Sets the value of the workOrderItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderItemNumber(String value) {
        this.workOrderItemNumber = value;
    }

    /**
     * Gets the value of the workOrderItemInvolvesWork property.
     * 
     * @return
     *     possible object is
     *     {@link Work }
     *     
     */
    public Work getWorkOrderItemInvolvesWork() {
        return workOrderItemInvolvesWork;
    }

    /**
     * Sets the value of the workOrderItemInvolvesWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link Work }
     *     
     */
    public void setWorkOrderItemInvolvesWork(Work value) {
        this.workOrderItemInvolvesWork = value;
    }

    /**
     * Gets the value of the workOrderItemInvolvesWorkSpec property.
     * 
     * @return
     *     possible object is
     *     {@link WorkSpecification }
     *     
     */
    public WorkSpecification getWorkOrderItemInvolvesWorkSpec() {
        return workOrderItemInvolvesWorkSpec;
    }

    /**
     * Sets the value of the workOrderItemInvolvesWorkSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkSpecification }
     *     
     */
    public void setWorkOrderItemInvolvesWorkSpec(WorkSpecification value) {
        this.workOrderItemInvolvesWorkSpec = value;
    }

}
