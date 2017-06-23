
package au.com.singtel.group.cdm.v2_0_0.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Payment Disputes
 *             
 * 
 * <p>Java class for AppliedCustomerBillingCredit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppliedCustomerBillingCredit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}AtomicAppliedCustomerBillingRate">
 *       &lt;sequence>
 *         &lt;element name="appliedCustomerBillingProductAlteration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appliedCustomerBillingDiscount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="prodPriceAlteration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedCustomerBillingCredit", propOrder = {
    "appliedCustomerBillingProductAlteration",
    "appliedCustomerBillingDiscount",
    "prodPriceAlteration"
})
public abstract class AppliedCustomerBillingCredit
    extends AtomicAppliedCustomerBillingRate
{

    protected String appliedCustomerBillingProductAlteration;
    protected Float appliedCustomerBillingDiscount;
    protected String prodPriceAlteration;

    /**
     * Gets the value of the appliedCustomerBillingProductAlteration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppliedCustomerBillingProductAlteration() {
        return appliedCustomerBillingProductAlteration;
    }

    /**
     * Sets the value of the appliedCustomerBillingProductAlteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppliedCustomerBillingProductAlteration(String value) {
        this.appliedCustomerBillingProductAlteration = value;
    }

    /**
     * Gets the value of the appliedCustomerBillingDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAppliedCustomerBillingDiscount() {
        return appliedCustomerBillingDiscount;
    }

    /**
     * Sets the value of the appliedCustomerBillingDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAppliedCustomerBillingDiscount(Float value) {
        this.appliedCustomerBillingDiscount = value;
    }

    /**
     * Gets the value of the prodPriceAlteration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPriceAlteration() {
        return prodPriceAlteration;
    }

    /**
     * Sets the value of the prodPriceAlteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPriceAlteration(String value) {
        this.prodPriceAlteration = value;
    }

}
