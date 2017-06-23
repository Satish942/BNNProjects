
package au.com.singtel.group.cdm.v2_0_0.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceFacingServiceSpecAtomic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceFacingServiceSpecAtomic">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ResourceFacingServiceSpec">
 *       &lt;sequence>
 *         &lt;element name="resourceFacingServiceSpecAtomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceFacingServiceSpecAtomic", propOrder = {
    "resourceFacingServiceSpecAtomic"
})
public class ResourceFacingServiceSpecAtomic
    extends ResourceFacingServiceSpec
{

    protected String resourceFacingServiceSpecAtomic;

    /**
     * Gets the value of the resourceFacingServiceSpecAtomic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceFacingServiceSpecAtomic() {
        return resourceFacingServiceSpecAtomic;
    }

    /**
     * Sets the value of the resourceFacingServiceSpecAtomic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceFacingServiceSpecAtomic(String value) {
        this.resourceFacingServiceSpecAtomic = value;
    }

}
