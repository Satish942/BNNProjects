
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An amount, usually of money, that is asked for when a
 *                 ProductOffering is bought, rented, or leased.
 *             
 * 
 * <p>Java class for ProdOfferPriceCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdOfferPriceCharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ComponentProdOfferPrice">
 *       &lt;sequence>
 *         &lt;element name="tariffUsageProdOfferPriceCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="simpleUsageProdOfferPriceCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alternateProdOfferPriceCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringChargePeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oneTimeChargeProdOfferPriceCharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feeProdOfferingPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdOfferPriceCharge", propOrder = {
    "tariffUsageProdOfferPriceCharge",
    "simpleUsageProdOfferPriceCharge",
    "alternateProdOfferPriceCharge",
    "recurringChargePeriod",
    "oneTimeChargeProdOfferPriceCharge",
    "feeProdOfferingPrice"
})
public class ProdOfferPriceCharge
    extends ComponentProdOfferPrice
{

    protected String tariffUsageProdOfferPriceCharge;
    protected String simpleUsageProdOfferPriceCharge;
    protected String alternateProdOfferPriceCharge;
    protected String recurringChargePeriod;
    protected String oneTimeChargeProdOfferPriceCharge;
    protected String feeProdOfferingPrice;

    /**
     * Gets the value of the tariffUsageProdOfferPriceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffUsageProdOfferPriceCharge() {
        return tariffUsageProdOfferPriceCharge;
    }

    /**
     * Sets the value of the tariffUsageProdOfferPriceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffUsageProdOfferPriceCharge(String value) {
        this.tariffUsageProdOfferPriceCharge = value;
    }

    /**
     * Gets the value of the simpleUsageProdOfferPriceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleUsageProdOfferPriceCharge() {
        return simpleUsageProdOfferPriceCharge;
    }

    /**
     * Sets the value of the simpleUsageProdOfferPriceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleUsageProdOfferPriceCharge(String value) {
        this.simpleUsageProdOfferPriceCharge = value;
    }

    /**
     * Gets the value of the alternateProdOfferPriceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateProdOfferPriceCharge() {
        return alternateProdOfferPriceCharge;
    }

    /**
     * Sets the value of the alternateProdOfferPriceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateProdOfferPriceCharge(String value) {
        this.alternateProdOfferPriceCharge = value;
    }

    /**
     * Gets the value of the recurringChargePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringChargePeriod() {
        return recurringChargePeriod;
    }

    /**
     * Sets the value of the recurringChargePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringChargePeriod(String value) {
        this.recurringChargePeriod = value;
    }

    /**
     * Gets the value of the oneTimeChargeProdOfferPriceCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneTimeChargeProdOfferPriceCharge() {
        return oneTimeChargeProdOfferPriceCharge;
    }

    /**
     * Sets the value of the oneTimeChargeProdOfferPriceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneTimeChargeProdOfferPriceCharge(String value) {
        this.oneTimeChargeProdOfferPriceCharge = value;
    }

    /**
     * Gets the value of the feeProdOfferingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeProdOfferingPrice() {
        return feeProdOfferingPrice;
    }

    /**
     * Sets the value of the feeProdOfferingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeProdOfferingPrice(String value) {
        this.feeProdOfferingPrice = value;
    }

}
