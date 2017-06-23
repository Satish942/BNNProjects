
package au.com.singtel.group.cdm.v2_0_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TroubleTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TroubleTicket">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteraction">
 *       &lt;sequence>
 *         &lt;element name="troubleTicketState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="troubleDetectionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="causeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastCallbackTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="parentTTKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="severity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="netAffectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symptonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="symptonType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TroubleTicketItem" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TroubleTicketItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TroubleTicket", propOrder = {
    "troubleTicketState",
    "troubleDetectionDate",
    "priority",
    "causeCode",
    "clearCode",
    "clearLocationCode",
    "originator",
    "lastCallbackTime",
    "parentTTKey",
    "severity",
    "facilityType",
    "netAffectCode",
    "productGroup",
    "symptonCode",
    "symptonType",
    "troubleTicketItem"
})
public class TroubleTicket
    extends BusinessInteraction
{

    protected String troubleTicketState;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar troubleDetectionDate;
    protected String priority;
    protected String causeCode;
    protected String clearCode;
    protected String clearLocationCode;
    protected String originator;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCallbackTime;
    protected String parentTTKey;
    protected String severity;
    protected String facilityType;
    protected String netAffectCode;
    protected String productGroup;
    protected String symptonCode;
    protected String symptonType;
    @XmlElement(name = "TroubleTicketItem")
    protected List<TroubleTicketItem> troubleTicketItem;

    /**
     * Gets the value of the troubleTicketState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTroubleTicketState() {
        return troubleTicketState;
    }

    /**
     * Sets the value of the troubleTicketState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTroubleTicketState(String value) {
        this.troubleTicketState = value;
    }

    /**
     * Gets the value of the troubleDetectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTroubleDetectionDate() {
        return troubleDetectionDate;
    }

    /**
     * Sets the value of the troubleDetectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTroubleDetectionDate(XMLGregorianCalendar value) {
        this.troubleDetectionDate = value;
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
     * Gets the value of the causeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseCode() {
        return causeCode;
    }

    /**
     * Sets the value of the causeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseCode(String value) {
        this.causeCode = value;
    }

    /**
     * Gets the value of the clearCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearCode() {
        return clearCode;
    }

    /**
     * Sets the value of the clearCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearCode(String value) {
        this.clearCode = value;
    }

    /**
     * Gets the value of the clearLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearLocationCode() {
        return clearLocationCode;
    }

    /**
     * Sets the value of the clearLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearLocationCode(String value) {
        this.clearLocationCode = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Gets the value of the lastCallbackTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCallbackTime() {
        return lastCallbackTime;
    }

    /**
     * Sets the value of the lastCallbackTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCallbackTime(XMLGregorianCalendar value) {
        this.lastCallbackTime = value;
    }

    /**
     * Gets the value of the parentTTKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTTKey() {
        return parentTTKey;
    }

    /**
     * Sets the value of the parentTTKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTTKey(String value) {
        this.parentTTKey = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the facilityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityType() {
        return facilityType;
    }

    /**
     * Sets the value of the facilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityType(String value) {
        this.facilityType = value;
    }

    /**
     * Gets the value of the netAffectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetAffectCode() {
        return netAffectCode;
    }

    /**
     * Sets the value of the netAffectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetAffectCode(String value) {
        this.netAffectCode = value;
    }

    /**
     * Gets the value of the productGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGroup() {
        return productGroup;
    }

    /**
     * Sets the value of the productGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGroup(String value) {
        this.productGroup = value;
    }

    /**
     * Gets the value of the symptonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymptonCode() {
        return symptonCode;
    }

    /**
     * Sets the value of the symptonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymptonCode(String value) {
        this.symptonCode = value;
    }

    /**
     * Gets the value of the symptonType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymptonType() {
        return symptonType;
    }

    /**
     * Sets the value of the symptonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymptonType(String value) {
        this.symptonType = value;
    }

    /**
     * Gets the value of the troubleTicketItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the troubleTicketItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTroubleTicketItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TroubleTicketItem }
     * 
     * 
     */
    public List<TroubleTicketItem> getTroubleTicketItem() {
        if (troubleTicketItem == null) {
            troubleTicketItem = new ArrayList<TroubleTicketItem>();
        }
        return this.troubleTicketItem;
    }

}
