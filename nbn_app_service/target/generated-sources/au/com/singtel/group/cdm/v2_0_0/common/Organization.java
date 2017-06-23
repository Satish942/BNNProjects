
package au.com.singtel.group.cdm.v2_0_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Party">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noOfEmployees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yearsOfTrading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organizationName" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}OrganizationName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="organizationIdentification" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}OrganizationIdentification" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
    "type",
    "industryType",
    "noOfEmployees",
    "yearsOfTrading",
    "organizationName",
    "organizationIdentification"
})
public class Organization
    extends Party
{

    protected String type;
    protected String industryType;
    protected String noOfEmployees;
    protected String yearsOfTrading;
    protected List<OrganizationName> organizationName;
    protected List<OrganizationIdentification> organizationIdentification;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the industryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryType() {
        return industryType;
    }

    /**
     * Sets the value of the industryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryType(String value) {
        this.industryType = value;
    }

    /**
     * Gets the value of the noOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfEmployees() {
        return noOfEmployees;
    }

    /**
     * Sets the value of the noOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfEmployees(String value) {
        this.noOfEmployees = value;
    }

    /**
     * Gets the value of the yearsOfTrading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearsOfTrading() {
        return yearsOfTrading;
    }

    /**
     * Sets the value of the yearsOfTrading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearsOfTrading(String value) {
        this.yearsOfTrading = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationName }
     * 
     * 
     */
    public List<OrganizationName> getOrganizationName() {
        if (organizationName == null) {
            organizationName = new ArrayList<OrganizationName>();
        }
        return this.organizationName;
    }

    /**
     * Gets the value of the organizationIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationIdentification }
     * 
     * 
     */
    public List<OrganizationIdentification> getOrganizationIdentification() {
        if (organizationIdentification == null) {
            organizationIdentification = new ArrayList<OrganizationIdentification>();
        }
        return this.organizationIdentification;
    }

}
