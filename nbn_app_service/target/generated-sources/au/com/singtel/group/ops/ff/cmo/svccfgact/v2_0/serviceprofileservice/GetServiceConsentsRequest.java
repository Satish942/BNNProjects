
package au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.BaseDto;
import au.com.singtel.group.cdm.v2_0_0.common.InteractionParameter;


/**
 * <p>Java class for getServiceConsentsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceConsentsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="customerIdentifier" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}InteractionParameter" minOccurs="0" form="unqualified"/>
 *         &lt;element name="serviceIdentifier" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}InteractionParameter" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceConsentsRequest", propOrder = {
    "customerIdentifier",
    "serviceIdentifier"
})
public class GetServiceConsentsRequest
    extends BaseDto
{

    protected InteractionParameter customerIdentifier;
    protected InteractionParameter serviceIdentifier;

    /**
     * Gets the value of the customerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionParameter }
     *     
     */
    public InteractionParameter getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Sets the value of the customerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionParameter }
     *     
     */
    public void setCustomerIdentifier(InteractionParameter value) {
        this.customerIdentifier = value;
    }

    /**
     * Gets the value of the serviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionParameter }
     *     
     */
    public InteractionParameter getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * Sets the value of the serviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionParameter }
     *     
     */
    public void setServiceIdentifier(InteractionParameter value) {
        this.serviceIdentifier = value;
    }

}
