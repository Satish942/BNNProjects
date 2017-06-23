
package au.com.optus.mcas.sdp.nbnenabler.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateServiceOrderRequest_QNAME = new QName("http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", "createServiceOrderRequest");
    private final static QName _CheckAvailableAppointmentResponse_QNAME = new QName("http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", "checkAvailableAppointmentResponse");
    private final static QName _CheckAvailableAppointmentRequest_QNAME = new QName("http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", "checkAvailableAppointmentRequest");
    private final static QName _CreateAppointment_QNAME = new QName("http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", "createAppointment");
    private final static QName _CreateAppointmentRequest_QNAME = new QName("http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", "createAppointmentRequest");
    private final static QName _CheckAvailableAppointment_QNAME = new QName("http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", "checkAvailableAppointment");
    private final static QName _CreateAppointmentResponse_QNAME = new QName("http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", "createAppointmentResponse");
    private final static QName _CreateServiceOrder_QNAME = new QName("http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", "createServiceOrder");
    private final static QName _CreateServiceOrderResponse_QNAME = new QName("http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", "createServiceOrderResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.singtel.group.optus.oss.enabler.nbnenablerservice.v4_0_0.nbnenablerservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckAvailableAppointmentResponseModel }
     * 
     */
    public CheckAvailableAppointmentResponseModel createCheckAvailableAppointmentResponse() {
        return new CheckAvailableAppointmentResponseModel();
    }

    /**
     * Create an instance of {@link CreateAppointmentRequestModel }
     * 
     */
    public CreateAppointmentRequestModel createCreateAppointmentRequest() {
        return new CreateAppointmentRequestModel();
    }

    /**
     * Create an instance of {@link CreateServiceOrderRequestModel }
     * 
     */
    public CreateServiceOrderRequestModel createCreateServiceOrderRequest() {
        return new CreateServiceOrderRequestModel();
    }

    /**
     * Create an instance of {@link CheckAvailableAppointmentRequestModel }
     * 
     */
    public CheckAvailableAppointmentRequestModel createCheckAvailableAppointmentRequest() {
        return new CheckAvailableAppointmentRequestModel();
    }

    /**
     * Create an instance of {@link CreateAppointmentResponseModel }
     * 
     */
    public CreateAppointmentResponseModel createCreateAppointmentResponse() {
        return new CreateAppointmentResponseModel();
    }

    /**
     * Create an instance of {@link CreateServiceOrderResponseModel }
     * 
     */
    public CreateServiceOrderResponseModel createCreateServiceOrderResponse() {
        return new CreateServiceOrderResponseModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServiceOrderRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", name = "createServiceOrderRequest")
    public JAXBElement<CreateServiceOrderRequestModel> createCreateServiceOrderRequest(CreateServiceOrderRequestModel value) {
        return new JAXBElement<CreateServiceOrderRequestModel>(_CreateServiceOrderRequest_QNAME, CreateServiceOrderRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailableAppointmentResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", name = "checkAvailableAppointmentResponse")
    public JAXBElement<CheckAvailableAppointmentResponseModel> createCheckAvailableAppointmentResponse(CheckAvailableAppointmentResponseModel value) {
        return new JAXBElement<CheckAvailableAppointmentResponseModel>(_CheckAvailableAppointmentResponse_QNAME, CheckAvailableAppointmentResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailableAppointmentRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", name = "checkAvailableAppointmentRequest")
    public JAXBElement<CheckAvailableAppointmentRequestModel> createCheckAvailableAppointmentRequest(CheckAvailableAppointmentRequestModel value) {
        return new JAXBElement<CheckAvailableAppointmentRequestModel>(_CheckAvailableAppointmentRequest_QNAME, CheckAvailableAppointmentRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAppointmentRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", name = "createAppointment")
    public JAXBElement<CreateAppointmentRequestModel> createCreateAppointment(CreateAppointmentRequestModel value) {
        return new JAXBElement<CreateAppointmentRequestModel>(_CreateAppointment_QNAME, CreateAppointmentRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAppointmentRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", name = "createAppointmentRequest")
    public JAXBElement<CreateAppointmentRequestModel> createCreateAppointmentRequest(CreateAppointmentRequestModel value) {
        return new JAXBElement<CreateAppointmentRequestModel>(_CreateAppointmentRequest_QNAME, CreateAppointmentRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAvailableAppointmentRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", name = "checkAvailableAppointment")
    public JAXBElement<CheckAvailableAppointmentRequestModel> createCheckAvailableAppointment(CheckAvailableAppointmentRequestModel value) {
        return new JAXBElement<CheckAvailableAppointmentRequestModel>(_CheckAvailableAppointment_QNAME, CheckAvailableAppointmentRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAppointmentResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", name = "createAppointmentResponse")
    public JAXBElement<CreateAppointmentResponseModel> createCreateAppointmentResponse(CreateAppointmentResponseModel value) {
        return new JAXBElement<CreateAppointmentResponseModel>(_CreateAppointmentResponse_QNAME, CreateAppointmentResponseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServiceOrderRequestModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", name = "createServiceOrder")
    public JAXBElement<CreateServiceOrderRequestModel> createCreateServiceOrder(CreateServiceOrderRequestModel value) {
        return new JAXBElement<CreateServiceOrderRequestModel>(_CreateServiceOrder_QNAME, CreateServiceOrderRequestModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServiceOrderResponseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/optus/oss/enabler/NbnEnablerService/v4_0_0/NbnEnablerService", name = "createServiceOrderResponse")
    public JAXBElement<CreateServiceOrderResponseModel> createCreateServiceOrderResponse(CreateServiceOrderResponseModel value) {
        return new JAXBElement<CreateServiceOrderResponseModel>(_CreateServiceOrderResponse_QNAME, CreateServiceOrderResponseModel.class, null, value);
    }

}
