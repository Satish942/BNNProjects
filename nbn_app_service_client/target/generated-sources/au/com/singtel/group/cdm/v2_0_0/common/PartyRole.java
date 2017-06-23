
package au.com.singtel.group.cdm.v2_0_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.customer.Customer;


/**
 * <p>Java class for PartyRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="party" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Party" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactMedium" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}ContactMedium" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyProfile" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PartyProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyDemographic" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PartyDemographic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="placePartyRoleAssoc" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PlacePartyRoleAssoc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyRoleAssociation" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PartyRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRole", propOrder = {
    "id",
    "status",
    "name",
    "party",
    "contactMedium",
    "partyProfile",
    "partyDemographic",
    "placePartyRoleAssoc",
    "partyRoleAssociation"
})
@XmlSeeAlso({
    Sponser.class,
    Director.class,
    AccessSeeker.class,
    Employee.class,
    SupplyPartner.class,
    OrganizationPost.class,
    Bearer.class,
    ValueNetworkRole.class,
    Customer.class
})
public abstract class PartyRole {

    protected String id;
    protected String status;
    protected String name;
    protected List<Party> party;
    protected List<ContactMedium> contactMedium;
    protected List<PartyProfile> partyProfile;
    protected List<PartyDemographic> partyDemographic;
    protected List<PlacePartyRoleAssoc> placePartyRoleAssoc;
    protected List<PartyRole> partyRoleAssociation;

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

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

    /**
     * Gets the value of the contactMedium property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactMedium property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactMedium().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactMedium }
     * 
     * 
     */
    public List<ContactMedium> getContactMedium() {
        if (contactMedium == null) {
            contactMedium = new ArrayList<ContactMedium>();
        }
        return this.contactMedium;
    }

    /**
     * Gets the value of the partyProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyProfile }
     * 
     * 
     */
    public List<PartyProfile> getPartyProfile() {
        if (partyProfile == null) {
            partyProfile = new ArrayList<PartyProfile>();
        }
        return this.partyProfile;
    }

    /**
     * Gets the value of the partyDemographic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyDemographic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyDemographic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyDemographic }
     * 
     * 
     */
    public List<PartyDemographic> getPartyDemographic() {
        if (partyDemographic == null) {
            partyDemographic = new ArrayList<PartyDemographic>();
        }
        return this.partyDemographic;
    }

    /**
     * Gets the value of the placePartyRoleAssoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placePartyRoleAssoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacePartyRoleAssoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlacePartyRoleAssoc }
     * 
     * 
     */
    public List<PlacePartyRoleAssoc> getPlacePartyRoleAssoc() {
        if (placePartyRoleAssoc == null) {
            placePartyRoleAssoc = new ArrayList<PlacePartyRoleAssoc>();
        }
        return this.placePartyRoleAssoc;
    }

    /**
     * Gets the value of the partyRoleAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyRoleAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyRoleAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRole }
     * 
     * 
     */
    public List<PartyRole> getPartyRoleAssociation() {
        if (partyRoleAssociation == null) {
            partyRoleAssociation = new ArrayList<PartyRole>();
        }
        return this.partyRoleAssociation;
    }

}
