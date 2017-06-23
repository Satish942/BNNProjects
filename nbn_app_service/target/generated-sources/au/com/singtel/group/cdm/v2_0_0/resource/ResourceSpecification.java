
package au.com.singtel.group.cdm.v2_0_0.resource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resourceSpecCharUse" type="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}ResourceSpecCharUse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="networkAddressSpecification" type="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}NetworkAddressSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceSpecification", propOrder = {
    "id",
    "resourceSpecCharUse",
    "networkAddressSpecification"
})
@XmlSeeAlso({
    PhysicalResourceSpec.class,
    LogicalResourceSpec.class
})
public abstract class ResourceSpecification {

    protected String id;
    protected List<ResourceSpecCharUse> resourceSpecCharUse;
    protected List<NetworkAddressSpecification> networkAddressSpecification;

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
     * Gets the value of the resourceSpecCharUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceSpecCharUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceSpecCharUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceSpecCharUse }
     * 
     * 
     */
    public List<ResourceSpecCharUse> getResourceSpecCharUse() {
        if (resourceSpecCharUse == null) {
            resourceSpecCharUse = new ArrayList<ResourceSpecCharUse>();
        }
        return this.resourceSpecCharUse;
    }

    /**
     * Gets the value of the networkAddressSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkAddressSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkAddressSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkAddressSpecification }
     * 
     * 
     */
    public List<NetworkAddressSpecification> getNetworkAddressSpecification() {
        if (networkAddressSpecification == null) {
            networkAddressSpecification = new ArrayList<NetworkAddressSpecification>();
        }
        return this.networkAddressSpecification;
    }

}
