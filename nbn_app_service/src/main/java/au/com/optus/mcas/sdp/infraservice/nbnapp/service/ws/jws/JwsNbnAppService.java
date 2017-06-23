/**
 * FileName      : $Id: JwsNbnAppService.java $
 *
 * Copyright Notice: ©2004 Singapore Telecom Pte Ltd -- Confidential and Proprietary
 *
 * All rights reserved.
 * This software is the confidential and proprietary information of SingTel Pte Ltd
 * ("Confidential Information"). You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license agreement you
 * entered into with SingTel.
 */
package au.com.optus.mcas.sdp.infraservice.nbnapp.service.ws.jws;

import au.com.nbnco.cim.manageservicelimiter.v4.ManageServiceLimiterNotificationRequest;
import au.com.nbnco.cim.manageservicelimiter.v4.ManageServiceLimiterNotificationResponse;
import au.com.optus.mcas.sdp.infraservice.nbnapp.service.assembler.NbnAppAssembler;
import au.com.optus.mcas.sdp.nbnapp.application.facade.NbnApp;
import au.com.optus.mcas.sdp.nbnapp.model.CheckAvailableAppointmentNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CheckAvailableAppointmentNotificationResponseModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateAppointmentNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateAppointmentNotificationResponseModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateServiceOrderNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateServiceOrderNotificationResponseModel;
import au.com.optus.sdp.enabler.nbn.nbnmanagerservice.BusinessException;
import au.com.optus.sdp.enabler.nbn.nbnmanagerservice.NBNManagerService;
import au.com.optus.sdp.enabler.nbn.nbnmanagerservice.ServiceException;
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
import au.com.singtel.group.cdm.v2_0_0.resource.Resource;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

/**
 * @author optus
 *
 */
@WebService(portName = "NBNManagerServicePort", serviceName = "NBNManagerService", 
targetNamespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", 
endpointInterface = "au.com.optus.sdp.enabler.nbn.nbnmanagerservice.NBNManagerService")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
public class JwsNbnAppService extends AbstractSpringAutowireSupportService implements NBNManagerService {

    protected static final Logger LOG = LoggerFactory.getLogger(JwsNbnAppService.class);

    @Autowired
    @Qualifier(NbnApp.FACADE_ID)
    private NbnApp facade;

    //Method1
    @Override
    public CreateServiceOrderNotificationResponse createServiceOrderNotification(
        CreateServiceOrderNotificationRequest createServiceOrderNotificationRequestDto)
        throws au.com.optus.sdp.enabler.nbn.nbnmanagerservice.BusinessException,
        au.com.optus.sdp.enabler.nbn.nbnmanagerservice.ServiceException {

        LOG.info("==========START of createServiceOrderNotification==========");

        CreateServiceOrderNotificationResponse createServiceOrderNotificationResponse = null;
        
        
        
         CreateServiceOrderNotificationRequestModel convertcreateServiceDTOtoModel =
           NbnAppAssembler.convertcreateServiceOrderNotificationRequestDTOtoModel(createServiceOrderNotificationRequestDto);
         

         CreateServiceOrderNotificationResponseModel createServiceOrderNotificationResponseModel = null;

        try {
            //validate(createServiceOrder) TODO
            createServiceOrderNotificationResponseModel = facade.createServiceOrderNotification(convertcreateServiceDTOtoModel);
        } catch (Exception e) {

            LOG.error("Exceptin caught when creating the Service Order", e);
            //super.raiseSOAPFaultException(new OietsServiceException(ose.getCode(), ose.getMessage()));
        }

        createServiceOrderNotificationResponse = NbnAppAssembler.convertcreateServiceOrderNotificationToDTO(createServiceOrderNotificationResponseModel);

        LOG.info("==========END of createServiceOrderNotification==========");

        return createServiceOrderNotificationResponse;
    }

    //Method2
    @Override
    public CreateAppointmentNotificationResponse createAppointmentNotification(
        CreateAppointmentNotificationRequest createAppointmentNotificationRequestDto)
        throws au.com.optus.sdp.enabler.nbn.nbnmanagerservice.BusinessException,
        au.com.optus.sdp.enabler.nbn.nbnmanagerservice.ServiceException {
        LOG.info("==========START of createAppointmentNotification==========");

        CreateAppointmentNotificationResponse createAppointmentNotificationResponse = null;

        CreateAppointmentNotificationRequestModel createAppointmentNotificationRequestModel=
            NbnAppAssembler.convertcreateAppointmentNotificationRequestDtoToModel(createAppointmentNotificationRequestDto);

        CreateAppointmentNotificationResponseModel createAppointmentNotificationResponseModel = null;

        try {
            //validate(createServiceOrder) TODO
            createAppointmentNotificationResponseModel = facade.createAppointmentNotification(createAppointmentNotificationRequestModel);
        } catch (Exception e) {

            LOG.error("Exceptin caught when creating the Service Order", e);
            //super.raiseSOAPFaultException(new OietsServiceException(ose.getCode(), ose.getMessage()));
        }

        createAppointmentNotificationResponse =
            NbnAppAssembler.convertCreateAppointmentNotificationResponseModelToDTO(createAppointmentNotificationResponseModel);


        LOG.info("==========END of createAppointmentNotification==========");
        return createAppointmentNotificationResponse;
    }

    //Method3
    @Override
    public CheckAvailableAppointmentNotificationResponse checkAvailableAppointmentNotification(
        CheckAvailableAppointmentNotificationRequest checkAvailableAppointmentNotificationRequestDto)
        throws au.com.optus.sdp.enabler.nbn.nbnmanagerservice.BusinessException,
        au.com.optus.sdp.enabler.nbn.nbnmanagerservice.ServiceException {
        LOG.info("==========START of checkAvailableAppointmentNotification==========");

        CheckAvailableAppointmentNotificationResponse checkAvailableAppointmentNotificationResponse = null;

        CheckAvailableAppointmentNotificationRequestModel  checkAvailableAppointmentNotificationRequestModel =
            NbnAppAssembler.convertCheckAvailableAppointmentNotificationRequestDtoToModel(checkAvailableAppointmentNotificationRequestDto);

        CheckAvailableAppointmentNotificationResponseModel checkAvailableAppointmentNotificationResponseModel= null;
        
        try {
            //validate(createServiceOrder) TODO
            checkAvailableAppointmentNotificationResponseModel = facade.checkAvailableAppointmentNotification(checkAvailableAppointmentNotificationRequestModel);
        } catch (Exception e) {

            LOG.error("Exceptin caught when creating the Service Order", e);
            //super.raiseSOAPFaultException(new OietsServiceException(ose.getCode(), ose.getMessage()));
        }

        
        checkAvailableAppointmentNotificationResponse = 
            NbnAppAssembler.convertCheckAvailableAppointmentNotificationResponseModelToDTO(checkAvailableAppointmentNotificationResponseModel);


        LOG.info("==========END of checkAvailableAppointmentNotification==========");
        return checkAvailableAppointmentNotificationResponse;
    }

    @Override
    public QueryServiceQualificationResponse queryServiceQualification(
        QueryServiceQualificationRequest queryServiceQualificationRequestDto) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public QueryServiceQualificationNotificationResponse queryServiceQualificationNotification(
        QueryServiceQualificationNotificationRequest queryServiceQualificationNotificationRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public QueryServiceQualificationByIdResponse queryServiceQualificationById(
        QueryServiceQualificationByIdRequest queryServiceQualificationByIdRequestDto) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public QueryAddressResponse queryAddress(QueryAddressRequest queryAddressRequestDto) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public QueryAddressNotificationResponse queryAddressNotification(
        QueryAddressNotificationRequest queryAddressNotificationRequestDto) throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public QueryAddressByIdResponse queryAddressById(QueryAddressByIdRequest queryAddressByIdRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CreateServiceOrderResponse createServiceOrder(CreateServiceOrderRequest createServiceOrderRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetServiceOrderByIdResponse getServiceOrderById(GetServiceOrderByIdRequest getServiceOrderByIdRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CreateAppointmentResponse createAppointment(CreateAppointmentRequest createAppointmentRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CancelAppointmentResponse cancelAppointment(CancelAppointmentRequest cancelAppointmentRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CancelAppointmentNotificationResponse cancelAppointmentNotification(
        CancelAppointmentNotificationRequest cancelAppointmentNotificationRequestDto) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CheckAvailableAppointmentResponse checkAvailableAppointment(
        CheckAvailableAppointmentRequest checkAvailableAppointmentRequestDto) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetAppointmentByIdResponse getAppointmentById(GetAppointmentByIdRequest getAppointmentByIdRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetAppointmentResponse getAppointment(GetAppointmentRequest getAppointmentRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetAppointmentNotificationResponse getAppointmentNotification(
        GetAppointmentNotificationRequest getAppointmentNotificationRequestDto) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NsiReserveCTAGForCSAResponse nsiReserveCTAGForCSA(NsiReserveCTAGForCSARequest nsiReserveCTAGForCSARequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NsiReturnReservedCTAGResponse nsiReturnReservedCTAG(
        NsiReturnReservedCTAGRequest nsiReturnReservedCTAGRequestDto) throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SaveAVCResponse saveAVC(SaveAVCRequest saveAVCRequestDto) throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetSpeedDetailsResponse getSpeedDetails(GetSpeedDetailsRequest getSpeedDetailsRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NsiBatchCheckCVCAvailableForCSAResponse nsiBatchCheckCVCAvailableForCSA(
        NsiBatchCheckCVCAvailableForCSARequest nsiBatchCheckCVCAvailableForCSARequestDto) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ManageServiceLimiterNotificationResponse manageServiceLimiterNotification(
        ManageServiceLimiterNotificationRequest manageServiceLimiterNotificationRequest) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UpdateTransactionStatusResponse updateTransactionStatus(
        UpdateTransactionStatusRequest updateTransactionStatusRequest) throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public HandleFaultNotificationResponse handleFaultNotificationService(
        HandleFaultNotificationRequest handleFaultNotificationRequest) throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IlpmRetrieveBillingPackageIdResponse retrieveBillingPackageService(
        IlpmRetrieveBillingPackageIdRequest ilpmRetrieveBillingPackageIdRequest) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetNsiCvcCtagAvcByGsidResponse nsiGetCvcCtagAvcByGsid(
        GetNsiCvcCtagAvcByGsidRequest nsiGetCvcCtagAvcByGsidRequest) throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetServiceOrderResponse getServiceOrder(GetServiceOrderRequest getServiceOrderRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetServiceOrderNotificationResponse getServiceOrderNotification(
        GetServiceOrderNotificationRequest getServiceOrderNotificationRequestDto) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UpdateNotificationResponse updateNotification(UpdateNotificationRequest updateNotificationRequest)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public OpomUpdateNBNNotifStatusResponse opomUpdateNBNNotifStatus(
        OpomUpdateNBNNotifStatusRequest opomUpdateNBNNotifStatusRequest) throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetServiceProfileResponse getServiceProfile(GetServiceProfileRequest getServiceProfileRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetServiceProfileNotificationResponse getServiceProfileNotification(
        GetServiceProfileNotificationRequest getServiceProfileNotificationRequestDto) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public GetServiceProfileByIdResponse getServiceProfileById(
        GetServiceProfileByIdRequest getServiceProfileByIdRequestDto) throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ProcessServiceOrderResponse processServiceOrder(ProcessServiceOrderRequest processServiceOrderRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PerformServiceQualificationResponseDto performServiceQualification(
        PerformServiceQualificationRequestDto performServiceQualificationRequest) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SendSmsResponseDto sendSms(SendSmsRequestDto sendSmsRequest) throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ReceiveSmsResponseDto receiveSms(ReceiveSmsRequestDto receiveSmsRequest) throws BusinessException,
        ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BookNearestAppointmentResponse bookNearestAppointment(
        BookNearestAppointmentRequest bookNearestAppointmentRequestDto) throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CancelServiceOrderResponse cancelServiceOrder(CancelServiceOrderRequest cancelServiceOrderRequestDto)
        throws BusinessException, ServiceException {
        // TODO Auto-generated method stub
        return null;
    }

}
