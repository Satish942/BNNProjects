
package au.com.nbnco.cim.manageservicelimiter.v4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.nbnco.cim.manageservicelimiter.v4 package. 
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

    private final static QName _ManageServiceLimiterNotification_QNAME = new QName("http://www.nbnco.com.au/cim/manageServiceLimiter/v4", "ManageServiceLimiterNotification");
    private final static QName _ManageServiceLimiterNotificationResponse_QNAME = new QName("http://www.nbnco.com.au/cim/manageServiceLimiter/v4", "ManageServiceLimiterNotificationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.nbnco.cim.manageservicelimiter.v4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManageServiceLimiterNotificationResponse }
     * 
     */
    public ManageServiceLimiterNotificationResponse createManageServiceLimiterNotificationResponse() {
        return new ManageServiceLimiterNotificationResponse();
    }

    /**
     * Create an instance of {@link ManageServiceLimiterNotificationRequest }
     * 
     */
    public ManageServiceLimiterNotificationRequest createManageServiceLimiterNotificationRequest() {
        return new ManageServiceLimiterNotificationRequest();
    }

    /**
     * Create an instance of {@link ServiceLimit }
     * 
     */
    public ServiceLimit createServiceLimit() {
        return new ServiceLimit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageServiceLimiterNotificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/manageServiceLimiter/v4", name = "ManageServiceLimiterNotification")
    public JAXBElement<ManageServiceLimiterNotificationRequest> createManageServiceLimiterNotification(ManageServiceLimiterNotificationRequest value) {
        return new JAXBElement<ManageServiceLimiterNotificationRequest>(_ManageServiceLimiterNotification_QNAME, ManageServiceLimiterNotificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManageServiceLimiterNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/manageServiceLimiter/v4", name = "ManageServiceLimiterNotificationResponse")
    public JAXBElement<ManageServiceLimiterNotificationResponse> createManageServiceLimiterNotificationResponse(ManageServiceLimiterNotificationResponse value) {
        return new JAXBElement<ManageServiceLimiterNotificationResponse>(_ManageServiceLimiterNotificationResponse_QNAME, ManageServiceLimiterNotificationResponse.class, null, value);
    }

}
