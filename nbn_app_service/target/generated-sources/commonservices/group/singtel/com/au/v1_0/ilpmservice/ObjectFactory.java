
package commonservices.group.singtel.com.au.v1_0.ilpmservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import au.com.singtel.group.cdm.v2_0_0.service.ServiceOrder;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the commonservices.group.singtel.com.au.v1_0.ilpmservice package. 
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

    private final static QName _IlpmRetrieveBillingPackageIdResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/ILPMService", "ilpmRetrieveBillingPackageIdResponse");
    private final static QName _IlpmRetrieveBillingPackageIdRequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/ILPMService", "ilpmRetrieveBillingPackageIdRequest");
    private final static QName _IlpmRetrieveBillingPackageIdResponseStatus_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/ILPMService", "status");
    private final static QName _IlpmRetrieveBillingPackageIdResponseServiceOrder_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/ILPMService", "serviceOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: commonservices.group.singtel.com.au.v1_0.ilpmservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IlpmRetrieveBillingPackageIdRequest }
     * 
     */
    public IlpmRetrieveBillingPackageIdRequest createIlpmRetrieveBillingPackageIdRequest() {
        return new IlpmRetrieveBillingPackageIdRequest();
    }

    /**
     * Create an instance of {@link IlpmRetrieveBillingPackageIdResponse }
     * 
     */
    public IlpmRetrieveBillingPackageIdResponse createIlpmRetrieveBillingPackageIdResponse() {
        return new IlpmRetrieveBillingPackageIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IlpmRetrieveBillingPackageIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/ILPMService", name = "ilpmRetrieveBillingPackageIdResponse")
    public JAXBElement<IlpmRetrieveBillingPackageIdResponse> createIlpmRetrieveBillingPackageIdResponse(IlpmRetrieveBillingPackageIdResponse value) {
        return new JAXBElement<IlpmRetrieveBillingPackageIdResponse>(_IlpmRetrieveBillingPackageIdResponse_QNAME, IlpmRetrieveBillingPackageIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IlpmRetrieveBillingPackageIdRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/ILPMService", name = "ilpmRetrieveBillingPackageIdRequest")
    public JAXBElement<IlpmRetrieveBillingPackageIdRequest> createIlpmRetrieveBillingPackageIdRequest(IlpmRetrieveBillingPackageIdRequest value) {
        return new JAXBElement<IlpmRetrieveBillingPackageIdRequest>(_IlpmRetrieveBillingPackageIdRequest_QNAME, IlpmRetrieveBillingPackageIdRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/ILPMService", name = "status", scope = IlpmRetrieveBillingPackageIdResponse.class)
    public JAXBElement<String> createIlpmRetrieveBillingPackageIdResponseStatus(String value) {
        return new JAXBElement<String>(_IlpmRetrieveBillingPackageIdResponseStatus_QNAME, String.class, IlpmRetrieveBillingPackageIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/ILPMService", name = "serviceOrder", scope = IlpmRetrieveBillingPackageIdResponse.class)
    public JAXBElement<ServiceOrder> createIlpmRetrieveBillingPackageIdResponseServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_IlpmRetrieveBillingPackageIdResponseServiceOrder_QNAME, ServiceOrder.class, IlpmRetrieveBillingPackageIdResponse.class, value);
    }

}
