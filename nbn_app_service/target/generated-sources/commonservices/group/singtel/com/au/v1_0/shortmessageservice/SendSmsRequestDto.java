
package commonservices.group.singtel.com.au.v1_0.shortmessageservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.BaseDto;
import au.com.singtel.group.cdm.v2_0_0.service.ServiceOrder;


/**
 * DTO used to represent an SMS.
 * 
 * <p>Java class for sendSmsRequestDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendSmsRequestDto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="serviceOrder" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceOrder"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSmsRequestDto", propOrder = {
    "serviceOrder"
})
public class SendSmsRequestDto
    extends BaseDto
{

    @XmlElement(required = true)
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
