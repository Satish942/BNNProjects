
package au.com.singtel.group.cdm.v2_0_0.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceProblemItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceProblemItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAffectedServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceProblemItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceProblemItemStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resource" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceProblemItemFor" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceProblemItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="service" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}Service" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProblemItem", propOrder = {
    "id",
    "totalAffectedServices",
    "serviceProblemItemNumber",
    "serviceProblemItemStatus",
    "resource",
    "serviceProblemItemFor",
    "service"
})
public class ServiceProblemItem {

    protected String id;
    protected String totalAffectedServices;
    protected String serviceProblemItemNumber;
    protected String serviceProblemItemStatus;
    protected List<String> resource;
    protected List<ServiceProblemItem> serviceProblemItemFor;
    protected List<Service> service;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the totalAffectedServices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalAffectedServices() {
        return totalAffectedServices;
    }

    /**
     * Sets the value of the totalAffectedServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAffectedServices(String value) {
        this.totalAffectedServices = value;
    }

    /**
     * Gets the value of the serviceProblemItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProblemItemNumber() {
        return serviceProblemItemNumber;
    }

    /**
     * Sets the value of the serviceProblemItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProblemItemNumber(String value) {
        this.serviceProblemItemNumber = value;
    }

    /**
     * Gets the value of the serviceProblemItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProblemItemStatus() {
        return serviceProblemItemStatus;
    }

    /**
     * Sets the value of the serviceProblemItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProblemItemStatus(String value) {
        this.serviceProblemItemStatus = value;
    }

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResource() {
        if (resource == null) {
            resource = new ArrayList<String>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the serviceProblemItemFor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProblemItemFor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProblemItemFor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProblemItem }
     * 
     * 
     */
    public List<ServiceProblemItem> getServiceProblemItemFor() {
        if (serviceProblemItemFor == null) {
            serviceProblemItemFor = new ArrayList<ServiceProblemItem>();
        }
        return this.serviceProblemItemFor;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Service }
     * 
     * 
     */
    public List<Service> getService() {
        if (service == null) {
            service = new ArrayList<Service>();
        }
        return this.service;
    }

}
