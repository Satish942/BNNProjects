
package au.com.singtel.group.cdm.v2_0_0.resource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Protocol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Protocol">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}LogicalResource">
 *       &lt;sequence>
 *         &lt;element name="currentPortNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isEphemeral" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="protocolDirection" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="portRangeStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="portRangeEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="logicalDevice" type="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}LogicalDevice" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Protocol", propOrder = {
    "currentPortNumber",
    "isEphemeral",
    "protocolDirection",
    "portRangeStart",
    "portRangeEnd",
    "logicalDevice"
})
public class Protocol
    extends LogicalResource
{

    protected Integer currentPortNumber;
    protected Boolean isEphemeral;
    protected Integer protocolDirection;
    protected Integer portRangeStart;
    protected Integer portRangeEnd;
    protected List<LogicalDevice> logicalDevice;

    /**
     * Gets the value of the currentPortNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentPortNumber() {
        return currentPortNumber;
    }

    /**
     * Sets the value of the currentPortNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentPortNumber(Integer value) {
        this.currentPortNumber = value;
    }

    /**
     * Gets the value of the isEphemeral property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEphemeral() {
        return isEphemeral;
    }

    /**
     * Sets the value of the isEphemeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEphemeral(Boolean value) {
        this.isEphemeral = value;
    }

    /**
     * Gets the value of the protocolDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProtocolDirection() {
        return protocolDirection;
    }

    /**
     * Sets the value of the protocolDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProtocolDirection(Integer value) {
        this.protocolDirection = value;
    }

    /**
     * Gets the value of the portRangeStart property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPortRangeStart() {
        return portRangeStart;
    }

    /**
     * Sets the value of the portRangeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortRangeStart(Integer value) {
        this.portRangeStart = value;
    }

    /**
     * Gets the value of the portRangeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPortRangeEnd() {
        return portRangeEnd;
    }

    /**
     * Sets the value of the portRangeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortRangeEnd(Integer value) {
        this.portRangeEnd = value;
    }

    /**
     * Gets the value of the logicalDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logicalDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogicalDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicalDevice }
     * 
     * 
     */
    public List<LogicalDevice> getLogicalDevice() {
        if (logicalDevice == null) {
            logicalDevice = new ArrayList<LogicalDevice>();
        }
        return this.logicalDevice;
    }

}
