
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A ProductOfferingPrice that is made up of parts. The parts may
 *                 be other CompositeProdOfferPrices or ComponentProdOfferPrices.
 *             
 * 
 * <p>Java class for CompositeProdOfferPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompositeProdOfferPrice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductOfferingPrice">
 *       &lt;sequence>
 *         &lt;element name="compositeProductOfferPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productOfferingPrice" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductOfferingPrice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeProdOfferPrice", propOrder = {
    "compositeProductOfferPrice",
    "productOfferingPrice"
})
public class CompositeProdOfferPrice
    extends ProductOfferingPrice
{

    protected String compositeProductOfferPrice;
    protected List<ProductOfferingPrice> productOfferingPrice;

    /**
     * Gets the value of the compositeProductOfferPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeProductOfferPrice() {
        return compositeProductOfferPrice;
    }

    /**
     * Sets the value of the compositeProductOfferPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeProductOfferPrice(String value) {
        this.compositeProductOfferPrice = value;
    }

    /**
     * Gets the value of the productOfferingPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productOfferingPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductOfferingPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductOfferingPrice }
     * 
     * 
     */
    public List<ProductOfferingPrice> getProductOfferingPrice() {
        if (productOfferingPrice == null) {
            productOfferingPrice = new ArrayList<ProductOfferingPrice>();
        }
        return this.productOfferingPrice;
    }

}
