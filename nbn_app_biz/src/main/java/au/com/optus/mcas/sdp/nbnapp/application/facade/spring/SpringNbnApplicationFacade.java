package au.com.optus.mcas.sdp.nbnapp.application.facade.spring;

import au.com.optus.mcas.sdp.nbnapp.application.facade.NbnApp;
import au.com.optus.mcas.sdp.nbnapp.exception.BusinessException;
import au.com.optus.mcas.sdp.nbnapp.exception.ServiceException;
import au.com.optus.mcas.sdp.nbnapp.model.CheckAvailableAppointmentNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CheckAvailableAppointmentNotificationResponseModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateAppointmentNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateAppointmentNotificationResponseModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateServiceOrderNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateServiceOrderNotificationResponseModel;
import au.com.optus.mcas.sdp.nbnapp.service.impl.NbnAppServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author optus
 *
 */
@Service(NbnApp.FACADE_ID)
public class SpringNbnApplicationFacade implements NbnApp {
    
    
    protected static final Logger LOG = LoggerFactory.getLogger(SpringNbnApplicationFacade.class);

    @Autowired
    private NbnAppServiceImpl NbnAppService;
    

    public CreateServiceOrderNotificationResponseModel createServiceOrderNotification(
        CreateServiceOrderNotificationRequestModel createServiceOrderNotificationRequestDto) throws BusinessException,
        ServiceException {
        LOG.info("========= START of createServiceOrderNotification Method =========");

        CreateServiceOrderNotificationResponseModel createServiceOrderNotificationResponseModel =
            NbnAppService.createServiceOrderNotification(createServiceOrderNotificationRequestDto);

        LOG.info("========= END of createServiceOrderNotification Method ==========");
        return createServiceOrderNotificationResponseModel;
    }

    public CreateAppointmentNotificationResponseModel createAppointmentNotification(
        CreateAppointmentNotificationRequestModel createAppointmentNotificationRequestDto) throws BusinessException,
        ServiceException {
        LOG.info("========= START of createAppointmentNotification Method =========");

        CreateAppointmentNotificationResponseModel createAppointmentNotificationResponseModel =
            NbnAppService.createAppointmentNotification(createAppointmentNotificationRequestDto);

        LOG.info("========= END of createAppointmentNotification Method ==========");
        return createAppointmentNotificationResponseModel;
    }

    public CheckAvailableAppointmentNotificationResponseModel checkAvailableAppointmentNotification(
        CheckAvailableAppointmentNotificationRequestModel checkAvailableAppointmentNotificationRequestDto)
        throws BusinessException, ServiceException {
        LOG.info("========= START of checkAvailableAppointmentNotification Method =========");

        CheckAvailableAppointmentNotificationResponseModel checkAvailableAppointmentNotificationResponseModel =
            NbnAppService.checkAvailableAppointmentNotification(checkAvailableAppointmentNotificationRequestDto);

        LOG.info("========= END of checkAvailableAppointmentNotification Method ==========");
        return checkAvailableAppointmentNotificationResponseModel;
    }

}
