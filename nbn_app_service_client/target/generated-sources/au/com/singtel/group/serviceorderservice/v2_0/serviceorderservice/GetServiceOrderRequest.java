
package au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.BaseDto;
import au.com.singtel.group.cdm.v2_0_0.service.ServiceOrder;


/**
 * <p>Java class for getServiceOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceOrderRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="serviceOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceOrder" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceOrderRequest", propOrder = {
    "serviceOrderNumber",
    "serviceOrder"
})
public class GetServiceOrderRequest
    extends BaseDto
{

    @XmlElement(required = true)
    protected String serviceOrderNumber;
    protected ServiceOrder serviceOrder;

    /**
     * Gets the value of the serviceOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceOrderNumber() {
        return serviceOrderNumber;
    }

    /**
     * Sets the value of the serviceOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceOrderNumber(String value) {
        this.serviceOrderNumber = value;
    }

    /**
     * Gets the value of the serviceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOrder }
     *     
     */
    public ServiceOrder getServiceOrder() {
        return serviceOrder;
    }

    /**
     * Sets the value of the serviceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOrder }
     *     
     */
    public void setServiceOrder(ServiceOrder value) {
        this.serviceOrder = value;
    }

}
