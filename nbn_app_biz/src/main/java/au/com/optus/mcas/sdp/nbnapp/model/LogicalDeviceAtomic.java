
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogicalDeviceAtomic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalDeviceAtomic">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}LogicalDevice">
 *       &lt;sequence>
 *         &lt;element name="logicalDeviceAtomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalDeviceAtomic", propOrder = {
    "logicalDeviceAtomic"
})
public class LogicalDeviceAtomic
    extends LogicalDevice
{

    protected String logicalDeviceAtomic;

    /**
     * Gets the value of the logicalDeviceAtomic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalDeviceAtomic() {
        return logicalDeviceAtomic;
    }

    /**
     * Sets the value of the logicalDeviceAtomic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalDeviceAtomic(String value) {
        this.logicalDeviceAtomic = value;
    }

}
