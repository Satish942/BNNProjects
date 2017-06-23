
package au.com.singtel.group.cdm.v2_0_0.product;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductBundle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductBundle">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}Product">
 *       &lt;sequence>
 *         &lt;element name="productBundleComprisedOf" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}Product" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductBundle", propOrder = {
    "productBundleComprisedOf"
})
public class ProductBundle
    extends Product
{

    protected List<Product> productBundleComprisedOf;

    /**
     * Gets the value of the productBundleComprisedOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productBundleComprisedOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductBundleComprisedOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getProductBundleComprisedOf() {
        if (productBundleComprisedOf == null) {
            productBundleComprisedOf = new ArrayList<Product>();
        }
        return this.productBundleComprisedOf;
    }

}
