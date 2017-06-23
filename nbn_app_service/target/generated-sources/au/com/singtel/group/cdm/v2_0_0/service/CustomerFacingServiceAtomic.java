
package au.com.singtel.group.cdm.v2_0_0.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerFacingServiceAtomic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFacingServiceAtomic">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/service}CustomerFacingService">
 *       &lt;sequence>
 *         &lt;element name="customerFacingServiceAtomic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFacingServiceAtomic", propOrder = {
    "customerFacingServiceAtomic"
})
public class CustomerFacingServiceAtomic
    extends CustomerFacingService
{

    protected String customerFacingServiceAtomic;

    /**
     * Gets the value of the customerFacingServiceAtomic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFacingServiceAtomic() {
        return customerFacingServiceAtomic;
    }

    /**
     * Sets the value of the customerFacingServiceAtomic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFacingServiceAtomic(String value) {
        this.customerFacingServiceAtomic = value;
    }

}
