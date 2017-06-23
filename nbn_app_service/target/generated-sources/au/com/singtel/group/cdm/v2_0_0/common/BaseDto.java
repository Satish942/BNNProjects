
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import au.com.nbnco.cim.manageservicelimiter.v4.ManageServiceLimiterNotificationResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.BookNearestAppointmentRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.BookNearestAppointmentResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CancelAppointmentNotificationRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CancelAppointmentNotificationResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CancelAppointmentRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CancelAppointmentResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CheckAvailableAppointmentNotificationRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CheckAvailableAppointmentNotificationResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CheckAvailableAppointmentRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CheckAvailableAppointmentResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CreateAppointmentNotificationRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CreateAppointmentNotificationResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CreateAppointmentRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CreateAppointmentResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetAppointmentByIdRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetAppointmentByIdResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetAppointmentNotificationRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetAppointmentNotificationResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetAppointmentRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetAppointmentResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetAppointmentsForOrderRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetAppointmentsForOrderResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetRequiredAppointmentTypeRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetRequiredAppointmentTypeResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.RescheduleAppointmentNotificationRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.RescheduleAppointmentNotificationResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.RescheduleAppointmentRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.RescheduleAppointmentResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.UpdateAppointmentRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.UpdateAppointmentResponse;
import au.com.singtel.group.faultnotificationservice.v2_0.faultnotificationservice.HandleFaultNotificationRequest;
import au.com.singtel.group.faultnotificationservice.v2_0.faultnotificationservice.HandleFaultNotificationResponse;
import au.com.singtel.group.opomservice.v1_0.opomservice.OpomUpdateNBNNotifStatusRequest;
import au.com.singtel.group.opomservice.v1_0.opomservice.OpomUpdateNBNNotifStatusResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetRelatedServicesRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetRelatedServicesResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceConsentsRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceConsentsResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceMarketSegmentRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceMarketSegmentResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileByIdRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileByIdResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileNotificationRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileNotificationResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.ProcessCoverageCheckRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.ProcessCoverageCheckResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.ProcessFullQualificationCheckRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.ProcessFullQualificationCheckResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.QueryServiceQualificationByIdRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.QueryServiceQualificationByIdResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.QueryServiceQualificationNotificationRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.QueryServiceQualificationNotificationResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.QueryServiceQualificationRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.QueryServiceQualificationResponse;
import au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice.QueryAddressByIdRequest;
import au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice.QueryAddressByIdResponse;
import au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice.QueryAddressNotificationRequest;
import au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice.QueryAddressNotificationResponse;
import au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice.QueryAddressRequest;
import au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice.QueryAddressResponse;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.CancelServiceOrderRequest;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.CancelServiceOrderResponse;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.CreateServiceOrderNotificationRequest;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.CreateServiceOrderNotificationResponse;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.CreateServiceOrderRequest;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.CreateServiceOrderResponse;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.GetServiceOrderByIdRequest;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.GetServiceOrderByIdResponse;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.GetServiceOrderNotificationRequest;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.GetServiceOrderNotificationResponse;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.GetServiceOrderRequest;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.GetServiceOrderResponse;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.ProcessServiceOrderRequest;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.ProcessServiceOrderResponse;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.UpdateTransactionStatusRequest;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.UpdateTransactionStatusResponse;
import au.com.singtel.group.updatenotificationservice.v1_0.updatenotificationservice.UpdateNotificationRequest;
import au.com.singtel.group.updatenotificationservice.v1_0.updatenotificationservice.UpdateNotificationResponse;
import commonservices.group.singtel.com.au.v1_0.ilpmservice.IlpmRetrieveBillingPackageIdRequest;
import commonservices.group.singtel.com.au.v1_0.ilpmservice.IlpmRetrieveBillingPackageIdResponse;
import commonservices.group.singtel.com.au.v1_0.oietsservice.GetNsiCvcCtagAvcByGsidRequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.GetNsiCvcCtagAvcByGsidResponse;
import commonservices.group.singtel.com.au.v1_0.oietsservice.GetSpeedDetailsRequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.GetSpeedDetailsResponse;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiBatchCheckCVCAvailableForCSARequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiBatchCheckCVCAvailableForCSAResponse;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiCheckCVCAvailableForCSARequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiCheckCVCAvailableForCSAResponse;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiGetBandwidthProfileRequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiGetBandwidthProfileResponse;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiGetNbnTemplateRequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiGetNbnTemplateResponse;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiReserveCTAGForCSARequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiReserveCTAGForCSAResponse;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiReturnReservedCTAGRequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiReturnReservedCTAGResponse;
import commonservices.group.singtel.com.au.v1_0.oietsservice.SaveAVCRequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.SaveAVCResponse;
import commonservices.group.singtel.com.au.v1_0.oietsservice.SaveOWOrderRequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.SaveOWOrderResponse;
import commonservices.group.singtel.com.au.v1_0.shortmessageservice.ReceiveSmsRequestDto;
import commonservices.group.singtel.com.au.v1_0.shortmessageservice.ReceiveSmsResponseDto;
import commonservices.group.singtel.com.au.v1_0.shortmessageservice.SendSmsRequestDto;
import commonservices.group.singtel.com.au.v1_0.shortmessageservice.SendSmsResponseDto;
import commonservices.group.singtel.com.au.v1_0.sossqservice.PerformServiceQualificationRequestDto;
import commonservices.group.singtel.com.au.v1_0.sossqservice.PerformServiceQualificationResponseDto;


/**
 *  All ESB service requests and responses extend core dto type. Contains fields useful for
 *                 operational support.
 *             
 * 
 * <p>Java class for BaseDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signOnIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callerIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callerIdentityRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callerIdentityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salesmanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverIdentityRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverIdentityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseDto", propOrder = {
    "interactionId",
    "processId",
    "signOnIdentity",
    "callerIdentity",
    "callerIdentityRole",
    "callerIdentityType",
    "salesmanCode",
    "vendorCode",
    "dealerCode",
    "receiverIdentity",
    "receiverIdentityRole",
    "receiverIdentityType",
    "requestDate",
    "description",
    "clientId",
    "password",
    "version",
    "operation",
    "action",
    "status",
    "statusCode",
    "statusDescription"
})
@XmlSeeAlso({
    QueryAddressNotificationRequest.class,
    QueryAddressNotificationResponse.class,
    QueryAddressRequest.class,
    QueryAddressByIdRequest.class,
    QueryAddressByIdResponse.class,
    QueryAddressResponse.class,
    ProcessCoverageCheckRequest.class,
    QueryServiceQualificationByIdRequest.class,
    QueryServiceQualificationResponse.class,
    QueryServiceQualificationRequest.class,
    QueryServiceQualificationByIdResponse.class,
    ProcessCoverageCheckResponse.class,
    QueryServiceQualificationNotificationRequest.class,
    ProcessFullQualificationCheckResponse.class,
    ProcessFullQualificationCheckRequest.class,
    QueryServiceQualificationNotificationResponse.class,
    ProcessServiceOrderResponse.class,
    CancelServiceOrderResponse.class,
    GetServiceOrderNotificationResponse.class,
    CreateServiceOrderNotificationResponse.class,
    GetServiceOrderNotificationRequest.class,
    CancelServiceOrderRequest.class,
    ProcessServiceOrderRequest.class,
    CreateServiceOrderNotificationRequest.class,
    CreateServiceOrderRequest.class,
    UpdateTransactionStatusResponse.class,
    UpdateTransactionStatusRequest.class,
    GetServiceOrderByIdResponse.class,
    GetServiceOrderResponse.class,
    GetServiceOrderRequest.class,
    GetServiceOrderByIdRequest.class,
    CreateServiceOrderResponse.class,
    CancelAppointmentNotificationRequest.class,
    GetAppointmentByIdRequest.class,
    GetAppointmentsForOrderResponse.class,
    RescheduleAppointmentRequest.class,
    BookNearestAppointmentRequest.class,
    CreateAppointmentNotificationRequest.class,
    CheckAvailableAppointmentRequest.class,
    CheckAvailableAppointmentNotificationRequest.class,
    CancelAppointmentNotificationResponse.class,
    CreateAppointmentResponse.class,
    CheckAvailableAppointmentResponse.class,
    GetAppointmentsForOrderRequest.class,
    GetRequiredAppointmentTypeRequest.class,
    GetRequiredAppointmentTypeResponse.class,
    GetAppointmentRequest.class,
    GetAppointmentNotificationResponse.class,
    CreateAppointmentNotificationResponse.class,
    GetAppointmentByIdResponse.class,
    RescheduleAppointmentNotificationRequest.class,
    CancelAppointmentResponse.class,
    CreateAppointmentRequest.class,
    RescheduleAppointmentNotificationResponse.class,
    CheckAvailableAppointmentNotificationResponse.class,
    BookNearestAppointmentResponse.class,
    CancelAppointmentRequest.class,
    UpdateAppointmentResponse.class,
    UpdateAppointmentRequest.class,
    RescheduleAppointmentResponse.class,
    GetAppointmentResponse.class,
    GetAppointmentNotificationRequest.class,
    ManageServiceLimiterNotificationResponse.class,
    NsiGetNbnTemplateRequest.class,
    SaveAVCResponse.class,
    NsiBatchCheckCVCAvailableForCSAResponse.class,
    NsiGetNbnTemplateResponse.class,
    GetSpeedDetailsResponse.class,
    SaveOWOrderResponse.class,
    NsiReserveCTAGForCSARequest.class,
    GetSpeedDetailsRequest.class,
    NsiGetBandwidthProfileResponse.class,
    NsiCheckCVCAvailableForCSARequest.class,
    SaveAVCRequest.class,
    NsiGetBandwidthProfileRequest.class,
    SaveOWOrderRequest.class,
    GetNsiCvcCtagAvcByGsidResponse.class,
    NsiCheckCVCAvailableForCSAResponse.class,
    NsiReserveCTAGForCSAResponse.class,
    NsiBatchCheckCVCAvailableForCSARequest.class,
    GetNsiCvcCtagAvcByGsidRequest.class,
    NsiReturnReservedCTAGResponse.class,
    NsiReturnReservedCTAGRequest.class,
    IlpmRetrieveBillingPackageIdResponse.class,
    IlpmRetrieveBillingPackageIdRequest.class,
    HandleFaultNotificationResponse.class,
    HandleFaultNotificationRequest.class,
    UpdateNotificationResponse.class,
    UpdateNotificationRequest.class,
    OpomUpdateNBNNotifStatusResponse.class,
    OpomUpdateNBNNotifStatusRequest.class,
    GetServiceProfileByIdResponse.class,
    GetServiceProfileRequest.class,
    GetServiceMarketSegmentRequest.class,
    GetRelatedServicesResponse.class,
    GetRelatedServicesRequest.class,
    GetServiceConsentsRequest.class,
    GetServiceConsentsResponse.class,
    GetServiceProfileResponse.class,
    GetServiceMarketSegmentResponse.class,
    GetServiceProfileByIdRequest.class,
    GetServiceProfileNotificationResponse.class,
    GetServiceProfileNotificationRequest.class,
    PerformServiceQualificationRequestDto.class,
    PerformServiceQualificationResponseDto.class,
    ReceiveSmsResponseDto.class,
    SendSmsResponseDto.class,
    ReceiveSmsRequestDto.class,
    SendSmsRequestDto.class
})
public class BaseDto {

    protected String interactionId;
    protected String processId;
    protected String signOnIdentity;
    protected String callerIdentity;
    protected String callerIdentityRole;
    protected String callerIdentityType;
    protected String salesmanCode;
    protected String vendorCode;
    protected String dealerCode;
    protected String receiverIdentity;
    protected String receiverIdentityRole;
    protected String receiverIdentityType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    protected String description;
    protected String clientId;
    protected String password;
    protected String version;
    protected String operation;
    protected String action;
    protected String status;
    protected String statusCode;
    protected String statusDescription;

    /**
     * Gets the value of the interactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionId() {
        return interactionId;
    }

    /**
     * Sets the value of the interactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionId(String value) {
        this.interactionId = value;
    }

    /**
     * Gets the value of the processId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the processId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

    /**
     * Gets the value of the signOnIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignOnIdentity() {
        return signOnIdentity;
    }

    /**
     * Sets the value of the signOnIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignOnIdentity(String value) {
        this.signOnIdentity = value;
    }

    /**
     * Gets the value of the callerIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerIdentity() {
        return callerIdentity;
    }

    /**
     * Sets the value of the callerIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerIdentity(String value) {
        this.callerIdentity = value;
    }

    /**
     * Gets the value of the callerIdentityRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerIdentityRole() {
        return callerIdentityRole;
    }

    /**
     * Sets the value of the callerIdentityRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerIdentityRole(String value) {
        this.callerIdentityRole = value;
    }

    /**
     * Gets the value of the callerIdentityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerIdentityType() {
        return callerIdentityType;
    }

    /**
     * Sets the value of the callerIdentityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerIdentityType(String value) {
        this.callerIdentityType = value;
    }

    /**
     * Gets the value of the salesmanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesmanCode() {
        return salesmanCode;
    }

    /**
     * Sets the value of the salesmanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesmanCode(String value) {
        this.salesmanCode = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the dealerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * Sets the value of the dealerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * Gets the value of the receiverIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverIdentity() {
        return receiverIdentity;
    }

    /**
     * Sets the value of the receiverIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverIdentity(String value) {
        this.receiverIdentity = value;
    }

    /**
     * Gets the value of the receiverIdentityRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverIdentityRole() {
        return receiverIdentityRole;
    }

    /**
     * Sets the value of the receiverIdentityRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverIdentityRole(String value) {
        this.receiverIdentityRole = value;
    }

    /**
     * Gets the value of the receiverIdentityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverIdentityType() {
        return receiverIdentityType;
    }

    /**
     * Sets the value of the receiverIdentityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverIdentityType(String value) {
        this.receiverIdentityType = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
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

}
