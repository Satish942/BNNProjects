
package au.com.optus.mcas.sdp.nbnenabler.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v4_0_0.cdm.BaseDto;
import au.com.singtel.group.cdm.v4_0_0.cdm.ServiceOrder;


/**
 * <p>Java class for createServiceOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createServiceOrderRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v4_0_0/cdm}BaseDto">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.group.singtel.com.au/cdm/v4_0_0/cdm}serviceOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createServiceOrderRequest", propOrder = {
    "serviceOrder"
})
public class CreateServiceOrderRequestModel
    extends BaseDto
{

    @XmlElement(namespace = "http://www.group.singtel.com.au/cdm/v4_0_0/cdm")
    protected ServiceOrder serviceOrder;

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
