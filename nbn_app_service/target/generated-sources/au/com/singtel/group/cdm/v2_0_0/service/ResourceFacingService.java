
package au.com.singtel.group.cdm.v2_0_0.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an abstract base class for ResourceFacingServices. A
 *                 ResourceFacingService is an abstraction that defines the characteristics and behavior of a particular
 *                 Service that is not directly seen or purchased by the Customer. ResourceFacingServices are internal
 *                 Services that are required to support a CustomerFacingService. The Customer obtains
 *                 CustomerFacingServices via Products, and is not aware of the ResourceFacingServices which support the
 *                 CustomerFacingService(s) that is being obtained directly by the Customer via a Product. For example, a
 *                 VPN is an example of a CustomerFacingService. This particular type of VPN may require BGP to support it.
 *                 Customers dont purchase BGP, and hopefully arent even aware that BGP is running. Therefore, BGP is an
 *                 example of a ResourceFacingService. CustomerFacingServices are directly related to Products as well as
 *                 to ResourceFacingServices. ResourceFacingServices are indirectly related to Products through the
 *                 relationship between Product and Resource. This enforces the relationship to Products while keeping
 *                 Services that are not directly obtainable via Products (i.e., ResourceFacingServices) separated from
 *                 Products.
 *             
 * 
 * <p>Java class for ResourceFacingService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceFacingService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/service}Service">
 *       &lt;sequence>
 *         &lt;element name="rfsStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resourceFacingServiceAtomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resources" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resourceFacingServiceSpec" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ResourceFacingServiceSpec" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceFacingService", propOrder = {
    "rfsStatus",
    "resourceFacingServiceAtomic",
    "resources",
    "resourceFacingServiceSpec"
})
@XmlSeeAlso({
    ResourceFacingServiceComposite.class,
    ResourceFacingServiceAtomic.class
})
public abstract class ResourceFacingService
    extends Service
{

    protected Integer rfsStatus;
    protected String resourceFacingServiceAtomic;
    protected List<String> resources;
    protected ResourceFacingServiceSpec resourceFacingServiceSpec;

    /**
     * Gets the value of the rfsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRfsStatus() {
        return rfsStatus;
    }

    /**
     * Sets the value of the rfsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRfsStatus(Integer value) {
        this.rfsStatus = value;
    }

    /**
     * Gets the value of the resourceFacingServiceAtomic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceFacingServiceAtomic() {
        return resourceFacingServiceAtomic;
    }

    /**
     * Sets the value of the resourceFacingServiceAtomic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceFacingServiceAtomic(String value) {
        this.resourceFacingServiceAtomic = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResources() {
        if (resources == null) {
            resources = new ArrayList<String>();
        }
        return this.resources;
    }

    /**
     * Gets the value of the resourceFacingServiceSpec property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceFacingServiceSpec }
     *     
     */
    public ResourceFacingServiceSpec getResourceFacingServiceSpec() {
        return resourceFacingServiceSpec;
    }

    /**
     * Sets the value of the resourceFacingServiceSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceFacingServiceSpec }
     *     
     */
    public void setResourceFacingServiceSpec(ResourceFacingServiceSpec value) {
        this.resourceFacingServiceSpec = value;
    }

}
