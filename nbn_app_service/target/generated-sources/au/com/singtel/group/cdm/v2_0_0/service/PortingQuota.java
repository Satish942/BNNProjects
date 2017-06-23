
package au.com.singtel.group.cdm.v2_0_0.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Optus Extension
 *             
 * 
 * <p>Java class for PortingQuota complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortingQuota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remainingQuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalQuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quotaDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portingQuotaInfo" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}PortingQuotaInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortingQuota", propOrder = {
    "id",
    "remainingQuota",
    "totalQuota",
    "quotaDate",
    "portingQuotaInfo"
})
public class PortingQuota {

    protected String id;
    protected String remainingQuota;
    protected String totalQuota;
    @XmlElement(required = true)
    protected String quotaDate;
    protected List<PortingQuotaInfo> portingQuotaInfo;

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
     * Gets the value of the remainingQuota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainingQuota() {
        return remainingQuota;
    }

    /**
     * Sets the value of the remainingQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainingQuota(String value) {
        this.remainingQuota = value;
    }

    /**
     * Gets the value of the totalQuota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalQuota() {
        return totalQuota;
    }

    /**
     * Sets the value of the totalQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalQuota(String value) {
        this.totalQuota = value;
    }

    /**
     * Gets the value of the quotaDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaDate() {
        return quotaDate;
    }

    /**
     * Sets the value of the quotaDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaDate(String value) {
        this.quotaDate = value;
    }

    /**
     * Gets the value of the portingQuotaInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portingQuotaInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortingQuotaInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortingQuotaInfo }
     * 
     * 
     */
    public List<PortingQuotaInfo> getPortingQuotaInfo() {
        if (portingQuotaInfo == null) {
            portingQuotaInfo = new ArrayList<PortingQuotaInfo>();
        }
        return this.portingQuotaInfo;
    }

}
