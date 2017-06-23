
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Conceptually, a ServiceBundle is thought of as a collection of
 *                 ResourceFacingServiceSpecifications. This enables the needs of different sets of
 *                 ResourceFacingServiceSpecifications to be grouped together hence, the name "bundle". Since these are
 *                 ResoureFacingSpecifications, they define reusable templates for implementing the ResourceFacingServices
 *                 that are required by a particular CustomerFacingService (as represented by a ServicePackage).
 *                 ServiceBundles were designed to define a set of Class of Service specifications that were required by a
 *                 CustomerFacingService to work together. A ServicePackage is the entity that models the requirements of
 *                 the CustomerFacingService. Thus, ServicePackages can specify different packaging of
 *                 CustomerFacingServices that are obtained by a Customer via a Product, and ServiceBundles specify the set
 *                 of ResourceFacingServices that each CustomerFacingService requires. ServiceBundles are a natural way to
 *                 implement the requirements of a ServicePackage, and are related to a ServicePackage through the
 *                 ServicePackageUsesServiceBundles aggregation.
 *             
 * 
 * <p>Java class for ServiceBundle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceBundle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasMultipleQoSTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBundle", propOrder = {
    "hasMultipleQoSTypes",
    "id"
})
public class ServiceBundle {

    protected Boolean hasMultipleQoSTypes;
    protected String id;

    /**
     * Gets the value of the hasMultipleQoSTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMultipleQoSTypes() {
        return hasMultipleQoSTypes;
    }

    /**
     * Sets the value of the hasMultipleQoSTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMultipleQoSTypes(Boolean value) {
        this.hasMultipleQoSTypes = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
