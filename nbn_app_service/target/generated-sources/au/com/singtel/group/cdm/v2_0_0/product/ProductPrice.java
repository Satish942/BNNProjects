
package au.com.singtel.group.cdm.v2_0_0.product;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.TimePeriod;


/**
 * An amount, usually of money, that represents the actual price
 *                 paid by a Customer for a purchase, a rent or a lease of a Product. The price is valid for a defined
 *                 period of time.
 *             
 * 
 * <p>Java class for ProductPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productOfferingPrice" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductOfferingPrice" minOccurs="0"/>
 *         &lt;element name="compositeProdPrice" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductPrice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductPrice", propOrder = {
    "name",
    "description",
    "validFor",
    "id",
    "product",
    "productOfferingPrice",
    "compositeProdPrice"
})
@XmlSeeAlso({
    ComponentProdPrice.class
})
public abstract class ProductPrice {

    protected String name;
    protected String description;
    protected TimePeriod validFor;
    protected String id;
    protected List<String> product;
    protected ProductOfferingPrice productOfferingPrice;
    protected List<ProductPrice> compositeProdPrice;

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
     * Gets the value of the productOfferingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOfferingPrice }
     *     
     */
    public ProductOfferingPrice getProductOfferingPrice() {
        return productOfferingPrice;
    }

    /**
     * Sets the value of the productOfferingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOfferingPrice }
     *     
     */
    public void setProductOfferingPrice(ProductOfferingPrice value) {
        this.productOfferingPrice = value;
    }

    /**
     * Gets the value of the compositeProdPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositeProdPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositeProdPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPrice }
     * 
     * 
     */
    public List<ProductPrice> getCompositeProdPrice() {
        if (compositeProdPrice == null) {
            compositeProdPrice = new ArrayList<ProductPrice>();
        }
        return this.compositeProdPrice;
    }

}
