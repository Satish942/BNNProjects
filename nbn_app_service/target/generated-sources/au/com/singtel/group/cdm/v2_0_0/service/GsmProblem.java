
package au.com.singtel.group.cdm.v2_0_0.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GsmProblem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GsmProblem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gsmSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gsmSiteCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GsmProblem", propOrder = {
    "gsmSector",
    "gsmSiteCode"
})
public class GsmProblem {

    protected String gsmSector;
    protected String gsmSiteCode;

    /**
     * Gets the value of the gsmSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsmSector() {
        return gsmSector;
    }

    /**
     * Sets the value of the gsmSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsmSector(String value) {
        this.gsmSector = value;
    }

    /**
     * Gets the value of the gsmSiteCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsmSiteCode() {
        return gsmSiteCode;
    }

    /**
     * Sets the value of the gsmSiteCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsmSiteCode(String value) {
        this.gsmSiteCode = value;
    }

}
