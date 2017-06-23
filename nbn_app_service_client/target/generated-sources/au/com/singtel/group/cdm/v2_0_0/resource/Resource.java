
package au.com.singtel.group.cdm.v2_0_0.resource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resource">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usageState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourceOrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isActivationRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourceCharacteristicValue" type="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}ResourceCharacteristicValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resourceSpecification" type="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}ResourceSpecification" minOccurs="0"/>
 *         &lt;element name="resourceUsage" type="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}ResourceUsage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource", propOrder = {
    "usageState",
    "id",
    "type",
    "subType",
    "identifier",
    "resourceOrderType",
    "isActivationRequired",
    "resourceCharacteristicValue",
    "resourceSpecification",
    "resourceUsage"
})
@XmlSeeAlso({
    PhysicalResource.class,
    LogicalResource.class
})
public abstract class Resource {

    protected Integer usageState;
    protected String id;
    protected List<String> type;
    protected String subType;
    protected String identifier;
    protected String resourceOrderType;
    protected String isActivationRequired;
    protected List<ResourceCharacteristicValue> resourceCharacteristicValue;
    protected ResourceSpecification resourceSpecification;
    protected List<ResourceUsage> resourceUsage;

    /**
     * Gets the value of the usageState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsageState() {
        return usageState;
    }

    /**
     * Sets the value of the usageState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsageState(Integer value) {
        this.usageState = value;
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
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<String>();
        }
        return this.type;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the resourceOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceOrderType() {
        return resourceOrderType;
    }

    /**
     * Sets the value of the resourceOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceOrderType(String value) {
        this.resourceOrderType = value;
    }

    /**
     * Gets the value of the isActivationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActivationRequired() {
        return isActivationRequired;
    }

    /**
     * Sets the value of the isActivationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActivationRequired(String value) {
        this.isActivationRequired = value;
    }

    /**
     * Gets the value of the resourceCharacteristicValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceCharacteristicValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceCharacteristicValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceCharacteristicValue }
     * 
     * 
     */
    public List<ResourceCharacteristicValue> getResourceCharacteristicValue() {
        if (resourceCharacteristicValue == null) {
            resourceCharacteristicValue = new ArrayList<ResourceCharacteristicValue>();
        }
        return this.resourceCharacteristicValue;
    }

    /**
     * Gets the value of the resourceSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceSpecification }
     *     
     */
    public ResourceSpecification getResourceSpecification() {
        return resourceSpecification;
    }

    /**
     * Sets the value of the resourceSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceSpecification }
     *     
     */
    public void setResourceSpecification(ResourceSpecification value) {
        this.resourceSpecification = value;
    }

    /**
     * Gets the value of the resourceUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceUsage }
     * 
     * 
     */
    public List<ResourceUsage> getResourceUsage() {
        if (resourceUsage == null) {
            resourceUsage = new ArrayList<ResourceUsage>();
        }
        return this.resourceUsage;
    }

}
