
package au.com.singtel.group.cdm.v2_0_0.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import au.com.singtel.group.cdm.v2_0_0.common.TimePeriod;


/**
 * <p>Java class for CustomerCreditProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerCreditProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditProfileDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="creditRiskRating" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="creditScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overrideCreditCheck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditRiskRatingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="riskStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="historicalCreditScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currentCreditScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custCreditProfileReference" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustCreditProfileReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externalCreditCheckDetails" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}ExternalCreditCheckDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCreditProfile", propOrder = {
    "id",
    "creditProfileDate",
    "validFor",
    "creditRiskRating",
    "creditScore",
    "status",
    "overrideCreditCheck",
    "creditRiskRatingReason",
    "riskStatus",
    "historicalCreditScore",
    "currentCreditScore",
    "custCreditProfileReference",
    "externalCreditCheckDetails"
})
public class CustomerCreditProfile {

    protected String id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creditProfileDate;
    protected TimePeriod validFor;
    protected Integer creditRiskRating;
    protected Integer creditScore;
    protected String status;
    protected String overrideCreditCheck;
    protected String creditRiskRatingReason;
    protected String riskStatus;
    protected String historicalCreditScore;
    protected String currentCreditScore;
    protected List<CustCreditProfileReference> custCreditProfileReference;
    protected ExternalCreditCheckDetails externalCreditCheckDetails;

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
     * Gets the value of the creditProfileDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditProfileDate() {
        return creditProfileDate;
    }

    /**
     * Sets the value of the creditProfileDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditProfileDate(XMLGregorianCalendar value) {
        this.creditProfileDate = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setValidFor(TimePeriod value) {
        this.validFor = value;
    }

    /**
     * Gets the value of the creditRiskRating property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditRiskRating() {
        return creditRiskRating;
    }

    /**
     * Sets the value of the creditRiskRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditRiskRating(Integer value) {
        this.creditRiskRating = value;
    }

    /**
     * Gets the value of the creditScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditScore() {
        return creditScore;
    }

    /**
     * Sets the value of the creditScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditScore(Integer value) {
        this.creditScore = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the overrideCreditCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideCreditCheck() {
        return overrideCreditCheck;
    }

    /**
     * Sets the value of the overrideCreditCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideCreditCheck(String value) {
        this.overrideCreditCheck = value;
    }

    /**
     * Gets the value of the creditRiskRatingReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditRiskRatingReason() {
        return creditRiskRatingReason;
    }

    /**
     * Sets the value of the creditRiskRatingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditRiskRatingReason(String value) {
        this.creditRiskRatingReason = value;
    }

    /**
     * Gets the value of the riskStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskStatus() {
        return riskStatus;
    }

    /**
     * Sets the value of the riskStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskStatus(String value) {
        this.riskStatus = value;
    }

    /**
     * Gets the value of the historicalCreditScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoricalCreditScore() {
        return historicalCreditScore;
    }

    /**
     * Sets the value of the historicalCreditScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoricalCreditScore(String value) {
        this.historicalCreditScore = value;
    }

    /**
     * Gets the value of the currentCreditScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentCreditScore() {
        return currentCreditScore;
    }

    /**
     * Sets the value of the currentCreditScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentCreditScore(String value) {
        this.currentCreditScore = value;
    }

    /**
     * Gets the value of the custCreditProfileReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custCreditProfileReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustCreditProfileReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustCreditProfileReference }
     * 
     * 
     */
    public List<CustCreditProfileReference> getCustCreditProfileReference() {
        if (custCreditProfileReference == null) {
            custCreditProfileReference = new ArrayList<CustCreditProfileReference>();
        }
        return this.custCreditProfileReference;
    }

    /**
     * Gets the value of the externalCreditCheckDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalCreditCheckDetails }
     *     
     */
    public ExternalCreditCheckDetails getExternalCreditCheckDetails() {
        return externalCreditCheckDetails;
    }

    /**
     * Sets the value of the externalCreditCheckDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalCreditCheckDetails }
     *     
     */
    public void setExternalCreditCheckDetails(ExternalCreditCheckDetails value) {
        this.externalCreditCheckDetails = value;
    }

}
