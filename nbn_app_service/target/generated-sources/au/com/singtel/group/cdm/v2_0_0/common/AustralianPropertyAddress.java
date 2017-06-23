
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AustralianPropertyAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AustralianPropertyAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}UrbanPropertyAddress">
 *       &lt;sequence>
 *         &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unformattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partialAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pickList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isFullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AustralianPropertyAddress", propOrder = {
    "addressType",
    "addressValue",
    "unformattedAddress",
    "formattedAddress",
    "partialAddress",
    "pickList",
    "isFullAddress",
    "exchangeId",
    "addressFormat"
})
@XmlSeeAlso({
    SingaporePropertyAddress.class
})
public class AustralianPropertyAddress
    extends UrbanPropertyAddress
{

    protected String addressType;
    protected String addressValue;
    protected String unformattedAddress;
    protected String formattedAddress;
    protected String partialAddress;
    protected String pickList;
    protected String isFullAddress;
    protected String exchangeId;
    protected String addressFormat;

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressValue() {
        return addressValue;
    }

    /**
     * Sets the value of the addressValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressValue(String value) {
        this.addressValue = value;
    }

    /**
     * Gets the value of the unformattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnformattedAddress() {
        return unformattedAddress;
    }

    /**
     * Sets the value of the unformattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnformattedAddress(String value) {
        this.unformattedAddress = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormattedAddress(String value) {
        this.formattedAddress = value;
    }

    /**
     * Gets the value of the partialAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialAddress() {
        return partialAddress;
    }

    /**
     * Sets the value of the partialAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialAddress(String value) {
        this.partialAddress = value;
    }

    /**
     * Gets the value of the pickList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickList() {
        return pickList;
    }

    /**
     * Sets the value of the pickList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickList(String value) {
        this.pickList = value;
    }

    /**
     * Gets the value of the isFullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFullAddress() {
        return isFullAddress;
    }

    /**
     * Sets the value of the isFullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFullAddress(String value) {
        this.isFullAddress = value;
    }

    /**
     * Gets the value of the exchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeId() {
        return exchangeId;
    }

    /**
     * Sets the value of the exchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeId(String value) {
        this.exchangeId = value;
    }

    /**
     * Gets the value of the addressFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressFormat() {
        return addressFormat;
    }

    /**
     * Sets the value of the addressFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressFormat(String value) {
        this.addressFormat = value;
    }

}
