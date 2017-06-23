
package au.com.singtel.group.cdm.v2_0_0.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAccountProductInvolvement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAccountProductInvolvement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductInvolvementRole">
 *       &lt;sequence>
 *         &lt;element name="customerAccountProductInvolvement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountProductInvolvement", propOrder = {
    "customerAccountProductInvolvement"
})
public class CustomerAccountProductInvolvement
    extends ProductInvolvementRole
{

    protected String customerAccountProductInvolvement;

    /**
     * Gets the value of the customerAccountProductInvolvement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountProductInvolvement() {
        return customerAccountProductInvolvement;
    }

    /**
     * Sets the value of the customerAccountProductInvolvement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountProductInvolvement(String value) {
        this.customerAccountProductInvolvement = value;
    }

}
