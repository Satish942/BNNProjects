
package au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import au.com.singtel.group.cdm.v2_0_0.customer.Customer;
import au.com.singtel.group.cdm.v2_0_0.resource.Resource;
import au.com.singtel.group.cdm.v2_0_0.service.ServiceOrder;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice package. 
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

    private final static QName _CreateServiceOrderNotificationResponse_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "createServiceOrderNotificationResponse");
    private final static QName _GetServiceOrderByIdRequest_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "getServiceOrderByIdRequest");
    private final static QName _GetServiceOrderNotificationResponse_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "getServiceOrderNotificationResponse");
    private final static QName _GetServiceOrderNotificationRequest_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "getServiceOrderNotificationRequest");
    private final static QName _CreateServiceOrderRequest_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "createServiceOrderRequest");
    private final static QName _GetServiceOrderRequest_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "getServiceOrderRequest");
    private final static QName _CreateServiceOrderNotificationRequest_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "createServiceOrderNotificationRequest");
    private final static QName _UpdateTransactionStatusResponse_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "updateTransactionStatusResponse");
    private final static QName _ProcessServiceOrderResponse_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "processServiceOrderResponse");
    private final static QName _CancelServiceOrderResponse_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "cancelServiceOrderResponse");
    private final static QName _GetServiceOrderByIdResponse_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "getServiceOrderByIdResponse");
    private final static QName _GetServiceOrderResponse_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "getServiceOrderResponse");
    private final static QName _CancelServiceOrderRequest_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "cancelServiceOrderRequest");
    private final static QName _ProcessServiceOrderRequest_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "processServiceOrderRequest");
    private final static QName _CreateServiceOrderResponse_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "createServiceOrderResponse");
    private final static QName _UpdateTransactionStatusRequest_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "updateTransactionStatusRequest");
    private final static QName _CreateServiceOrderNotificationResponseStatus_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "status");
    private final static QName _CancelServiceOrderResponseServiceOrder_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "serviceOrder");
    private final static QName _GetServiceOrderByIdResponseResource_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "resource");
    private final static QName _GetServiceOrderByIdResponseCustomer_QNAME = new QName("http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", "customer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelServiceOrderResponse }
     * 
     */
    public CancelServiceOrderResponse createCancelServiceOrderResponse() {
        return new CancelServiceOrderResponse();
    }

    /**
     * Create an instance of {@link CancelServiceOrderRequest }
     * 
     */
    public CancelServiceOrderRequest createCancelServiceOrderRequest() {
        return new CancelServiceOrderRequest();
    }

    /**
     * Create an instance of {@link ProcessServiceOrderRequest }
     * 
     */
    public ProcessServiceOrderRequest createProcessServiceOrderRequest() {
        return new ProcessServiceOrderRequest();
    }

    /**
     * Create an instance of {@link GetServiceOrderByIdResponse }
     * 
     */
    public GetServiceOrderByIdResponse createGetServiceOrderByIdResponse() {
        return new GetServiceOrderByIdResponse();
    }

    /**
     * Create an instance of {@link CreateServiceOrderResponse }
     * 
     */
    public CreateServiceOrderResponse createCreateServiceOrderResponse() {
        return new CreateServiceOrderResponse();
    }

    /**
     * Create an instance of {@link GetServiceOrderByIdRequest }
     * 
     */
    public GetServiceOrderByIdRequest createGetServiceOrderByIdRequest() {
        return new GetServiceOrderByIdRequest();
    }

    /**
     * Create an instance of {@link UpdateTransactionStatusResponse }
     * 
     */
    public UpdateTransactionStatusResponse createUpdateTransactionStatusResponse() {
        return new UpdateTransactionStatusResponse();
    }

    /**
     * Create an instance of {@link ProcessServiceOrderResponse }
     * 
     */
    public ProcessServiceOrderResponse createProcessServiceOrderResponse() {
        return new ProcessServiceOrderResponse();
    }

    /**
     * Create an instance of {@link GetServiceOrderRequest }
     * 
     */
    public GetServiceOrderRequest createGetServiceOrderRequest() {
        return new GetServiceOrderRequest();
    }

    /**
     * Create an instance of {@link GetServiceOrderNotificationResponse }
     * 
     */
    public GetServiceOrderNotificationResponse createGetServiceOrderNotificationResponse() {
        return new GetServiceOrderNotificationResponse();
    }

    /**
     * Create an instance of {@link GetServiceOrderNotificationRequest }
     * 
     */
    public GetServiceOrderNotificationRequest createGetServiceOrderNotificationRequest() {
        return new GetServiceOrderNotificationRequest();
    }

    /**
     * Create an instance of {@link CreateServiceOrderNotificationRequest }
     * 
     */
    public CreateServiceOrderNotificationRequest createCreateServiceOrderNotificationRequest() {
        return new CreateServiceOrderNotificationRequest();
    }

    /**
     * Create an instance of {@link GetServiceOrderResponse }
     * 
     */
    public GetServiceOrderResponse createGetServiceOrderResponse() {
        return new GetServiceOrderResponse();
    }

    /**
     * Create an instance of {@link CreateServiceOrderRequest }
     * 
     */
    public CreateServiceOrderRequest createCreateServiceOrderRequest() {
        return new CreateServiceOrderRequest();
    }

    /**
     * Create an instance of {@link CreateServiceOrderNotificationResponse }
     * 
     */
    public CreateServiceOrderNotificationResponse createCreateServiceOrderNotificationResponse() {
        return new CreateServiceOrderNotificationResponse();
    }

    /**
     * Create an instance of {@link UpdateTransactionStatusRequest }
     * 
     */
    public UpdateTransactionStatusRequest createUpdateTransactionStatusRequest() {
        return new UpdateTransactionStatusRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServiceOrderNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "createServiceOrderNotificationResponse")
    public JAXBElement<CreateServiceOrderNotificationResponse> createCreateServiceOrderNotificationResponse(CreateServiceOrderNotificationResponse value) {
        return new JAXBElement<CreateServiceOrderNotificationResponse>(_CreateServiceOrderNotificationResponse_QNAME, CreateServiceOrderNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceOrderByIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "getServiceOrderByIdRequest")
    public JAXBElement<GetServiceOrderByIdRequest> createGetServiceOrderByIdRequest(GetServiceOrderByIdRequest value) {
        return new JAXBElement<GetServiceOrderByIdRequest>(_GetServiceOrderByIdRequest_QNAME, GetServiceOrderByIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceOrderNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "getServiceOrderNotificationResponse")
    public JAXBElement<GetServiceOrderNotificationResponse> createGetServiceOrderNotificationResponse(GetServiceOrderNotificationResponse value) {
        return new JAXBElement<GetServiceOrderNotificationResponse>(_GetServiceOrderNotificationResponse_QNAME, GetServiceOrderNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceOrderNotificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "getServiceOrderNotificationRequest")
    public JAXBElement<GetServiceOrderNotificationRequest> createGetServiceOrderNotificationRequest(GetServiceOrderNotificationRequest value) {
        return new JAXBElement<GetServiceOrderNotificationRequest>(_GetServiceOrderNotificationRequest_QNAME, GetServiceOrderNotificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServiceOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "createServiceOrderRequest")
    public JAXBElement<CreateServiceOrderRequest> createCreateServiceOrderRequest(CreateServiceOrderRequest value) {
        return new JAXBElement<CreateServiceOrderRequest>(_CreateServiceOrderRequest_QNAME, CreateServiceOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "getServiceOrderRequest")
    public JAXBElement<GetServiceOrderRequest> createGetServiceOrderRequest(GetServiceOrderRequest value) {
        return new JAXBElement<GetServiceOrderRequest>(_GetServiceOrderRequest_QNAME, GetServiceOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServiceOrderNotificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "createServiceOrderNotificationRequest")
    public JAXBElement<CreateServiceOrderNotificationRequest> createCreateServiceOrderNotificationRequest(CreateServiceOrderNotificationRequest value) {
        return new JAXBElement<CreateServiceOrderNotificationRequest>(_CreateServiceOrderNotificationRequest_QNAME, CreateServiceOrderNotificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTransactionStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "updateTransactionStatusResponse")
    public JAXBElement<UpdateTransactionStatusResponse> createUpdateTransactionStatusResponse(UpdateTransactionStatusResponse value) {
        return new JAXBElement<UpdateTransactionStatusResponse>(_UpdateTransactionStatusResponse_QNAME, UpdateTransactionStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessServiceOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "processServiceOrderResponse")
    public JAXBElement<ProcessServiceOrderResponse> createProcessServiceOrderResponse(ProcessServiceOrderResponse value) {
        return new JAXBElement<ProcessServiceOrderResponse>(_ProcessServiceOrderResponse_QNAME, ProcessServiceOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelServiceOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "cancelServiceOrderResponse")
    public JAXBElement<CancelServiceOrderResponse> createCancelServiceOrderResponse(CancelServiceOrderResponse value) {
        return new JAXBElement<CancelServiceOrderResponse>(_CancelServiceOrderResponse_QNAME, CancelServiceOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceOrderByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "getServiceOrderByIdResponse")
    public JAXBElement<GetServiceOrderByIdResponse> createGetServiceOrderByIdResponse(GetServiceOrderByIdResponse value) {
        return new JAXBElement<GetServiceOrderByIdResponse>(_GetServiceOrderByIdResponse_QNAME, GetServiceOrderByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "getServiceOrderResponse")
    public JAXBElement<GetServiceOrderResponse> createGetServiceOrderResponse(GetServiceOrderResponse value) {
        return new JAXBElement<GetServiceOrderResponse>(_GetServiceOrderResponse_QNAME, GetServiceOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelServiceOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "cancelServiceOrderRequest")
    public JAXBElement<CancelServiceOrderRequest> createCancelServiceOrderRequest(CancelServiceOrderRequest value) {
        return new JAXBElement<CancelServiceOrderRequest>(_CancelServiceOrderRequest_QNAME, CancelServiceOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessServiceOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "processServiceOrderRequest")
    public JAXBElement<ProcessServiceOrderRequest> createProcessServiceOrderRequest(ProcessServiceOrderRequest value) {
        return new JAXBElement<ProcessServiceOrderRequest>(_ProcessServiceOrderRequest_QNAME, ProcessServiceOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateServiceOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "createServiceOrderResponse")
    public JAXBElement<CreateServiceOrderResponse> createCreateServiceOrderResponse(CreateServiceOrderResponse value) {
        return new JAXBElement<CreateServiceOrderResponse>(_CreateServiceOrderResponse_QNAME, CreateServiceOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTransactionStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "updateTransactionStatusRequest")
    public JAXBElement<UpdateTransactionStatusRequest> createUpdateTransactionStatusRequest(UpdateTransactionStatusRequest value) {
        return new JAXBElement<UpdateTransactionStatusRequest>(_UpdateTransactionStatusRequest_QNAME, UpdateTransactionStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "status", scope = CreateServiceOrderNotificationResponse.class)
    public JAXBElement<String> createCreateServiceOrderNotificationResponseStatus(String value) {
        return new JAXBElement<String>(_CreateServiceOrderNotificationResponseStatus_QNAME, String.class, CreateServiceOrderNotificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "status", scope = GetServiceOrderNotificationResponse.class)
    public JAXBElement<String> createGetServiceOrderNotificationResponseStatus(String value) {
        return new JAXBElement<String>(_CreateServiceOrderNotificationResponseStatus_QNAME, String.class, GetServiceOrderNotificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "status", scope = CancelServiceOrderResponse.class)
    public JAXBElement<String> createCancelServiceOrderResponseStatus(String value) {
        return new JAXBElement<String>(_CreateServiceOrderNotificationResponseStatus_QNAME, String.class, CancelServiceOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "serviceOrder", scope = CancelServiceOrderResponse.class)
    public JAXBElement<ServiceOrder> createCancelServiceOrderResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_CancelServiceOrderResponseServiceOrder_QNAME, ServiceOrder.class, CancelServiceOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "status", scope = CreateServiceOrderResponse.class)
    public JAXBElement<String> createCreateServiceOrderResponseStatus(String value) {
        return new JAXBElement<String>(_CreateServiceOrderNotificationResponseStatus_QNAME, String.class, CreateServiceOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "serviceOrder", scope = CreateServiceOrderResponse.class)
    public JAXBElement<ServiceOrder> createCreateServiceOrderResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_CancelServiceOrderResponseServiceOrder_QNAME, ServiceOrder.class, CreateServiceOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "resource", scope = GetServiceOrderByIdResponse.class)
    public JAXBElement<Resource> createGetServiceOrderByIdResponseResource(Resource value) {
        return new JAXBElement<Resource>(_GetServiceOrderByIdResponseResource_QNAME, Resource.class, GetServiceOrderByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "customer", scope = GetServiceOrderByIdResponse.class)
    public JAXBElement<Customer> createGetServiceOrderByIdResponseCustomer(Customer value) {
        return new JAXBElement<Customer>(_GetServiceOrderByIdResponseCustomer_QNAME, Customer.class, GetServiceOrderByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "status", scope = GetServiceOrderByIdResponse.class)
    public JAXBElement<String> createGetServiceOrderByIdResponseStatus(String value) {
        return new JAXBElement<String>(_CreateServiceOrderNotificationResponseStatus_QNAME, String.class, GetServiceOrderByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "serviceOrder", scope = GetServiceOrderByIdResponse.class)
    public JAXBElement<ServiceOrder> createGetServiceOrderByIdResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_CancelServiceOrderResponseServiceOrder_QNAME, ServiceOrder.class, GetServiceOrderByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "status", scope = ProcessServiceOrderResponse.class)
    public JAXBElement<String> createProcessServiceOrderResponseStatus(String value) {
        return new JAXBElement<String>(_CreateServiceOrderNotificationResponseStatus_QNAME, String.class, ProcessServiceOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ServiceOrderService/v2_0/ServiceOrderService", name = "serviceOrder", scope = ProcessServiceOrderResponse.class)
    public JAXBElement<ServiceOrder> createProcessServiceOrderResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_CancelServiceOrderResponseServiceOrder_QNAME, ServiceOrder.class, ProcessServiceOrderResponse.class, value);
    }

}
