package au.com.singtel.group.sdp.appointment.service.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang.StringUtils;

import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CancelAppointmentRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CheckAvailableAppointmentNotificationRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CheckAvailableAppointmentRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CreateAppointmentNotificationRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CreateAppointmentRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.GetAppointmentByIdRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.GetAppointmentsByOrderRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.GetRequiredAppointmentTypeRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.UpdateAppointmentRequest;
import au.com.singtel.group.sdp.appointment.service.constants.AppointmentServiceConstants;
import au.com.singtel.group.sdp.appointment.service.exception.AppointmentServiceException;
import au.com.singtel.group.sdp.appointment.service.exception.AppointmentServiceExceptionInfo;

/**
 * @author ms00365975
 * 
 */
public class AppointmentServiceValidator {

	protected static final Logger logger = LoggerFactory
			.getLogger(AppointmentServiceValidator.class);

	/**
	 * Validator method for Create Appointment Request Operation
	 * @param request
	 */
	public static void validateCreateAppointmentRequest(
			CreateAppointmentRequest request)
			throws AppointmentServiceException {

		boolean isValidated = true;
		
		if (request == null) {
			logger.debug("CreateAppointmentRequest Object is Empty");
			
		}

		/*
		 * Check for Application Identity (i.e. callerIdentity) in request object
		 */
		if (StringUtils.isEmpty(request.getCallerIdentity())
				|| request.getCallerIdentity() == null) {

			logger.debug("Application Identity is Empty");
			isValidated = false;
		}

		/*
		 * Check for System Identity (i.e. client) in request object
		 */
		if (StringUtils.isEmpty(request.getClientId())
				|| request.getClientId() == null) {

			logger.debug("System Identity is Empty");
			isValidated = false;
		}

		/*
		 * Check for Interaction Date Time
		 */
		if (request.getInteractionDate() == null) {

			logger.debug("Interaction Date Time is Empty");
			isValidated = false;
		}

		/*
		 * If the market segment is not residential or business raise error
		 */
		if (StringUtils.isEmpty(request.getCallerIdentityType())) {

			logger.debug("Market Segment value is Empty");
			isValidated = false;
		} else if (!(request.getCallerIdentityType().equals(AppointmentServiceConstants.CALLER_IDENTITY_TYPE1))
				|| !(request.getCallerIdentityType().equals(AppointmentServiceConstants.CALLER_IDENTITY_TYPE2))) {

			logger.debug("Invalid Market Segment received");
			isValidated = false;
		}

		/*
		 * Validate Transaction ID
		 */
		if (StringUtils.isEmpty(request.getSessionId())) {

			logger.debug("Invalid Transaction ID received");
			isValidated = false;
		}

		/*
		 * Validate Customer Selected Appointment
		 */
		if (request.getCustomerSelectedAppointment() == null) {

			logger.debug("Customer Selected Appointment is Empty");
			isValidated = false;
		}
		
		/*
		 *  Check for Appointment Type
		 */
		if(request.getCustomerSelectedAppointment().getAppointmentType() == null ||
				request.getCustomerSelectedAppointment().getAppointmentType() != AppointmentServiceConstants.APPOINTMENT_TYPE ||
				StringUtils.isEmpty(request.getCustomerSelectedAppointment().getAppointmentType())) {
			
			logger.debug("Invalid Appointment Type received");
			isValidated = false;
		}
		
		/*
		 *  Check for Appointment Action
		 */
		if(request.getCustomerSelectedAppointment().getAction().toString() == null ||
				request.getCustomerSelectedAppointment().getAction().toString() != AppointmentServiceConstants.ACTION ||
				StringUtils.isEmpty(request.getCustomerSelectedAppointment().getAppointmentType())) {
			
			logger.debug("Appointment Action is Empty");
			isValidated = false;
		}
		
		/*
		 *  Check for Demand Type (i.e Specification)
		 */
		if(request.getCustomerSelectedAppointment().getSpecification() == null) {
			
			logger.debug("Invalid Specification Object received");
			isValidated = false;
		}
		
		/*
		 *  Check for Appointment Category
		 */
		if(request.getCustomerSelectedAppointment().getAppointmentCategory() == null||
				StringUtils.isEmpty(request.getCustomerSelectedAppointment().getAppointmentCategory()) || 
				request.getCustomerSelectedAppointment().getAppointmentCategory() != AppointmentServiceConstants.APPOINTMENT_CATEGORY) {
			
			logger.debug("Invalid Appoint Category received");
			isValidated = false;
		}
		
		/*
		 *  Check for Requested Appointment Slot
		 */
		if(request.getCustomerSelectedAppointment().getAppointmentSlot() == null) {
			
			logger.debug("Invalid Appointment Slot received");
			isValidated = false;
		}
		
		/*
		 *  Check for Requested Appointment Slot Code
		 */
		if(request.getCustomerSelectedAppointment().getAppointmentSlotCode() == null) {
			
			logger.debug("Invalid Appointment Slot Code received");
			isValidated = false;
		}	
		
		if(!isValidated) {
			throw new AppointmentServiceException(
					AppointmentServiceExceptionInfo.formatFaultString(
							AppointmentServiceExceptionInfo.BIZ_Error_001,
							"Validation failed in validateCheckAvailableAppointmentRequest CreateAppointmentRequest Object is Empty"));
		}
	}

	/**
	 * 
	 * @param request
	 */
	public static void validateUpdateAppointmentRequest(
			UpdateAppointmentRequest request) {

		if (request == null) {

			logger.debug("UpdateAppointmentRequest Object is null");
		}
	}

	/**
	 * 
	 * @param request
	 */
	public static void validateCancelAppointmentRequest(
			CancelAppointmentRequest request) {

		if (request == null) {

			logger.debug("CancelAppointmentRequest Object is null");
		}
	}

	/**
	 * 
	 * @param request
	 */
	public static void validateGetAppointmentsByOrderRequest(
			GetAppointmentsByOrderRequest request) {

		if (request == null) {

			logger.debug("GetAppointmentsByOrderRequest  Object is null");
		}
	}

	/**
	 * 
	 * @param request
	 */
	public static void validateGetAppointmentByIdRequest(
			GetAppointmentByIdRequest request) {

		if (request == null) {

			logger.debug("GetAppointmentByIdRequest  Object is null");
		}
	}

	/**
	 * 
	 * @param request
	 */
	public static void validateCheckAvailableAppointmentRequest(
			CheckAvailableAppointmentRequest request)
			throws AppointmentServiceException {
		
		boolean isValidated = true;
		
		if (request == null) {

			logger.debug("CheckAvailableAppointmentRequest  Object is null");
			isValidated = false;
		}

		/*
		 * If the market segment is not residential or business raise error
		 */
		if (StringUtils.isEmpty(request.getCallerIdentityType())) {

			logger.debug("Market Segment value is null");
			isValidated = false;
		} else if (!(request.getCallerIdentityType().equals(AppointmentServiceConstants.CALLER_IDENTITY_TYPE1))
				|| !(request.getCallerIdentityType().equals(AppointmentServiceConstants.CALLER_IDENTITY_TYPE2))) {

			logger.debug("Invalid Market Segment received");
			isValidated = false;
		}

		/*
		 * Validate Customer Selected Appointment
		 */
		if (request.getCustomerRequestedAppointment() == null) {

			logger.debug("Customer Requested Appointment is Null");
			isValidated = false;
		}

		if(!isValidated) {
			throw new AppointmentServiceException(
					AppointmentServiceExceptionInfo.formatFaultString(
							AppointmentServiceExceptionInfo.BIZ_Error_001,
							"Validation failed in validateCheckAvailableAppointmentRequest"));
		}
	}

	/**
	 * 
	 * @param request
	 */
	public static void validateGetRequiredAppointmentTypeRequest(
			GetRequiredAppointmentTypeRequest request) {

		if (request == null) {

			logger.debug("GetRequiredAppointmentTypeRequest  Object is null");
		}
	}

	/**
	 * 
	 * @param request
	 */
	public static void validateCheckAvailableAppointmentNotificationRequest(
			CheckAvailableAppointmentNotificationRequest request)
			throws AppointmentServiceException {
		
		boolean isValidated = true;

		if (request == null) {
			logger.debug("CheckAvailableAppointmentNotification Object is null");
			isValidated = false;
		}

		/*
		 * If the market segment is not residential or business raise error
		 */
		if (StringUtils.isEmpty(request.getCallerIdentityType())) {

			logger.debug("Market Segment value is null");
			isValidated = false;;
		} else if (!(request.getCallerIdentityType().equals(AppointmentServiceConstants.CALLER_IDENTITY_TYPE1))
				|| !(request.getCallerIdentityType().equals(AppointmentServiceConstants.CALLER_IDENTITY_TYPE2))) {

			logger.debug("Invalid Market Segment received");
			isValidated = false;;
		}

		/*
		 * Validate Transaction ID
		 */
		if (StringUtils.isEmpty(request.getSessionId())) {

			logger.debug("Invalid Transaction ID received");
			isValidated = false;
		}

		/*
		 * Validate Customer Selected Appointment
		 */
		if (request.getCustomerRequestedAppointment() == null) {

			logger.debug("Customer Requested Appointment is Null");
			isValidated = false;
		}
		
		
		if(!isValidated) {
			throw new AppointmentServiceException(
					AppointmentServiceExceptionInfo.formatFaultString(
							AppointmentServiceExceptionInfo.BIZ_Error_001,
							"Validation failed in validateCheckAvailableAppointmentNotificationRequest"));
		}
	}

	/**
	 * 
	 * @param request
	 */
	public static void validateCreateAppointmentNotificationRequest(
			CreateAppointmentNotificationRequest request)
			throws AppointmentServiceException {
		
		boolean isValidated = true;

		if (request == null) {
			logger.debug("CreateAppointmentNotification Object is null");
			isValidated = false;
		}

		/*
		 * If the market segment is not residential or business raise error
		 */
		if (StringUtils.isEmpty(request.getCallerIdentityType())) {

			logger.debug("Market Segment value is null");
			isValidated = false;;
		} else if (!(request.getCallerIdentityType().equals(AppointmentServiceConstants.CALLER_IDENTITY_TYPE1))
				|| !(request.getCallerIdentityType().equals(AppointmentServiceConstants.CALLER_IDENTITY_TYPE2))) {

			logger.debug("Invalid Market Segment received");
			isValidated = false;;
		}

		/*
		 * Validate Transaction ID
		 */
		if (StringUtils.isEmpty(request.getSessionId())) {

			logger.debug("Invalid Transaction ID received");
			isValidated = false;;
		}

		/*
		 * Validate Customer Selected Appointment
		 */
		if (request.getCustomerSelectedAppointment() == null) {

			logger.debug("Customer Selected Appointment is Null");
			isValidated = false;;
		}
		
		if(!isValidated) {
			throw new AppointmentServiceException(
					AppointmentServiceExceptionInfo.formatFaultString(
							AppointmentServiceExceptionInfo.BIZ_Error_001,
							"Validation failed in validateCreateAppointmentNotificationRequest"));
		}

	}

}
