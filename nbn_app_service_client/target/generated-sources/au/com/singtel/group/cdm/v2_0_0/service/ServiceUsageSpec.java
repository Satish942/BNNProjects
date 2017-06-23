
package au.com.singtel.group.cdm.v2_0_0.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A detailed description of a service usage event (for example,
 *                 a purchase or a usage of a service).
 *             
 * 
 * <p>Java class for ServiceUsageSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceUsageSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceUsageSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_serviceSpecification" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceUsageSpec", propOrder = {
    "serviceUsageSpec",
    "id",
    "name",
    "serviceSpecification"
})
public class ServiceUsageSpec {

    protected String serviceUsageSpec;
    protected String id;
    protected String name;
    @XmlElement(name = "_serviceSpecification")
    protected List<ServiceSpecification> serviceSpecification;

    /**
     * Gets the value of the serviceUsageSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUsageSpec() {
        return serviceUsageSpec;
    }

    /**
     * Sets the value of the serviceUsageSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUsageSpec(String value) {
        this.serviceUsageSpec = value;
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

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the serviceSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceSpecification }
     * 
     * 
     */
    public List<ServiceSpecification> getServiceSpecification() {
        if (serviceSpecification == null) {
            serviceSpecification = new ArrayList<ServiceSpecification>();
        }
        return this.serviceSpecification;
    }

}
