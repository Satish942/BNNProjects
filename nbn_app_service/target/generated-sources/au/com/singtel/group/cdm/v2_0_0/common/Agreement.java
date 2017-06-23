
package au.com.singtel.group.cdm.v2_0_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Agreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Agreement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteraction">
 *       &lt;sequence>
 *         &lt;element name="agreementDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementPeriod" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="agreementStatementOfIntent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementDuration" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Quantity" minOccurs="0"/>
 *         &lt;element name="minimumAgreementPeriod" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="minimumAgreementDuration" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Quantity" minOccurs="0"/>
 *         &lt;element name="agreementItem" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}AgreementItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AgreementResultsIn" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Appointment" minOccurs="0"/>
 *         &lt;element name="resourceAgreement" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}ResourceAgreement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agreement", propOrder = {
    "agreementDocumentNumber",
    "agreementPeriod",
    "agreementStatementOfIntent",
    "agreementType",
    "agreementDuration",
    "minimumAgreementPeriod",
    "minimumAgreementDuration",
    "agreementItem",
    "agreementResultsIn",
    "resourceAgreement"
})
public class Agreement
    extends BusinessInteraction
{

    protected String agreementDocumentNumber;
    protected TimePeriod agreementPeriod;
    protected String agreementStatementOfIntent;
    protected String agreementType;
    protected Quantity agreementDuration;
    protected TimePeriod minimumAgreementPeriod;
    protected Quantity minimumAgreementDuration;
    protected List<AgreementItem> agreementItem;
    @XmlElement(name = "AgreementResultsIn")
    protected Appointment agreementResultsIn;
    protected List<ResourceAgreement> resourceAgreement;

    /**
     * Gets the value of the agreementDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementDocumentNumber() {
        return agreementDocumentNumber;
    }

    /**
     * Sets the value of the agreementDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementDocumentNumber(String value) {
        this.agreementDocumentNumber = value;
    }

    /**
     * Gets the value of the agreementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getAgreementPeriod() {
        return agreementPeriod;
    }

    /**
     * Sets the value of the agreementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setAgreementPeriod(TimePeriod value) {
        this.agreementPeriod = value;
    }

    /**
     * Gets the value of the agreementStatementOfIntent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementStatementOfIntent() {
        return agreementStatementOfIntent;
    }

    /**
     * Sets the value of the agreementStatementOfIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementStatementOfIntent(String value) {
        this.agreementStatementOfIntent = value;
    }

    /**
     * Gets the value of the agreementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementType() {
        return agreementType;
    }

    /**
     * Sets the value of the agreementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementType(String value) {
        this.agreementType = value;
    }

    /**
     * Gets the value of the agreementDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getAgreementDuration() {
        return agreementDuration;
    }

    /**
     * Sets the value of the agreementDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setAgreementDuration(Quantity value) {
        this.agreementDuration = value;
    }

    /**
     * Gets the value of the minimumAgreementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getMinimumAgreementPeriod() {
        return minimumAgreementPeriod;
    }

    /**
     * Sets the value of the minimumAgreementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setMinimumAgreementPeriod(TimePeriod value) {
        this.minimumAgreementPeriod = value;
    }

    /**
     * Gets the value of the minimumAgreementDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getMinimumAgreementDuration() {
        return minimumAgreementDuration;
    }

    /**
     * Sets the value of the minimumAgreementDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setMinimumAgreementDuration(Quantity value) {
        this.minimumAgreementDuration = value;
    }

    /**
     * Gets the value of the agreementItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementItem }
     * 
     * 
     */
    public List<AgreementItem> getAgreementItem() {
        if (agreementItem == null) {
            agreementItem = new ArrayList<AgreementItem>();
        }
        return this.agreementItem;
    }

    /**
     * Gets the value of the agreementResultsIn property.
     * 
     * @return
     *     possible object is
     *     {@link Appointment }
     *     
     */
    public Appointment getAgreementResultsIn() {
        return agreementResultsIn;
    }

    /**
     * Sets the value of the agreementResultsIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appointment }
     *     
     */
    public void setAgreementResultsIn(Appointment value) {
        this.agreementResultsIn = value;
    }

    /**
     * Gets the value of the resourceAgreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceAgreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceAgreement }
     * 
     * 
     */
    public List<ResourceAgreement> getResourceAgreement() {
        if (resourceAgreement == null) {
            resourceAgreement = new ArrayList<ResourceAgreement>();
        }
        return this.resourceAgreement;
    }

}
