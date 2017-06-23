
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementAuthorization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementAuthorization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agreementAuthorizationState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementSignatureRepresentation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementAuthorizationDate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
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
@XmlType(name = "AgreementAuthorization", propOrder = {
    "agreementAuthorizationState",
    "agreementSignatureRepresentation",
    "agreementAuthorizationDate",
    "id"
})
public class AgreementAuthorization {

    protected String agreementAuthorizationState;
    protected String agreementSignatureRepresentation;
    protected TimePeriod agreementAuthorizationDate;
    protected String id;

    /**
     * Gets the value of the agreementAuthorizationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementAuthorizationState() {
        return agreementAuthorizationState;
    }

    /**
     * Sets the value of the agreementAuthorizationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementAuthorizationState(String value) {
        this.agreementAuthorizationState = value;
    }

    /**
     * Gets the value of the agreementSignatureRepresentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementSignatureRepresentation() {
        return agreementSignatureRepresentation;
    }

    /**
     * Sets the value of the agreementSignatureRepresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementSignatureRepresentation(String value) {
        this.agreementSignatureRepresentation = value;
    }

    /**
     * Gets the value of the agreementAuthorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getAgreementAuthorizationDate() {
        return agreementAuthorizationDate;
    }

    /**
     * Sets the value of the agreementAuthorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setAgreementAuthorizationDate(TimePeriod value) {
        this.agreementAuthorizationDate = value;
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
