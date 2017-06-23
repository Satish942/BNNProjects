
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.customer.CustomerOrder;
import au.com.singtel.group.cdm.v2_0_0.resource.ResourceOrder;
import au.com.singtel.group.cdm.v2_0_0.service.ServiceOrder;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteraction">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request")
@XmlSeeAlso({
    WorkOrder.class,
    ServiceOrder.class,
    CustomerOrder.class,
    ResourceOrder.class
})
public abstract class Request
    extends BusinessInteraction
{


}
