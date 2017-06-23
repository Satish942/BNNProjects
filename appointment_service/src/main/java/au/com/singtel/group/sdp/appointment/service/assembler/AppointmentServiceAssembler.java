package au.com.singtel.group.sdp.appointment.service.assembler;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.UpdateAppointmentRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.UpdateAppointmentResponse;
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

public final class AppointmentServiceAssembler {
	
	private static final Logger logger = LoggerFactory.getLogger(AppointmentServiceAssembler.class);
	
	private static final Mapper BEAN_MAPPER = DozerBeanMapperSingletonWrapper.getInstance();
    
	/**
	 * Convert incomingRequest from App Service / External System into outgoingRequest to be passed to biz
	 * service to invoke Webservice call or to perform Business operation 
	 * @param incomingRequest
	 * @return CreateAppointmentRequestModel
	 */
    public static CreateAppointmentRequestModel convertCreateAppointmentRequest(
    		CreateAppointmentRequest  incomingRequest) {
    	
    	logger.info("convertCreateAppointmentRequest called!");
    	logger.info("***incomingRequest***");
    	
    	CreateAppointmentRequestModel outgoingRequest = BEAN_MAPPER.map(
    			incomingRequest, CreateAppointmentRequestModel.class);
    	
    	logger.info("***outgoingRequest generated***");
    	logger.info("convertCreateAppointmentRequest ended!");
    	
    return outgoingRequest;
    		
    }
    
    /**
     * Convert incoming response from biz service to outgoing response to App Service / External System
     * @param incomingResponse
     * @return CreateAppointmentResponse
     */

    public static CreateAppointmentResponse convertCreateAppointmentResponse(
    		CreateAppointmentResponseModel  incomingResponse) {
 
    	logger.info("convertCreateAppointmentResponse called!");
    	logger.info("***incomingResponse***");
    	
    	CreateAppointmentResponse outgoingResponse = BEAN_MAPPER.map(
    			incomingResponse, CreateAppointmentResponse.class);
    	
    	logger.info("***outgoingResponse generated***");
    	logger.info("convertCreateAppointmentResponse ended!");
    	
    return outgoingResponse;
    		
    }
    
	/**
	 * Convert incomingRequest from App Service / External System into outgoingRequest to be passed to biz
	 * service to invoke Webservice call or to perform Business operation 
	 * @param incomingRequest
	 * @return UpdateAppointmentRequestModel
	 */
    public static UpdateAppointmentRequestModel convertUpdateAppointmentRequest(
    		UpdateAppointmentRequest  incomingRequest) {
    	
    	logger.info("convertUpdateAppointmentRequest called!");
    	logger.info("***incomingRequest***");
    	
    	UpdateAppointmentRequestModel outgoingRequest = BEAN_MAPPER.map(
    			incomingRequest, UpdateAppointmentRequestModel.class);
    	
    	logger.info("***outgoingRequest generated***");
    	logger.info("convertUpdateAppointmentRequest ended!");
    	
    return outgoingRequest;
    		
    }
    
    /**
     * Convert incoming response from biz service to outgoing response to App Service / External System
     * @param incomingResponse
     * @return UpdateAppointmentResponse
     */

    public static UpdateAppointmentResponse convertUpdateAppointmentResponse(
    		UpdateAppointmentResponseModel  incomingResponse) {
 
    	logger.info("convertCreateAppointmentResponse called!");
    	logger.info("***incomingResponse***");
    	
    	UpdateAppointmentResponse outgoingResponse = BEAN_MAPPER.map(
    			incomingResponse, UpdateAppointmentResponse.class);
    	
    	logger.info("***outgoingResponse generated***");
    	logger.info("convertUpdateAppointmentResponse ended!");
    	
    return outgoingResponse;
    		
    }
    
	/**
	 * Convert incomingRequest from App Service / External System into outgoingRequest to be passed to biz
	 * service to invoke Webservice call or to perform Business operation 
	 * @param incomingRequest
	 * @return CancelAppointmentRequestModel
	 */
    public static CancelAppointmentRequestModel convertCancelAppointmentRequest(
    		CancelAppointmentRequest  incomingRequest) {
    	
    	logger.info("convertCancelAppointmentRequest called!");
    	logger.info("***incomingRequest***");
    	
    	CancelAppointmentRequestModel outgoingRequest = BEAN_MAPPER.map(
    			incomingRequest, CancelAppointmentRequestModel.class);
    	
    	logger.info("***outgoingRequest generated***");
    	logger.info("convertCancelAppointmentRequest ended!");
    	
    return outgoingRequest;
    		
    }
    
    /**
     * Convert incoming response from biz service to outgoing response to App Service / External System
     * @param incomingResponse
     * @return CancelAppointmentResponse
     */

    public static CancelAppointmentResponse convertCancelAppointmentResponse(
    		CancelAppointmentResponseModel  incomingResponse) {
 
    	logger.info("convertCancelAppointmentResponse called!");
    	logger.info("***incomingResponse***");
    	
    	CancelAppointmentResponse outgoingResponse = BEAN_MAPPER.map(
    			incomingResponse, CancelAppointmentResponse.class);
    	
    	logger.info("***outgoingResponse generated***");
    	logger.info("convertCancelAppointmentResponse ended!");
    	
    return outgoingResponse;
    		
    }

	/**
	 * Convert incomingRequest from App Service / External System into outgoingRequest to be passed to biz
	 * service to invoke Webservice call or to perform Business operation 
	 * @param incomingRequest
	 * @return GetAppointmentsByOrderRequestModel
	 */
    public static GetAppointmentsByOrderRequestModel convertGetAppointmentsByOrderRequest(
    		GetAppointmentsByOrderRequest  incomingRequest) {
    	
    	logger.info("convertGetAppointmentsByOrderRequest called!");
    	logger.info("***incomingRequest***");
    	
    	GetAppointmentsByOrderRequestModel outgoingRequest = BEAN_MAPPER.map(
    			incomingRequest, GetAppointmentsByOrderRequestModel.class);
    	
    	logger.info("***outgoingRequest generated***");
    	logger.info("convertGetAppointmentsByOrderRequest ended!");
    	
    return outgoingRequest;
    		
    }
    
    /**
     * Convert incoming response from biz service to outgoing response to App Service / External System
     * @param incomingResponse
     * @return GetAppointmentsByOrderResponse
     */

    public static GetAppointmentsByOrderResponse convertGetAppointmentsByOrderResponse(
    		GetAppointmentsByOrderResponseModel  incomingResponse) {
 
    	logger.info("convertGetAppointmentsByOrderResponse called!");
    	logger.info("***incomingResponse***");
    	
    	GetAppointmentsByOrderResponse outgoingResponse = BEAN_MAPPER.map(
    			incomingResponse, GetAppointmentsByOrderResponse.class);
    	
    	logger.info("***outgoingResponse generated***");
    	logger.info("convertGetAppointmentsByOrderResponse ended!");
    	
    return outgoingResponse;
    		
    }
    
	/**
	 * Convert incomingRequest from App Service / External System into outgoingRequest to be passed to biz
	 * service to invoke Webservice call or to perform Business operation 
	 * @param incomingRequest
	 * @return GetAppointmentByIdRequestModel
	 */
    public static GetAppointmentByIdRequestModel convertGetAppointmentByIdRequest(
    		GetAppointmentByIdRequest  incomingRequest) {
    	
    	logger.info("convertGetAppointmentByIdRequest called!");
    	logger.info("***incomingRequest***");
    	
    	GetAppointmentByIdRequestModel outgoingRequest = BEAN_MAPPER.map(
    			incomingRequest, GetAppointmentByIdRequestModel.class);
    	
    	logger.info("***outgoingRequest generated***");
    	logger.info("convertGetAppointmentByIdRequest ended!");
    	
    return outgoingRequest;
    		
    }
    
    /**
     * Convert incoming response from biz service to outgoing response to App Service / External System
     * @param incomingResponse
     * @return GetAppointmentByIdResponse
     */

    public static GetAppointmentByIdResponse convertGetAppointmentByIdResponse(
    		GetAppointmentByIdResponseModel  incomingResponse) {
 
    	logger.info("convertGetAppointmentByIdResponse called!");
    	logger.info("***incomingResponse***");
    	
    	GetAppointmentByIdResponse outgoingResponse = BEAN_MAPPER.map(
    			incomingResponse, GetAppointmentByIdResponse.class);
    	
    	logger.info("***outgoingResponse generated***");
    	logger.info("convertGetAppointmentByIdResponse ended!");
    	
    return outgoingResponse;
    		
    }

	/**
	 * Convert incomingRequest from App Service / External System into outgoingRequest to be passed to biz
	 * service to invoke Webservice call or to perform Business operation 
	 * @param incomingRequest
	 * @return GetAppointmentByIdRequestModel
	 */
    public static CheckAvailableAppointmentRequestModel convertCheckAvailableAppointmentRequest(
    		CheckAvailableAppointmentRequest  incomingRequest) {
    	
    	logger.info("convertCheckAvailableAppointmentRequest called!");
    	logger.info("***incomingRequest***");
    	
    	CheckAvailableAppointmentRequestModel outgoingRequest = BEAN_MAPPER.map(
    			incomingRequest, CheckAvailableAppointmentRequestModel.class);
    	
    	logger.info("***outgoingRequest generated***");
    	logger.info("convertCheckAvailableAppointmentRequest ended!");
    	
    return outgoingRequest;
    		
    }
    
    /**
     * Convert incoming response from biz service to outgoing response to App Service / External System
     * @param incomingResponse
     * @return CheckAvailableAppointmentResponse
     */

    public static CheckAvailableAppointmentResponse convertCheckAvailableAppointmentResponse(
    		CheckAvailableAppointmentResponseModel  incomingResponse) {
 
    	logger.info("convertCheckAvailableAppointmentResponse called!");
    	logger.info("***incomingResponse***");
    	
    	CheckAvailableAppointmentResponse outgoingResponse = BEAN_MAPPER.map(
    			incomingResponse, CheckAvailableAppointmentResponse.class);
    	
    	logger.info("***outgoingResponse generated***");
    	logger.info("convertCheckAvailableAppointmentResponse ended!");
    	
    return outgoingResponse;
    		
    }    

	/**
	 * Convert incomingRequest from App Service / External System into outgoingRequest to be passed to biz
	 * service to invoke Webservice call or to perform Business operation 
	 * @param incomingRequest
	 * @return GetRequiredAppointmentTypeRequestModel
	 */
    public static GetRequiredAppointmentTypeRequestModel convertGetRequiredAppointmentTypeRequest(
    		GetRequiredAppointmentTypeRequest  incomingRequest) {
    	
    	logger.info("convertGetRequiredAppointmentTypeRequest called!");
    	logger.info("***incomingRequest***");
    	
    	GetRequiredAppointmentTypeRequestModel outgoingRequest = BEAN_MAPPER.map(
    			incomingRequest, GetRequiredAppointmentTypeRequestModel.class);
    	
    	logger.info("***outgoingRequest generated***");
    	logger.info("convertGetRequiredAppointmentTypeRequest ended!");
    	
    return outgoingRequest;
    		
    }
    
    /**
     * Convert incoming response from biz service to outgoing response to App Service / External System
     * @param incomingResponse
     * @return GetRequiredAppointmentTypeResponse
     */

    public static GetRequiredAppointmentTypeResponse convertGetRequiredAppointmentTypeResponse(
    		GetRequiredAppointmentTypeResponseModel  incomingResponse) {
 
    	logger.info("convertGetRequiredAppointmentTypeResponse called!");
    	logger.info("***incomingResponse***");
    	
    	GetRequiredAppointmentTypeResponse outgoingResponse = BEAN_MAPPER.map(
    			incomingResponse, GetRequiredAppointmentTypeResponse.class);
    	
    	logger.info("***outgoingResponse generated***");
    	logger.info("convertGetRequiredAppointmentTypeResponse ended!");
    	
    return outgoingResponse;
    		
    }   
    
	/**
	 * Convert incomingRequest from App Service / External System into outgoingRequest to be passed to biz
	 * service to invoke Webservice call or to perform Business operation 
	 * @param incomingRequest
	 * @return CheckAvailableAppointmentNotificationRequestModel
	 */
    public static CheckAvailableAppointmentNotificationRequestModel convertCheckAvailableAppointmentNotificationRequest(
    		CheckAvailableAppointmentNotificationRequest  incomingRequest) {
    	
    	logger.info("convertCheckAvailableAppointmentNotificationRequest called!");
    	logger.info("***incomingRequest***");
    	
    	CheckAvailableAppointmentNotificationRequestModel outgoingRequest = BEAN_MAPPER.map(
    			incomingRequest, CheckAvailableAppointmentNotificationRequestModel.class);
    	
    	logger.info("***outgoingRequest generated***");
    	logger.info("convertCheckAvailableAppointmentNotificationRequest ended!");
    	
    return outgoingRequest;
    		
    }
    
    /**
     * Convert incoming response from biz service to outgoing response to App Service / External System
     * @param incomingResponse
     * @return CheckAvailableAppointmentNotificationResponse
     */

    public static CheckAvailableAppointmentNotificationResponse convertCheckAvailableAppointmentNotificationResponse(
    		CheckAvailableAppointmentNotificationResponseModel  incomingResponse) {
 
    	logger.info("convertCheckAvailableAppointmentNotificationResponse called!");
    	logger.info("***incomingResponse***");
    	
    	CheckAvailableAppointmentNotificationResponse outgoingResponse = BEAN_MAPPER.map(
    			incomingResponse, CheckAvailableAppointmentNotificationResponse.class);
    	
    	logger.info("***outgoingResponse generated***");
    	logger.info("convertCheckAvailableAppointmentNotificationResponse ended!");
    	
    return outgoingResponse;
    		
    }     

	/**
	 * Convert incomingRequest from App Service / External System into outgoingRequest to be passed to biz
	 * service to invoke Webservice call or to perform Business operation 
	 * @param incomingRequest
	 * @return CreateAppointmentNotificationRequestModel
	 */
    public static CreateAppointmentNotificationRequestModel convertCreateAppointmentNotificationRequest(
    		CreateAppointmentNotificationRequest  incomingRequest) {
    	
    	logger.info("convertCreateAppointmentNotificationRequest called!");
    	logger.info("***incomingRequest***");
    	
    	CreateAppointmentNotificationRequestModel outgoingRequest = BEAN_MAPPER.map(
    			incomingRequest, CreateAppointmentNotificationRequestModel.class);
    	
    	logger.info("***outgoingRequest generated***");
    	logger.info("convertCreateAppointmentNotificationRequest ended!");
    	
    return outgoingRequest;
    		
    }
    
    /**
     * Convert incoming response from biz service to outgoing response to App Service / External System
     * @param incomingResponse
     * @return CreateAppointmentNotificationResponse
     */

    public static CreateAppointmentNotificationResponse convertCreateAppointmentNotificationResponse(
    		CreateAppointmentNotificationResponseModel  incomingResponse) {
 
    	logger.info("convertCreateAppointmentNotificationResponse called!");
    	logger.info("***incomingResponse***");
    	
    	CreateAppointmentNotificationResponse outgoingResponse = BEAN_MAPPER.map(
    			incomingResponse, CreateAppointmentNotificationResponse.class);
    	
    	logger.info("***outgoingResponse generated***");
    	logger.info("convertCreateAppointmentNotificationResponse ended!");
    	
    return outgoingResponse;
    		
    }
    
}
