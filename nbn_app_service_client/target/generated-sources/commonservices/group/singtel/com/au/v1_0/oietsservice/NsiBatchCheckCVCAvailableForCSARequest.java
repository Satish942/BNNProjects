
package commonservices.group.singtel.com.au.v1_0.oietsservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.BaseDto;
import au.com.singtel.group.cdm.v2_0_0.service.ServiceOrder;


/**
 * <p>Java class for nsiBatchCheckCVCAvailableForCSARequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nsiBatchCheckCVCAvailableForCSARequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="serviceOrder" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceOrder" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nsiBatchCheckCVCAvailableForCSARequest", propOrder = {
    "serviceOrder"
})
public class NsiBatchCheckCVCAvailableForCSARequest
    extends BaseDto
{

    @XmlElement(required = true)
    protected List<ServiceOrder> serviceOrder;

    /**
     * Gets the value of the serviceOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceOrder }
     * 
     * 
     */
    public List<ServiceOrder> getServiceOrder() {
        if (serviceOrder == null) {
            serviceOrder = new ArrayList<ServiceOrder>();
        }
        return this.serviceOrder;
    }

}
