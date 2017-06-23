package au.com.optus.mcas.sdp.nbnapp.service;

import au.com.optus.mcas.sdp.nbnapp.exception.BusinessException;
import au.com.optus.mcas.sdp.nbnapp.exception.ServiceException;
import au.com.optus.mcas.sdp.nbnapp.model.CheckAvailableAppointmentNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CheckAvailableAppointmentNotificationResponseModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateAppointmentNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateAppointmentNotificationResponseModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateServiceOrderNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateServiceOrderNotificationResponseModel;

public interface NbnAppService {
    
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