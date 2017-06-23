
package au.com.singtel.group.cdm.v2_0_0.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.MarketSegment;
import au.com.singtel.group.cdm.v2_0_0.common.PartyRole;


/**
 * <p>Java class for Customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Customer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PartyRole">
 *       &lt;sequence>
 *         &lt;element name="customerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isListingRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="privacyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerExternalIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditCardsOwnedByCustomer" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CreditCardPM" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerQuote" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerQuote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="loyaltyAccount" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}LoyaltyAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customerCreditProfile" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerCreditProfile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="marketSegment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}MarketSegment" minOccurs="0"/>
 *         &lt;element name="customerAccount" type="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}CustomerAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "customerStatus",
    "customerRank",
    "customerType",
    "salesClass",
    "isListingRequired",
    "privacyType",
    "customerUID",
    "customerExternalIdentifier",
    "creditCardsOwnedByCustomer",
    "customerQuote",
    "loyaltyAccount",
    "customerCreditProfile",
    "marketSegment",
    "customerAccount"
})
public class Customer
    extends PartyRole
{

    protected String customerStatus;
    protected String customerRank;
    protected String customerType;
    protected String salesClass;
    protected Boolean isListingRequired;
    protected String privacyType;
    protected String customerUID;
    protected String customerExternalIdentifier;
    protected List<CreditCardPM> creditCardsOwnedByCustomer;
    protected List<CustomerQuote> customerQuote;
    protected List<LoyaltyAccount> loyaltyAccount;
    protected List<CustomerCreditProfile> customerCreditProfile;
    protected MarketSegment marketSegment;
    protected List<CustomerAccount> customerAccount;

    /**
     * Gets the value of the customerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerStatus() {
        return customerStatus;
    }

    /**
     * Sets the value of the customerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerStatus(String value) {
        this.customerStatus = value;
    }

    /**
     * Gets the value of the customerRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerRank() {
        return customerRank;
    }

    /**
     * Sets the value of the customerRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerRank(String value) {
        this.customerRank = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the salesClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesClass() {
        return salesClass;
    }

    /**
     * Sets the value of the salesClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesClass(String value) {
        this.salesClass = value;
    }

    /**
     * Gets the value of the isListingRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsListingRequired() {
        return isListingRequired;
    }

    /**
     * Sets the value of the isListingRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsListingRequired(Boolean value) {
        this.isListingRequired = value;
    }

    /**
     * Gets the value of the privacyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyType() {
        return privacyType;
    }

    /**
     * Sets the value of the privacyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyType(String value) {
        this.privacyType = value;
    }

    /**
     * Gets the value of the customerUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUID() {
        return customerUID;
    }

    /**
     * Sets the value of the customerUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUID(String value) {
        this.customerUID = value;
    }

    /**
     * Gets the value of the customerExternalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerExternalIdentifier() {
        return customerExternalIdentifier;
    }

    /**
     * Sets the value of the customerExternalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerExternalIdentifier(String value) {
        this.customerExternalIdentifier = value;
    }

    /**
     * Gets the value of the creditCardsOwnedByCustomer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardsOwnedByCustomer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCardsOwnedByCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardPM }
     * 
     * 
     */
    public List<CreditCardPM> getCreditCardsOwnedByCustomer() {
        if (creditCardsOwnedByCustomer == null) {
            creditCardsOwnedByCustomer = new ArrayList<CreditCardPM>();
        }
        return this.creditCardsOwnedByCustomer;
    }

    /**
     * Gets the value of the customerQuote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerQuote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerQuote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerQuote }
     * 
     * 
     */
    public List<CustomerQuote> getCustomerQuote() {
        if (customerQuote == null) {
            customerQuote = new ArrayList<CustomerQuote>();
        }
        return this.customerQuote;
    }

    /**
     * Gets the value of the loyaltyAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyAccount }
     * 
     * 
     */
    public List<LoyaltyAccount> getLoyaltyAccount() {
        if (loyaltyAccount == null) {
            loyaltyAccount = new ArrayList<LoyaltyAccount>();
        }
        return this.loyaltyAccount;
    }

    /**
     * Gets the value of the customerCreditProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerCreditProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerCreditProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerCreditProfile }
     * 
     * 
     */
    public List<CustomerCreditProfile> getCustomerCreditProfile() {
        if (customerCreditProfile == null) {
            customerCreditProfile = new ArrayList<CustomerCreditProfile>();
        }
        return this.customerCreditProfile;
    }

    /**
     * Gets the value of the marketSegment property.
     * 
     * @return
     *     possible object is
     *     {@link MarketSegment }
     *     
     */
    public MarketSegment getMarketSegment() {
        return marketSegment;
    }

    /**
     * Sets the value of the marketSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketSegment }
     *     
     */
    public void setMarketSegment(MarketSegment value) {
        this.marketSegment = value;
    }

    /**
     * Gets the value of the customerAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAccount }
     * 
     * 
     */
    public List<CustomerAccount> getCustomerAccount() {
        if (customerAccount == null) {
            customerAccount = new ArrayList<CustomerAccount>();
        }
        return this.customerAccount;
    }

}
