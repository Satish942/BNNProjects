
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for manageServiceLimiterNotificationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manageServiceLimiterNotificationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/message/v4}OperationNotification">
 *       &lt;sequence>
 *         &lt;element name="ServiceLimit" type="{http://www.nbnco.com.au/cim/manageServiceLimiter/v4}ServiceLimit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manageServiceLimiterNotificationRequest", propOrder = {
    "serviceLimit"
})
public class ManageServiceLimiterNotificationRequest
    extends OperationNotification
{

    @XmlElement(name = "ServiceLimit")
    protected List<ServiceLimit> serviceLimit;

    /**
     * Gets the value of the serviceLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLimit }
     * 
     * 
     */
    public List<ServiceLimit> getServiceLimit() {
        if (serviceLimit == null) {
            serviceLimit = new ArrayList<ServiceLimit>();
        }
        return this.serviceLimit;
    }

}
