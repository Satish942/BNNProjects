
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A detailed description of a tangible or intangible object made
 *                 available externally in the form of a ProductOffering to Customers or other Parties playing a PartyRole.
 *                 A ProductSpecification may consist of other ProductSpecifications supplied together as a collection.
 *                 Members of the collection may be offered in their own right. ProductSpecifications may also exist within
 *                 groupings, such as ProductCategories, ProductLines, and ProductTypes.
 *             
 * 
 * <p>Java class for ProductSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="lifecycleStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerFacingServiceSpec" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resourceSpecification" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productSpecCharUse" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductSpecCharUse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productSpecificationCostForProductSpecification" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductSpecificationCost" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productSpecificationType" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductSpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productUsageSpec" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductUsageSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSpecification", propOrder = {
    "name",
    "description",
    "productNumber",
    "brand",
    "validFor",
    "lifecycleStatus",
    "id",
    "vendorName",
    "vendorDescription",
    "customerFacingServiceSpec",
    "resourceSpecification",
    "productSpecCharUse",
    "productSpecificationCostForProductSpecification",
    "productSpecificationType",
    "productUsageSpec"
})
@XmlSeeAlso({
    AtomicProductSpecification.class
})
public abstract class ProductSpecification {

    protected String name;
    protected String description;
    protected String productNumber;
    protected String brand;
    protected TimePeriod validFor;
    protected String lifecycleStatus;
    protected String id;
    protected String vendorName;
    protected String vendorDescription;
    @XmlElement(type = Long.class)
    protected List<Long> customerFacingServiceSpec;
    @XmlElement(type = Long.class)
    protected List<Long> resourceSpecification;
    protected List<ProductSpecCharUse> productSpecCharUse;
    protected List<ProductSpecificationCost> productSpecificationCostForProductSpecification;
    protected List<ProductSpecificationType> productSpecificationType;
    protected List<ProductUsageSpec> productUsageSpec;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the productNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductNumber() {
        return productNumber;
    }

    /**
     * Sets the value of the productNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductNumber(String value) {
        this.productNumber = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setValidFor(TimePeriod value) {
        this.validFor = value;
    }

    /**
     * Gets the value of the lifecycleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifecycleStatus() {
        return lifecycleStatus;
    }

    /**
     * Sets the value of the lifecycleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifecycleStatus(String value) {
        this.lifecycleStatus = value;
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
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the vendorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorDescription() {
        return vendorDescription;
    }

    /**
     * Sets the value of the vendorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorDescription(String value) {
        this.vendorDescription = value;
    }

    /**
     * Gets the value of the customerFacingServiceSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerFacingServiceSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerFacingServiceSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCustomerFacingServiceSpec() {
        if (customerFacingServiceSpec == null) {
            customerFacingServiceSpec = new ArrayList<Long>();
        }
        return this.customerFacingServiceSpec;
    }

    /**
     * Gets the value of the resourceSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getResourceSpecification() {
        if (resourceSpecification == null) {
            resourceSpecification = new ArrayList<Long>();
        }
        return this.resourceSpecification;
    }

    /**
     * Gets the value of the productSpecCharUse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSpecCharUse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSpecCharUse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSpecCharUse }
     * 
     * 
     */
    public List<ProductSpecCharUse> getProductSpecCharUse() {
        if (productSpecCharUse == null) {
            productSpecCharUse = new ArrayList<ProductSpecCharUse>();
        }
        return this.productSpecCharUse;
    }

    /**
     * Gets the value of the productSpecificationCostForProductSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSpecificationCostForProductSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSpecificationCostForProductSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSpecificationCost }
     * 
     * 
     */
    public List<ProductSpecificationCost> getProductSpecificationCostForProductSpecification() {
        if (productSpecificationCostForProductSpecification == null) {
            productSpecificationCostForProductSpecification = new ArrayList<ProductSpecificationCost>();
        }
        return this.productSpecificationCostForProductSpecification;
    }

    /**
     * Gets the value of the productSpecificationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSpecificationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSpecificationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSpecificationType }
     * 
     * 
     */
    public List<ProductSpecificationType> getProductSpecificationType() {
        if (productSpecificationType == null) {
            productSpecificationType = new ArrayList<ProductSpecificationType>();
        }
        return this.productSpecificationType;
    }

    /**
     * Gets the value of the productUsageSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productUsageSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductUsageSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductUsageSpec }
     * 
     * 
     */
    public List<ProductUsageSpec> getProductUsageSpec() {
        if (productUsageSpec == null) {
            productUsageSpec = new ArrayList<ProductUsageSpec>();
        }
        return this.productUsageSpec;
    }

}
