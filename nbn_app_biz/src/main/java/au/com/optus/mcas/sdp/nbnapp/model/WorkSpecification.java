
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isAppointmentRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lifeCycleStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountDue" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Money" minOccurs="0"/>
 *         &lt;element name="categorizesWorkSpecs" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}WorkSpecificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkSpecification", propOrder = {
    "isAppointmentRequired",
    "lifeCycleStatus",
    "id",
    "amountDue",
    "categorizesWorkSpecs"
})
public class WorkSpecification {

    protected Boolean isAppointmentRequired;
    protected String lifeCycleStatus;
    protected String id;
    protected Money amountDue;
    protected WorkSpecificationType categorizesWorkSpecs;

    /**
     * Gets the value of the isAppointmentRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAppointmentRequired() {
        return isAppointmentRequired;
    }

    /**
     * Sets the value of the isAppointmentRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAppointmentRequired(Boolean value) {
        this.isAppointmentRequired = value;
    }

    /**
     * Gets the value of the lifeCycleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleStatus() {
        return lifeCycleStatus;
    }

    /**
     * Sets the value of the lifeCycleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleStatus(String value) {
        this.lifeCycleStatus = value;
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
     * Gets the value of the amountDue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAmountDue(Money value) {
        this.amountDue = value;
    }

    /**
     * Gets the value of the categorizesWorkSpecs property.
     * 
     * @return
     *     possible object is
     *     {@link WorkSpecificationType }
     *     
     */
    public WorkSpecificationType getCategorizesWorkSpecs() {
        return categorizesWorkSpecs;
    }

    /**
     * Sets the value of the categorizesWorkSpecs property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkSpecificationType }
     *     
     */
    public void setCategorizesWorkSpecs(WorkSpecificationType value) {
        this.categorizesWorkSpecs = value;
    }

}
