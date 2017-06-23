
package au.com.singtel.group.cdm.v2_0_0.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A CustomerFacingService defines the properties of a particular
 *                 related Service that represents a realization of a Product within an organization's infrastructure; This
 *                 is in direct contrast to ResourceFacingServices, which support the network/infrastructure facing part of
 *                 the service. For example, a VPN is an example of a CustomerFacingService, while the sub-services that
 *                 perform different types of routing between network devices making up the VPN are examples of
 *                 ResourceFacingServices. CustomerFacingServices are directly related to Products as well as to
 *                 ResourceFacingServices. ResourceFacingServices are indirectly related to Products through the
 *                 relationship between Product and CustomerFacingServices. This enforces the relationship to Products
 *                 while keeping Services that are not directly realized by Products (i.e., ResourceFacingServices)
 *                 separated from Products.
 *             
 * 
 * <p>Java class for CustomerFacingService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFacingService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/service}Service">
 *       &lt;sequence>
 *         &lt;element name="cfsStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="authoriseSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cfsStatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerAllowance" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resourceFacingService" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ResourceFacingService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFacingService", propOrder = {
    "cfsStatus",
    "authoriseSystem",
    "cfsStatusMessage",
    "type",
    "subType",
    "product",
    "customerAllowance",
    "resourceFacingService"
})
@XmlSeeAlso({
    CustomerFacingServiceComposite.class,
    CustomerFacingServiceAtomic.class
})
public abstract class CustomerFacingService
    extends Service
{

    protected Integer cfsStatus;
    protected String authoriseSystem;
    protected String cfsStatusMessage;
    protected List<String> type;
    protected List<String> subType;
    protected List<String> product;
    protected List<String> customerAllowance;
    protected List<ResourceFacingService> resourceFacingService;

    /**
     * Gets the value of the cfsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCfsStatus() {
        return cfsStatus;
    }

    /**
     * Sets the value of the cfsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCfsStatus(Integer value) {
        this.cfsStatus = value;
    }

    /**
     * Gets the value of the authoriseSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthoriseSystem() {
        return authoriseSystem;
    }

    /**
     * Sets the value of the authoriseSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthoriseSystem(String value) {
        this.authoriseSystem = value;
    }

    /**
     * Gets the value of the cfsStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfsStatusMessage() {
        return cfsStatusMessage;
    }

    /**
     * Sets the value of the cfsStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfsStatusMessage(String value) {
        this.cfsStatusMessage = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getType() {
        if (type == null) {
            type = new ArrayList<String>();
        }
        return this.type;
    }

    /**
     * Gets the value of the subType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubType() {
        if (subType == null) {
            subType = new ArrayList<String>();
        }
        return this.subType;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProduct() {
        if (product == null) {
            product = new ArrayList<String>();
        }
        return this.product;
    }

    /**
     * Gets the value of the customerAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomerAllowance() {
        if (customerAllowance == null) {
            customerAllowance = new ArrayList<String>();
        }
        return this.customerAllowance;
    }

    /**
     * Gets the value of the resourceFacingService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceFacingService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceFacingService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceFacingService }
     * 
     * 
     */
    public List<ResourceFacingService> getResourceFacingService() {
        if (resourceFacingService == null) {
            resourceFacingService = new ArrayList<ResourceFacingService>();
        }
        return this.resourceFacingService;
    }

}
