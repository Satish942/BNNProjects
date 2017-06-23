
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ServicePorting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicePorting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portingRejectReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gainingSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="losingSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previousRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gainingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="losingCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorisedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="portingRejectParty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sameCarrier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPortable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="assignedCarrier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="assignedSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cutOverStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giveBackStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authoriseSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portingRejectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorisationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portingQuota" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}PortingQuota" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePorting", propOrder = {
    "portType",
    "id",
    "portingRejectReason",
    "portStatus",
    "gainingSP",
    "losingSP",
    "eventType",
    "previousRequestId",
    "gainingCarrier",
    "losingCarrier",
    "authorisedDate",
    "portingRejectParty",
    "sameCarrier",
    "isPortable",
    "assignedCarrier",
    "assignedSP",
    "cutOverStatus",
    "giveBackStatus",
    "authoriseSystem",
    "portingRejectCode",
    "authorisationType",
    "portingQuota"
})
public class ServicePorting {

    protected String portType;
    protected String id;
    protected String portingRejectReason;
    protected String portStatus;
    protected String gainingSP;
    protected String losingSP;
    protected String eventType;
    protected String previousRequestId;
    protected String gainingCarrier;
    protected String losingCarrier;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorisedDate;
    protected String portingRejectParty;
    protected Boolean sameCarrier;
    protected Boolean isPortable;
    protected Boolean assignedCarrier;
    protected String assignedSP;
    protected String cutOverStatus;
    protected String giveBackStatus;
    protected String authoriseSystem;
    protected String portingRejectCode;
    protected String authorisationType;
    protected List<PortingQuota> portingQuota;

    /**
     * Gets the value of the portType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortType() {
        return portType;
    }

    /**
     * Sets the value of the portType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortType(String value) {
        this.portType = value;
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
     * Gets the value of the portingRejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortingRejectReason() {
        return portingRejectReason;
    }

    /**
     * Sets the value of the portingRejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortingRejectReason(String value) {
        this.portingRejectReason = value;
    }

    /**
     * Gets the value of the portStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortStatus() {
        return portStatus;
    }

    /**
     * Sets the value of the portStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortStatus(String value) {
        this.portStatus = value;
    }

    /**
     * Gets the value of the gainingSP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGainingSP() {
        return gainingSP;
    }

    /**
     * Sets the value of the gainingSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGainingSP(String value) {
        this.gainingSP = value;
    }

    /**
     * Gets the value of the losingSP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLosingSP() {
        return losingSP;
    }

    /**
     * Sets the value of the losingSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLosingSP(String value) {
        this.losingSP = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the previousRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousRequestId() {
        return previousRequestId;
    }

    /**
     * Sets the value of the previousRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousRequestId(String value) {
        this.previousRequestId = value;
    }

    /**
     * Gets the value of the gainingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGainingCarrier() {
        return gainingCarrier;
    }

    /**
     * Sets the value of the gainingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGainingCarrier(String value) {
        this.gainingCarrier = value;
    }

    /**
     * Gets the value of the losingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLosingCarrier() {
        return losingCarrier;
    }

    /**
     * Sets the value of the losingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLosingCarrier(String value) {
        this.losingCarrier = value;
    }

    /**
     * Gets the value of the authorisedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorisedDate() {
        return authorisedDate;
    }

    /**
     * Sets the value of the authorisedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorisedDate(XMLGregorianCalendar value) {
        this.authorisedDate = value;
    }

    /**
     * Gets the value of the portingRejectParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortingRejectParty() {
        return portingRejectParty;
    }

    /**
     * Sets the value of the portingRejectParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortingRejectParty(String value) {
        this.portingRejectParty = value;
    }

    /**
     * Gets the value of the sameCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSameCarrier() {
        return sameCarrier;
    }

    /**
     * Sets the value of the sameCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSameCarrier(Boolean value) {
        this.sameCarrier = value;
    }

    /**
     * Gets the value of the isPortable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPortable() {
        return isPortable;
    }

    /**
     * Sets the value of the isPortable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPortable(Boolean value) {
        this.isPortable = value;
    }

    /**
     * Gets the value of the assignedCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignedCarrier() {
        return assignedCarrier;
    }

    /**
     * Sets the value of the assignedCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignedCarrier(Boolean value) {
        this.assignedCarrier = value;
    }

    /**
     * Gets the value of the assignedSP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedSP() {
        return assignedSP;
    }

    /**
     * Sets the value of the assignedSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedSP(String value) {
        this.assignedSP = value;
    }

    /**
     * Gets the value of the cutOverStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutOverStatus() {
        return cutOverStatus;
    }

    /**
     * Sets the value of the cutOverStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutOverStatus(String value) {
        this.cutOverStatus = value;
    }

    /**
     * Gets the value of the giveBackStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiveBackStatus() {
        return giveBackStatus;
    }

    /**
     * Sets the value of the giveBackStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiveBackStatus(String value) {
        this.giveBackStatus = value;
    }

    /**
     * Gets the value of the authoriseSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthoriseSystem() {
        return authoriseSystem;
    }

    /**
     * Sets the value of the authoriseSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthoriseSystem(String value) {
        this.authoriseSystem = value;
    }

    /**
     * Gets the value of the portingRejectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortingRejectCode() {
        return portingRejectCode;
    }

    /**
     * Sets the value of the portingRejectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortingRejectCode(String value) {
        this.portingRejectCode = value;
    }

    /**
     * Gets the value of the authorisationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisationType() {
        return authorisationType;
    }

    /**
     * Sets the value of the authorisationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorisationType(String value) {
        this.authorisationType = value;
    }

    /**
     * Gets the value of the portingQuota property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portingQuota property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortingQuota().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortingQuota }
     * 
     * 
     */
    public List<PortingQuota> getPortingQuota() {
        if (portingQuota == null) {
            portingQuota = new ArrayList<PortingQuota>();
        }
        return this.portingQuota;
    }

}
