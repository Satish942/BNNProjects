
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EventTriggerDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventTriggerDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}CoreEntity">
 *       &lt;sequence>
 *         &lt;element name="triggerStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="triggerEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventTriggerDetails", propOrder = {
    "triggerStartTime",
    "triggerEndTime"
})
public class EventTriggerDetails
    extends CoreEntity
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar triggerStartTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar triggerEndTime;

    /**
     * Gets the value of the triggerStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTriggerStartTime() {
        return triggerStartTime;
    }

    /**
     * Sets the value of the triggerStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTriggerStartTime(XMLGregorianCalendar value) {
        this.triggerStartTime = value;
    }

    /**
     * Gets the value of the triggerEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTriggerEndTime() {
        return triggerEndTime;
    }

    /**
     * Sets the value of the triggerEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTriggerEndTime(XMLGregorianCalendar value) {
        this.triggerEndTime = value;
    }

}
