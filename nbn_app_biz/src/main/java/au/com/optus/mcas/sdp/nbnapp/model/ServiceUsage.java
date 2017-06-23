
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * An occurrence of employing a Service for its intended purpose.
 *             
 * 
 * <p>Java class for ServiceUsage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceUsage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Usage">
 *       &lt;sequence>
 *         &lt;element name="serviceUsage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceUsage", propOrder = {
    "serviceUsage"
})
public class ServiceUsage
    extends Usage
{

    protected String serviceUsage;

    /**
     * Gets the value of the serviceUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUsage() {
        return serviceUsage;
    }

    /**
     * Sets the value of the serviceUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUsage(String value) {
        this.serviceUsage = value;
    }

}
