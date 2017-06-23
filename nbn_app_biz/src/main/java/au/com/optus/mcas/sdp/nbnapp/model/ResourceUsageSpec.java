
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceUsageSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceUsageSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}UsageSpecification">
 *       &lt;sequence>
 *         &lt;element name="resourceUsageSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourceSpecification" type="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}ResourceSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceUsageSpec", propOrder = {
    "resourceUsageSpec",
    "resourceSpecification"
})
public class ResourceUsageSpec
    extends UsageSpecification
{

    protected String resourceUsageSpec;
    protected List<ResourceSpecification> resourceSpecification;

    /**
     * Gets the value of the resourceUsageSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceUsageSpec() {
        return resourceUsageSpec;
    }

    /**
     * Sets the value of the resourceUsageSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceUsageSpec(String value) {
        this.resourceUsageSpec = value;
    }

    /**
     * Gets the value of the resourceSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceSpecification }
     * 
     * 
     */
    public List<ResourceSpecification> getResourceSpecification() {
        if (resourceSpecification == null) {
            resourceSpecification = new ArrayList<ResourceSpecification>();
        }
        return this.resourceSpecification;
    }

}
