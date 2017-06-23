package au.com.optus.mcas.sdp.nbnapp.application.facade;

import au.com.optus.mcas.sdp.nbnapp.model.*;
import au.com.optus.mcas.sdp.nbnapp.exception.BusinessException;
import au.com.optus.mcas.sdp.nbnapp.exception.ServiceException;

/**
 * @author optus
 *
 */
public interface NbnApp {

    public static final String FACADE_ID =
        "au.com.optus.mcas.sdp.nbnapp.application.facade.spring.SpringNbnApplicationFacade";

    public CreateServiceOrderNotificationResponseModel createServiceOrderNotification(
        CreateServiceOrderNotificationRequestModel createServiceOrderNotificationRequestDto)
        throws BusinessException, ServiceException;

    public CreateAppointmentNotificationResponseModel createAppointmentNotification(
        CreateAppointmentNotificationRequestModel createAppointmentNotificationRequestDto)
        throws BusinessException, ServiceException;

    public CheckAvailableAppointmentNotificationResponseModel checkAvailableAppointmentNotification(
        CheckAvailableAppointmentNotificationRequestModel checkAvailableAppointmentNotificationRequestDto)
        throws BusinessException, ServiceException;
}
