
package au.com.singtel.group.cdm.v2_0_0.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalDeviceAtomic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalDeviceAtomic">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}PhysicalDevice">
 *       &lt;sequence>
 *         &lt;element name="physicalDeviceAtomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalDeviceAtomic", propOrder = {
    "physicalDeviceAtomic"
})
public class PhysicalDeviceAtomic
    extends PhysicalDevice
{

    protected String physicalDeviceAtomic;

    /**
     * Gets the value of the physicalDeviceAtomic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalDeviceAtomic() {
        return physicalDeviceAtomic;
    }

    /**
     * Sets the value of the physicalDeviceAtomic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalDeviceAtomic(String value) {
        this.physicalDeviceAtomic = value;
    }

}
