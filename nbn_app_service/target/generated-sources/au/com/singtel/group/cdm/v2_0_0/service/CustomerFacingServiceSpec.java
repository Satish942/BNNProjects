
package au.com.singtel.group.cdm.v2_0_0.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A CustomerFacingServiceSpec defines the properties
 *                 (attributes) common to a particular CustomerFacingService used to realize the associated Product(s).
 *                 This entity serves as a common basis to build any set of CustomerFacingServices that the service
 *                 provider needs.
 *             
 * 
 * <p>Java class for CustomerFacingServiceSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFacingServiceSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceSpecification">
 *       &lt;sequence>
 *         &lt;element name="customerFacingServiceSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourceFacingServiceSpec" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ResourceFacingServiceSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFacingServiceSpec", propOrder = {
    "customerFacingServiceSpec",
    "resourceFacingServiceSpec"
})
@XmlSeeAlso({
    CustomerFacingServiceSpecAtomic.class,
    CustomerFacingServiceSpecComposite.class
})
public abstract class CustomerFacingServiceSpec
    extends ServiceSpecification
{

    protected String customerFacingServiceSpec;
    protected List<ResourceFacingServiceSpec> resourceFacingServiceSpec;

    /**
     * Gets the value of the customerFacingServiceSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFacingServiceSpec() {
        return customerFacingServiceSpec;
    }

    /**
     * Sets the value of the customerFacingServiceSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFacingServiceSpec(String value) {
        this.customerFacingServiceSpec = value;
    }

    /**
     * Gets the value of the resourceFacingServiceSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceFacingServiceSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceFacingServiceSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceFacingServiceSpec }
     * 
     * 
     */
    public List<ResourceFacingServiceSpec> getResourceFacingServiceSpec() {
        if (resourceFacingServiceSpec == null) {
            resourceFacingServiceSpec = new ArrayList<ResourceFacingServiceSpec>();
        }
        return this.resourceFacingServiceSpec;
    }

}
