
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents a type of Service Specification introduced for the
 *                 purposes of Service Fulfillment. It defines ALL the ServiceSpecCharacteristics SSCs that must be used to
 *                 create corresponding Service instances. This includes the SSCs which are: globally set the corresponding
 *                 values are defined only in ServiceTemplates and are sometimes designated as invariant and set per
 *                 instance since the ServiceDefinition does not contain any value for such SSCs, the corresponding values
 *                 can be defined only over the Activation Interface and are sometimes designated as variant
 *             
 * 
 * <p>Java class for ServiceDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceSpecification">
 *       &lt;sequence>
 *         &lt;element name="sdStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="activationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceTemplate" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceTemplate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinition", propOrder = {
    "sdStatus",
    "activationMode",
    "serviceTemplate"
})
public class ServiceDefinition
    extends ServiceSpecification
{

    protected String sdStatus;
    protected String activationMode;
    protected List<ServiceTemplate> serviceTemplate;

    /**
     * Gets the value of the sdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdStatus() {
        return sdStatus;
    }

    /**
     * Sets the value of the sdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdStatus(String value) {
        this.sdStatus = value;
    }

    /**
     * Gets the value of the activationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationMode() {
        return activationMode;
    }

    /**
     * Sets the value of the activationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationMode(String value) {
        this.activationMode = value;
    }

    /**
     * Gets the value of the serviceTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceTemplate }
     * 
     * 
     */
    public List<ServiceTemplate> getServiceTemplate() {
        if (serviceTemplate == null) {
            serviceTemplate = new ArrayList<ServiceTemplate>();
        }
        return this.serviceTemplate;
    }

}
