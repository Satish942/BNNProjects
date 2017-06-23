
package au.com.singtel.group.cdm.v2_0_0.product;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A ProductComponent is an instantiation of
 *                 SimpleProductOffering which keeps the business terms under which the customer purchased the product
 *                 (using a SimpleProductOffering).
 *             
 * 
 * <p>Java class for ProductComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}Product">
 *       &lt;sequence>
 *         &lt;element name="productComponentUsage" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductComponentUsage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductComponent", propOrder = {
    "productComponentUsage"
})
public class ProductComponent
    extends Product
{

    protected List<ProductComponentUsage> productComponentUsage;

    /**
     * Gets the value of the productComponentUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productComponentUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductComponentUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductComponentUsage }
     * 
     * 
     */
    public List<ProductComponentUsage> getProductComponentUsage() {
        if (productComponentUsage == null) {
            productComponentUsage = new ArrayList<ProductComponentUsage>();
        }
        return this.productComponentUsage;
    }

}
