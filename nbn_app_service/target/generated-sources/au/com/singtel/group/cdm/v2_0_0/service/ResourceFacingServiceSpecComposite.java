
package au.com.singtel.group.cdm.v2_0_0.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceFacingServiceSpecComposite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceFacingServiceSpecComposite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ResourceFacingServiceSpec">
 *       &lt;sequence>
 *         &lt;element name="resourceFacingServiceSpecs" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ResourceFacingServiceSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceFacingServiceSpecComposite", propOrder = {
    "resourceFacingServiceSpecs"
})
public class ResourceFacingServiceSpecComposite
    extends ResourceFacingServiceSpec
{

    protected List<ResourceFacingServiceSpec> resourceFacingServiceSpecs;

    /**
     * Gets the value of the resourceFacingServiceSpecs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceFacingServiceSpecs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceFacingServiceSpecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceFacingServiceSpec }
     * 
     * 
     */
    public List<ResourceFacingServiceSpec> getResourceFacingServiceSpecs() {
        if (resourceFacingServiceSpecs == null) {
            resourceFacingServiceSpecs = new ArrayList<ResourceFacingServiceSpec>();
        }
        return this.resourceFacingServiceSpecs;
    }

}
