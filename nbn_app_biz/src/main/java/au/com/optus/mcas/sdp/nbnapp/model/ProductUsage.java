
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An occurrence of employing a Product for its intended purpose.
 *             
 * 
 * <p>Java class for ProductUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductUsage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Usage">
 *       &lt;sequence>
 *         &lt;element name="productUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productPrice" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductPrice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductUsage", propOrder = {
    "productUsage",
    "serviceUsage",
    "productPrice"
})
@XmlSeeAlso({
    ProductComponentUsage.class
})
public abstract class ProductUsage
    extends Usage
{

    protected String productUsage;
    protected String serviceUsage;
    protected ProductPrice productPrice;

    /**
     * Gets the value of the productUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductUsage() {
        return productUsage;
    }

    /**
     * Sets the value of the productUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductUsage(String value) {
        this.productUsage = value;
    }

    /**
     * Gets the value of the serviceUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUsage() {
        return serviceUsage;
    }

    /**
     * Sets the value of the serviceUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUsage(String value) {
        this.serviceUsage = value;
    }

    /**
     * Gets the value of the productPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPrice }
     *     
     */
    public ProductPrice getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the value of the productPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPrice }
     *     
     */
    public void setProductPrice(ProductPrice value) {
        this.productPrice = value;
    }

}
