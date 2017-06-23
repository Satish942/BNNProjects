package au.com.optus.mcas.sdp.nbnenabler.service;

import au.com.optus.mcas.sdp.nbnenabler.exception.NbnServiceException;
import au.com.optus.mcas.sdp.nbnenabler.model.*;


public interface NbnService {

    public CreateServiceOrderResponseModel createServiceOrder(CreateServiceOrderRequestModel createServiceOrder)
        throws NbnServiceException;

    public CheckAvailableAppointmentResponseModel checkAvailableAppointment(
        CheckAvailableAppointmentRequestModel checkAvailableAppointment) throws NbnServiceException;

    public CreateAppointmentResponseModel createAppointment(CreateAppointmentRequestModel createAppointment)
        throws NbnServiceException;

}
