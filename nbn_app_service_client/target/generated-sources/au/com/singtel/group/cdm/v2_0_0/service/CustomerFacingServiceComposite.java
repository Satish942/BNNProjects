
package au.com.singtel.group.cdm.v2_0_0.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerFacingServiceComposite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFacingServiceComposite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/service}CustomerFacingService">
 *       &lt;sequence>
 *         &lt;element name="customerFacingServiceComposite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerFacingServices" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}CustomerFacingService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFacingServiceComposite", propOrder = {
    "customerFacingServiceComposite",
    "customerFacingServices"
})
public class CustomerFacingServiceComposite
    extends CustomerFacingService
{

    protected String customerFacingServiceComposite;
    protected List<CustomerFacingService> customerFacingServices;

    /**
     * Gets the value of the customerFacingServiceComposite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFacingServiceComposite() {
        return customerFacingServiceComposite;
    }

    /**
     * Sets the value of the customerFacingServiceComposite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFacingServiceComposite(String value) {
        this.customerFacingServiceComposite = value;
    }

    /**
     * Gets the value of the customerFacingServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerFacingServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerFacingServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerFacingService }
     * 
     * 
     */
    public List<CustomerFacingService> getCustomerFacingServices() {
        if (customerFacingServices == null) {
            customerFacingServices = new ArrayList<CustomerFacingService>();
        }
        return this.customerFacingServices;
    }

}
