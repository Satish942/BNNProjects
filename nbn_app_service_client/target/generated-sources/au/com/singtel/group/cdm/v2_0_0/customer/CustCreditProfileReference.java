
package au.com.singtel.group.cdm.v2_0_0.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustCreditProfileReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustCreditProfileReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="financialInstitutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financialInstitutionAccoutNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financialInstitutionAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustCreditProfileReference", propOrder = {
    "financialInstitutionName",
    "financialInstitutionAccoutNumber",
    "financialInstitutionAccountType",
    "id"
})
public class CustCreditProfileReference {

    protected String financialInstitutionName;
    protected String financialInstitutionAccoutNumber;
    protected String financialInstitutionAccountType;
    protected String id;

    /**
     * Gets the value of the financialInstitutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialInstitutionName() {
        return financialInstitutionName;
    }

    /**
     * Sets the value of the financialInstitutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialInstitutionName(String value) {
        this.financialInstitutionName = value;
    }

    /**
     * Gets the value of the financialInstitutionAccoutNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialInstitutionAccoutNumber() {
        return financialInstitutionAccoutNumber;
    }

    /**
     * Sets the value of the financialInstitutionAccoutNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialInstitutionAccoutNumber(String value) {
        this.financialInstitutionAccoutNumber = value;
    }

    /**
     * Gets the value of the financialInstitutionAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialInstitutionAccountType() {
        return financialInstitutionAccountType;
    }

    /**
     * Sets the value of the financialInstitutionAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialInstitutionAccountType(String value) {
        this.financialInstitutionAccountType = value;
    }

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

}
