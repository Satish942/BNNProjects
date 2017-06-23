
package au.com.nbnco.cim.common.rootbusinessentity.v3;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an abstract base class that is used to represent entities in a managed
 *                 environment that have the following semantics in common: (1) a ManagedBusinessEntity owns or is
 *                 otherwise responsible for them, (2) management of the entity is critical for providing a service and/or
 *                 maintaining the environment, and (3) the entity is "important" from a management point-of-view. As such,
 *                 it is a point at which semantically important relationships can be created; this avoids duplicating
 *                 these relationships on multiple subclasses as well as forcing ManagedObject to support these
 *                 relationships.
 * 
 * <p>Java class for ManagedEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}Entity">
 *       &lt;sequence>
 *         &lt;element name="managementMethodCurrent" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="managementMethodSupported" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedEntity", propOrder = {
    "managementMethodCurrent",
    "managementMethodSupported",
    "status"
})
public abstract class ManagedEntity
    extends Entity
{

    protected BigInteger managementMethodCurrent;
    protected BigInteger managementMethodSupported;
    protected String status;

    /**
     * Gets the value of the managementMethodCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManagementMethodCurrent() {
        return managementMethodCurrent;
    }

    /**
     * Sets the value of the managementMethodCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManagementMethodCurrent(BigInteger value) {
        this.managementMethodCurrent = value;
    }

    /**
     * Gets the value of the managementMethodSupported property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getManagementMethodSupported() {
        return managementMethodSupported;
    }

    /**
     * Sets the value of the managementMethodSupported property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setManagementMethodSupported(BigInteger value) {
        this.managementMethodSupported = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
