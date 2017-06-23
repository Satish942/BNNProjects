
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A condition under which a ProductOffering is made available to
 *                 Customers. ProductOfferingTerm include ProductOfferingFinancialTerm, which includes such things as
 *                 acceptable methods of payment, ShipmentTerm, and ServiceTerm.
 *             
 * 
 * <p>Java class for ProductOfferingTerm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOfferingTerm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productOfferingFinancialTerm" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductOfferingFinancialTerm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="agreement" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Agreement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOfferingTerm", propOrder = {
    "id",
    "productOfferingFinancialTerm",
    "agreement"
})
public class ProductOfferingTerm {

    protected String id;
    protected List<ProductOfferingFinancialTerm> productOfferingFinancialTerm;
    protected List<Agreement> agreement;

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

    /**
     * Gets the value of the productOfferingFinancialTerm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOfferingFinancialTerm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOfferingFinancialTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOfferingFinancialTerm }
     * 
     * 
     */
    public List<ProductOfferingFinancialTerm> getProductOfferingFinancialTerm() {
        if (productOfferingFinancialTerm == null) {
            productOfferingFinancialTerm = new ArrayList<ProductOfferingFinancialTerm>();
        }
        return this.productOfferingFinancialTerm;
    }

    /**
     * Gets the value of the agreement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Agreement }
     * 
     * 
     */
    public List<Agreement> getAgreement() {
        if (agreement == null) {
            agreement = new ArrayList<Agreement>();
        }
        return this.agreement;
    }

}
