
package au.com.singtel.group.cdm.v2_0_0.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppliedCustomerBillingProductUsageRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppliedCustomerBillingProductUsageRate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}AppliedCustomerBillingProductCharge">
 *       &lt;sequence>
 *         &lt;element name="productUsage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedCustomerBillingProductUsageRate", propOrder = {
    "productUsage"
})
public abstract class AppliedCustomerBillingProductUsageRate
    extends AppliedCustomerBillingProductCharge
{

    protected List<String> productUsage;

    /**
     * Gets the value of the productUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductUsage() {
        if (productUsage == null) {
            productUsage = new ArrayList<String>();
        }
        return this.productUsage;
    }

}
