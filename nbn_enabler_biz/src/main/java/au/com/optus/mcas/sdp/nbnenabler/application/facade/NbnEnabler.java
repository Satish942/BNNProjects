package au.com.optus.mcas.sdp.nbnenabler.application.facade;

import au.com.optus.mcas.sdp.nbnenabler.exception.NbnServiceException;
import au.com.optus.mcas.sdp.nbnenabler.model.BusinessException;
import au.com.optus.mcas.sdp.nbnenabler.model.CheckAvailableAppointmentRequestModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CheckAvailableAppointmentResponseModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateAppointmentRequestModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateAppointmentResponseModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateServiceOrderRequestModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateServiceOrderResponseModel;
import au.com.optus.mcas.sdp.nbnenabler.model.ServiceException;


public interface NbnEnabler {

	public static final String FACADE_ID = "au.com.optus.mcas.sdp.nbnenabler.application.facade.spring.SpringNbnEnablerApplicationFacade";
	
	public CreateServiceOrderResponseModel createServiceOrder(CreateServiceOrderRequestModel createServiceOrder) throws NbnServiceException;
	
	public CheckAvailableAppointmentResponseModel checkAvailableAppointment(CheckAvailableAppointmentRequestModel checkAvailableAppointment) throws NbnServiceException;
	
	public CreateAppointmentResponseModel createAppointment(CreateAppointmentRequestModel createAppointment) throws NbnServiceException;
	
}
