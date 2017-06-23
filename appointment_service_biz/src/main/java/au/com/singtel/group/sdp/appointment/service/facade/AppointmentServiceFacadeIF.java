package au.com.singtel.group.sdp.appointment.service.facade;

import au.com.singtel.group.sdp.appointment.service.exception.AppointmentServiceException;
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


/**
 * 
 * @author M Shafiullah
 *
 */
public interface AppointmentServiceFacadeIF {
	
	
	/**
	 *   Facade ID to be used in @Qualifier
	 */
	String FACADE_ID = "au.com.singtel.group.sdp.appointment.service.facade.impl.AppointmentServiceFacadeImpl";
	
	/**
     * 
     * @param createAppointment
     * @return
     *     returns au.com.singtel.group.appointment.service.model.CreateAppointmentResponse
     * @throws AppointmentServiceException
     */
    CreateAppointmentResponseModel createAppointment
    (CreateAppointmentRequestModel createAppointment)
        throws AppointmentServiceException;

    /**
     * 
     * @param updateAppointment
     * @return
     *     returns au.com.singtel.group.appointment.service.model.UpdateAppointmentResponse
     * @throws AppointmentServiceException
     */
    UpdateAppointmentResponseModel updateAppointment
    (UpdateAppointmentRequestModel updateAppointment)
        		throws AppointmentServiceException;

    /**
     * 
     * @param cancelAppointment
     * @return
     *     returns au.com.singtel.group.appointment.service.model.CancelAppointmentResponse
     * @throws AppointmentServiceException
     */
    CancelAppointmentResponseModel cancelAppointment
    (CancelAppointmentRequestModel cancelAppointment)
        		throws AppointmentServiceException;

    /**
     * 
     * @param getAppointmentsByOrder
     * @return
     *     returns au.com.singtel.group.appointment.service.model.GetAppointmentsByOrderResponse
     * @throws AppointmentServiceException
     */
    GetAppointmentsByOrderResponseModel getAppointmentsByOrder
    (GetAppointmentsByOrderRequestModel getAppointmentsByOrder)
        		throws AppointmentServiceException;

    /**
     * 
     * @param getAppointmentById
     * @return
     *     returns au.com.singtel.group.appointment.service.model.GetAppointmentByIdResponse
     * @throws AppointmentServiceException
     */
    GetAppointmentByIdResponseModel getAppointmentById
    (GetAppointmentByIdRequestModel getAppointmentById)
        		throws AppointmentServiceException;

    /**
     * 
     * @param checkAvailableAppointment
     * @return
     *     returns au.com.singtel.group.appointment.service.model.CheckAvailableAppointmentResponse
     * @throws AppointmentServiceException
     */
    CheckAvailableAppointmentResponseModel checkAvailableAppointment
    (CheckAvailableAppointmentRequestModel checkAvailableAppointment)
        		throws AppointmentServiceException;

    /**
     * 
     * @param getRequiredAppointmentType
     * @return
     *     returns au.com.singtel.group.appointment.service.model.GetRequiredAppointmentTypeResponse
     * @throws AppointmentServiceException
     */
    GetRequiredAppointmentTypeResponseModel getRequiredAppointmentType
    (GetRequiredAppointmentTypeRequestModel getRequiredAppointmentType)
        		throws AppointmentServiceException;

    /**
     * 
     * @param checkAvailableAppointmentNotification
     * @return
     *     returns au.com.singtel.group.appointment.service.model.CheckAvailableAppointmentNotificationResponse
     * @throws AppointmentServiceException
     */
    CheckAvailableAppointmentNotificationResponseModel checkAvailableAppointmentNotification
    (CheckAvailableAppointmentNotificationRequestModel checkAvailableAppointmentNotification)
        		throws AppointmentServiceException;

    /**
     * 
     * @param createAppointmentNotification
     * @return
     *     returns au.com.singtel.group.appointment.service.model.CreateAppointmentNotificationResponse
     * @throws AppointmentServiceException
     */
    CreateAppointmentNotificationResponseModel createAppointmentNotification
    (CreateAppointmentNotificationRequestModel createAppointmentNotification)
        		throws AppointmentServiceException;
}
