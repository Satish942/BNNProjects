
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * AccessSeeker account relationship information
 * 
 * <p>Java class for AccessSeekerBillingAccountRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessSeekerBillingAccountRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessSeekerAccount" type="{http://www.nbnco.com.au/cim/common/accessSeeker/v3}AccessSeekerBillingAccount" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessSeekerBillingAccountRelationship", propOrder = {
    "accessSeekerAccount",
    "name"
})
public class AccessSeekerBillingAccountRelationship {

    @XmlElement(name = "AccessSeekerAccount")
    protected AccessSeekerBillingAccount accessSeekerAccount;
    protected String name;

    /**
     * Gets the value of the accessSeekerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AccessSeekerBillingAccount }
     *     
     */
    public AccessSeekerBillingAccount getAccessSeekerAccount() {
        return accessSeekerAccount;
    }

    /**
     * Sets the value of the accessSeekerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessSeekerBillingAccount }
     *     
     */
    public void setAccessSeekerAccount(AccessSeekerBillingAccount value) {
        this.accessSeekerAccount = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
