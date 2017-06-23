
package au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import au.com.singtel.group.cdm.v2_0_0.common.AustralianPropertyAddress;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice package. 
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

    private final static QName _QueryAddressByIdResponse_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", "queryAddressByIdResponse");
    private final static QName _QueryAddressNotificationRequest_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", "queryAddressNotificationRequest");
    private final static QName _QueryAddressByIdRequest_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", "queryAddressByIdRequest");
    private final static QName _QueryAddressResponse_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", "queryAddressResponse");
    private final static QName _QueryAddressNotificationResponse_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", "queryAddressNotificationResponse");
    private final static QName _QueryAddressRequest_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", "queryAddressRequest");
    private final static QName _QueryAddressResponseAddress_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", "address");
    private final static QName _QueryAddressResponseStatus_QNAME = new QName("http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryAddressResponse }
     * 
     */
    public QueryAddressResponse createQueryAddressResponse() {
        return new QueryAddressResponse();
    }

    /**
     * Create an instance of {@link QueryAddressNotificationRequest }
     * 
     */
    public QueryAddressNotificationRequest createQueryAddressNotificationRequest() {
        return new QueryAddressNotificationRequest();
    }

    /**
     * Create an instance of {@link QueryAddressByIdResponse }
     * 
     */
    public QueryAddressByIdResponse createQueryAddressByIdResponse() {
        return new QueryAddressByIdResponse();
    }

    /**
     * Create an instance of {@link QueryAddressRequest }
     * 
     */
    public QueryAddressRequest createQueryAddressRequest() {
        return new QueryAddressRequest();
    }

    /**
     * Create an instance of {@link QueryAddressNotificationResponse }
     * 
     */
    public QueryAddressNotificationResponse createQueryAddressNotificationResponse() {
        return new QueryAddressNotificationResponse();
    }

    /**
     * Create an instance of {@link QueryAddressByIdRequest }
     * 
     */
    public QueryAddressByIdRequest createQueryAddressByIdRequest() {
        return new QueryAddressByIdRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAddressByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", name = "queryAddressByIdResponse")
    public JAXBElement<QueryAddressByIdResponse> createQueryAddressByIdResponse(QueryAddressByIdResponse value) {
        return new JAXBElement<QueryAddressByIdResponse>(_QueryAddressByIdResponse_QNAME, QueryAddressByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAddressNotificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", name = "queryAddressNotificationRequest")
    public JAXBElement<QueryAddressNotificationRequest> createQueryAddressNotificationRequest(QueryAddressNotificationRequest value) {
        return new JAXBElement<QueryAddressNotificationRequest>(_QueryAddressNotificationRequest_QNAME, QueryAddressNotificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAddressByIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", name = "queryAddressByIdRequest")
    public JAXBElement<QueryAddressByIdRequest> createQueryAddressByIdRequest(QueryAddressByIdRequest value) {
        return new JAXBElement<QueryAddressByIdRequest>(_QueryAddressByIdRequest_QNAME, QueryAddressByIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", name = "queryAddressResponse")
    public JAXBElement<QueryAddressResponse> createQueryAddressResponse(QueryAddressResponse value) {
        return new JAXBElement<QueryAddressResponse>(_QueryAddressResponse_QNAME, QueryAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAddressNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", name = "queryAddressNotificationResponse")
    public JAXBElement<QueryAddressNotificationResponse> createQueryAddressNotificationResponse(QueryAddressNotificationResponse value) {
        return new JAXBElement<QueryAddressNotificationResponse>(_QueryAddressNotificationResponse_QNAME, QueryAddressNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryAddressRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", name = "queryAddressRequest")
    public JAXBElement<QueryAddressRequest> createQueryAddressRequest(QueryAddressRequest value) {
        return new JAXBElement<QueryAddressRequest>(_QueryAddressRequest_QNAME, QueryAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AustralianPropertyAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", name = "address", scope = QueryAddressResponse.class)
    public JAXBElement<AustralianPropertyAddress> createQueryAddressResponseAddress(AustralianPropertyAddress value) {
        return new JAXBElement<AustralianPropertyAddress>(_QueryAddressResponseAddress_QNAME, AustralianPropertyAddress.class, QueryAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", name = "status", scope = QueryAddressResponse.class)
    public JAXBElement<String> createQueryAddressResponseStatus(String value) {
        return new JAXBElement<String>(_QueryAddressResponseStatus_QNAME, String.class, QueryAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", name = "status", scope = QueryAddressNotificationResponse.class)
    public JAXBElement<String> createQueryAddressNotificationResponseStatus(String value) {
        return new JAXBElement<String>(_QueryAddressResponseStatus_QNAME, String.class, QueryAddressNotificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", name = "status", scope = QueryAddressByIdResponse.class)
    public JAXBElement<String> createQueryAddressByIdResponseStatus(String value) {
        return new JAXBElement<String>(_QueryAddressResponseStatus_QNAME, String.class, QueryAddressByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AustralianPropertyAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/ops/ff/crm/orderhandling/v2_0/AddressService", name = "address", scope = QueryAddressByIdResponse.class)
    public JAXBElement<AustralianPropertyAddress> createQueryAddressByIdResponseAddress(AustralianPropertyAddress value) {
        return new JAXBElement<AustralianPropertyAddress>(_QueryAddressResponseAddress_QNAME, AustralianPropertyAddress.class, QueryAddressByIdResponse.class, value);
    }

}
