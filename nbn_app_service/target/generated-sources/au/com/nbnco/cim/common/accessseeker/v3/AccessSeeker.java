
package au.com.nbnco.cim.common.accessseeker.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Access Seeker details.
 * 
 * <p>Java class for AccessSeeker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessSeeker">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccessSeekerContact" type="{http://www.nbnco.com.au/cim/common/accessSeeker/v3}AccessSeekerContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accessSeekerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccessSeekerBillingAccountRelationship" type="{http://www.nbnco.com.au/cim/common/accessSeeker/v3}AccessSeekerBillingAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessSeeker", propOrder = {
    "accessSeekerContact",
    "accessSeekerName",
    "accountStatus",
    "accessSeekerBillingAccountRelationship"
})
public class AccessSeeker {

    @XmlElement(name = "AccessSeekerContact")
    protected List<AccessSeekerContact> accessSeekerContact;
    protected String accessSeekerName;
    protected String accountStatus;
    @XmlElement(name = "AccessSeekerBillingAccountRelationship")
    protected List<AccessSeekerBillingAccount> accessSeekerBillingAccountRelationship;

    /**
     * Gets the value of the accessSeekerContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessSeekerContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessSeekerContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessSeekerContact }
     * 
     * 
     */
    public List<AccessSeekerContact> getAccessSeekerContact() {
        if (accessSeekerContact == null) {
            accessSeekerContact = new ArrayList<AccessSeekerContact>();
        }
        return this.accessSeekerContact;
    }

    /**
     * Gets the value of the accessSeekerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessSeekerName() {
        return accessSeekerName;
    }

    /**
     * Sets the value of the accessSeekerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessSeekerName(String value) {
        this.accessSeekerName = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountStatus(String value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the accessSeekerBillingAccountRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessSeekerBillingAccountRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessSeekerBillingAccountRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessSeekerBillingAccount }
     * 
     * 
     */
    public List<AccessSeekerBillingAccount> getAccessSeekerBillingAccountRelationship() {
        if (accessSeekerBillingAccountRelationship == null) {
            accessSeekerBillingAccountRelationship = new ArrayList<AccessSeekerBillingAccount>();
        }
        return this.accessSeekerBillingAccountRelationship;
    }

}
