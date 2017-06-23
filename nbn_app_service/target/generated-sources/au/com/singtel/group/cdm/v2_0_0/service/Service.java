
package au.com.singtel.group.cdm.v2_0_0.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import au.com.singtel.group.cdm.v2_0_0.common.RootEntity;


/**
 * This is an abstract base class for defining the Service
 *                 hierarchy. All Services are characterized as either being possibly visible and usable by a Customer or
 *                 not. This gives rise to the two subclasses of Service: CustomerFacingService and ResourceFacingService.
 *                 Services are defined as being tightly bound to Products. A Product defines the context of the Service,
 *                 Service and its related entities (e.g., ServiceSpecification, ServiceRole, and so forth) are related to
 *                 entities in the Resource, Product, and other domains through a set of relationships. A Service
 *                 represents the object that will be instantiated. Each Service instance can be different; therefore,
 *                 Service is limited to owning just the changeable attributes, methods, relationships, and constraints
 *                 that can be instantiated. The invariant attributes, methods, relationships, and constraints that can be
 *                 instantiated are defined by a ServiceSpecification. The purpose of this entity is twofold. First, it is
 *                 used to define attributes, methods, and relationships that are common to all Services. Second, it
 *                 provides a convenient point to define how Services interact with other parts business entities. Service
 *                 is a first-class entity, inheriting directly from ManagedEntity. It is therefore a sibling with
 *                 Resource, Product, and other first-class entities. Note that the CIM models Service as a subclass of
 *                 LogicalElement, which is a subclass of ManagedSystemElement, which is a subclass of ManagedElement
 *                 (which is equivalent to ManagedEntity).
 *             
 * 
 * <p>Java class for Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}RootEntity">
 *       &lt;sequence>
 *         &lt;element name="isServiceEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hasStarted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="startMode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isStateful" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="serviceEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newIdentifierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownServiceDetails" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}OwnsServiceDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="identifierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partyRole" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessInteractionItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="valueNetworkRole" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceCharacteristicValue" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceCharacteristicValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="servicePorting" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServicePorting" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="servicePlaceDetails" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServicePlaceDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceAccessPoint" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceAccessPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceSpecification" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceUsageForService" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}ServiceUsage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service", propOrder = {
    "isServiceEnabled",
    "hasStarted",
    "isMandatory",
    "startMode",
    "isStateful",
    "name",
    "password",
    "serviceStartDate",
    "serviceEndDate",
    "identifier",
    "provisionDate",
    "reasonCode",
    "status",
    "statusCode",
    "statusDescription",
    "newIdentifier",
    "newIdentifierType",
    "ownServiceDetails",
    "identifierType",
    "partyRole",
    "businessInteractionItem",
    "valueNetworkRole",
    "customer",
    "serviceCharacteristicValue",
    "servicePorting",
    "servicePlaceDetails",
    "serviceAccessPoint",
    "serviceSpecification",
    "serviceUsageForService"
})
@XmlSeeAlso({
    CustomerFacingService.class,
    ResourceFacingService.class
})
public abstract class Service
    extends RootEntity
{

    protected Boolean isServiceEnabled;
    protected Boolean hasStarted;
    protected Boolean isMandatory;
    protected Integer startMode;
    protected Boolean isStateful;
    protected String name;
    protected String password;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceEndDate;
    protected String identifier;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar provisionDate;
    protected String reasonCode;
    protected String status;
    protected String statusCode;
    protected String statusDescription;
    protected String newIdentifier;
    protected String newIdentifierType;
    protected List<OwnsServiceDetails> ownServiceDetails;
    protected String identifierType;
    protected List<String> partyRole;
    protected List<String> businessInteractionItem;
    protected List<String> valueNetworkRole;
    protected List<String> customer;
    protected List<ServiceCharacteristicValue> serviceCharacteristicValue;
    protected List<ServicePorting> servicePorting;
    protected List<ServicePlaceDetails> servicePlaceDetails;
    protected List<ServiceAccessPoint> serviceAccessPoint;
    protected List<ServiceSpecification> serviceSpecification;
    protected List<ServiceUsage> serviceUsageForService;

    /**
     * Gets the value of the isServiceEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsServiceEnabled() {
        return isServiceEnabled;
    }

    /**
     * Sets the value of the isServiceEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsServiceEnabled(Boolean value) {
        this.isServiceEnabled = value;
    }

    /**
     * Gets the value of the hasStarted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasStarted() {
        return hasStarted;
    }

    /**
     * Sets the value of the hasStarted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasStarted(Boolean value) {
        this.hasStarted = value;
    }

    /**
     * Gets the value of the isMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * Sets the value of the isMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMandatory(Boolean value) {
        this.isMandatory = value;
    }

    /**
     * Gets the value of the startMode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartMode() {
        return startMode;
    }

    /**
     * Sets the value of the startMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartMode(Integer value) {
        this.startMode = value;
    }

    /**
     * Gets the value of the isStateful property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStateful() {
        return isStateful;
    }

    /**
     * Sets the value of the isStateful property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStateful(Boolean value) {
        this.isStateful = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the serviceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceStartDate() {
        return serviceStartDate;
    }

    /**
     * Sets the value of the serviceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceStartDate(XMLGregorianCalendar value) {
        this.serviceStartDate = value;
    }

    /**
     * Gets the value of the serviceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceEndDate() {
        return serviceEndDate;
    }

    /**
     * Sets the value of the serviceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceEndDate(XMLGregorianCalendar value) {
        this.serviceEndDate = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the provisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProvisionDate() {
        return provisionDate;
    }

    /**
     * Sets the value of the provisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProvisionDate(XMLGregorianCalendar value) {
        this.provisionDate = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
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

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the newIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIdentifier() {
        return newIdentifier;
    }

    /**
     * Sets the value of the newIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIdentifier(String value) {
        this.newIdentifier = value;
    }

    /**
     * Gets the value of the newIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewIdentifierType() {
        return newIdentifierType;
    }

    /**
     * Sets the value of the newIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewIdentifierType(String value) {
        this.newIdentifierType = value;
    }

    /**
     * Gets the value of the ownServiceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownServiceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnServiceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OwnsServiceDetails }
     * 
     * 
     */
    public List<OwnsServiceDetails> getOwnServiceDetails() {
        if (ownServiceDetails == null) {
            ownServiceDetails = new ArrayList<OwnsServiceDetails>();
        }
        return this.ownServiceDetails;
    }

    /**
     * Gets the value of the identifierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierType() {
        return identifierType;
    }

    /**
     * Sets the value of the identifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierType(String value) {
        this.identifierType = value;
    }

    /**
     * Gets the value of the partyRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPartyRole() {
        if (partyRole == null) {
            partyRole = new ArrayList<String>();
        }
        return this.partyRole;
    }

    /**
     * Gets the value of the businessInteractionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessInteractionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessInteractionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBusinessInteractionItem() {
        if (businessInteractionItem == null) {
            businessInteractionItem = new ArrayList<String>();
        }
        return this.businessInteractionItem;
    }

    /**
     * Gets the value of the valueNetworkRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueNetworkRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueNetworkRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValueNetworkRole() {
        if (valueNetworkRole == null) {
            valueNetworkRole = new ArrayList<String>();
        }
        return this.valueNetworkRole;
    }

    /**
     * Gets the value of the customer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomer() {
        if (customer == null) {
            customer = new ArrayList<String>();
        }
        return this.customer;
    }

    /**
     * Gets the value of the serviceCharacteristicValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCharacteristicValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCharacteristicValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCharacteristicValue }
     * 
     * 
     */
    public List<ServiceCharacteristicValue> getServiceCharacteristicValue() {
        if (serviceCharacteristicValue == null) {
            serviceCharacteristicValue = new ArrayList<ServiceCharacteristicValue>();
        }
        return this.serviceCharacteristicValue;
    }

    /**
     * Gets the value of the servicePorting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicePorting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicePorting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePorting }
     * 
     * 
     */
    public List<ServicePorting> getServicePorting() {
        if (servicePorting == null) {
            servicePorting = new ArrayList<ServicePorting>();
        }
        return this.servicePorting;
    }

    /**
     * Gets the value of the servicePlaceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicePlaceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicePlaceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePlaceDetails }
     * 
     * 
     */
    public List<ServicePlaceDetails> getServicePlaceDetails() {
        if (servicePlaceDetails == null) {
            servicePlaceDetails = new ArrayList<ServicePlaceDetails>();
        }
        return this.servicePlaceDetails;
    }

    /**
     * Gets the value of the serviceAccessPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceAccessPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceAccessPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceAccessPoint }
     * 
     * 
     */
    public List<ServiceAccessPoint> getServiceAccessPoint() {
        if (serviceAccessPoint == null) {
            serviceAccessPoint = new ArrayList<ServiceAccessPoint>();
        }
        return this.serviceAccessPoint;
    }

    /**
     * Gets the value of the serviceSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceSpecification }
     * 
     * 
     */
    public List<ServiceSpecification> getServiceSpecification() {
        if (serviceSpecification == null) {
            serviceSpecification = new ArrayList<ServiceSpecification>();
        }
        return this.serviceSpecification;
    }

    /**
     * Gets the value of the serviceUsageForService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceUsageForService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceUsageForService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceUsage }
     * 
     * 
     */
    public List<ServiceUsage> getServiceUsageForService() {
        if (serviceUsageForService == null) {
            serviceUsageForService = new ArrayList<ServiceUsage>();
        }
        return this.serviceUsageForService;
    }

}
