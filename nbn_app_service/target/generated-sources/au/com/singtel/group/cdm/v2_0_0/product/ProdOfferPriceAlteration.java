
package au.com.singtel.group.cdm.v2_0_0.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An amount, usually of money, that modifies a price charged for
 *                 a ProductOffering.
 *             
 * 
 * <p>Java class for ProdOfferPriceAlteration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdOfferPriceAlteration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ComponentProdOfferPrice">
 *       &lt;sequence>
 *         &lt;element name="prodOfferPriceAlteration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowanceProdOfferPriceAlteration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountProdOfferPriceAlteration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdOfferPriceAlteration", propOrder = {
    "prodOfferPriceAlteration",
    "allowanceProdOfferPriceAlteration",
    "discountProdOfferPriceAlteration"
})
public class ProdOfferPriceAlteration
    extends ComponentProdOfferPrice
{

    protected String prodOfferPriceAlteration;
    protected String allowanceProdOfferPriceAlteration;
    protected String discountProdOfferPriceAlteration;

    /**
     * Gets the value of the prodOfferPriceAlteration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdOfferPriceAlteration() {
        return prodOfferPriceAlteration;
    }

    /**
     * Sets the value of the prodOfferPriceAlteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdOfferPriceAlteration(String value) {
        this.prodOfferPriceAlteration = value;
    }

    /**
     * Gets the value of the allowanceProdOfferPriceAlteration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowanceProdOfferPriceAlteration() {
        return allowanceProdOfferPriceAlteration;
    }

    /**
     * Sets the value of the allowanceProdOfferPriceAlteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowanceProdOfferPriceAlteration(String value) {
        this.allowanceProdOfferPriceAlteration = value;
    }

    /**
     * Gets the value of the discountProdOfferPriceAlteration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountProdOfferPriceAlteration() {
        return discountProdOfferPriceAlteration;
    }

    /**
     * Sets the value of the discountProdOfferPriceAlteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountProdOfferPriceAlteration(String value) {
        this.discountProdOfferPriceAlteration = value;
    }

}
