
package au.com.nbnco.cim.manageservicelimiter.v4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.com.nbnco.cim.common.rootbusinessentity.v3.Entity;
import au.com.nbnco.cim.common.rootbusinessentity.v3.Quantity;


/**
 * Represents a service limit.
 * 
 * <p>Java class for ServiceLimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLimit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}Entity">
 *       &lt;sequence>
 *         &lt;element name="Usage" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}Quantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLimit", propOrder = {
    "usage"
})
public class ServiceLimit
    extends Entity
{

    @XmlElement(name = "Usage")
    protected Quantity usage;

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setUsage(Quantity value) {
        this.usage = value;
    }

}
