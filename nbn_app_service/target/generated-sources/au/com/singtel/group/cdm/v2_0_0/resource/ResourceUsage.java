
package au.com.singtel.group.cdm.v2_0_0.resource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.Usage;


/**
 * <p>Java class for ResourceUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceUsage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Usage">
 *       &lt;sequence>
 *         &lt;element name="resourceUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceUsageId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceUsage", propOrder = {
    "resourceUsage",
    "serviceUsageId"
})
public class ResourceUsage
    extends Usage
{

    protected String resourceUsage;
    protected List<String> serviceUsageId;

    /**
     * Gets the value of the resourceUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceUsage() {
        return resourceUsage;
    }

    /**
     * Sets the value of the resourceUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceUsage(String value) {
        this.resourceUsage = value;
    }

    /**
     * Gets the value of the serviceUsageId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceUsageId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceUsageId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceUsageId() {
        if (serviceUsageId == null) {
            serviceUsageId = new ArrayList<String>();
        }
        return this.serviceUsageId;
    }

}
