
package au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.BaseDto;


/**
 * <p>Java class for getServiceConsentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getServiceConsentsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceProfileService}GetServiceConsentsWrapper" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getServiceConsentsResponse", propOrder = {
    "response"
})
public class GetServiceConsentsResponse
    extends BaseDto
{

    protected GetServiceConsentsWrapper response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link GetServiceConsentsWrapper }
     *     
     */
    public GetServiceConsentsWrapper getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetServiceConsentsWrapper }
     *     
     */
    public void setResponse(GetServiceConsentsWrapper value) {
        this.response = value;
    }

}
