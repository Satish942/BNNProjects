
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceAgreement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resourceAgreementPeriod" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="resourceAgreementDuration" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Quantity" minOccurs="0"/>
 *         &lt;element name="resourceReplacementPeriod" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="resourceReplacementDuration" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Quantity" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceAgreement", propOrder = {
    "resourceAgreementPeriod",
    "resourceAgreementDuration",
    "resourceReplacementPeriod",
    "resourceReplacementDuration",
    "id"
})
public class ResourceAgreement {

    protected TimePeriod resourceAgreementPeriod;
    protected Quantity resourceAgreementDuration;
    protected TimePeriod resourceReplacementPeriod;
    protected Quantity resourceReplacementDuration;
    protected String id;

    /**
     * Gets the value of the resourceAgreementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getResourceAgreementPeriod() {
        return resourceAgreementPeriod;
    }

    /**
     * Sets the value of the resourceAgreementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setResourceAgreementPeriod(TimePeriod value) {
        this.resourceAgreementPeriod = value;
    }

    /**
     * Gets the value of the resourceAgreementDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getResourceAgreementDuration() {
        return resourceAgreementDuration;
    }

    /**
     * Sets the value of the resourceAgreementDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setResourceAgreementDuration(Quantity value) {
        this.resourceAgreementDuration = value;
    }

    /**
     * Gets the value of the resourceReplacementPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getResourceReplacementPeriod() {
        return resourceReplacementPeriod;
    }

    /**
     * Sets the value of the resourceReplacementPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setResourceReplacementPeriod(TimePeriod value) {
        this.resourceReplacementPeriod = value;
    }

    /**
     * Gets the value of the resourceReplacementDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getResourceReplacementDuration() {
        return resourceReplacementDuration;
    }

    /**
     * Sets the value of the resourceReplacementDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setResourceReplacementDuration(Quantity value) {
        this.resourceReplacementDuration = value;
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

}
