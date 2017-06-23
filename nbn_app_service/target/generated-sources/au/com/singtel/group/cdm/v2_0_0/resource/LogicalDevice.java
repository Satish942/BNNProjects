
package au.com.singtel.group.cdm.v2_0_0.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogicalDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}LogicalResource">
 *       &lt;sequence>
 *         &lt;element name="policyDecisionPoint1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configBackupLocation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="configRunningLocation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="configurationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configurationMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isLoopbackSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isNullInterfaceSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="monitorMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfConfigurationsPresent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="protocolsRunning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isMultiBootSystem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="currentRunningOS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasMultipleInstalledOSs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalDevice", propOrder = {
    "policyDecisionPoint1",
    "configBackupLocation",
    "configRunningLocation",
    "configurationMethod",
    "configurationMode",
    "isLoopbackSet",
    "isNullInterfaceSet",
    "monitorMethod",
    "numberOfConfigurationsPresent",
    "protocolsRunning",
    "isMultiBootSystem",
    "currentRunningOS",
    "hasMultipleInstalledOSs"
})
@XmlSeeAlso({
    LogicalDeviceAtomic.class
})
public abstract class LogicalDevice
    extends LogicalResource
{

    protected String policyDecisionPoint1;
    protected Integer configBackupLocation;
    protected Integer configRunningLocation;
    protected String configurationMethod;
    protected Integer configurationMode;
    protected Boolean isLoopbackSet;
    protected Boolean isNullInterfaceSet;
    protected String monitorMethod;
    protected Integer numberOfConfigurationsPresent;
    protected String protocolsRunning;
    protected Boolean isMultiBootSystem;
    protected String currentRunningOS;
    protected Boolean hasMultipleInstalledOSs;

    /**
     * Gets the value of the policyDecisionPoint1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyDecisionPoint1() {
        return policyDecisionPoint1;
    }

    /**
     * Sets the value of the policyDecisionPoint1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyDecisionPoint1(String value) {
        this.policyDecisionPoint1 = value;
    }

    /**
     * Gets the value of the configBackupLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfigBackupLocation() {
        return configBackupLocation;
    }

    /**
     * Sets the value of the configBackupLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfigBackupLocation(Integer value) {
        this.configBackupLocation = value;
    }

    /**
     * Gets the value of the configRunningLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfigRunningLocation() {
        return configRunningLocation;
    }

    /**
     * Sets the value of the configRunningLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfigRunningLocation(Integer value) {
        this.configRunningLocation = value;
    }

    /**
     * Gets the value of the configurationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationMethod() {
        return configurationMethod;
    }

    /**
     * Sets the value of the configurationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationMethod(String value) {
        this.configurationMethod = value;
    }

    /**
     * Gets the value of the configurationMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfigurationMode() {
        return configurationMode;
    }

    /**
     * Sets the value of the configurationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfigurationMode(Integer value) {
        this.configurationMode = value;
    }

    /**
     * Gets the value of the isLoopbackSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoopbackSet() {
        return isLoopbackSet;
    }

    /**
     * Sets the value of the isLoopbackSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoopbackSet(Boolean value) {
        this.isLoopbackSet = value;
    }

    /**
     * Gets the value of the isNullInterfaceSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNullInterfaceSet() {
        return isNullInterfaceSet;
    }

    /**
     * Sets the value of the isNullInterfaceSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNullInterfaceSet(Boolean value) {
        this.isNullInterfaceSet = value;
    }

    /**
     * Gets the value of the monitorMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitorMethod() {
        return monitorMethod;
    }

    /**
     * Sets the value of the monitorMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitorMethod(String value) {
        this.monitorMethod = value;
    }

    /**
     * Gets the value of the numberOfConfigurationsPresent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfConfigurationsPresent() {
        return numberOfConfigurationsPresent;
    }

    /**
     * Sets the value of the numberOfConfigurationsPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfConfigurationsPresent(Integer value) {
        this.numberOfConfigurationsPresent = value;
    }

    /**
     * Gets the value of the protocolsRunning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolsRunning() {
        return protocolsRunning;
    }

    /**
     * Sets the value of the protocolsRunning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolsRunning(String value) {
        this.protocolsRunning = value;
    }

    /**
     * Gets the value of the isMultiBootSystem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiBootSystem() {
        return isMultiBootSystem;
    }

    /**
     * Sets the value of the isMultiBootSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiBootSystem(Boolean value) {
        this.isMultiBootSystem = value;
    }

    /**
     * Gets the value of the currentRunningOS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentRunningOS() {
        return currentRunningOS;
    }

    /**
     * Sets the value of the currentRunningOS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentRunningOS(String value) {
        this.currentRunningOS = value;
    }

    /**
     * Gets the value of the hasMultipleInstalledOSs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMultipleInstalledOSs() {
        return hasMultipleInstalledOSs;
    }

    /**
     * Sets the value of the hasMultipleInstalledOSs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMultipleInstalledOSs(Boolean value) {
        this.hasMultipleInstalledOSs = value;
    }

}
