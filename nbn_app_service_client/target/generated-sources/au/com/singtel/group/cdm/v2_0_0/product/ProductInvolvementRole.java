
package au.com.singtel.group.cdm.v2_0_0.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A role a business entity (such as PartyRole, ResourceRole or
 *                 CustomerAccount) plays in the relationship for a Product. For example: user, owner, payer and so forth.
 *             
 * 
 * <p>Java class for ProductInvolvementRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInvolvementRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productInvolvementRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInvolvementRole", propOrder = {
    "productInvolvementRole",
    "id"
})
@XmlSeeAlso({
    CustomerAccountProductInvolvement.class
})
public abstract class ProductInvolvementRole {

    protected String productInvolvementRole;
    protected String id;

    /**
     * Gets the value of the productInvolvementRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductInvolvementRole() {
        return productInvolvementRole;
    }

    /**
     * Sets the value of the productInvolvementRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductInvolvementRole(String value) {
        this.productInvolvementRole = value;
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

}
