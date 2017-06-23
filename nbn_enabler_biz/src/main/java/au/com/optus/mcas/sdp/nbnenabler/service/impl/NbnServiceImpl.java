package au.com.optus.mcas.sdp.nbnenabler.service.impl;

import au.com.optus.mcas.core.exception.BusinessException;
import au.com.optus.mcas.sdp.nbnenabler.exception.NbnServiceException;
import au.com.optus.mcas.sdp.nbnenabler.model.CheckAvailableAppointmentRequestModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CheckAvailableAppointmentResponseModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateAppointmentRequestModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateAppointmentResponseModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateServiceOrderRequestModel;
import au.com.optus.mcas.sdp.nbnenabler.model.CreateServiceOrderResponseModel;
import au.com.optus.mcas.sdp.nbnenabler.service.NbnService;
import au.com.optus.mcas.sdp.nbnenabler.util.NbnEnablerPropertiesContainer;
import au.com.optus.sdp.enabler.nbn.nbnmanagerservice.NBNManagerService;
import au.com.singtel.group.ops.ff.smo.svccfgact.v4_0_0.serviceorderservice.CreateServiceOrderRequest;
import au.com.singtel.group.ops.ff.smo.svccfgact.v4_0_0.serviceorderservice.ServiceOrderServiceEndpoint;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.AppointmentServiceEndpoint;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CheckAvailableAppointmentRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CheckAvailableAppointmentResponse;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CreateAppointmentRequest;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CreateAppointmentResponse;
import au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.ServiceException;
import au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice.CreateServiceOrderResponse;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.bind.JAXBContext;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("au.com.optus.mcas.sdp.nbnenabler.service.impl.NbnServiceImpl")
@Transactional(propagation = Propagation.REQUIRED)
public class NbnServiceImpl implements NbnService {

    protected static final Logger LOG = LoggerFactory.getLogger(NbnServiceImpl.class);

    @Autowired
    @Qualifier(value = "appointmentServiceClient")
    private AppointmentServiceEndpoint appointmentClient;

    @Autowired
    @Qualifier(value = "ServiceOrderClient")
    private ServiceOrderServiceEndpoint serviceClient;

    /*@Autowired
    @Qualifier(value = "NBNManagerServiceClient")
    private NBNManagerService gatewayServiceClient;*/

    @Autowired
    private NbnEnablerPropertiesContainer nbnEnablerProperties;

    private JAXBContext context =null;

    private static final Mapper BEAN_MAPPER = DozerBeanMapperSingletonWrapper.getInstance();

    @Override
    public CreateServiceOrderResponseModel createServiceOrder(
        CreateServiceOrderRequestModel createServiceOrder)
        throws NbnServiceException {
        LOG.info("========= START of createServiceOrder Method ==========");

        CreateServiceOrderResponseModel createServiceOrderResponseModel = null;

        CreateServiceOrderRequest createServiceOrderRequest = BEAN_MAPPER.map(createServiceOrder, CreateServiceOrderRequest.class);

        au.com.singtel.group.ops.ff.smo.svccfgact.v4_0_0.serviceorderservice.CreateServiceOrderResponse createServiceOrderResponse = null;

        try {
            createServiceOrderResponse = serviceClient.createServiceOrder(createServiceOrderRequest);

            createServiceOrderResponse.setCallerIdentity("OSSF NBN");
            createServiceOrderResponse.setClientId("OSSF");
            //2006-05-04T18:14:00.0Z
            javax.xml.datatype.XMLGregorianCalendar value = toXMLGregorianCalendar(new Date());
            createServiceOrderResponse.setInteractionDate(value.normalize());
            createServiceOrderResponse.setInteractionId("342232b323323");
            createServiceOrderResponse.setSessionId("240830");
            createServiceOrderResponse.setStatus("Success");

        } catch (au.com.singtel.group.ops.ff.smo.svccfgact.v4_0_0.serviceorderservice.BusinessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (au.com.singtel.group.ops.ff.smo.svccfgact.v4_0_0.serviceorderservice.ServiceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        createServiceOrderResponseModel = BEAN_MAPPER.map(createServiceOrderResponse, CreateServiceOrderResponseModel.class);

        LOG.info("========= serviceClient=========="+serviceClient);

        LOG.info("========= END of createServiceOrder Method ==========");
        return createServiceOrderResponseModel;
    }

    @Override
    public CheckAvailableAppointmentResponseModel checkAvailableAppointment(
        CheckAvailableAppointmentRequestModel checkAvailableAppointment)
        throws NbnServiceException {
        LOG.info("========= START of checkAvailableAppointment Method ==========");

        CheckAvailableAppointmentResponseModel checkAvailableAppointmentResponseModel = null;

        CheckAvailableAppointmentRequest checkAvailableAppointmentRequest =
            BEAN_MAPPER.map(checkAvailableAppointment, CheckAvailableAppointmentRequest.class);

        //CheckAvailableAppointmentResponse checkAvailableAppointmentResponse = new CheckAvailableAppointmentResponse();

         try {
        LOG.info("========= Try Entered. ==========");
        au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CheckAvailableAppointmentResponse checkAvailableAppointmentResponse =
            appointmentClient.checkAvailableAppointment(checkAvailableAppointmentRequest);

        
        checkAvailableAppointmentResponse.setCallerIdentity("OSSF");
        checkAvailableAppointmentResponse.setClientId("OSSF");
        checkAvailableAppointmentResponse.setDescription("Check available appointment");

        javax.xml.datatype.XMLGregorianCalendar value = toXMLGregorianCalendar(new Date());
        checkAvailableAppointmentResponse.setInteractionDate(value.normalize());
        checkAvailableAppointmentResponse.setInteractionId("");
        checkAvailableAppointmentResponse.setProcessId("");
        checkAvailableAppointmentResponse.setProviderSessionId("");
        checkAvailableAppointmentResponse.setSalesmanCode("");
        checkAvailableAppointmentResponse.setSignOnIdentity("");
        checkAvailableAppointmentResponse.setStatusDescription("");

        checkAvailableAppointmentResponse.setSessionId("240830");
        checkAvailableAppointmentResponse.setStatus("Success");
        checkAvailableAppointmentResponse.setVersion("");

        checkAvailableAppointmentResponseModel =
            BEAN_MAPPER.map(checkAvailableAppointmentResponse, CheckAvailableAppointmentResponseModel.class);

        } catch (ServiceException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.BusinessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        LOG.info("========= END of checkAvailableAppointment Method ==========");

        return checkAvailableAppointmentResponseModel;
    }

    @Override
    public CreateAppointmentResponseModel createAppointment(
        CreateAppointmentRequestModel createAppointment)
        throws NbnServiceException {
        LOG.info("========= START of createAppointment Method ==========");

        CreateAppointmentRequest createAppointmentRequest = BEAN_MAPPER.map(createAppointment, CreateAppointmentRequest.class);

        CreateAppointmentResponseModel createAppointmentResponseModel = null;

        //au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CreateAppointmentResponse createAppointmentResponse1 = new au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CreateAppointmentResponse();

         try {
        LOG.info("========= Try Entered. ==========");
        au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.CreateAppointmentResponse  createAppointmentResponse = appointmentClient.createAppointment(createAppointmentRequest);

        createAppointmentResponse.setCallerIdentity("OSSF");
        createAppointmentResponse.setClientId("OSSF");
        createAppointmentResponse.setDescription("Create appointment request");

        javax.xml.datatype.XMLGregorianCalendar value = toXMLGregorianCalendar(new Date());
        createAppointmentResponse.setInteractionDate(value.normalize());
        createAppointmentResponse.setInteractionId("");
        createAppointmentResponse.setStatus("Success");
        createAppointmentResponse.setProcessId("");
        createAppointmentResponse.setProviderSessionId("");
        createAppointmentResponse.setSalesmanCode("");
        createAppointmentResponse.setSessionId("OptusB2BTxNum_OSSF_241092");
        createAppointmentResponse.setSignOnIdentity("");
        createAppointmentResponse.setStatusDescription("");
        createAppointmentResponse.setVersion("");

        createAppointmentResponseModel = BEAN_MAPPER.map(createAppointmentResponse, CreateAppointmentResponseModel.class);

        } catch (BusinessException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (au.com.singtel.group.ops.osr.rmo.manageworkforce.v4_0_0.appointmentservice.BusinessException e) {
            e.printStackTrace();
        }

        LOG.info("========= END of createAppointment Method ==========");
        return createAppointmentResponseModel;
    }

    /*
     * Converts java.util.Date to javax.xml.datatype.XMLGregorianCalendar
     */
    private XMLGregorianCalendar toXMLGregorianCalendar(Date date) {
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
            LOG.info("Exception on dateconvertion:" + ex);
        }
        return xmlCalendar;
    }

    /*
     * Converts XMLGregorianCalendar to java.util.Date in Java
     */
    private Date toDate(XMLGregorianCalendar calendar) {
        if (calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }



}
