package au.com.singtel.group.sdp.appointment.service.ws.jws;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.AppointmentServiceEndpoint;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.BusinessException;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CancelAppointmentRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CancelAppointmentResponse;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CheckAvailableAppointmentNotificationRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CheckAvailableAppointmentNotificationResponse;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CheckAvailableAppointmentRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CheckAvailableAppointmentResponse;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CreateAppointmentNotificationRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CreateAppointmentNotificationResponse;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CreateAppointmentRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CreateAppointmentResponse;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.GetAppointmentByIdRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.GetAppointmentByIdResponse;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.GetAppointmentsByOrderRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.GetAppointmentsByOrderResponse;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.GetRequiredAppointmentTypeRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.GetRequiredAppointmentTypeResponse;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.ServiceException;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.UpdateAppointmentRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.UpdateAppointmentResponse;
import au.com.singtel.group.sdp.appointment.service.assembler.AppointmentServiceAssembler;
import au.com.singtel.group.sdp.appointment.service.dao.impl.AppointmentServiceDAOImpl;
import au.com.singtel.group.sdp.appointment.service.exception.AppointmentServiceException;
import au.com.singtel.group.sdp.appointment.service.facade.AppointmentServiceFacadeIF;
import au.com.singtel.group.sdp.appointment.service.model.CancelAppointmentRequestModel;
import au.com.singtel.group.sdp.appointment.service.model.CancelAppointmentResponseModel;
import au.com.singtel.group.sdp.appointment.service.model.CheckAvailableAppointmentNotificationRequestModel;
import au.com.singtel.group.sdp.appointment.service.model.CheckAvailableAppointmentNotificationResponseModel;
import au.com.singtel.group.sdp.appointment.service.model.CheckAvailableAppointmentRequestModel;
import au.com.singtel.group.sdp.appointment.service.model.CheckAvailableAppointmentResponseModel;
import au.com.singtel.group.sdp.appointment.service.model.CreateAppointmentNotificationRequestModel;
import au.com.singtel.group.sdp.appointment.service.model.CreateAppointmentNotificationResponseModel;
import au.com.singtel.group.sdp.appointment.service.model.CreateAppointmentRequestModel;
import au.com.singtel.group.sdp.appointment.service.model.CreateAppointmentResponseModel;
import au.com.singtel.group.sdp.appointment.service.model.GetAppointmentByIdRequestModel;
import au.com.singtel.group.sdp.appointment.service.model.GetAppointmentByIdResponseModel;
import au.com.singtel.group.sdp.appointment.service.model.GetAppointmentsByOrderRequestModel;
import au.com.singtel.group.sdp.appointment.service.model.GetAppointmentsByOrderResponseModel;
import au.com.singtel.group.sdp.appointment.service.model.GetRequiredAppointmentTypeRequestModel;
import au.com.singtel.group.sdp.appointment.service.model.GetRequiredAppointmentTypeResponseModel;
import au.com.singtel.group.sdp.appointment.service.model.UpdateAppointmentRequestModel;
import au.com.singtel.group.sdp.appointment.service.model.UpdateAppointmentResponseModel;
import au.com.singtel.group.sdp.appointment.service.validator.AppointmentServiceValidator;

@WebService(portName = "AppointmentServiceEndpointPort", serviceName = "AppointmentServiceEndpointService", targetNamespace = "http://www.group.singtel.com.au/ops/osr/rmo/manageworkforce/v4_0_0/AppointmentService", endpointInterface = "au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.AppointmentServiceEndpoint")
@BindingType("http://schemas.xmlsoap.org/wsdl/soap/http")
public class JwsAppointmentService extends AbstractSpringAutowireSupportService  implements AppointmentServiceEndpoint{

    /** Internal logger object. **/
    private static final Logger logger = LoggerFactory.getLogger(JwsAppointmentService.class);
    
    @Autowired
    @Qualifier(AppointmentServiceFacadeIF.FACADE_ID)
    private AppointmentServiceFacadeIF appointmentServiceFacade;
    
    /**
     * @author ms00365975
     * @param CreateAppointmentRequest
     * @return CreateAppointmentResponse
     */
    @Override
	public CreateAppointmentResponse createAppointment(
			CreateAppointmentRequest createAppointment)
			throws BusinessException, ServiceException {
		
		CreateAppointmentResponse outgoingResponse = null;
		try {
			
			// Validate the request
			AppointmentServiceValidator.validateCreateAppointmentRequest(createAppointment);

			// Call the Assembler to convert incoming request to outgoing request
			CreateAppointmentRequestModel outgoingRequest = 
					AppointmentServiceAssembler.convertCreateAppointmentRequest(
							createAppointment);
			
			// Call Facade and get Response
			CreateAppointmentResponseModel incomingResponse = 
					appointmentServiceFacade.createAppointment(outgoingRequest);
			
			// Call the Assembler to convert incoming response to outgoing response
			outgoingResponse = AppointmentServiceAssembler.convertCreateAppointmentResponse(incomingResponse);
			
			
		} catch (AppointmentServiceException e) {
			e.printStackTrace();
		}
		
		
	return outgoingResponse;
	}

	@Override
	public UpdateAppointmentResponse updateAppointment(
			UpdateAppointmentRequest updateAppointment)
			throws BusinessException, ServiceException {
		
		// TODO Auto-generated method stub
		UpdateAppointmentResponse outgoingResponse = null;
		try {
			
			// Validate the request
		//	AppointmentServiceValidator.validateUpdateAppointmentRequest(updateAppointment);

			// Call the Assembler to convert incoming request to outgoing request
			UpdateAppointmentRequestModel outgoingRequest = 
					AppointmentServiceAssembler.convertUpdateAppointmentRequest(updateAppointment);
			
			// Call Facade and get Response
			UpdateAppointmentResponseModel incomingResponse = 
					appointmentServiceFacade.updateAppointment(outgoingRequest);
			
			// Call the Assembler to convert incoming response to outgoing response
			outgoingResponse = AppointmentServiceAssembler.convertUpdateAppointmentResponse(incomingResponse);
			
			
		} catch (AppointmentServiceException e) {
			e.printStackTrace();
		}
		
		return outgoingResponse;
	}

	@Override
	public CancelAppointmentResponse cancelAppointment(
			CancelAppointmentRequest cancelAppointment)
			throws BusinessException, ServiceException {
		// TODO Auto-generated method stub
		CancelAppointmentResponse outgoingResponse = null;
		try {
			
			// Validate the request
			AppointmentServiceValidator.validateCancelAppointmentRequest(cancelAppointment);

			// Call the Assembler to convert incoming request to outgoing request
			CancelAppointmentRequestModel outgoingRequest = 
					AppointmentServiceAssembler.convertCancelAppointmentRequest(
							cancelAppointment);
			
			// Call Facade and get Response
			CancelAppointmentResponseModel incomingResponse = 
					appointmentServiceFacade.cancelAppointment(outgoingRequest);
			
			// Call the Assembler to convert incoming response to outgoing response
			outgoingResponse = AppointmentServiceAssembler.convertCancelAppointmentResponse(incomingResponse);
			
			
		} catch (AppointmentServiceException e) {
			e.printStackTrace();
		}
		return outgoingResponse;
	}

	@Override
	public GetAppointmentsByOrderResponse getAppointmentsByOrder(
			GetAppointmentsByOrderRequest getAppointmentsByOrder)
			throws BusinessException, ServiceException {
		// TODO Auto-generated method stub
		GetAppointmentsByOrderResponse outgoingResponse = null;
		try {
			
			// Validate the request
			AppointmentServiceValidator.validateGetAppointmentsByOrderRequest(
					getAppointmentsByOrder);

			// Call the Assembler to convert incoming request to outgoing request
			GetAppointmentsByOrderRequestModel outgoingRequest = 
					AppointmentServiceAssembler.convertGetAppointmentsByOrderRequest(
							getAppointmentsByOrder);
			
			// Call Facade and get Response
			GetAppointmentsByOrderResponseModel incomingResponse = 
					appointmentServiceFacade.getAppointmentsByOrder(outgoingRequest);
			
			// Call the Assembler to convert incoming response to outgoing response
			outgoingResponse = AppointmentServiceAssembler.convertGetAppointmentsByOrderResponse(incomingResponse);
			
			
		} catch (AppointmentServiceException e) {
			e.printStackTrace();
		}
		return outgoingResponse;
	}

	@Override
	public GetAppointmentByIdResponse getAppointmentById(
			GetAppointmentByIdRequest getAppointmentById)
			throws BusinessException, ServiceException {
		// TODO Auto-generated method stub
		GetAppointmentByIdResponse outgoingResponse = null;
		try {
			
			// Validate the request
			AppointmentServiceValidator.validateGetAppointmentByIdRequest(getAppointmentById);

			// Call the Assembler to convert incoming request to outgoing request
			GetAppointmentByIdRequestModel outgoingRequest = 
					AppointmentServiceAssembler.convertGetAppointmentByIdRequest(getAppointmentById);
			
			// Call Facade and get Response
			GetAppointmentByIdResponseModel incomingResponse = 
					appointmentServiceFacade.getAppointmentById(outgoingRequest);
			
			// Call the Assembler to convert incoming response to outgoing response
			outgoingResponse = AppointmentServiceAssembler.convertGetAppointmentByIdResponse(incomingResponse);
			
			
		} catch (AppointmentServiceException e) {
			e.printStackTrace();
		}
		return outgoingResponse;
	}

	@Override
	public CheckAvailableAppointmentResponse checkAvailableAppointment(
			CheckAvailableAppointmentRequest checkAvailableAppointment)
			throws BusinessException, ServiceException {
		// TODO Auto-generated method stub
		CheckAvailableAppointmentResponse outgoingResponse = null;
		try {
			
			// Validate the request
//			AppointmentServiceValidator.validateCheckAvailableAppointmentRequest(
//					checkAvailableAppointment);

			// Call the Assembler to convert incoming request to outgoing request
			CheckAvailableAppointmentRequestModel outgoingRequest = 
					AppointmentServiceAssembler.convertCheckAvailableAppointmentRequest(
							checkAvailableAppointment);
			
			// Call Facade and get Response
			CheckAvailableAppointmentResponseModel incomingResponse = 
					appointmentServiceFacade.checkAvailableAppointment(outgoingRequest);
			
			// Call the Assembler to convert incoming response to outgoing response
			outgoingResponse = AppointmentServiceAssembler.convertCheckAvailableAppointmentResponse(incomingResponse);
			
			
		} catch (AppointmentServiceException e) {
			e.printStackTrace();
		}
		return outgoingResponse;
	}

	@Override
	public GetRequiredAppointmentTypeResponse getRequiredAppointmentType(
			GetRequiredAppointmentTypeRequest getRequiredAppointmentType)
			throws BusinessException, ServiceException {
		// TODO Auto-generated method stub
		GetRequiredAppointmentTypeResponse outgoingResponse = null;
		try {
			
			// Validate the request
			AppointmentServiceValidator.validateGetRequiredAppointmentTypeRequest(
					getRequiredAppointmentType);

			// Call the Assembler to convert incoming request to outgoing request
			GetRequiredAppointmentTypeRequestModel outgoingRequest = 
					AppointmentServiceAssembler.convertGetRequiredAppointmentTypeRequest(
							getRequiredAppointmentType);
			
			// Call Facade and get Response
			GetRequiredAppointmentTypeResponseModel incomingResponse = 
					appointmentServiceFacade.getRequiredAppointmentType(outgoingRequest);
			
			// Call the Assembler to convert incoming response to outgoing response
			outgoingResponse = AppointmentServiceAssembler.convertGetRequiredAppointmentTypeResponse(incomingResponse);
			
			
		} catch (AppointmentServiceException e) {
			e.printStackTrace();
		}
		return outgoingResponse;
	}

	@Override
	public CheckAvailableAppointmentNotificationResponse checkAvailableAppointmentNotification(
			CheckAvailableAppointmentNotificationRequest checkAvailableAppointmentNotification)
			throws BusinessException, ServiceException {
		
		CheckAvailableAppointmentNotificationResponse outgoingResponse = null;
		try {
			
			// Validate the request
			AppointmentServiceValidator.validateCheckAvailableAppointmentNotificationRequest(
					checkAvailableAppointmentNotification);

			// Call the Assembler to convert incoming request to outgoing request
			CheckAvailableAppointmentNotificationRequestModel outgoingRequest = 
					AppointmentServiceAssembler.convertCheckAvailableAppointmentNotificationRequest(
							checkAvailableAppointmentNotification);
			
			// Call Facade and get Response
			CheckAvailableAppointmentNotificationResponseModel incomingResponse = 
					appointmentServiceFacade.checkAvailableAppointmentNotification(outgoingRequest);
			
			// Call the Assembler to convert incoming response to outgoing response
			outgoingResponse = AppointmentServiceAssembler.convertCheckAvailableAppointmentNotificationResponse(incomingResponse);
			
			
		} catch (AppointmentServiceException e) {
			e.printStackTrace();
		}
		return outgoingResponse;
	}

	@Override
	public CreateAppointmentNotificationResponse createAppointmentNotification(
			CreateAppointmentNotificationRequest createAppointmentNotification)
			throws BusinessException, ServiceException {
 
		CreateAppointmentNotificationResponse outgoingResponse = null;
		try {
			
			// Validate the request
			AppointmentServiceValidator.validateCreateAppointmentNotificationRequest(
					createAppointmentNotification);

			// Call the Assembler to convert incoming request to outgoing request
			CreateAppointmentNotificationRequestModel outgoingRequest = 
					AppointmentServiceAssembler.convertCreateAppointmentNotificationRequest(
							createAppointmentNotification);
			
			// Call Facade and get Response
			CreateAppointmentNotificationResponseModel incomingResponse = 
					appointmentServiceFacade.createAppointmentNotification(outgoingRequest);
			
			// Call the Assembler to convert incoming response to outgoing response
			outgoingResponse = AppointmentServiceAssembler.convertCreateAppointmentNotificationResponse(incomingResponse);
			
			
		} catch (AppointmentServiceException e) {
			e.printStackTrace();
		}
		return outgoingResponse;
	}
	
	

}
