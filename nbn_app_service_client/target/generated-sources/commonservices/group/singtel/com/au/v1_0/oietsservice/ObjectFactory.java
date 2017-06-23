
package commonservices.group.singtel.com.au.v1_0.oietsservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import au.com.singtel.group.cdm.v2_0_0.service.ServiceOrder;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the commonservices.group.singtel.com.au.v1_0.oietsservice package. 
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

    private final static QName _GetSpeedDetailsResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "getSpeedDetailsResponse");
    private final static QName _NsiGetNbnTemplateRequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "nsiGetNbnTemplateRequest");
    private final static QName _NsiGetNbnTemplateResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "nsiGetNbnTemplateResponse");
    private final static QName _SaveOWOrderRequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "saveOWOrderRequest");
    private final static QName _NsiBatchCheckCVCAvailableForCSARequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "nsiBatchCheckCVCAvailableForCSARequest");
    private final static QName _SaveOWOrderResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "saveOWOrderResponse");
    private final static QName _NsiReserveCTAGForCSARequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "nsiReserveCTAGForCSARequest");
    private final static QName _NsiGetBandwidthProfileResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "nsiGetBandwidthProfileResponse");
    private final static QName _SaveAVCRequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "saveAVCRequest");
    private final static QName _NsiReturnReservedCTAGRequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "nsiReturnReservedCTAGRequest");
    private final static QName _SaveAVCResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "saveAVCResponse");
    private final static QName _NsiReserveCTAGForCSAResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "nsiReserveCTAGForCSAResponse");
    private final static QName _NsiCheckCVCAvailableForCSAResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "nsiCheckCVCAvailableForCSAResponse");
    private final static QName _GetNsiCvcCtagAvcByGsidRequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "getNsiCvcCtagAvcByGsidRequest");
    private final static QName _GetNsiCvcCtagAvcByGsidResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "getNsiCvcCtagAvcByGsidResponse");
    private final static QName _NsiBatchCheckCVCAvailableForCSAResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "nsiBatchCheckCVCAvailableForCSAResponse");
    private final static QName _NsiGetBandwidthProfileRequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "nsiGetBandwidthProfileRequest");
    private final static QName _GetSpeedDetailsRequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "getSpeedDetailsRequest");
    private final static QName _NsiCheckCVCAvailableForCSARequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "nsiCheckCVCAvailableForCSARequest");
    private final static QName _NsiReturnReservedCTAGResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "nsiReturnReservedCTAGResponse");
    private final static QName _SaveAVCResponseServiceOrder_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "serviceOrder");
    private final static QName _SaveAVCResponseStatus_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/OIETSService", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: commonservices.group.singtel.com.au.v1_0.oietsservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NsiReserveCTAGForCSARequest }
     * 
     */
    public NsiReserveCTAGForCSARequest createNsiReserveCTAGForCSARequest() {
        return new NsiReserveCTAGForCSARequest();
    }

    /**
     * Create an instance of {@link NsiReserveCTAGForCSAResponse }
     * 
     */
    public NsiReserveCTAGForCSAResponse createNsiReserveCTAGForCSAResponse() {
        return new NsiReserveCTAGForCSAResponse();
    }

    /**
     * Create an instance of {@link NsiCheckCVCAvailableForCSAResponse }
     * 
     */
    public NsiCheckCVCAvailableForCSAResponse createNsiCheckCVCAvailableForCSAResponse() {
        return new NsiCheckCVCAvailableForCSAResponse();
    }

    /**
     * Create an instance of {@link NsiReturnReservedCTAGRequest }
     * 
     */
    public NsiReturnReservedCTAGRequest createNsiReturnReservedCTAGRequest() {
        return new NsiReturnReservedCTAGRequest();
    }

    /**
     * Create an instance of {@link NsiGetBandwidthProfileResponse }
     * 
     */
    public NsiGetBandwidthProfileResponse createNsiGetBandwidthProfileResponse() {
        return new NsiGetBandwidthProfileResponse();
    }

    /**
     * Create an instance of {@link SaveAVCRequest }
     * 
     */
    public SaveAVCRequest createSaveAVCRequest() {
        return new SaveAVCRequest();
    }

    /**
     * Create an instance of {@link GetNsiCvcCtagAvcByGsidResponse }
     * 
     */
    public GetNsiCvcCtagAvcByGsidResponse createGetNsiCvcCtagAvcByGsidResponse() {
        return new GetNsiCvcCtagAvcByGsidResponse();
    }

    /**
     * Create an instance of {@link GetSpeedDetailsResponse }
     * 
     */
    public GetSpeedDetailsResponse createGetSpeedDetailsResponse() {
        return new GetSpeedDetailsResponse();
    }

    /**
     * Create an instance of {@link GetNsiCvcCtagAvcByGsidRequest }
     * 
     */
    public GetNsiCvcCtagAvcByGsidRequest createGetNsiCvcCtagAvcByGsidRequest() {
        return new GetNsiCvcCtagAvcByGsidRequest();
    }

    /**
     * Create an instance of {@link NsiGetBandwidthProfileRequest }
     * 
     */
    public NsiGetBandwidthProfileRequest createNsiGetBandwidthProfileRequest() {
        return new NsiGetBandwidthProfileRequest();
    }

    /**
     * Create an instance of {@link NsiGetNbnTemplateResponse }
     * 
     */
    public NsiGetNbnTemplateResponse createNsiGetNbnTemplateResponse() {
        return new NsiGetNbnTemplateResponse();
    }

    /**
     * Create an instance of {@link SaveOWOrderResponse }
     * 
     */
    public SaveOWOrderResponse createSaveOWOrderResponse() {
        return new SaveOWOrderResponse();
    }

    /**
     * Create an instance of {@link NsiGetNbnTemplateRequest }
     * 
     */
    public NsiGetNbnTemplateRequest createNsiGetNbnTemplateRequest() {
        return new NsiGetNbnTemplateRequest();
    }

    /**
     * Create an instance of {@link SaveAVCResponse }
     * 
     */
    public SaveAVCResponse createSaveAVCResponse() {
        return new SaveAVCResponse();
    }

    /**
     * Create an instance of {@link SaveOWOrderRequest }
     * 
     */
    public SaveOWOrderRequest createSaveOWOrderRequest() {
        return new SaveOWOrderRequest();
    }

    /**
     * Create an instance of {@link GetSpeedDetailsRequest }
     * 
     */
    public GetSpeedDetailsRequest createGetSpeedDetailsRequest() {
        return new GetSpeedDetailsRequest();
    }

    /**
     * Create an instance of {@link NsiCheckCVCAvailableForCSARequest }
     * 
     */
    public NsiCheckCVCAvailableForCSARequest createNsiCheckCVCAvailableForCSARequest() {
        return new NsiCheckCVCAvailableForCSARequest();
    }

    /**
     * Create an instance of {@link NsiBatchCheckCVCAvailableForCSARequest }
     * 
     */
    public NsiBatchCheckCVCAvailableForCSARequest createNsiBatchCheckCVCAvailableForCSARequest() {
        return new NsiBatchCheckCVCAvailableForCSARequest();
    }

    /**
     * Create an instance of {@link NsiReturnReservedCTAGResponse }
     * 
     */
    public NsiReturnReservedCTAGResponse createNsiReturnReservedCTAGResponse() {
        return new NsiReturnReservedCTAGResponse();
    }

    /**
     * Create an instance of {@link NsiBatchCheckCVCAvailableForCSAResponse }
     * 
     */
    public NsiBatchCheckCVCAvailableForCSAResponse createNsiBatchCheckCVCAvailableForCSAResponse() {
        return new NsiBatchCheckCVCAvailableForCSAResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpeedDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "getSpeedDetailsResponse")
    public JAXBElement<GetSpeedDetailsResponse> createGetSpeedDetailsResponse(GetSpeedDetailsResponse value) {
        return new JAXBElement<GetSpeedDetailsResponse>(_GetSpeedDetailsResponse_QNAME, GetSpeedDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NsiGetNbnTemplateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "nsiGetNbnTemplateRequest")
    public JAXBElement<NsiGetNbnTemplateRequest> createNsiGetNbnTemplateRequest(NsiGetNbnTemplateRequest value) {
        return new JAXBElement<NsiGetNbnTemplateRequest>(_NsiGetNbnTemplateRequest_QNAME, NsiGetNbnTemplateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NsiGetNbnTemplateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "nsiGetNbnTemplateResponse")
    public JAXBElement<NsiGetNbnTemplateResponse> createNsiGetNbnTemplateResponse(NsiGetNbnTemplateResponse value) {
        return new JAXBElement<NsiGetNbnTemplateResponse>(_NsiGetNbnTemplateResponse_QNAME, NsiGetNbnTemplateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOWOrderRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "saveOWOrderRequest")
    public JAXBElement<SaveOWOrderRequest> createSaveOWOrderRequest(SaveOWOrderRequest value) {
        return new JAXBElement<SaveOWOrderRequest>(_SaveOWOrderRequest_QNAME, SaveOWOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NsiBatchCheckCVCAvailableForCSARequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "nsiBatchCheckCVCAvailableForCSARequest")
    public JAXBElement<NsiBatchCheckCVCAvailableForCSARequest> createNsiBatchCheckCVCAvailableForCSARequest(NsiBatchCheckCVCAvailableForCSARequest value) {
        return new JAXBElement<NsiBatchCheckCVCAvailableForCSARequest>(_NsiBatchCheckCVCAvailableForCSARequest_QNAME, NsiBatchCheckCVCAvailableForCSARequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveOWOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "saveOWOrderResponse")
    public JAXBElement<SaveOWOrderResponse> createSaveOWOrderResponse(SaveOWOrderResponse value) {
        return new JAXBElement<SaveOWOrderResponse>(_SaveOWOrderResponse_QNAME, SaveOWOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NsiReserveCTAGForCSARequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "nsiReserveCTAGForCSARequest")
    public JAXBElement<NsiReserveCTAGForCSARequest> createNsiReserveCTAGForCSARequest(NsiReserveCTAGForCSARequest value) {
        return new JAXBElement<NsiReserveCTAGForCSARequest>(_NsiReserveCTAGForCSARequest_QNAME, NsiReserveCTAGForCSARequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NsiGetBandwidthProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "nsiGetBandwidthProfileResponse")
    public JAXBElement<NsiGetBandwidthProfileResponse> createNsiGetBandwidthProfileResponse(NsiGetBandwidthProfileResponse value) {
        return new JAXBElement<NsiGetBandwidthProfileResponse>(_NsiGetBandwidthProfileResponse_QNAME, NsiGetBandwidthProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveAVCRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "saveAVCRequest")
    public JAXBElement<SaveAVCRequest> createSaveAVCRequest(SaveAVCRequest value) {
        return new JAXBElement<SaveAVCRequest>(_SaveAVCRequest_QNAME, SaveAVCRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NsiReturnReservedCTAGRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "nsiReturnReservedCTAGRequest")
    public JAXBElement<NsiReturnReservedCTAGRequest> createNsiReturnReservedCTAGRequest(NsiReturnReservedCTAGRequest value) {
        return new JAXBElement<NsiReturnReservedCTAGRequest>(_NsiReturnReservedCTAGRequest_QNAME, NsiReturnReservedCTAGRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveAVCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "saveAVCResponse")
    public JAXBElement<SaveAVCResponse> createSaveAVCResponse(SaveAVCResponse value) {
        return new JAXBElement<SaveAVCResponse>(_SaveAVCResponse_QNAME, SaveAVCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NsiReserveCTAGForCSAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "nsiReserveCTAGForCSAResponse")
    public JAXBElement<NsiReserveCTAGForCSAResponse> createNsiReserveCTAGForCSAResponse(NsiReserveCTAGForCSAResponse value) {
        return new JAXBElement<NsiReserveCTAGForCSAResponse>(_NsiReserveCTAGForCSAResponse_QNAME, NsiReserveCTAGForCSAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NsiCheckCVCAvailableForCSAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "nsiCheckCVCAvailableForCSAResponse")
    public JAXBElement<NsiCheckCVCAvailableForCSAResponse> createNsiCheckCVCAvailableForCSAResponse(NsiCheckCVCAvailableForCSAResponse value) {
        return new JAXBElement<NsiCheckCVCAvailableForCSAResponse>(_NsiCheckCVCAvailableForCSAResponse_QNAME, NsiCheckCVCAvailableForCSAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNsiCvcCtagAvcByGsidRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "getNsiCvcCtagAvcByGsidRequest")
    public JAXBElement<GetNsiCvcCtagAvcByGsidRequest> createGetNsiCvcCtagAvcByGsidRequest(GetNsiCvcCtagAvcByGsidRequest value) {
        return new JAXBElement<GetNsiCvcCtagAvcByGsidRequest>(_GetNsiCvcCtagAvcByGsidRequest_QNAME, GetNsiCvcCtagAvcByGsidRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNsiCvcCtagAvcByGsidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "getNsiCvcCtagAvcByGsidResponse")
    public JAXBElement<GetNsiCvcCtagAvcByGsidResponse> createGetNsiCvcCtagAvcByGsidResponse(GetNsiCvcCtagAvcByGsidResponse value) {
        return new JAXBElement<GetNsiCvcCtagAvcByGsidResponse>(_GetNsiCvcCtagAvcByGsidResponse_QNAME, GetNsiCvcCtagAvcByGsidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NsiBatchCheckCVCAvailableForCSAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "nsiBatchCheckCVCAvailableForCSAResponse")
    public JAXBElement<NsiBatchCheckCVCAvailableForCSAResponse> createNsiBatchCheckCVCAvailableForCSAResponse(NsiBatchCheckCVCAvailableForCSAResponse value) {
        return new JAXBElement<NsiBatchCheckCVCAvailableForCSAResponse>(_NsiBatchCheckCVCAvailableForCSAResponse_QNAME, NsiBatchCheckCVCAvailableForCSAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NsiGetBandwidthProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "nsiGetBandwidthProfileRequest")
    public JAXBElement<NsiGetBandwidthProfileRequest> createNsiGetBandwidthProfileRequest(NsiGetBandwidthProfileRequest value) {
        return new JAXBElement<NsiGetBandwidthProfileRequest>(_NsiGetBandwidthProfileRequest_QNAME, NsiGetBandwidthProfileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpeedDetailsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "getSpeedDetailsRequest")
    public JAXBElement<GetSpeedDetailsRequest> createGetSpeedDetailsRequest(GetSpeedDetailsRequest value) {
        return new JAXBElement<GetSpeedDetailsRequest>(_GetSpeedDetailsRequest_QNAME, GetSpeedDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NsiCheckCVCAvailableForCSARequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "nsiCheckCVCAvailableForCSARequest")
    public JAXBElement<NsiCheckCVCAvailableForCSARequest> createNsiCheckCVCAvailableForCSARequest(NsiCheckCVCAvailableForCSARequest value) {
        return new JAXBElement<NsiCheckCVCAvailableForCSARequest>(_NsiCheckCVCAvailableForCSARequest_QNAME, NsiCheckCVCAvailableForCSARequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NsiReturnReservedCTAGResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "nsiReturnReservedCTAGResponse")
    public JAXBElement<NsiReturnReservedCTAGResponse> createNsiReturnReservedCTAGResponse(NsiReturnReservedCTAGResponse value) {
        return new JAXBElement<NsiReturnReservedCTAGResponse>(_NsiReturnReservedCTAGResponse_QNAME, NsiReturnReservedCTAGResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "serviceOrder", scope = SaveAVCResponse.class)
    public JAXBElement<ServiceOrder> createSaveAVCResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_SaveAVCResponseServiceOrder_QNAME, ServiceOrder.class, SaveAVCResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "status", scope = SaveAVCResponse.class)
    public JAXBElement<String> createSaveAVCResponseStatus(String value) {
        return new JAXBElement<String>(_SaveAVCResponseStatus_QNAME, String.class, SaveAVCResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "serviceOrder", scope = NsiGetNbnTemplateResponse.class)
    public JAXBElement<ServiceOrder> createNsiGetNbnTemplateResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_SaveAVCResponseServiceOrder_QNAME, ServiceOrder.class, NsiGetNbnTemplateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "status", scope = NsiGetNbnTemplateResponse.class)
    public JAXBElement<String> createNsiGetNbnTemplateResponseStatus(String value) {
        return new JAXBElement<String>(_SaveAVCResponseStatus_QNAME, String.class, NsiGetNbnTemplateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "serviceOrder", scope = GetNsiCvcCtagAvcByGsidResponse.class)
    public JAXBElement<ServiceOrder> createGetNsiCvcCtagAvcByGsidResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_SaveAVCResponseServiceOrder_QNAME, ServiceOrder.class, GetNsiCvcCtagAvcByGsidResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "status", scope = GetNsiCvcCtagAvcByGsidResponse.class)
    public JAXBElement<String> createGetNsiCvcCtagAvcByGsidResponseStatus(String value) {
        return new JAXBElement<String>(_SaveAVCResponseStatus_QNAME, String.class, GetNsiCvcCtagAvcByGsidResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "serviceOrder", scope = NsiBatchCheckCVCAvailableForCSAResponse.class)
    public JAXBElement<ServiceOrder> createNsiBatchCheckCVCAvailableForCSAResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_SaveAVCResponseServiceOrder_QNAME, ServiceOrder.class, NsiBatchCheckCVCAvailableForCSAResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "status", scope = NsiBatchCheckCVCAvailableForCSAResponse.class)
    public JAXBElement<String> createNsiBatchCheckCVCAvailableForCSAResponseStatus(String value) {
        return new JAXBElement<String>(_SaveAVCResponseStatus_QNAME, String.class, NsiBatchCheckCVCAvailableForCSAResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "serviceOrder", scope = NsiReserveCTAGForCSAResponse.class)
    public JAXBElement<ServiceOrder> createNsiReserveCTAGForCSAResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_SaveAVCResponseServiceOrder_QNAME, ServiceOrder.class, NsiReserveCTAGForCSAResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "status", scope = NsiReserveCTAGForCSAResponse.class)
    public JAXBElement<String> createNsiReserveCTAGForCSAResponseStatus(String value) {
        return new JAXBElement<String>(_SaveAVCResponseStatus_QNAME, String.class, NsiReserveCTAGForCSAResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "serviceOrder", scope = NsiGetBandwidthProfileResponse.class)
    public JAXBElement<ServiceOrder> createNsiGetBandwidthProfileResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_SaveAVCResponseServiceOrder_QNAME, ServiceOrder.class, NsiGetBandwidthProfileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "status", scope = NsiGetBandwidthProfileResponse.class)
    public JAXBElement<String> createNsiGetBandwidthProfileResponseStatus(String value) {
        return new JAXBElement<String>(_SaveAVCResponseStatus_QNAME, String.class, NsiGetBandwidthProfileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "serviceOrder", scope = NsiReturnReservedCTAGResponse.class)
    public JAXBElement<ServiceOrder> createNsiReturnReservedCTAGResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_SaveAVCResponseServiceOrder_QNAME, ServiceOrder.class, NsiReturnReservedCTAGResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "status", scope = NsiReturnReservedCTAGResponse.class)
    public JAXBElement<String> createNsiReturnReservedCTAGResponseStatus(String value) {
        return new JAXBElement<String>(_SaveAVCResponseStatus_QNAME, String.class, NsiReturnReservedCTAGResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "serviceOrder", scope = NsiCheckCVCAvailableForCSAResponse.class)
    public JAXBElement<ServiceOrder> createNsiCheckCVCAvailableForCSAResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_SaveAVCResponseServiceOrder_QNAME, ServiceOrder.class, NsiCheckCVCAvailableForCSAResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "status", scope = NsiCheckCVCAvailableForCSAResponse.class)
    public JAXBElement<String> createNsiCheckCVCAvailableForCSAResponseStatus(String value) {
        return new JAXBElement<String>(_SaveAVCResponseStatus_QNAME, String.class, NsiCheckCVCAvailableForCSAResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "serviceOrder", scope = SaveOWOrderResponse.class)
    public JAXBElement<ServiceOrder> createSaveOWOrderResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_SaveAVCResponseServiceOrder_QNAME, ServiceOrder.class, SaveOWOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "status", scope = SaveOWOrderResponse.class)
    public JAXBElement<String> createSaveOWOrderResponseStatus(String value) {
        return new JAXBElement<String>(_SaveAVCResponseStatus_QNAME, String.class, SaveOWOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "serviceOrder", scope = GetSpeedDetailsResponse.class)
    public JAXBElement<ServiceOrder> createGetSpeedDetailsResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_SaveAVCResponseServiceOrder_QNAME, ServiceOrder.class, GetSpeedDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/OIETSService", name = "status", scope = GetSpeedDetailsResponse.class)
    public JAXBElement<String> createGetSpeedDetailsResponseStatus(String value) {
        return new JAXBElement<String>(_SaveAVCResponseStatus_QNAME, String.class, GetSpeedDetailsResponse.class, value);
    }

}
