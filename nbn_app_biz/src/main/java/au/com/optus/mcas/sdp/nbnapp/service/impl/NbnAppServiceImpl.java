package au.com.optus.mcas.sdp.nbnapp.service.impl;

import au.com.optus.mcas.sdp.nbnapp.application.facade.NbnApp;
import au.com.optus.mcas.sdp.nbnapp.model.CheckAvailableAppointmentNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CheckAvailableAppointmentNotificationResponseModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateAppointmentNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateAppointmentNotificationResponseModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateServiceOrderNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateServiceOrderNotificationResponseModel;
import au.com.singtel.group.ops.ff.smo.svccfgact.v4_0_0.serviceorderservice.ServiceOrderServiceEndpoint;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.AppointmentServiceEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("au.com.optus.mcas.sdp.nbnapp.service.impl.NbnAppServiceImpl")
@Transactional(propagation = Propagation.REQUIRED)
public class NbnAppServiceImpl implements NbnApp{

    protected static final Logger LOG = LoggerFactory.getLogger(NbnAppServiceImpl.class);

    @Autowired
    @Qualifier(value= "appointmentClient")
    private AppointmentServiceEndpoint appointmentsClient;
    
    @Autowired
    @Qualifier(value= "serviceOrderClient")
    private ServiceOrderServiceEndpoint serviceOrdersClient;

    public CreateServiceOrderNotificationResponseModel createServiceOrderNotification(
        CreateServiceOrderNotificationRequestModel createServiceOrderNotificationRequestDto)
        throws au.com.optus.mcas.sdp.nbnapp.exception.BusinessException,
        au.com.optus.mcas.sdp.nbnapp.exception.ServiceException {
        LOG.info("========= START of createServiceOrderNotification Method ==========");
        CreateServiceOrderNotificationResponseModel createServiceOrderNotificationResponseModel = new CreateServiceOrderNotificationResponseModel();
        
        LOG.info("========= END of createServiceOrderNotification Method ==========");
        return createServiceOrderNotificationResponseModel;
    }

    public CreateAppointmentNotificationResponseModel createAppointmentNotification(
        CreateAppointmentNotificationRequestModel createAppointmentNotificationRequestDto)
        throws au.com.optus.mcas.sdp.nbnapp.exception.BusinessException,
        au.com.optus.mcas.sdp.nbnapp.exception.ServiceException {
        LOG.info("========= START of createAppointmentNotification Method ==========");
        CreateAppointmentNotificationResponseModel createAppointmentNotificationResponseModel = new CreateAppointmentNotificationResponseModel();
        
        LOG.info("========= END of createAppointmentNotification Method ==========");
        return createAppointmentNotificationResponseModel;
    }

    public CheckAvailableAppointmentNotificationResponseModel checkAvailableAppointmentNotification(
        CheckAvailableAppointmentNotificationRequestModel checkAvailableAppointmentNotificationRequestDto)
        throws au.com.optus.mcas.sdp.nbnapp.exception.BusinessException,
        au.com.optus.mcas.sdp.nbnapp.exception.ServiceException {
        LOG.info("========= START of checkAvailableAppointmentNotification Method ==========");
        CheckAvailableAppointmentNotificationResponseModel checkAvailableAppointmentNotificationResponseModel = new CheckAvailableAppointmentNotificationResponseModel();
        
        LOG.info("========= END of checkAvailableAppointmentNotification Method ==========");
        return checkAvailableAppointmentNotificationResponseModel;
    }

}
