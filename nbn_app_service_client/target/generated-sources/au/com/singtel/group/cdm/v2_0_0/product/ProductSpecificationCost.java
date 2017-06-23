
package au.com.singtel.group.cdm.v2_0_0.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.Money;


/**
 * <p>Java class for ProductSpecificationCost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecificationCost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="costToBusiness" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Money" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Money" minOccurs="0"/>
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
@XmlType(name = "ProductSpecificationCost", propOrder = {
    "costToBusiness",
    "validFor",
    "id"
})
public class ProductSpecificationCost {

    protected Money costToBusiness;
    protected Money validFor;
    protected String id;

    /**
     * Gets the value of the costToBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCostToBusiness() {
        return costToBusiness;
    }

    /**
     * Sets the value of the costToBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCostToBusiness(Money value) {
        this.costToBusiness = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setValidFor(Money value) {
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

}
