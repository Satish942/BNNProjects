
package au.com.optus.sdp.enabler.nbn.nbnmanagerservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import au.com.nbnco.cim.manageservicelimiter.v4.ManageServiceLimiterNotificationRequest;
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
import au.com.singtel.group.faultnotificationservice.v2_0.faultnotificationservice.HandleFaultNotificationRequest;
import au.com.singtel.group.faultnotificationservice.v2_0.faultnotificationservice.HandleFaultNotificationResponse;
import au.com.singtel.group.opomservice.v1_0.opomservice.OpomUpdateNBNNotifStatusRequest;
import au.com.singtel.group.opomservice.v1_0.opomservice.OpomUpdateNBNNotifStatusResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileByIdRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileByIdResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileNotificationRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileNotificationResponse;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileRequest;
import au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileResponse;
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
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiReserveCTAGForCSARequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiReserveCTAGForCSAResponse;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiReturnReservedCTAGRequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.NsiReturnReservedCTAGResponse;
import commonservices.group.singtel.com.au.v1_0.oietsservice.SaveAVCRequest;
import commonservices.group.singtel.com.au.v1_0.oietsservice.SaveAVCResponse;
import commonservices.group.singtel.com.au.v1_0.shortmessageservice.ReceiveSmsRequestDto;
import commonservices.group.singtel.com.au.v1_0.shortmessageservice.ReceiveSmsResponseDto;
import commonservices.group.singtel.com.au.v1_0.shortmessageservice.SendSmsRequestDto;
import commonservices.group.singtel.com.au.v1_0.shortmessageservice.SendSmsResponseDto;
import commonservices.group.singtel.com.au.v1_0.sossqservice.PerformServiceQualificationRequestDto;
import commonservices.group.singtel.com.au.v1_0.sossqservice.PerformServiceQualificationResponseDto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "NBNManagerService", targetNamespace = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    au.com.nbnco.cim.common.exception.v3.ObjectFactory.class,
    commonservices.group.singtel.com.au.v1_0.oietsservice.ObjectFactory.class,
    au.com.singtel.group.cdm.v2_0_0.exception.ObjectFactory.class,
    au.com.singtel.group.cdm.v2_0_0.common.ObjectFactory.class,
    au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice.ObjectFactory.class,
    au.com.singtel.group.opomservice.v1_0.opomservice.ObjectFactory.class,
    commonservices.group.singtel.com.au.v1_0.shortmessageservice.ObjectFactory.class,
    au.com.nbnco.cim.manageservicelimiter.v4.ObjectFactory.class,
    au.com.singtel.group.updatenotificationservice.v1_0.updatenotificationservice.ObjectFactory.class,
    au.com.singtel.group.cdm.v2_0_0.resource.ObjectFactory.class,
    au.com.nbnco.cim.common.message.v4.ObjectFactory.class,
    au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.ObjectFactory.class,
    au.com.singtel.group.cdm.v2_0_0.product.ObjectFactory.class,
    au.com.singtel.group.faultnotificationservice.v2_0.faultnotificationservice.ObjectFactory.class,
    au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.ObjectFactory.class,
    au.com.nbnco.cim.common.accessseeker.v3.ObjectFactory.class,
    commonservices.group.singtel.com.au.v1_0.sossqservice.ObjectFactory.class,
    au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.ObjectFactory.class,
    au.com.singtel.group.cdm.v2_0_0.customer.ObjectFactory.class,
    commonservices.group.singtel.com.au.v1_0.ilpmservice.ObjectFactory.class,
    au.com.singtel.group.appointmentservice.v2_0.appointmentservice.ObjectFactory.class,
    au.com.nbnco.cim.common.rootbusinessentity.v3.ObjectFactory.class,
    au.com.singtel.group.cdm.v2_0_0.service.ObjectFactory.class
})
public interface NBNManagerService {


    /**
     * 
     * @param queryServiceQualificationRequestDto
     * @return
     *     returns au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.QueryServiceQualificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/queryServiceQualification")
    @WebResult(name = "queryServiceQualificationResponse", targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", partName = "queryServiceQualificationResponseDto")
    public QueryServiceQualificationResponse queryServiceQualification(
        @WebParam(name = "queryServiceQualificationRequest", targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", partName = "queryServiceQualificationRequestDto")
        QueryServiceQualificationRequest queryServiceQualificationRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param queryServiceQualificationNotificationRequestDto
     * @return
     *     returns au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.QueryServiceQualificationNotificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/QueryServiceQualificationNotification")
    @WebResult(name = "queryServiceQualificationNotificationResponse", targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", partName = "queryServiceQualificationNotificationResponseDto")
    public QueryServiceQualificationNotificationResponse queryServiceQualificationNotification(
        @WebParam(name = "queryServiceQualificationNotificationRequest", targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", partName = "queryServiceQualificationNotificationRequestDto")
        QueryServiceQualificationNotificationRequest queryServiceQualificationNotificationRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param queryServiceQualificationByIdRequestDto
     * @return
     *     returns au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice.QueryServiceQualificationByIdResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/queryServiceQualificationById")
    @WebResult(name = "queryServiceQualificationByIdResponse", targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", partName = "queryServiceQualificationByIdResponseDto")
    public QueryServiceQualificationByIdResponse queryServiceQualificationById(
        @WebParam(name = "queryServiceQualificationByIdRequest", targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", partName = "queryServiceQualificationByIdRequestDto")
        QueryServiceQualificationByIdRequest queryServiceQualificationByIdRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param queryAddressRequestDto
     * @return
     *     returns au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice.QueryAddressResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/queryAddress")
    @WebResult(name = "queryAddressResponse", targetNamespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", partName = "queryAddressResponseDto")
    public QueryAddressResponse queryAddress(
        @WebParam(name = "queryAddressRequest", targetNamespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", partName = "queryAddressRequestDto")
        QueryAddressRequest queryAddressRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param queryAddressNotificationRequestDto
     * @return
     *     returns au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice.QueryAddressNotificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/queryAddressNotification")
    @WebResult(name = "queryAddressNotificationResponse", targetNamespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", partName = "queryAddressNotificationResponseDto")
    public QueryAddressNotificationResponse queryAddressNotification(
        @WebParam(name = "queryAddressNotificationRequest", targetNamespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", partName = "queryAddressNotificationRequestDto")
        QueryAddressNotificationRequest queryAddressNotificationRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param queryAddressByIdRequestDto
     * @return
     *     returns au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice.QueryAddressByIdResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/queryAddressById")
    @WebResult(name = "queryAddressByIdResponse", targetNamespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", partName = "queryAddressByIdResponseDto")
    public QueryAddressByIdResponse queryAddressById(
        @WebParam(name = "queryAddressByIdRequest", targetNamespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", partName = "queryAddressByIdRequestDto")
        QueryAddressByIdRequest queryAddressByIdRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param createServiceOrderRequestDto
     * @return
     *     returns au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.CreateServiceOrderResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/createServiceOrder")
    @WebResult(name = "createServiceOrderResponse", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "createServiceOrderResponseDto")
    public CreateServiceOrderResponse createServiceOrder(
        @WebParam(name = "createServiceOrderRequest", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "createServiceOrderRequestDto")
        CreateServiceOrderRequest createServiceOrderRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param createServiceOrderNotificationRequestDto
     * @return
     *     returns au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.CreateServiceOrderNotificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/createServiceOrderNotification")
    @WebResult(name = "createServiceOrderNotificationResponse", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "createServiceOrderNotificationResponseDto")
    public CreateServiceOrderNotificationResponse createServiceOrderNotification(
        @WebParam(name = "createServiceOrderNotificationRequest", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "createServiceOrderNotificationRequestDto")
        CreateServiceOrderNotificationRequest createServiceOrderNotificationRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param getServiceOrderByIdRequestDto
     * @return
     *     returns au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.GetServiceOrderByIdResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/getServiceOrderById")
    @WebResult(name = "getServiceOrderByIdResponse", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "getServiceOrderByIdResponseDto")
    public GetServiceOrderByIdResponse getServiceOrderById(
        @WebParam(name = "getServiceOrderByIdRequest", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "getServiceOrderByIdRequestDto")
        GetServiceOrderByIdRequest getServiceOrderByIdRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param createAppointmentRequestDto
     * @return
     *     returns au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CreateAppointmentResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/createAppointment")
    @WebResult(name = "createAppointmentResponse", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "createAppointmentResponseDto")
    public CreateAppointmentResponse createAppointment(
        @WebParam(name = "createAppointmentRequest", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "createAppointmentRequestDto")
        CreateAppointmentRequest createAppointmentRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param createAppointmentNotificationRequestDto
     * @return
     *     returns au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CreateAppointmentNotificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/createAppointmentNotification")
    @WebResult(name = "createAppointmentNotificationResponse", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "createAppointmentNotificationResponseDto")
    public CreateAppointmentNotificationResponse createAppointmentNotification(
        @WebParam(name = "createAppointmentNotificationRequest", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "createAppointmentNotificationRequestDto")
        CreateAppointmentNotificationRequest createAppointmentNotificationRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param cancelAppointmentRequestDto
     * @return
     *     returns au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CancelAppointmentResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/cancelAppointment")
    @WebResult(name = "cancelAppointmentResponse", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "cancelAppointmentResponseDto")
    public CancelAppointmentResponse cancelAppointment(
        @WebParam(name = "cancelAppointmentRequest", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "cancelAppointmentRequestDto")
        CancelAppointmentRequest cancelAppointmentRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param cancelAppointmentNotificationRequestDto
     * @return
     *     returns au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CancelAppointmentNotificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/cancelAppointmentNotification")
    @WebResult(name = "cancelAppointmentNotificationResponse", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "cancelAppointmentNotificationResponseDto")
    public CancelAppointmentNotificationResponse cancelAppointmentNotification(
        @WebParam(name = "cancelAppointmentNotificationRequest", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "cancelAppointmentNotificationRequestDto")
        CancelAppointmentNotificationRequest cancelAppointmentNotificationRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param checkAvailableAppointmentRequestDto
     * @return
     *     returns au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CheckAvailableAppointmentResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/checkAvailableAppointment")
    @WebResult(name = "checkAvailableAppointmentResponse", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "checkAvailableAppointmentResponseDto")
    public CheckAvailableAppointmentResponse checkAvailableAppointment(
        @WebParam(name = "checkAvailableAppointmentRequest", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "checkAvailableAppointmentRequestDto")
        CheckAvailableAppointmentRequest checkAvailableAppointmentRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param checkAvailableAppointmentNotificationRequestDto
     * @return
     *     returns au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CheckAvailableAppointmentNotificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/checkAvailableAppointmentNotification")
    @WebResult(name = "checkAvailableAppointmentNotificationResponse", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "checkAvailableAppointmentNotificationResponseDto")
    public CheckAvailableAppointmentNotificationResponse checkAvailableAppointmentNotification(
        @WebParam(name = "checkAvailableAppointmentNotificationRequest", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "checkAvailableAppointmentNotificationRequestDto")
        CheckAvailableAppointmentNotificationRequest checkAvailableAppointmentNotificationRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param getAppointmentByIdRequestDto
     * @return
     *     returns au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetAppointmentByIdResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://localhost:7001/appointmentservice/AppointmentService/getAppointmentById")
    @WebResult(name = "getAppointmentByIdResponse", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "getAppointmentResponseDto")
    public GetAppointmentByIdResponse getAppointmentById(
        @WebParam(name = "getAppointmentByIdRequest", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "getAppointmentByIdRequestDto")
        GetAppointmentByIdRequest getAppointmentByIdRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param getAppointmentRequestDto
     * @return
     *     returns au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetAppointmentResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/getAppointment")
    @WebResult(name = "getAppointmentResponse", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "getAppointmentResponseDto")
    public GetAppointmentResponse getAppointment(
        @WebParam(name = "getAppointmentRequest", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "getAppointmentRequestDto")
        GetAppointmentRequest getAppointmentRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param getAppointmentNotificationRequestDto
     * @return
     *     returns au.com.singtel.group.appointmentservice.v2_0.appointmentservice.GetAppointmentNotificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/getAppointmentNotification")
    @WebResult(name = "getAppointmentNotificationResponse", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "getAppointmentNotificationResponseDto")
    public GetAppointmentNotificationResponse getAppointmentNotification(
        @WebParam(name = "getAppointmentNotificationRequest", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "getAppointmentNotificationRequestDto")
        GetAppointmentNotificationRequest getAppointmentNotificationRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param nsiReserveCTAGForCSARequestDto
     * @return
     *     returns commonservices.group.singtel.com.au.v1_0.oietsservice.NsiReserveCTAGForCSAResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/nsiReserveCTAGForCSA")
    @WebResult(name = "nsiReserveCTAGForCSAResponse", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", partName = "nsiReserveCTAGForCSAResponseDto")
    public NsiReserveCTAGForCSAResponse nsiReserveCTAGForCSA(
        @WebParam(name = "nsiReserveCTAGForCSARequest", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", partName = "nsiReserveCTAGForCSARequestDto")
        NsiReserveCTAGForCSARequest nsiReserveCTAGForCSARequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param nsiReturnReservedCTAGRequestDto
     * @return
     *     returns commonservices.group.singtel.com.au.v1_0.oietsservice.NsiReturnReservedCTAGResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/nsiReturnReservedCTAG")
    @WebResult(name = "nsiReturnReservedCTAGResponse", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", partName = "nsiReturnReservedCTAGResponseDto")
    public NsiReturnReservedCTAGResponse nsiReturnReservedCTAG(
        @WebParam(name = "nsiReturnReservedCTAGRequest", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", partName = "nsiReturnReservedCTAGRequestDto")
        NsiReturnReservedCTAGRequest nsiReturnReservedCTAGRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param saveAVCRequestDto
     * @return
     *     returns commonservices.group.singtel.com.au.v1_0.oietsservice.SaveAVCResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/saveAVC")
    @WebResult(name = "saveAVCResponse", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", partName = "saveAVCResponseDto")
    public SaveAVCResponse saveAVC(
        @WebParam(name = "saveAVCRequest", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", partName = "saveAVCRequestDto")
        SaveAVCRequest saveAVCRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param getSpeedDetailsRequestDto
     * @return
     *     returns commonservices.group.singtel.com.au.v1_0.oietsservice.GetSpeedDetailsResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/getSpeedDetails")
    @WebResult(name = "getSpeedDetailsResponse", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", partName = "getSpeedDetailsResponseDto")
    public GetSpeedDetailsResponse getSpeedDetails(
        @WebParam(name = "getSpeedDetailsRequest", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", partName = "getSpeedDetailsRequestDto")
        GetSpeedDetailsRequest getSpeedDetailsRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param nsiBatchCheckCVCAvailableForCSARequestDto
     * @return
     *     returns commonservices.group.singtel.com.au.v1_0.oietsservice.NsiBatchCheckCVCAvailableForCSAResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/nsiBatchCheckCVCAvailableForCSA")
    @WebResult(name = "nsiBatchCheckCVCAvailableForCSAResponse", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", partName = "nsiBatchCheckCVCAvailableForCSAResponseDto")
    public NsiBatchCheckCVCAvailableForCSAResponse nsiBatchCheckCVCAvailableForCSA(
        @WebParam(name = "nsiBatchCheckCVCAvailableForCSARequest", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", partName = "nsiBatchCheckCVCAvailableForCSARequestDto")
        NsiBatchCheckCVCAvailableForCSARequest nsiBatchCheckCVCAvailableForCSARequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param manageServiceLimiterNotificationRequest
     * @return
     *     returns au.com.nbnco.cim.manageservicelimiter.v4.ManageServiceLimiterNotificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(operationName = "ManageServiceLimiterNotification", action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/ManageServiceLimiterNotification")
    @WebResult(name = "ManageServiceLimiterNotificationResponse", targetNamespace = "http://www.nbnco.com.au/cim/manageServiceLimiter/v4", partName = "manageServiceLimiterNotificationResponse")
    public ManageServiceLimiterNotificationResponse manageServiceLimiterNotification(
        @WebParam(name = "ManageServiceLimiterNotification", targetNamespace = "http://www.nbnco.com.au/cim/manageServiceLimiter/v4", partName = "manageServiceLimiterNotificationRequest")
        ManageServiceLimiterNotificationRequest manageServiceLimiterNotificationRequest)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param updateTransactionStatusRequest
     * @return
     *     returns au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.UpdateTransactionStatusResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/updateTransactionStatus")
    @WebResult(name = "updateTransactionStatusResponse", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "updateTransactionStatusResponse")
    public UpdateTransactionStatusResponse updateTransactionStatus(
        @WebParam(name = "updateTransactionStatusRequest", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "updateTransactionStatusRequest")
        UpdateTransactionStatusRequest updateTransactionStatusRequest)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param handleFaultNotificationRequest
     * @return
     *     returns au.com.singtel.group.faultnotificationservice.v2_0.faultnotificationservice.HandleFaultNotificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/handleFaultNotificationService")
    @WebResult(name = "handleFaultNotificationResponse", targetNamespace = "http://www.group.singtel.com.au/FaultNotificationService/v2_0/FaultNotificationService", partName = "handleFaultNotificationResponse")
    public HandleFaultNotificationResponse handleFaultNotificationService(
        @WebParam(name = "handleFaultNotificationRequest", targetNamespace = "http://www.group.singtel.com.au/FaultNotificationService/v2_0/FaultNotificationService", partName = "handleFaultNotificationRequest")
        HandleFaultNotificationRequest handleFaultNotificationRequest)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param ilpmRetrieveBillingPackageIdRequest
     * @return
     *     returns commonservices.group.singtel.com.au.v1_0.ilpmservice.IlpmRetrieveBillingPackageIdResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/retrieveBillingPackageService")
    @WebResult(name = "ilpmRetrieveBillingPackageIdResponse", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/ILPMService", partName = "ilpmRetrieveBillingPackageIdResponse")
    public IlpmRetrieveBillingPackageIdResponse retrieveBillingPackageService(
        @WebParam(name = "ilpmRetrieveBillingPackageIdRequest", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/ILPMService", partName = "ilpmRetrieveBillingPackageIdRequest")
        IlpmRetrieveBillingPackageIdRequest ilpmRetrieveBillingPackageIdRequest)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param nsiGetCvcCtagAvcByGsidRequest
     * @return
     *     returns commonservices.group.singtel.com.au.v1_0.oietsservice.GetNsiCvcCtagAvcByGsidResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/nsiGetCvcCtagAvcByGsid")
    @WebResult(name = "getNsiCvcCtagAvcByGsidResponse", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", partName = "nsiGetCvcCtagAvcByGsidResponse")
    public GetNsiCvcCtagAvcByGsidResponse nsiGetCvcCtagAvcByGsid(
        @WebParam(name = "getNsiCvcCtagAvcByGsidRequest", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", partName = "nsiGetCvcCtagAvcByGsidRequest")
        GetNsiCvcCtagAvcByGsidRequest nsiGetCvcCtagAvcByGsidRequest)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param getServiceOrderRequestDto
     * @return
     *     returns au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.GetServiceOrderResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/getServiceOrder")
    @WebResult(name = "getServiceOrderResponse", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "getServiceOrderResponseDto")
    public GetServiceOrderResponse getServiceOrder(
        @WebParam(name = "getServiceOrderRequest", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "getServiceOrderRequestDto")
        GetServiceOrderRequest getServiceOrderRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param getServiceOrderNotificationRequestDto
     * @return
     *     returns au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.GetServiceOrderNotificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/getServiceOrderNotification")
    @WebResult(name = "getServiceOrderNotificationResponse", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "getServiceOrderNotificationResponseDto")
    public GetServiceOrderNotificationResponse getServiceOrderNotification(
        @WebParam(name = "getServiceOrderNotificationRequest", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "getServiceOrderNotificationRequestDto")
        GetServiceOrderNotificationRequest getServiceOrderNotificationRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param updateNotificationRequest
     * @return
     *     returns au.com.singtel.group.updatenotificationservice.v1_0.updatenotificationservice.UpdateNotificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/updateNotification")
    @WebResult(name = "updateNotificationResponse", targetNamespace = "http://www.group.singtel.com.au/UpdateNotificationService/v1_0/UpdateNotificationService", partName = "updateNotificationResponse")
    public UpdateNotificationResponse updateNotification(
        @WebParam(name = "updateNotificationRequest", targetNamespace = "http://www.group.singtel.com.au/UpdateNotificationService/v1_0/UpdateNotificationService", partName = "updateNotificationRequest")
        UpdateNotificationRequest updateNotificationRequest)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param opomUpdateNBNNotifStatusRequest
     * @return
     *     returns au.com.singtel.group.opomservice.v1_0.opomservice.OpomUpdateNBNNotifStatusResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/opomUpdateNBNNotifStatus")
    @WebResult(name = "opomUpdateNBNNotifStatusResponse", targetNamespace = "http://www.group.singtel.com.au/OPOMService/v1_0/OPOMService", partName = "opomUpdateNBNNotifStatusResponse")
    public OpomUpdateNBNNotifStatusResponse opomUpdateNBNNotifStatus(
        @WebParam(name = "opomUpdateNBNNotifStatusRequest", targetNamespace = "http://www.group.singtel.com.au/OPOMService/v1_0/OPOMService", partName = "opomUpdateNBNNotifStatusRequest")
        OpomUpdateNBNNotifStatusRequest opomUpdateNBNNotifStatusRequest)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param getServiceProfileRequestDto
     * @return
     *     returns au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/getServiceProfile")
    @WebResult(name = "getServiceProfileResponse", targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceProfileService", partName = "getServiceProfileResponseDto")
    public GetServiceProfileResponse getServiceProfile(
        @WebParam(name = "getServiceProfileRequest", targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceProfileService", partName = "getServiceProfileRequestDto")
        GetServiceProfileRequest getServiceProfileRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param getServiceProfileNotificationRequestDto
     * @return
     *     returns au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileNotificationResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/getServiceProfileNotification")
    @WebResult(name = "getServiceProfileNotificationResponse", targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceProfileService", partName = "getServiceProfileNotificationResponseDto")
    public GetServiceProfileNotificationResponse getServiceProfileNotification(
        @WebParam(name = "getServiceProfileNotificationRequest", targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceProfileService", partName = "getServiceProfileNotificationRequestDto")
        GetServiceProfileNotificationRequest getServiceProfileNotificationRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param getServiceProfileByIdRequestDto
     * @return
     *     returns au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice.GetServiceProfileByIdResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/getServiceProfileById")
    @WebResult(name = "getServiceProfileByIdResponse", targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceProfileService", partName = "getServiceProfileByIdResponseDto")
    public GetServiceProfileByIdResponse getServiceProfileById(
        @WebParam(name = "getServiceProfileByIdRequest", targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceProfileService", partName = "getServiceProfileByIdRequestDto")
        GetServiceProfileByIdRequest getServiceProfileByIdRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param processServiceOrderRequestDto
     * @return
     *     returns au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.ProcessServiceOrderResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/processServiceOrder")
    @WebResult(name = "processServiceOrderResponse", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "processServiceOrderResponseDto")
    public ProcessServiceOrderResponse processServiceOrder(
        @WebParam(name = "processServiceOrderRequest", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "processServiceOrderRequestDto")
        ProcessServiceOrderRequest processServiceOrderRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param performServiceQualificationRequest
     * @return
     *     returns commonservices.group.singtel.com.au.v1_0.sossqservice.PerformServiceQualificationResponseDto
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/performServiceQualification")
    @WebResult(name = "performServiceQualificationResponse", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/SOSSQService", partName = "performServiceQualificationResponse")
    public PerformServiceQualificationResponseDto performServiceQualification(
        @WebParam(name = "performServiceQualificationRequest", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/SOSSQService", partName = "performServiceQualificationRequest")
        PerformServiceQualificationRequestDto performServiceQualificationRequest)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param sendSmsRequest
     * @return
     *     returns commonservices.group.singtel.com.au.v1_0.shortmessageservice.SendSmsResponseDto
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/sendSms")
    @WebResult(name = "sendSmsResponse", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/ShortMessageService", partName = "sendSmsResponse")
    public SendSmsResponseDto sendSms(
        @WebParam(name = "sendSmsRequest", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/ShortMessageService", partName = "sendSmsRequest")
        SendSmsRequestDto sendSmsRequest)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param receiveSmsRequest
     * @return
     *     returns commonservices.group.singtel.com.au.v1_0.shortmessageservice.ReceiveSmsResponseDto
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/receiveSms")
    @WebResult(name = "receiveSmsResponse", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/ShortMessageService", partName = "receiveSmsResponse")
    public ReceiveSmsResponseDto receiveSms(
        @WebParam(name = "receiveSmsRequest", targetNamespace = "http://au.com.singtel.group.commonservices/v1_0/ShortMessageService", partName = "receiveSmsRequest")
        ReceiveSmsRequestDto receiveSmsRequest)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param bookNearestAppointmentRequestDto
     * @return
     *     returns au.com.singtel.group.appointmentservice.v2_0.appointmentservice.BookNearestAppointmentResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/bookNearestAppointment")
    @WebResult(name = "bookNearestAppointmentResponse", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "bookNearestAppointmentResponseDto")
    public BookNearestAppointmentResponse bookNearestAppointment(
        @WebParam(name = "bookNearestAppointmentRequest", targetNamespace = "http://www.group.singtel.com.au/AppointmentService/v2_0/AppointmentService", partName = "bookNearestAppointmentRequestDto")
        BookNearestAppointmentRequest bookNearestAppointmentRequestDto)
        throws BusinessException, ServiceException
    ;

    /**
     * 
     * @param cancelServiceOrderRequestDto
     * @return
     *     returns au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.CancelServiceOrderResponse
     * @throws BusinessException
     * @throws ServiceException
     */
    @WebMethod(action = "http://www.optus.com.au/sdp/enabler/nbn/NBNManagerService/cancelServiceOrder")
    @WebResult(name = "cancelServiceOrderResponse", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "cancelServiceOrderResponseDto")
    public CancelServiceOrderResponse cancelServiceOrder(
        @WebParam(name = "cancelServiceOrderRequest", targetNamespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", partName = "cancelServiceOrderRequestDto")
        CancelServiceOrderRequest cancelServiceOrderRequestDto)
        throws BusinessException, ServiceException
    ;

}
