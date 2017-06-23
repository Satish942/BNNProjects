
package au.com.singtel.group.cdm.v2_0_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.product.ProductUsage;
import au.com.singtel.group.cdm.v2_0_0.resource.ResourceUsage;
import au.com.singtel.group.cdm.v2_0_0.service.ServiceUsage;


/**
 * <p>Java class for Usage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Usage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usageDate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="usageStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usageCharacteristicValue" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}UsageCharacteristicValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="usageSpecification" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}UsageSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partyRole" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PartyRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Usage", propOrder = {
    "usageDate",
    "usageStatus",
    "id",
    "description",
    "usageCharacteristicValue",
    "usageSpecification",
    "partyRole"
})
@XmlSeeAlso({
    ServiceUsage.class,
    ProductUsage.class,
    ResourceUsage.class
})
public abstract class Usage {

    protected TimePeriod usageDate;
    protected String usageStatus;
    protected String id;
    protected String description;
    protected List<UsageCharacteristicValue> usageCharacteristicValue;
    protected List<UsageSpecification> usageSpecification;
    protected List<PartyRole> partyRole;

    /**
     * Gets the value of the usageDate property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getUsageDate() {
        return usageDate;
    }

    /**
     * Sets the value of the usageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setUsageDate(TimePeriod value) {
        this.usageDate = value;
    }

    /**
     * Gets the value of the usageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageStatus() {
        return usageStatus;
    }

    /**
     * Sets the value of the usageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageStatus(String value) {
        this.usageStatus = value;
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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the usageCharacteristicValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageCharacteristicValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageCharacteristicValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageCharacteristicValue }
     * 
     * 
     */
    public List<UsageCharacteristicValue> getUsageCharacteristicValue() {
        if (usageCharacteristicValue == null) {
            usageCharacteristicValue = new ArrayList<UsageCharacteristicValue>();
        }
        return this.usageCharacteristicValue;
    }

    /**
     * Gets the value of the usageSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsageSpecification }
     * 
     * 
     */
    public List<UsageSpecification> getUsageSpecification() {
        if (usageSpecification == null) {
            usageSpecification = new ArrayList<UsageSpecification>();
        }
        return this.usageSpecification;
    }

    /**
     * Gets the value of the partyRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRole }
     * 
     * 
     */
    public List<PartyRole> getPartyRole() {
        if (partyRole == null) {
            partyRole = new ArrayList<PartyRole>();
        }
        return this.partyRole;
    }

}
