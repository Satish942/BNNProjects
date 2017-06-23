
package au.com.singtel.group.cdm.v2_0_0.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import au.com.singtel.group.cdm.v2_0_0.common.Problem;


/**
 * <p>Java class for ServiceProblem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceProblem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Problem">
 *       &lt;sequence>
 *         &lt;element name="serviceProblem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affectedServiceQuantity" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *         &lt;element name="serviceRestoredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceProblemItem" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceProblemItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="service" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}Service" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProblem", propOrder = {
    "serviceProblem",
    "affectedServiceQuantity",
    "serviceRestoredDate",
    "product",
    "serviceProblemItem",
    "service"
})
public class ServiceProblem
    extends Problem
{

    protected String serviceProblem;
    protected Byte affectedServiceQuantity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceRestoredDate;
    protected List<String> product;
    protected List<ServiceProblemItem> serviceProblemItem;
    protected List<Service> service;

    /**
     * Gets the value of the serviceProblem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProblem() {
        return serviceProblem;
    }

    /**
     * Sets the value of the serviceProblem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProblem(String value) {
        this.serviceProblem = value;
    }

    /**
     * Gets the value of the affectedServiceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getAffectedServiceQuantity() {
        return affectedServiceQuantity;
    }

    /**
     * Sets the value of the affectedServiceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setAffectedServiceQuantity(Byte value) {
        this.affectedServiceQuantity = value;
    }

    /**
     * Gets the value of the serviceRestoredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceRestoredDate() {
        return serviceRestoredDate;
    }

    /**
     * Sets the value of the serviceRestoredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceRestoredDate(XMLGregorianCalendar value) {
        this.serviceRestoredDate = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProduct() {
        if (product == null) {
            product = new ArrayList<String>();
        }
        return this.product;
    }

    /**
     * Gets the value of the serviceProblemItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProblemItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProblemItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProblemItem }
     * 
     * 
     */
    public List<ServiceProblemItem> getServiceProblemItem() {
        if (serviceProblemItem == null) {
            serviceProblemItem = new ArrayList<ServiceProblemItem>();
        }
        return this.serviceProblemItem;
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
