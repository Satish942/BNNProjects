
package au.com.singtel.group.faultnotificationservice.v2_0.faultnotificationservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.singtel.group.faultnotificationservice.v2_0.faultnotificationservice package. 
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

    private final static QName _HandleFaultNotificationRequest_QNAME = new QName("http://www.group.singtel.com.au/FaultNotificationService/v2_0/FaultNotificationService", "handleFaultNotificationRequest");
    private final static QName _HandleFaultNotificationResponse_QNAME = new QName("http://www.group.singtel.com.au/FaultNotificationService/v2_0/FaultNotificationService", "handleFaultNotificationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.singtel.group.faultnotificationservice.v2_0.faultnotificationservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HandleFaultNotificationRequest }
     * 
     */
    public HandleFaultNotificationRequest createHandleFaultNotificationRequest() {
        return new HandleFaultNotificationRequest();
    }

    /**
     * Create an instance of {@link HandleFaultNotificationResponse }
     * 
     */
    public HandleFaultNotificationResponse createHandleFaultNotificationResponse() {
        return new HandleFaultNotificationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleFaultNotificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/FaultNotificationService/v2_0/FaultNotificationService", name = "handleFaultNotificationRequest")
    public JAXBElement<HandleFaultNotificationRequest> createHandleFaultNotificationRequest(HandleFaultNotificationRequest value) {
        return new JAXBElement<HandleFaultNotificationRequest>(_HandleFaultNotificationRequest_QNAME, HandleFaultNotificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleFaultNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/FaultNotificationService/v2_0/FaultNotificationService", name = "handleFaultNotificationResponse")
    public JAXBElement<HandleFaultNotificationResponse> createHandleFaultNotificationResponse(HandleFaultNotificationResponse value) {
        return new JAXBElement<HandleFaultNotificationResponse>(_HandleFaultNotificationResponse_QNAME, HandleFaultNotificationResponse.class, null, value);
    }

}
