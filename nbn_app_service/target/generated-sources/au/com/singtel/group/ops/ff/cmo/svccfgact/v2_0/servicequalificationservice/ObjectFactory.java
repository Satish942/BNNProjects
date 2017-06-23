
package au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import au.com.singtel.group.cdm.v2_0_0.service.Service;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice package. 
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

    private final static QName _QueryServiceQualificationNotificationRequest_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", "queryServiceQualificationNotificationRequest");
    private final static QName _ProcessCoverageCheckResponse_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", "processCoverageCheckResponse");
    private final static QName _ProcessCoverageCheckRequest_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", "processCoverageCheckRequest");
    private final static QName _QueryServiceQualificationRequest_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", "queryServiceQualificationRequest");
    private final static QName _QueryServiceQualificationResponse_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", "queryServiceQualificationResponse");
    private final static QName _QueryServiceQualificationNotificationResponse_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", "queryServiceQualificationNotificationResponse");
    private final static QName _QueryServiceQualificationByIdResponse_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", "queryServiceQualificationByIdResponse");
    private final static QName _ProcessFullQualificationCheckRequest_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", "processFullQualificationCheckRequest");
    private final static QName _QueryServiceQualificationByIdRequest_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", "queryServiceQualificationByIdRequest");
    private final static QName _ProcessFullQualificationCheckResponse_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", "processFullQualificationCheckResponse");
    private final static QName _QueryServiceQualificationNotificationResponseStatus_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", "status");
    private final static QName _QueryServiceQualificationResponseService_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", "service");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.servicequalificationservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessFullQualificationCheckResponse }
     * 
     */
    public ProcessFullQualificationCheckResponse createProcessFullQualificationCheckResponse() {
        return new ProcessFullQualificationCheckResponse();
    }

    /**
     * Create an instance of {@link QueryServiceQualificationNotificationResponse }
     * 
     */
    public QueryServiceQualificationNotificationResponse createQueryServiceQualificationNotificationResponse() {
        return new QueryServiceQualificationNotificationResponse();
    }

    /**
     * Create an instance of {@link QueryServiceQualificationByIdResponse }
     * 
     */
    public QueryServiceQualificationByIdResponse createQueryServiceQualificationByIdResponse() {
        return new QueryServiceQualificationByIdResponse();
    }

    /**
     * Create an instance of {@link QueryServiceQualificationNotificationRequest }
     * 
     */
    public QueryServiceQualificationNotificationRequest createQueryServiceQualificationNotificationRequest() {
        return new QueryServiceQualificationNotificationRequest();
    }

    /**
     * Create an instance of {@link QueryServiceQualificationRequest }
     * 
     */
    public QueryServiceQualificationRequest createQueryServiceQualificationRequest() {
        return new QueryServiceQualificationRequest();
    }

    /**
     * Create an instance of {@link QueryServiceQualificationByIdRequest }
     * 
     */
    public QueryServiceQualificationByIdRequest createQueryServiceQualificationByIdRequest() {
        return new QueryServiceQualificationByIdRequest();
    }

    /**
     * Create an instance of {@link QueryServiceQualificationResponse }
     * 
     */
    public QueryServiceQualificationResponse createQueryServiceQualificationResponse() {
        return new QueryServiceQualificationResponse();
    }

    /**
     * Create an instance of {@link ProcessFullQualificationCheckRequest }
     * 
     */
    public ProcessFullQualificationCheckRequest createProcessFullQualificationCheckRequest() {
        return new ProcessFullQualificationCheckRequest();
    }

    /**
     * Create an instance of {@link ProcessCoverageCheckResponse }
     * 
     */
    public ProcessCoverageCheckResponse createProcessCoverageCheckResponse() {
        return new ProcessCoverageCheckResponse();
    }

    /**
     * Create an instance of {@link ProcessCoverageCheckRequest }
     * 
     */
    public ProcessCoverageCheckRequest createProcessCoverageCheckRequest() {
        return new ProcessCoverageCheckRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryServiceQualificationNotificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "queryServiceQualificationNotificationRequest")
    public JAXBElement<QueryServiceQualificationNotificationRequest> createQueryServiceQualificationNotificationRequest(QueryServiceQualificationNotificationRequest value) {
        return new JAXBElement<QueryServiceQualificationNotificationRequest>(_QueryServiceQualificationNotificationRequest_QNAME, QueryServiceQualificationNotificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessCoverageCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "processCoverageCheckResponse")
    public JAXBElement<ProcessCoverageCheckResponse> createProcessCoverageCheckResponse(ProcessCoverageCheckResponse value) {
        return new JAXBElement<ProcessCoverageCheckResponse>(_ProcessCoverageCheckResponse_QNAME, ProcessCoverageCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessCoverageCheckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "processCoverageCheckRequest")
    public JAXBElement<ProcessCoverageCheckRequest> createProcessCoverageCheckRequest(ProcessCoverageCheckRequest value) {
        return new JAXBElement<ProcessCoverageCheckRequest>(_ProcessCoverageCheckRequest_QNAME, ProcessCoverageCheckRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryServiceQualificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "queryServiceQualificationRequest")
    public JAXBElement<QueryServiceQualificationRequest> createQueryServiceQualificationRequest(QueryServiceQualificationRequest value) {
        return new JAXBElement<QueryServiceQualificationRequest>(_QueryServiceQualificationRequest_QNAME, QueryServiceQualificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryServiceQualificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "queryServiceQualificationResponse")
    public JAXBElement<QueryServiceQualificationResponse> createQueryServiceQualificationResponse(QueryServiceQualificationResponse value) {
        return new JAXBElement<QueryServiceQualificationResponse>(_QueryServiceQualificationResponse_QNAME, QueryServiceQualificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryServiceQualificationNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "queryServiceQualificationNotificationResponse")
    public JAXBElement<QueryServiceQualificationNotificationResponse> createQueryServiceQualificationNotificationResponse(QueryServiceQualificationNotificationResponse value) {
        return new JAXBElement<QueryServiceQualificationNotificationResponse>(_QueryServiceQualificationNotificationResponse_QNAME, QueryServiceQualificationNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryServiceQualificationByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "queryServiceQualificationByIdResponse")
    public JAXBElement<QueryServiceQualificationByIdResponse> createQueryServiceQualificationByIdResponse(QueryServiceQualificationByIdResponse value) {
        return new JAXBElement<QueryServiceQualificationByIdResponse>(_QueryServiceQualificationByIdResponse_QNAME, QueryServiceQualificationByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessFullQualificationCheckRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "processFullQualificationCheckRequest")
    public JAXBElement<ProcessFullQualificationCheckRequest> createProcessFullQualificationCheckRequest(ProcessFullQualificationCheckRequest value) {
        return new JAXBElement<ProcessFullQualificationCheckRequest>(_ProcessFullQualificationCheckRequest_QNAME, ProcessFullQualificationCheckRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryServiceQualificationByIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "queryServiceQualificationByIdRequest")
    public JAXBElement<QueryServiceQualificationByIdRequest> createQueryServiceQualificationByIdRequest(QueryServiceQualificationByIdRequest value) {
        return new JAXBElement<QueryServiceQualificationByIdRequest>(_QueryServiceQualificationByIdRequest_QNAME, QueryServiceQualificationByIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessFullQualificationCheckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "processFullQualificationCheckResponse")
    public JAXBElement<ProcessFullQualificationCheckResponse> createProcessFullQualificationCheckResponse(ProcessFullQualificationCheckResponse value) {
        return new JAXBElement<ProcessFullQualificationCheckResponse>(_ProcessFullQualificationCheckResponse_QNAME, ProcessFullQualificationCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "status", scope = QueryServiceQualificationNotificationResponse.class)
    public JAXBElement<String> createQueryServiceQualificationNotificationResponseStatus(String value) {
        return new JAXBElement<String>(_QueryServiceQualificationNotificationResponseStatus_QNAME, String.class, QueryServiceQualificationNotificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "status", scope = QueryServiceQualificationResponse.class)
    public JAXBElement<String> createQueryServiceQualificationResponseStatus(String value) {
        return new JAXBElement<String>(_QueryServiceQualificationNotificationResponseStatus_QNAME, String.class, QueryServiceQualificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "service", scope = QueryServiceQualificationResponse.class)
    public JAXBElement<Service> createQueryServiceQualificationResponseService(Service value) {
        return new JAXBElement<Service>(_QueryServiceQualificationResponseService_QNAME, Service.class, QueryServiceQualificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "status", scope = QueryServiceQualificationByIdResponse.class)
    public JAXBElement<String> createQueryServiceQualificationByIdResponseStatus(String value) {
        return new JAXBElement<String>(_QueryServiceQualificationNotificationResponseStatus_QNAME, String.class, QueryServiceQualificationByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/cmo/svccfgact/v2_0/ServiceQualificationService", name = "service", scope = QueryServiceQualificationByIdResponse.class)
    public JAXBElement<Service> createQueryServiceQualificationByIdResponseService(Service value) {
        return new JAXBElement<Service>(_QueryServiceQualificationResponseService_QNAME, Service.class, QueryServiceQualificationByIdResponse.class, value);
    }

}
