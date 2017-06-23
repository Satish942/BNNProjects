
package au.com.singtel.group.cdm.v2_0_0.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceSpecCharUse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceSpecCharUse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourcePackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canBeOveridden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minCardinality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxCardinality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extensible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourceSpecCharacteristic" type="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}ResourceSpecCharacteristic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceSpecCharUse", propOrder = {
    "name",
    "description",
    "unique",
    "resourcePackage",
    "canBeOveridden",
    "minCardinality",
    "maxCardinality",
    "extensible",
    "id",
    "resourceSpecCharacteristic"
})
public class ResourceSpecCharUse {

    protected String name;
    protected String description;
    protected String unique;
    protected String resourcePackage;
    protected String canBeOveridden;
    protected String minCardinality;
    protected String maxCardinality;
    protected String extensible;
    @XmlElement(name = "Id")
    protected String id;
    protected ResourceSpecCharacteristic resourceSpecCharacteristic;

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
     * Gets the value of the unique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnique(String value) {
        this.unique = value;
    }

    /**
     * Gets the value of the resourcePackage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourcePackage() {
        return resourcePackage;
    }

    /**
     * Sets the value of the resourcePackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourcePackage(String value) {
        this.resourcePackage = value;
    }

    /**
     * Gets the value of the canBeOveridden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanBeOveridden() {
        return canBeOveridden;
    }

    /**
     * Sets the value of the canBeOveridden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanBeOveridden(String value) {
        this.canBeOveridden = value;
    }

    /**
     * Gets the value of the minCardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinCardinality() {
        return minCardinality;
    }

    /**
     * Sets the value of the minCardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinCardinality(String value) {
        this.minCardinality = value;
    }

    /**
     * Gets the value of the maxCardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCardinality() {
        return maxCardinality;
    }

    /**
     * Sets the value of the maxCardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCardinality(String value) {
        this.maxCardinality = value;
    }

    /**
     * Gets the value of the extensible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensible() {
        return extensible;
    }

    /**
     * Sets the value of the extensible property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensible(String value) {
        this.extensible = value;
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
     * Gets the value of the resourceSpecCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceSpecCharacteristic }
     *     
     */
    public ResourceSpecCharacteristic getResourceSpecCharacteristic() {
        return resourceSpecCharacteristic;
    }

    /**
     * Sets the value of the resourceSpecCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceSpecCharacteristic }
     *     
     */
    public void setResourceSpecCharacteristic(ResourceSpecCharacteristic value) {
        this.resourceSpecCharacteristic = value;
    }

}
