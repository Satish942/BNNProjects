
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an abstract base class for defining the
 *                 ServiceSpecification hierarchy. All Services are characterized as either being possibly visible and
 *                 usable by a Customer or not. This gives rise to the two subclasses of Service: CustomerFacingService and
 *                 ResourceFacingService. However, each instance of a Service is made up of changeable as well as invariant
 *                 attributes, methods, relationships and constraints. A ServiceSpecification defines the invariant
 *                 characteristics of a Service. It can be conceptually thought of as a template that different Service
 *                 instances can be instantiated from. Each of these Service instances will have the same invariant
 *                 characteristics. However, the other characteristics of the instantiated Service will be specific to each
 *                 instance. This class can be thought of as a template, which represents a generic specification for
 *                 implementing a particular type of Service. A ServiceSpecification may consist of other
 *                 ServiceSpecifications supplied together as a collection. Members of the collection may be offered
 *                 individually or collectively. ServiceSpecifications may also exist within groupings, such as within a
 *                 Product. ServiceSpecification inherits from Specification, which inherits from ManagedEntity.
 *             
 * 
 * <p>Java class for ServiceSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceSpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Specification">
 *       &lt;sequence>
 *         &lt;element name="serviceSpecCharUse" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceSpecCharUse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="servicedefinition" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceDefinition" minOccurs="0"/>
 *         &lt;element name="servicetemplate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceTemplate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSpecification", propOrder = {
    "serviceSpecCharUse",
    "servicedefinition",
    "servicetemplate"
})
@XmlSeeAlso({
    ResourceFacingServiceSpec.class,
    ServiceDefinition.class,
    CustomerFacingServiceSpec.class
})
public abstract class ServiceSpecification
    extends Specification
{

    protected List<ServiceSpecCharUse> serviceSpecCharUse;
    protected ServiceDefinition servicedefinition;
    protected ServiceTemplate servicetemplate;

    /**
     * Gets the value of the serviceSpecCharUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSpecCharUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceSpecCharUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceSpecCharUse }
     * 
     * 
     */
    public List<ServiceSpecCharUse> getServiceSpecCharUse() {
        if (serviceSpecCharUse == null) {
            serviceSpecCharUse = new ArrayList<ServiceSpecCharUse>();
        }
        return this.serviceSpecCharUse;
    }

    /**
     * Gets the value of the servicedefinition property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinition }
     *     
     */
    public ServiceDefinition getServicedefinition() {
        return servicedefinition;
    }

    /**
     * Sets the value of the servicedefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinition }
     *     
     */
    public void setServicedefinition(ServiceDefinition value) {
        this.servicedefinition = value;
    }

    /**
     * Gets the value of the servicetemplate property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceTemplate }
     *     
     */
    public ServiceTemplate getServicetemplate() {
        return servicetemplate;
    }

    /**
     * Sets the value of the servicetemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceTemplate }
     *     
     */
    public void setServicetemplate(ServiceTemplate value) {
        this.servicetemplate = value;
    }

}
