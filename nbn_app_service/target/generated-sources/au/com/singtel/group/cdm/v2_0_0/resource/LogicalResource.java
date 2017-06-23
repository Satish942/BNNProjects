
package au.com.singtel.group.cdm.v2_0_0.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogicalResource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalResource">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}Resource">
 *       &lt;sequence>
 *         &lt;element name="lrStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serviceState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isOperational" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalResource", propOrder = {
    "lrStatus",
    "serviceState",
    "isOperational"
})
@XmlSeeAlso({
    Protocol.class,
    NetworkAddress.class,
    LogicalDevice.class
})
public abstract class LogicalResource
    extends Resource
{

    protected Integer lrStatus;
    protected Integer serviceState;
    protected Boolean isOperational;

    /**
     * Gets the value of the lrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLrStatus() {
        return lrStatus;
    }

    /**
     * Sets the value of the lrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLrStatus(Integer value) {
        this.lrStatus = value;
    }

    /**
     * Gets the value of the serviceState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceState() {
        return serviceState;
    }

    /**
     * Sets the value of the serviceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceState(Integer value) {
        this.serviceState = value;
    }

    /**
     * Gets the value of the isOperational property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOperational() {
        return isOperational;
    }

    /**
     * Sets the value of the isOperational property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOperational(Boolean value) {
        this.isOperational = value;
    }

}
