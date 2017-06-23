
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PartyDemographic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyDemographic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyDemographicSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="partyDemographicValue" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PartyDemographicValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="marketSegment" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}MarketSegment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyDemographic", propOrder = {
    "id",
    "description",
    "partyDemographicSource",
    "dateCreated",
    "validFor",
    "partyDemographicValue",
    "marketSegment"
})
@XmlSeeAlso({
    AtomicPartyDemographic.class
})
public class PartyDemographic {

    protected String id;
    protected String description;
    protected String partyDemographicSource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    protected TimePeriod validFor;
    protected List<PartyDemographicValue> partyDemographicValue;
    protected List<MarketSegment> marketSegment;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the partyDemographicSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyDemographicSource() {
        return partyDemographicSource;
    }

    /**
     * Sets the value of the partyDemographicSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyDemographicSource(String value) {
        this.partyDemographicSource = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setValidFor(TimePeriod value) {
        this.validFor = value;
    }

    /**
     * Gets the value of the partyDemographicValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyDemographicValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyDemographicValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyDemographicValue }
     * 
     * 
     */
    public List<PartyDemographicValue> getPartyDemographicValue() {
        if (partyDemographicValue == null) {
            partyDemographicValue = new ArrayList<PartyDemographicValue>();
        }
        return this.partyDemographicValue;
    }

    /**
     * Gets the value of the marketSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketSegment }
     * 
     * 
     */
    public List<MarketSegment> getMarketSegment() {
        if (marketSegment == null) {
            marketSegment = new ArrayList<MarketSegment>();
        }
        return this.marketSegment;
    }

}
