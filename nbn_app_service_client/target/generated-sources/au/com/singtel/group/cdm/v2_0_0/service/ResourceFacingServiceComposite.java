
package au.com.singtel.group.cdm.v2_0_0.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceFacingServiceComposite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceFacingServiceComposite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ResourceFacingService">
 *       &lt;sequence>
 *         &lt;element name="resourceFacingServices" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ResourceFacingService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceFacingServiceComposite", propOrder = {
    "resourceFacingServices"
})
public class ResourceFacingServiceComposite
    extends ResourceFacingService
{

    protected List<ResourceFacingService> resourceFacingServices;

    /**
     * Gets the value of the resourceFacingServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceFacingServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceFacingServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceFacingService }
     * 
     * 
     */
    public List<ResourceFacingService> getResourceFacingServices() {
        if (resourceFacingServices == null) {
            resourceFacingServices = new ArrayList<ResourceFacingService>();
        }
        return this.resourceFacingServices;
    }

}
