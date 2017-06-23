
package au.com.singtel.group.cdm.v2_0_0.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.Money;
import au.com.singtel.group.cdm.v2_0_0.common.Quantity;


/**
 * Part of a ProductOfferingPrice representing a single element
 *                 of the price. Subclasses further define these elements.
 *             
 * 
 * <p>Java class for ComponentProdOfferPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentProdOfferPrice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductOfferingPrice">
 *       &lt;sequence>
 *         &lt;element name="priceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitOfMeasure" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Quantity" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentProdOfferPrice", propOrder = {
    "priceType",
    "unitOfMeasure",
    "price"
})
@XmlSeeAlso({
    ProdOfferPriceCharge.class,
    ProdOfferPriceAlteration.class
})
public abstract class ComponentProdOfferPrice
    extends ProductOfferingPrice
{

    protected String priceType;
    protected Quantity unitOfMeasure;
    protected Money price;

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setUnitOfMeasure(Quantity value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPrice(Money value) {
        this.price = value;
    }

}
