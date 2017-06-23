
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Collection">
 *       &lt;sequence>
 *         &lt;element name="hasEventEvaluated" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="eventSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyEventAtomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventTriggerDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyEvent", propOrder = {
    "hasEventEvaluated",
    "eventSequenceNumber",
    "policyEventAtomic",
    "eventTriggerDetails"
})
public class PolicyEvent
    extends Collection
{

    protected Float hasEventEvaluated;
    protected String eventSequenceNumber;
    protected String policyEventAtomic;
    protected String eventTriggerDetails;

    /**
     * Gets the value of the hasEventEvaluated property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHasEventEvaluated() {
        return hasEventEvaluated;
    }

    /**
     * Sets the value of the hasEventEvaluated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHasEventEvaluated(Float value) {
        this.hasEventEvaluated = value;
    }

    /**
     * Gets the value of the eventSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventSequenceNumber() {
        return eventSequenceNumber;
    }

    /**
     * Sets the value of the eventSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventSequenceNumber(String value) {
        this.eventSequenceNumber = value;
    }

    /**
     * Gets the value of the policyEventAtomic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyEventAtomic() {
        return policyEventAtomic;
    }

    /**
     * Sets the value of the policyEventAtomic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyEventAtomic(String value) {
        this.policyEventAtomic = value;
    }

    /**
     * Gets the value of the eventTriggerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTriggerDetails() {
        return eventTriggerDetails;
    }

    /**
     * Sets the value of the eventTriggerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTriggerDetails(String value) {
        this.eventTriggerDetails = value;
    }

}
