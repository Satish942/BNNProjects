
package au.com.singtel.group.cdm.v2_0_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Optus - Directly extends Place instead of GeographicPlace and
 *                 AbstractGeographicAddress
 *             
 * 
 * <p>Java class for GeographicAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Place">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subAddress" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}GeographicSubAddress" minOccurs="0"/>
 *         &lt;element name="contactMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logicalAddress" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}LogicalAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicAddress", propOrder = {
    "country",
    "stateOrProvince",
    "subAddress",
    "contactMedium",
    "logicalAddress"
})
@XmlSeeAlso({
    UrbanPropertyAddress.class
})
public abstract class GeographicAddress
    extends Place
{

    protected String country;
    protected String stateOrProvince;
    protected GeographicSubAddress subAddress;
    protected String contactMedium;
    protected List<LogicalAddress> logicalAddress;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the stateOrProvince property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * Sets the value of the stateOrProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvince(String value) {
        this.stateOrProvince = value;
    }

    /**
     * Gets the value of the subAddress property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSubAddress }
     *     
     */
    public GeographicSubAddress getSubAddress() {
        return subAddress;
    }

    /**
     * Sets the value of the subAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSubAddress }
     *     
     */
    public void setSubAddress(GeographicSubAddress value) {
        this.subAddress = value;
    }

    /**
     * Gets the value of the contactMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMedium() {
        return contactMedium;
    }

    /**
     * Sets the value of the contactMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMedium(String value) {
        this.contactMedium = value;
    }

    /**
     * Gets the value of the logicalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logicalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogicalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicalAddress }
     * 
     * 
     */
    public List<LogicalAddress> getLogicalAddress() {
        if (logicalAddress == null) {
            logicalAddress = new ArrayList<LogicalAddress>();
        }
        return this.logicalAddress;
    }

}
