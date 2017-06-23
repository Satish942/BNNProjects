
package au.com.singtel.group.cdm.v2_0_0.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an abstract base class for defining different types of
 *                 ResourceFacingServiceSpecs. A ResourceFacingServiceSpec is an abstraction that defines the invariant
 *                 characteristics and behavior of a particular ResourceFacingService. The invariant portion serves as a
 *                 single common basis to build a set of variable ResourceFacingServices that all use this common
 *                 ResourceFacingServiceSpec. This class can be thought of as a template, which represents a generic
 *                 specification for implementing a particular type of Service. A ServiceSpecification may consist of other
 *                 ServiceSpecifications supplied together as a collection. Members of the collection may be offered
 *                 individually or collectively. ServiceSpecifications may also exist within groupings, such as within a
 *                 Product. ServiceSpecification inherits from Specification, which inherits from ManagedEntity.
 *             
 * 
 * <p>Java class for ResourceFacingServiceSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceFacingServiceSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceSpecification">
 *       &lt;sequence>
 *         &lt;element name="resourceFacingServiceSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceFacingServiceSpec", propOrder = {
    "resourceFacingServiceSpec"
})
@XmlSeeAlso({
    ResourceFacingServiceSpecAtomic.class,
    ResourceFacingServiceSpecComposite.class
})
public abstract class ResourceFacingServiceSpec
    extends ServiceSpecification
{

    protected String resourceFacingServiceSpec;

    /**
     * Gets the value of the resourceFacingServiceSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceFacingServiceSpec() {
        return resourceFacingServiceSpec;
    }

    /**
     * Sets the value of the resourceFacingServiceSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceFacingServiceSpec(String value) {
        this.resourceFacingServiceSpec = value;
    }

}
