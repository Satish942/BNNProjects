
package au.com.singtel.group.cdm.v2_0_0.product;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An amount, usually of money, that is asked for when a Product
 *                 is bought, rented, or leased.
 *             
 * 
 * <p>Java class for ProdPriceCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdPriceCharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ComponentProdPrice">
 *       &lt;sequence>
 *         &lt;element name="prodPriceCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prodPriceAlteration" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProdPriceAlteration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdPriceCharge", propOrder = {
    "prodPriceCharge",
    "prodPriceAlteration"
})
@XmlSeeAlso({
    RecurringChargeProdPriceCharge.class,
    OneTimeChargeProdPriceCharge.class
})
public class ProdPriceCharge
    extends ComponentProdPrice
{

    protected String prodPriceCharge;
    protected List<ProdPriceAlteration> prodPriceAlteration;

    /**
     * Gets the value of the prodPriceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdPriceCharge() {
        return prodPriceCharge;
    }

    /**
     * Sets the value of the prodPriceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdPriceCharge(String value) {
        this.prodPriceCharge = value;
    }

    /**
     * Gets the value of the prodPriceAlteration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodPriceAlteration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdPriceAlteration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdPriceAlteration }
     * 
     * 
     */
    public List<ProdPriceAlteration> getProdPriceAlteration() {
        if (prodPriceAlteration == null) {
            prodPriceAlteration = new ArrayList<ProdPriceAlteration>();
        }
        return this.prodPriceAlteration;
    }

}
