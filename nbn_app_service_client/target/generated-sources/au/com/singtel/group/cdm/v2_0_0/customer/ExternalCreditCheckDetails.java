
package au.com.singtel.group.cdm.v2_0_0.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Optus Extension
 *             
 * 
 * <p>Java class for ExternalCreditCheckDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalCreditCheckDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumMobileServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maximumFixedLineServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maximumCombinedServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ExternalCreditCheckDetails", propOrder = {
    "maximumMobileServices",
    "maximumFixedLineServices",
    "maximumCombinedServices",
    "id"
})
public class ExternalCreditCheckDetails {

    protected String maximumMobileServices;
    protected String maximumFixedLineServices;
    protected String maximumCombinedServices;
    protected String id;

    /**
     * Gets the value of the maximumMobileServices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumMobileServices() {
        return maximumMobileServices;
    }

    /**
     * Sets the value of the maximumMobileServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumMobileServices(String value) {
        this.maximumMobileServices = value;
    }

    /**
     * Gets the value of the maximumFixedLineServices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumFixedLineServices() {
        return maximumFixedLineServices;
    }

    /**
     * Sets the value of the maximumFixedLineServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumFixedLineServices(String value) {
        this.maximumFixedLineServices = value;
    }

    /**
     * Gets the value of the maximumCombinedServices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumCombinedServices() {
        return maximumCombinedServices;
    }

    /**
     * Sets the value of the maximumCombinedServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumCombinedServices(String value) {
        this.maximumCombinedServices = value;
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
