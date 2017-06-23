
package au.com.singtel.group.cdm.v2_0_0.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A detailed product component usage event.
 *             
 * 
 * <p>Java class for ProductComponentUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductComponentUsage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductUsage">
 *       &lt;sequence>
 *         &lt;element name="productComponentUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductComponentUsage", propOrder = {
    "productComponentUsage"
})
public class ProductComponentUsage
    extends ProductUsage
{

    protected String productComponentUsage;

    /**
     * Gets the value of the productComponentUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductComponentUsage() {
        return productComponentUsage;
    }

    /**
     * Sets the value of the productComponentUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductComponentUsage(String value) {
        this.productComponentUsage = value;
    }

}
