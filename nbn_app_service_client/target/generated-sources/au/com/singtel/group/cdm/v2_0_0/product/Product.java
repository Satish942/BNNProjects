
package au.com.singtel.group.cdm.v2_0_0.product;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.BusinessInteractionItem;
import au.com.singtel.group.cdm.v2_0_0.common.TimePeriod;


/**
 * A ProductOffering procured by a Customer, or other interested
 *                 Party playing a PartyRole, appearing as a BusinessInteractionItem, which could take the form of a
 *                 Agreement. ProductSpecificationCharacteristic(s) in part define the Product. A Product is realized as
 *                 one or more Service(s) and/or Resource(s).
 *             
 * 
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalResourceType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productOffering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="physicalResource" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerFacingService" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productPromotion" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductPromotion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productSpecification" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productInvolvementRole" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductInvolvementRole" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productPrice" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessInteractionItem" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productTerm" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductTerm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productCharacteristicValueForProduct" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductCharacteristicValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productUsageForProduct" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductUsage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "name",
    "description",
    "productStatus",
    "productSerialNumber",
    "validFor",
    "id",
    "productCategory",
    "productType",
    "physicalResourceType",
    "productNumber",
    "productOffering",
    "resource",
    "physicalResource",
    "customerFacingService",
    "productPromotion",
    "productSpecification",
    "productInvolvementRole",
    "productPrice",
    "businessInteractionItem",
    "productTerm",
    "productCharacteristicValueForProduct",
    "productUsageForProduct"
})
@XmlSeeAlso({
    ProductBundle.class,
    ProductComponent.class
})
public abstract class Product {

    protected String name;
    protected String description;
    protected String productStatus;
    protected String productSerialNumber;
    protected TimePeriod validFor;
    protected String id;
    protected String productCategory;
    protected String productType;
    protected List<String> physicalResourceType;
    protected String productNumber;
    protected String productOffering;
    protected List<String> resource;
    protected List<String> physicalResource;
    protected List<String> customerFacingService;
    protected List<ProductPromotion> productPromotion;
    protected List<ProductSpecification> productSpecification;
    protected List<ProductInvolvementRole> productInvolvementRole;
    protected List<ProductPrice> productPrice;
    protected List<BusinessInteractionItem> businessInteractionItem;
    protected List<ProductTerm> productTerm;
    protected List<ProductCharacteristicValue> productCharacteristicValueForProduct;
    protected List<ProductUsage> productUsageForProduct;

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
     * Gets the value of the productStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductStatus() {
        return productStatus;
    }

    /**
     * Sets the value of the productStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductStatus(String value) {
        this.productStatus = value;
    }

    /**
     * Gets the value of the productSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSerialNumber() {
        return productSerialNumber;
    }

    /**
     * Sets the value of the productSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSerialNumber(String value) {
        this.productSerialNumber = value;
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
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategory(String value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the physicalResourceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalResourceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalResourceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPhysicalResourceType() {
        if (physicalResourceType == null) {
            physicalResourceType = new ArrayList<String>();
        }
        return this.physicalResourceType;
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
     * Gets the value of the productOffering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductOffering() {
        return productOffering;
    }

    /**
     * Sets the value of the productOffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductOffering(String value) {
        this.productOffering = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResource() {
        if (resource == null) {
            resource = new ArrayList<String>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the physicalResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPhysicalResource() {
        if (physicalResource == null) {
            physicalResource = new ArrayList<String>();
        }
        return this.physicalResource;
    }

    /**
     * Gets the value of the customerFacingService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerFacingService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerFacingService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomerFacingService() {
        if (customerFacingService == null) {
            customerFacingService = new ArrayList<String>();
        }
        return this.customerFacingService;
    }

    /**
     * Gets the value of the productPromotion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPromotion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPromotion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPromotion }
     * 
     * 
     */
    public List<ProductPromotion> getProductPromotion() {
        if (productPromotion == null) {
            productPromotion = new ArrayList<ProductPromotion>();
        }
        return this.productPromotion;
    }

    /**
     * Gets the value of the productSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSpecification }
     * 
     * 
     */
    public List<ProductSpecification> getProductSpecification() {
        if (productSpecification == null) {
            productSpecification = new ArrayList<ProductSpecification>();
        }
        return this.productSpecification;
    }

    /**
     * Gets the value of the productInvolvementRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInvolvementRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInvolvementRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductInvolvementRole }
     * 
     * 
     */
    public List<ProductInvolvementRole> getProductInvolvementRole() {
        if (productInvolvementRole == null) {
            productInvolvementRole = new ArrayList<ProductInvolvementRole>();
        }
        return this.productInvolvementRole;
    }

    /**
     * Gets the value of the productPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPrice }
     * 
     * 
     */
    public List<ProductPrice> getProductPrice() {
        if (productPrice == null) {
            productPrice = new ArrayList<ProductPrice>();
        }
        return this.productPrice;
    }

    /**
     * Gets the value of the businessInteractionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessInteractionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessInteractionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessInteractionItem }
     * 
     * 
     */
    public List<BusinessInteractionItem> getBusinessInteractionItem() {
        if (businessInteractionItem == null) {
            businessInteractionItem = new ArrayList<BusinessInteractionItem>();
        }
        return this.businessInteractionItem;
    }

    /**
     * Gets the value of the productTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductTerm }
     * 
     * 
     */
    public List<ProductTerm> getProductTerm() {
        if (productTerm == null) {
            productTerm = new ArrayList<ProductTerm>();
        }
        return this.productTerm;
    }

    /**
     * Gets the value of the productCharacteristicValueForProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCharacteristicValueForProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCharacteristicValueForProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCharacteristicValue }
     * 
     * 
     */
    public List<ProductCharacteristicValue> getProductCharacteristicValueForProduct() {
        if (productCharacteristicValueForProduct == null) {
            productCharacteristicValueForProduct = new ArrayList<ProductCharacteristicValue>();
        }
        return this.productCharacteristicValueForProduct;
    }

    /**
     * Gets the value of the productUsageForProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productUsageForProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductUsageForProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductUsage }
     * 
     * 
     */
    public List<ProductUsage> getProductUsageForProduct() {
        if (productUsageForProduct == null) {
            productUsageForProduct = new ArrayList<ProductUsage>();
        }
        return this.productUsageForProduct;
    }

}
