
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualIdentification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PartyIdentification">
 *       &lt;sequence>
 *         &lt;element name="preferredIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifierValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relationship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualIdentification", propOrder = {
    "preferredIdentification",
    "alternateIdentification",
    "identifierValue",
    "relationship"
})
@XmlSeeAlso({
    DriversLicenseIdentification.class,
    PassportIdentification.class,
    MedicareIdentification.class,
    OthersIdentification.class
})
public abstract class IndividualIdentification
    extends PartyIdentification
{

    protected String preferredIdentification;
    protected String alternateIdentification;
    protected String identifierValue;
    protected String relationship;

    /**
     * Gets the value of the preferredIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredIdentification() {
        return preferredIdentification;
    }

    /**
     * Sets the value of the preferredIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredIdentification(String value) {
        this.preferredIdentification = value;
    }

    /**
     * Gets the value of the alternateIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateIdentification() {
        return alternateIdentification;
    }

    /**
     * Sets the value of the alternateIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateIdentification(String value) {
        this.alternateIdentification = value;
    }

    /**
     * Gets the value of the identifierValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierValue() {
        return identifierValue;
    }

    /**
     * Sets the value of the identifierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierValue(String value) {
        this.identifierValue = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
    }

}
