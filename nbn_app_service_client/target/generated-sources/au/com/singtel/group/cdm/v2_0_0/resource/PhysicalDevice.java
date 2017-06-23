
package au.com.singtel.group.cdm.v2_0_0.resource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}PhysicalResource">
 *       &lt;sequence>
 *         &lt;element name="backplaneIndependent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="backplaneNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="configurationOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceGroupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isComposite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="canMixPower" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hardware" type="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}Hardware" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalDevice", propOrder = {
    "backplaneIndependent",
    "backplaneNumber",
    "configurationOrder",
    "deviceGroupID",
    "isComposite",
    "canMixPower",
    "hardware"
})
@XmlSeeAlso({
    PhysicalDeviceComposite.class,
    PhysicalDeviceAtomic.class
})
public abstract class PhysicalDevice
    extends PhysicalResource
{

    protected Boolean backplaneIndependent;
    protected Integer backplaneNumber;
    protected String configurationOrder;
    protected String deviceGroupID;
    protected Boolean isComposite;
    protected Boolean canMixPower;
    protected List<Hardware> hardware;

    /**
     * Gets the value of the backplaneIndependent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackplaneIndependent() {
        return backplaneIndependent;
    }

    /**
     * Sets the value of the backplaneIndependent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackplaneIndependent(Boolean value) {
        this.backplaneIndependent = value;
    }

    /**
     * Gets the value of the backplaneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackplaneNumber() {
        return backplaneNumber;
    }

    /**
     * Sets the value of the backplaneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackplaneNumber(Integer value) {
        this.backplaneNumber = value;
    }

    /**
     * Gets the value of the configurationOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationOrder() {
        return configurationOrder;
    }

    /**
     * Sets the value of the configurationOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationOrder(String value) {
        this.configurationOrder = value;
    }

    /**
     * Gets the value of the deviceGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceGroupID() {
        return deviceGroupID;
    }

    /**
     * Sets the value of the deviceGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceGroupID(String value) {
        this.deviceGroupID = value;
    }

    /**
     * Gets the value of the isComposite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComposite() {
        return isComposite;
    }

    /**
     * Sets the value of the isComposite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComposite(Boolean value) {
        this.isComposite = value;
    }

    /**
     * Gets the value of the canMixPower property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanMixPower() {
        return canMixPower;
    }

    /**
     * Sets the value of the canMixPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanMixPower(Boolean value) {
        this.canMixPower = value;
    }

    /**
     * Gets the value of the hardware property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardware property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hardware }
     * 
     * 
     */
    public List<Hardware> getHardware() {
        if (hardware == null) {
            hardware = new ArrayList<Hardware>();
        }
        return this.hardware;
    }

}
