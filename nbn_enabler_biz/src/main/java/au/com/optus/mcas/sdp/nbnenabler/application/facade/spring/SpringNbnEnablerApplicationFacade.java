package au.com.optus.mcas.sdp.nbnenabler.application.facade.spring;

import au.com.optus.mcas.sdp.nbnenabler.application.facade.NbnEnabler;
import au.com.optus.mcas.sdp.nbnenabler.exception.NbnServiceException;
import au.com.optus.mcas.sdp.nbnenabler.model.CheckAvailableAppointmentRequestModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CheckAvailableAppointmentResponseModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateAppointmentRequestModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateAppointmentResponseModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateServiceOrderRequestModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateServiceOrderResponseModel;
import au.com.optus.mcas.sdp.nbnenabler.service.impl.NbnServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author optus
 *
 */
@Service(NbnEnabler.FACADE_ID)
public class SpringNbnEnablerApplicationFacade implements NbnEnabler {

    protected static final Logger LOG = LoggerFactory.getLogger(SpringNbnEnablerApplicationFacade.class);

    @Autowired
    private NbnServiceImpl NbnService;

    @Override
    public CreateServiceOrderResponseModel createServiceOrder(
        CreateServiceOrderRequestModel createServiceOrder)
            throws NbnServiceException {
        LOG.info("========= START of createServiceOrder Method =========");

        CreateServiceOrderResponseModel createServiceOrderResponseModel;
        try {
            createServiceOrderResponseModel = NbnService.createServiceOrder(createServiceOrder);
        } catch (NbnServiceException e) {
            
            throw new NbnServiceException(e.getExceptionInfo().getFaultCode(), e.getMessage());
        }

        LOG.info("========= END of createServiceOrder Method ==========");
        return createServiceOrderResponseModel;
    }

    @Override
    public CheckAvailableAppointmentResponseModel checkAvailableAppointment(
        CheckAvailableAppointmentRequestModel checkAvailableAppointment)
            throws NbnServiceException {
        LOG.info("========= START of checkAvailableAppointment Method ==========");

        CheckAvailableAppointmentResponseModel checkAvailableAppointmentResponseModel;
        try {
            checkAvailableAppointmentResponseModel = NbnService.checkAvailableAppointment(checkAvailableAppointment);
        }  catch (NbnServiceException e) {
            
            throw new NbnServiceException(e.getExceptionInfo().getFaultCode(), e.getMessage());
        }

        LOG.info("========= END of checkAvailableAppointment Method ==========");
        return checkAvailableAppointmentResponseModel;
    }

    @Override
    public CreateAppointmentResponseModel createAppointment(
        CreateAppointmentRequestModel createAppointment)
            throws NbnServiceException {
        LOG.info("========= START of createAppointment Method ==========");

        CreateAppointmentResponseModel createAppointmentResponseModel;
        try {
            createAppointmentResponseModel = NbnService.createAppointment(createAppointment);
        }  catch (NbnServiceException e) {
            
            throw new NbnServiceException(e.getExceptionInfo().getFaultCode(), e.getMessage());
        }

        LOG.info("========= END of createAppointment Method ==========");
        return createAppointmentResponseModel;
    }

}
