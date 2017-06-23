package au.com.singtel.group.sdp.appointment.service.facade.impl;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice.BusinessException;
import au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice.CheckAvailableAppointmentRequest;
import au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice.CheckAvailableAppointmentResponse;
import au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice.CreateAppointmentRequest;
import au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice.CreateAppointmentResponse;
import au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice.NbnEnablerServiceEndpoint;
import au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice.ServiceException;
import au.com.singtel.group.optus.oss.enabler.ossfenablerservice.v4_0_0.ossfenablerservice.CheckAvailableAppointmentNotificationRequest;
import au.com.singtel.group.optus.oss.enabler.ossfenablerservice.v4_0_0.ossfenablerservice.CheckAvailableAppointmentNotificationResponse;
import au.com.singtel.group.optus.oss.enabler.ossfenablerservice.v4_0_0.ossfenablerservice.CreateAppointmentNotificationRequest;
import au.com.singtel.group.optus.oss.enabler.ossfenablerservice.v4_0_0.ossfenablerservice.CreateAppointmentNotificationResponse;
import au.com.singtel.group.optus.oss.enabler.ossfenablerservice.v4_0_0.ossfenablerservice.OssfEnablerServiceEndpoint;
import au.com.singtel.group.sdp.appointment.service.dao.AppointmentServiceDAOIF;
import au.com.singtel.group.sdp.appointment.service.exception.AppointmentServiceException;
import au.com.singtel.group.sdp.appointment.service.exception.AppointmentServiceExceptionInfo;
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
import au.com.singtel.group.sdp.appointment.service.model.NBNCorrelation;
import au.com.singtel.group.sdp.appointment.service.model.NBNNotification;
import au.com.singtel.group.sdp.appointment.service.model.UpdateAppointmentRequestModel;
import au.com.singtel.group.sdp.appointment.service.model.UpdateAppointmentResponseModel;
import au.com.singtel.group.sdp.appointment.service.util.AppointmentServiceConstants;
import au.com.singtel.group.sdp.appointment.service.util.AppointmentServiceUtil;

@Service(AppointmentServiceFacadeIF.FACADE_ID)
@Transactional(propagation = Propagation.REQUIRED)
public class AppointmentServiceFacadeImpl implements AppointmentServiceFacadeIF {

	private static final Logger logger = LoggerFactory
			.getLogger(AppointmentServiceFacadeImpl.class);

	@Autowired
	private AppointmentServiceDAOIF appointmentServiceDAO;

	@Autowired
	@Qualifier("nbnEnablerServiceClient")
	private NbnEnablerServiceEndpoint nbnEnablerclient;

	@Autowired
	@Qualifier("ossfEnablerServiceClient")
	private OssfEnablerServiceEndpoint ossfEnablerClient;

	/**
	 * @author ms00365975
	 * @param CreateAppointmentRequestModel
	 * @return CreateAppointmentResponseModel
	 * 
	 * Method to implement create appointment operation. Accepts request form client and hits NBN Enabler to create the appointment
	 */
	public CreateAppointmentResponseModel createAppointment(
			CreateAppointmentRequestModel incomingRequest)
			throws AppointmentServiceException {
		
		CreateAppointmentResponseModel outgoingResponse = new CreateAppointmentResponseModel();
		
		// Incoming Correlation Transaction ID
		String transactionId = incomingRequest.getSessionId();

		// Generate unique interaction ID
		String interactionId = appointmentServiceDAO.generateCreateAppointmentId();
		
		// transform the client Transaction Id into NBN Transaction Id
		String nbnTransactionPrefix = AppointmentServiceConstants.NBN_TRANSACTION_PREFIX;
		String marketSegment = incomingRequest.getCallerIdentityType();
		
		StringBuilder sb = new StringBuilder();
		sb.append(nbnTransactionPrefix);
		sb.append(marketSegment);
		sb.append("_");
		sb.append(transactionId);
		
		String nbnTransactionId = sb.toString();
		
		// Construct request to NBN Enabler
		CreateAppointmentRequest outgoingRequest = new CreateAppointmentRequest();
		outgoingRequest.setInteractionId(interactionId);
		outgoingRequest.setSessionId(nbnTransactionId);
		
		outgoingRequest.setCallerIdentity(incomingRequest.getCallerIdentity());
		outgoingRequest.setCallerIdentityType(incomingRequest.getCallerIdentityType());
		outgoingRequest.setClientId(incomingRequest.getClientId());
		outgoingRequest.setDescription(incomingRequest.getDescription());
		outgoingRequest.setInteractionDate(incomingRequest.getInteractionDate());
		outgoingRequest.setProcessId(incomingRequest.getProcessId());
		outgoingRequest.setProviderSessionId(incomingRequest.getProviderSessionId());
		outgoingRequest.setSalesmanCode(incomingRequest.getSalesmanCode());
		outgoingRequest.setSignOnIdentity(incomingRequest.getSignOnIdentity());
		outgoingRequest.setVersion(incomingRequest.getVersion());
		
		outgoingRequest.setCustomerRequestedAppointment(incomingRequest.getCustomerSelectedAppointment());
		
		CreateAppointmentResponse incomingResponse = null;
		
		try {
			incomingResponse = nbnEnablerclient.createAppointment(outgoingRequest);
			
			if(incomingResponse != null) {
				
				NBNCorrelation nbnCorrelation = new NBNCorrelation();
				
				Date d = new Date();
				nbnCorrelation.setCreatedDateTime(d);
				nbnCorrelation.setTransactionId(outgoingRequest.getSessionId());
				nbnCorrelation.setConversationId(outgoingRequest.getSessionId());
				nbnCorrelation.setOperationName(AppointmentServiceConstants.CREATE_APPOINTMENT);
				nbnCorrelation.setDestination(outgoingRequest.getCallerIdentity()); // System Identity

				// Persist record into Co-relation Database
				appointmentServiceDAO.persistOssfNbnCorrelation(nbnCorrelation);
			}
			else {
					throw new AppointmentServiceException(
							AppointmentServiceExceptionInfo.formatFaultString(
									AppointmentServiceExceptionInfo.SVC_Error_001,
									"Unable to get response from NBN Enabler Client"));
				
			}
		} catch (BusinessException e) {

			logger.error("***Business Exception occured in Create Appointment***",e);
		} catch (ServiceException e) {
			logger.error("***Service Exception occured in Create Appointment***",e);
		}
		
		outgoingResponse.setCallerIdentity(incomingResponse.getCallerIdentity());
		outgoingResponse.setClientId(incomingResponse.getClientId());
		outgoingResponse.setDescription(incomingResponse.getDescription());
		outgoingResponse.setInteractionDate(incomingResponse.getInteractionDate());
		outgoingResponse.setInteractionId(incomingResponse.getInteractionId());
		outgoingResponse.setProcessId(incomingResponse.getProcessId());
		outgoingResponse.setProviderSessionId(incomingResponse.getProviderSessionId());
		outgoingResponse.setSalesmanCode(incomingResponse.getSalesmanCode());
		outgoingResponse.setSessionId(incomingResponse.getSessionId());
		outgoingResponse.setSignOnIdentity(incomingResponse.getSignOnIdentity());
		outgoingResponse.setStatus(incomingResponse.getStatus());
		outgoingResponse.setStatusDescription(incomingResponse.getStatusDescription());
		outgoingResponse.setVersion(incomingResponse.getVersion());

		return outgoingResponse;
	}

	public UpdateAppointmentResponseModel updateAppointment(
			UpdateAppointmentRequestModel updateAppointment)
			throws AppointmentServiceException {

		UpdateAppointmentResponseModel outgoingResponse = new UpdateAppointmentResponseModel();

		return outgoingResponse;

	}

	public CancelAppointmentResponseModel cancelAppointment(
			CancelAppointmentRequestModel cancelAppointment)
			throws AppointmentServiceException {

		CancelAppointmentResponseModel outgoingResponse = new CancelAppointmentResponseModel();

		return outgoingResponse;
	}

	public GetAppointmentsByOrderResponseModel getAppointmentsByOrder(
			GetAppointmentsByOrderRequestModel getAppointmentsByOrder)
			throws AppointmentServiceException {

		GetAppointmentsByOrderResponseModel outgoingResponse = new GetAppointmentsByOrderResponseModel();

		return outgoingResponse;
	}

	public GetAppointmentByIdResponseModel getAppointmentById(
			GetAppointmentByIdRequestModel getAppointmentById)
			throws AppointmentServiceException {

		GetAppointmentByIdResponseModel outgoingResponse = new GetAppointmentByIdResponseModel();

		return outgoingResponse;

	}

	/**
	 * @author ms00365975
	 * @param CheckAvailableAppointmentRequestModel
	 *            request
	 * @return CheckAvailableAppointmentResponseModel
	 * @throws AppointmentServiceException
	 *             Method to receive check available appointment request from
	 *             client, forward it to NBN Enabler and send response back to
	 *             client
	 */
	public CheckAvailableAppointmentResponseModel checkAvailableAppointment(
			CheckAvailableAppointmentRequestModel incomingRequest)
			throws AppointmentServiceException {

		// Generate Unique InteractionId and add it to request object
		String interactionId = appointmentServiceDAO
				.generateCheckAvailableAppointmentId();

		// Set the interactionId in incoming Request object
		incomingRequest.setInteractionId(interactionId);

		// Construct checkAvailableAppointment Request for NBN Enabler
		// These values of set as per the Sample Request XML Shared
		CheckAvailableAppointmentRequest outgoingRequest = new CheckAvailableAppointmentRequest();
		outgoingRequest.setCallerIdentity(incomingRequest.getCallerIdentity());
		outgoingRequest.setCallerIdentityType(incomingRequest
				.getCallerIdentityType());
		outgoingRequest.setClientId(incomingRequest.getClientId());
		outgoingRequest.setDescription(incomingRequest.getDescription());
		outgoingRequest
				.setInteractionDate(incomingRequest.getInteractionDate());
		outgoingRequest.setInteractionId(incomingRequest.getInteractionId());
		outgoingRequest.setProcessId(incomingRequest.getProcessId());
		outgoingRequest.setProviderSessionId(incomingRequest
				.getProviderSessionId());
		outgoingRequest.setSalesmanCode(incomingRequest.getSalesmanCode());
		outgoingRequest.setSignOnIdentity(incomingRequest.getSignOnIdentity());
		outgoingRequest.setVersion(incomingRequest.getVersion());
		outgoingRequest.setCustomerRequestedAppointment(incomingRequest
				.getCustomerRequestedAppointment());

		// Additional fields not in request
		outgoingRequest.setSessionId(incomingRequest.getSessionId());
		outgoingRequest.setAction(incomingRequest.getAction());

		// Send request to NBN Enabler operation
		CheckAvailableAppointmentResponse incomingResponse = null;
		try {
			incomingResponse = nbnEnablerclient
					.checkAvailableAppointment(outgoingRequest);
		} catch (BusinessException e) {

			logger.error("***Business Exception occured in Check Available Appointment***",e);
		} catch (ServiceException e) {
			logger.error("***Service Exception occured in Check Available Appointment***",e);
		}

		CheckAvailableAppointmentResponseModel outgoingResponse = null;

		if (incomingResponse == null) {
			throw new AppointmentServiceException(
					AppointmentServiceExceptionInfo.formatFaultString(
							AppointmentServiceExceptionInfo.BIZ_Error_001,
							"Response not received from NBN Enabler"));

		} else {
			// Check if successful response received, i.e. Transaction ID
			// available in incoming response object
			if (incomingResponse.getSessionId() != null
					|| !StringUtils.isEmpty(incomingResponse.getSessionId())) {

				NBNCorrelation nbnCorrelation = new NBNCorrelation();
				
				Date d = new Date();
				nbnCorrelation.setCreatedDateTime(d);
				nbnCorrelation.setTransactionId(incomingResponse
						.getSessionId());
				nbnCorrelation.setConversationId(incomingResponse
						.getSessionId());
				nbnCorrelation.setOperationName(AppointmentServiceConstants.CHECK_AVAILABLE_APPOINTMENT);
				nbnCorrelation.setDestination(incomingResponse
						.getCallerIdentity()); // System Identity

				// Persist record into Co-relation Database
				appointmentServiceDAO.persistOssfNbnCorrelation(nbnCorrelation);
			}

			// Construct and send response back to client
			outgoingResponse = new CheckAvailableAppointmentResponseModel();
			outgoingResponse.setCallerIdentity(incomingResponse
					.getCallerIdentity());
			outgoingResponse.setClientId(incomingResponse.getClientId());
			outgoingResponse.setDescription(incomingResponse.getDescription());
			outgoingResponse.setInteractionId(incomingResponse
					.getInteractionId());
			outgoingResponse.setInteractionDate(incomingResponse
					.getInteractionDate());
			outgoingResponse.setProcessId(incomingResponse.getProcessId());
			outgoingResponse.setProviderSessionId(incomingResponse
					.getProviderSessionId());
			outgoingResponse
					.setSalesmanCode(incomingResponse.getSalesmanCode());
			outgoingResponse.setSessionId(incomingResponse.getSessionId());
			outgoingResponse.setSignOnIdentity(incomingResponse
					.getSignOnIdentity());
			outgoingResponse.setStatus(incomingResponse.getStatus());
			outgoingResponse.setStatusDescription(incomingResponse
					.getStatusDescription());
			outgoingResponse.setVersion(incomingResponse.getVersion());
		}

		return outgoingResponse;
	}

	public GetRequiredAppointmentTypeResponseModel getRequiredAppointmentType(
			GetRequiredAppointmentTypeRequestModel getRequiredAppointmentType)
			throws AppointmentServiceException {

		GetRequiredAppointmentTypeResponseModel outgoingResponse = new GetRequiredAppointmentTypeResponseModel();

		return outgoingResponse;
	}

	/**
	 * @author ms00365975
	 * @param CheckAvailableAppointmentNotificationRequestModel
	 * @return CheckAvailableAppointmentNotificationResponseModel
	 * @throws AppointmentServiceException
	 */
	public CheckAvailableAppointmentNotificationResponseModel checkAvailableAppointmentNotification(
			CheckAvailableAppointmentNotificationRequestModel incomingRequest)
			throws AppointmentServiceException {

		CheckAvailableAppointmentNotificationResponseModel outgoingResponse = new CheckAvailableAppointmentNotificationResponseModel();

		// Generate a unique transaction id
		String newTransactionId = AppointmentServiceUtil
				.generateInteractionId(AppointmentServiceConstants.CHECK_AVAILABLE_APPOINTMENT_NOTIFICATION_PREFIX);

		// extract transactionId from request
		String transactionId = incomingRequest.getSessionId();
		String systemIdentity = incomingRequest.getCallerIdentity();

		// Lookup ossf_nbn_correlation table

		NBNCorrelation correlation = appointmentServiceDAO.getCorrelationById(transactionId, systemIdentity);

		if (correlation == null) {

			// Create a new request in ossf_nbn_notification
			NBNNotification newNotification = new NBNNotification();
			Date d = new Date();
			newNotification.setCreatedDateTime(d);
			newNotification.setTransactionId(newTransactionId);
			newNotification.setConversationId(newTransactionId);
			newNotification.setNotificationPayload(incomingRequest.toString());


			// Persist record into Co-relation Database
			appointmentServiceDAO.persistOssfNbnNotification(newNotification);

			// Don't hit OSSF Enabler Service, send response back to the client 
			outgoingResponse.setSessionId(newTransactionId);
			outgoingResponse.setStatus(AppointmentServiceConstants.STATUS);
			
			outgoingResponse.setCallerIdentity(incomingRequest.getCallerIdentity());
			outgoingResponse.setClientId(incomingRequest.getClientId());
			outgoingResponse.setDescription(incomingRequest.getDescription());
			outgoingResponse.setInteractionDate(incomingRequest.getInteractionDate());
			outgoingResponse.setInteractionId(incomingRequest.getInteractionId());
			outgoingResponse.setProcessId(incomingRequest.getProcessId());
			outgoingResponse.setProviderSessionId(incomingRequest.getProviderSessionId());
			outgoingResponse.setSalesmanCode(incomingRequest.getSalesmanCode());
			outgoingResponse.setSignOnIdentity(incomingRequest.getSignOnIdentity());
			outgoingResponse.setStatusDescription(incomingRequest.getStatusDescription());
			outgoingResponse.setVersion(incomingRequest.getVersion());

		} else {
			
			CheckAvailableAppointmentNotificationRequest outgoingRequest = new CheckAvailableAppointmentNotificationRequest();


			// extract original OSSF Transaction ID from NBN TransactionId in
			// the notification request
			String ossfTransactionId = transactionId.substring(transactionId.lastIndexOf("_") + 1, transactionId.length());

			outgoingRequest.setCallerIdentity(incomingRequest.getCallerIdentity());
			outgoingRequest.setCallerIdentityType(incomingRequest.getCallerIdentityType());
			outgoingRequest.setClientId(incomingRequest.getClientId());
			outgoingRequest.setDescription(incomingRequest.getDescription());

			// outgoingRequest.setInteractionId(incomingRequest.getInteractionId());
			outgoingRequest.setInteractionId(newTransactionId);

			outgoingRequest.setInteractionDate(incomingRequest.getInteractionDate());
			outgoingRequest.setProcessId(incomingRequest.getProcessId());
			outgoingRequest.setProviderSessionId(incomingRequest.getProviderSessionId());
			outgoingRequest.setSalesmanCode(incomingRequest.getSalesmanCode());
			outgoingRequest.setSessionId(ossfTransactionId);
			// outgoingRequest.setSessionId(incomingRequest.getSessionId());
			outgoingRequest.setSignOnIdentity(incomingRequest.getSignOnIdentity());
			outgoingRequest.setVersion(incomingRequest.getVersion());
			outgoingRequest.setCustomerRequestedAppointment(incomingRequest.getCustomerRequestedAppointment());
			outgoingRequest.setMustDoAppointment(incomingRequest.getMustDoAppointment());
			
			// Hit the Ossf Enabler Client
			CheckAvailableAppointmentNotificationResponse incomingResponse = null;
			try {
				incomingResponse = ossfEnablerClient.checkAvailableAppointmentNotification(outgoingRequest);
				
			} catch (au.com.singtel.group.optus.oss.enabler.ossfenablerservice.v4_0_0.ossfenablerservice.BusinessException e) {
				
				logger.error("***Business Exception Occurred in Check Available Appointment Notification***",e);
				
			} catch (au.com.singtel.group.optus.oss.enabler.ossfenablerservice.v4_0_0.ossfenablerservice.ServiceException e) {
				
				logger.error("***Service Exception Occurred in Check Available Appointment Notification***",e);
				
			}
			
			// Prepare the response to be sent to client
			outgoingResponse.setCallerIdentity(incomingResponse.getCallerIdentity());
			outgoingResponse.setClientId(incomingResponse.getClientId());
			outgoingResponse.setDescription(incomingResponse.getDescription());
			outgoingResponse.setInteractionDate(incomingResponse.getInteractionDate());
			outgoingResponse.setInteractionId(incomingResponse.getInteractionId());
			outgoingResponse.setProcessId(incomingResponse.getProcessId());
			outgoingResponse.setProviderSessionId(incomingResponse.getProviderSessionId());
			outgoingResponse.setSalesmanCode(incomingResponse.getSalesmanCode());
			outgoingResponse.setSignOnIdentity(incomingResponse.getSignOnIdentity());
			outgoingResponse.setStatus(incomingResponse.getStatus());
			outgoingResponse.setStatusDescription(incomingResponse.getStatusDescription());
			outgoingResponse.setVersion(incomingResponse.getVersion());

			outgoingResponse.setSessionId(ossfTransactionId);
		}

		return outgoingResponse;
	}

	/**
	 * @author ms00365975
	 * @param CreateAppointmentNotificationRequestModel
	 * @return CreateAppointmentNotificationResponseModel
	 */
	public CreateAppointmentNotificationResponseModel createAppointmentNotification(
			CreateAppointmentNotificationRequestModel incomingRequest)
			throws AppointmentServiceException {

		CreateAppointmentNotificationResponseModel outgoingResponse = new CreateAppointmentNotificationResponseModel();
		
		
		// Generate a unique transaction id
				String newTransactionId = AppointmentServiceUtil
						.generateInteractionId(AppointmentServiceConstants.CREATE_APPOINTMENT_NOTIFICATION_PREFIX);

				// extract transactionId from request
				String transactionId = incomingRequest.getSessionId();
				String systemIdentity = incomingRequest.getCallerIdentity();

				// Lookup ossf_nbn_correlation table
				NBNCorrelation  correlation = appointmentServiceDAO.getCorrelationById(transactionId, systemIdentity);
			
		
				if (correlation == null) {
					// create 
					NBNNotification newNotification = new NBNNotification();
					Date d = new Date();
					newNotification.setCreatedDateTime(d);
					newNotification.setTransactionId(newTransactionId);
					newNotification.setConversationId(newTransactionId);
					newNotification.setNotificationPayload(incomingRequest.toString()); // System Identity

					// Persist record into Co-relation Database
					appointmentServiceDAO.persistOssfNbnNotification(newNotification);

					// Don't hit OSSF Enabler Service, send response back to the client 
					outgoingResponse.setSessionId(newTransactionId);
					outgoingResponse.setStatus(AppointmentServiceConstants.STATUS);
					
					outgoingResponse.setCallerIdentity(incomingRequest.getCallerIdentity());
					outgoingResponse.setClientId(incomingRequest.getClientId());
					outgoingResponse.setDescription(incomingRequest.getDescription());
					outgoingResponse.setInteractionDate(incomingRequest.getInteractionDate());
					outgoingResponse.setInteractionId(incomingRequest.getInteractionId());
					outgoingResponse.setProcessId(incomingRequest.getProcessId());
					outgoingResponse.setProviderSessionId(incomingRequest.getProviderSessionId());
					outgoingResponse.setSalesmanCode(incomingRequest.getSalesmanCode());
					outgoingResponse.setSignOnIdentity(incomingRequest.getSignOnIdentity());
					outgoingResponse.setStatusDescription(incomingRequest.getStatusDescription());
					outgoingResponse.setVersion(incomingRequest.getVersion());

				} else {
					
					CreateAppointmentNotificationRequest outgoingRequest = new  CreateAppointmentNotificationRequest();
					
					// extract original OSSF Transaction ID from NBN TransactionId in
					// the notification request
					String ossfTransactionId = transactionId.substring(transactionId.lastIndexOf("_") + 1, transactionId.length());

					outgoingRequest.setCallerIdentity(incomingRequest.getCallerIdentity());
					outgoingRequest.setCallerIdentityType(incomingRequest.getCallerIdentityType());
					outgoingRequest.setClientId(incomingRequest.getClientId());
					outgoingRequest.setDescription(incomingRequest.getDescription());

					// outgoingRequest.setInteractionId(incomingRequest.getInteractionId());
					outgoingRequest.setInteractionId(newTransactionId);

					outgoingRequest.setInteractionDate(incomingRequest.getInteractionDate());
					outgoingRequest.setProcessId(incomingRequest.getProcessId());
					outgoingRequest.setProviderSessionId(incomingRequest.getProviderSessionId());
					outgoingRequest.setSalesmanCode(incomingRequest.getSalesmanCode());
					outgoingRequest.setSessionId(ossfTransactionId);
					// outgoingRequest.setSessionId(incomingRequest.getSessionId());
					outgoingRequest.setSignOnIdentity(incomingRequest.getSignOnIdentity());
					outgoingRequest.setVersion(incomingRequest.getVersion());
					outgoingRequest.setCustomerSelectedAppointment(incomingRequest.getCustomerSelectedAppointment());
					outgoingRequest.setMustDoAppointment(incomingRequest.getMustDoAppointment());
					
					CreateAppointmentNotificationResponse incomingResponse = null;
					try {
						incomingResponse = ossfEnablerClient.createAppointmentNotification(outgoingRequest);
						
					}  catch (au.com.singtel.group.optus.oss.enabler.ossfenablerservice.v4_0_0.ossfenablerservice.BusinessException e) {
						
						logger.error("***Business Exception Occurred in Create Appointment Notification***",e);
						
					} catch (au.com.singtel.group.optus.oss.enabler.ossfenablerservice.v4_0_0.ossfenablerservice.ServiceException e) {
						
						logger.error("***Service Exception Occurred in Create Appointment Notification***",e);
						
					}
					
					// Prepare the response to be sent to client
					outgoingResponse.setCallerIdentity(incomingResponse.getCallerIdentity());
					outgoingResponse.setClientId(incomingResponse.getClientId());
					outgoingResponse.setDescription(incomingResponse.getDescription());
					outgoingResponse.setInteractionDate(incomingResponse.getInteractionDate());
					outgoingResponse.setInteractionId(incomingResponse.getInteractionId());
					outgoingResponse.setProcessId(incomingResponse.getProcessId());
					outgoingResponse.setProviderSessionId(incomingResponse.getProviderSessionId());
					outgoingResponse.setSalesmanCode(incomingResponse.getSalesmanCode());
					outgoingResponse.setSignOnIdentity(incomingResponse.getSignOnIdentity());
					outgoingResponse.setStatus(incomingResponse.getStatus());
					outgoingResponse.setStatusDescription(incomingResponse.getStatusDescription());
					outgoingResponse.setVersion(incomingResponse.getVersion());

					outgoingResponse.setSessionId(ossfTransactionId);
				}

		return outgoingResponse;

	}

}
