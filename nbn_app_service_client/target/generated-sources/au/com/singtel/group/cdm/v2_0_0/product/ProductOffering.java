
package au.com.singtel.group.cdm.v2_0_0.product;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.MarketSegment;
import au.com.singtel.group.cdm.v2_0_0.common.PartyRole;
import au.com.singtel.group.cdm.v2_0_0.common.TimePeriod;


/**
 * The presentation of one or more ProductSpecifications to the
 *                 marketplace for sale, rental, or lease for a ProductOfferingPrice. A ProductOffering may target one or
 *                 more MarketSegments, be included in one or more ProductCatalog, presented in support of one or more
 *                 ProductStrategies, and made available in one or more Places. ProductOffering may represent a simple
 *                 offering of a single ProductSpecification or could represent a bundling of one or more other
 *                 ProductOffering.
 *             
 * 
 * <p>Java class for ProductOffering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOffering">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premiumOfferingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policySet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productForProductOffering" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}Product" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="distributionChannel" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}DistributionChannel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="marketSegment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}MarketSegment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productOfferingTerm" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductOfferingTerm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productOfferingPrice" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductOfferingPrice" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productSpecification" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductSpecification" minOccurs="0"/>
 *         &lt;element name="partyRole" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PartyRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOffering", propOrder = {
    "id",
    "name",
    "description",
    "validFor",
    "status",
    "type",
    "premiumOfferingFlag",
    "policySet",
    "productForProductOffering",
    "distributionChannel",
    "marketSegment",
    "productOfferingTerm",
    "productOfferingPrice",
    "productSpecification",
    "partyRole"
})
@XmlSeeAlso({
    BundledProductOffering.class,
    SimpleProductOffering.class
})
public abstract class ProductOffering {

    protected String id;
    protected String name;
    protected String description;
    protected TimePeriod validFor;
    protected String status;
    protected String type;
    protected String premiumOfferingFlag;
    protected String policySet;
    protected List<Product> productForProductOffering;
    protected List<DistributionChannel> distributionChannel;
    protected List<MarketSegment> marketSegment;
    protected List<ProductOfferingTerm> productOfferingTerm;
    protected List<ProductOfferingPrice> productOfferingPrice;
    protected ProductSpecification productSpecification;
    protected List<PartyRole> partyRole;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the premiumOfferingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumOfferingFlag() {
        return premiumOfferingFlag;
    }

    /**
     * Sets the value of the premiumOfferingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumOfferingFlag(String value) {
        this.premiumOfferingFlag = value;
    }

    /**
     * Gets the value of the policySet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicySet() {
        return policySet;
    }

    /**
     * Sets the value of the policySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicySet(String value) {
        this.policySet = value;
    }

    /**
     * Gets the value of the productForProductOffering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productForProductOffering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductForProductOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getProductForProductOffering() {
        if (productForProductOffering == null) {
            productForProductOffering = new ArrayList<Product>();
        }
        return this.productForProductOffering;
    }

    /**
     * Gets the value of the distributionChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DistributionChannel }
     * 
     * 
     */
    public List<DistributionChannel> getDistributionChannel() {
        if (distributionChannel == null) {
            distributionChannel = new ArrayList<DistributionChannel>();
        }
        return this.distributionChannel;
    }

    /**
     * Gets the value of the marketSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSegment }
     * 
     * 
     */
    public List<MarketSegment> getMarketSegment() {
        if (marketSegment == null) {
            marketSegment = new ArrayList<MarketSegment>();
        }
        return this.marketSegment;
    }

    /**
     * Gets the value of the productOfferingTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOfferingTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOfferingTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOfferingTerm }
     * 
     * 
     */
    public List<ProductOfferingTerm> getProductOfferingTerm() {
        if (productOfferingTerm == null) {
            productOfferingTerm = new ArrayList<ProductOfferingTerm>();
        }
        return this.productOfferingTerm;
    }

    /**
     * Gets the value of the productOfferingPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOfferingPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOfferingPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOfferingPrice }
     * 
     * 
     */
    public List<ProductOfferingPrice> getProductOfferingPrice() {
        if (productOfferingPrice == null) {
            productOfferingPrice = new ArrayList<ProductOfferingPrice>();
        }
        return this.productOfferingPrice;
    }

    /**
     * Gets the value of the productSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSpecification }
     *     
     */
    public ProductSpecification getProductSpecification() {
        return productSpecification;
    }

    /**
     * Sets the value of the productSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSpecification }
     *     
     */
    public void setProductSpecification(ProductSpecification value) {
        this.productSpecification = value;
    }

    /**
     * Gets the value of the partyRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyRole }
     * 
     * 
     */
    public List<PartyRole> getPartyRole() {
        if (partyRole == null) {
            partyRole = new ArrayList<PartyRole>();
        }
        return this.partyRole;
    }

}
