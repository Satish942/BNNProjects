
package au.com.singtel.group.updatenotificationservice.v1_0.updatenotificationservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.singtel.group.updatenotificationservice.v1_0.updatenotificationservice package. 
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

    private final static QName _UpdateNotificationRequest_QNAME = new QName("http://www.group.singtel.com.au/UpdateNotificationService/v1_0/UpdateNotificationService", "updateNotificationRequest");
    private final static QName _UpdateNotificationResponse_QNAME = new QName("http://www.group.singtel.com.au/UpdateNotificationService/v1_0/UpdateNotificationService", "updateNotificationResponse");
    private final static QName _UpdateNotificationResponseStatus_QNAME = new QName("http://www.group.singtel.com.au/UpdateNotificationService/v1_0/UpdateNotificationService", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.singtel.group.updatenotificationservice.v1_0.updatenotificationservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateNotificationResponse }
     * 
     */
    public UpdateNotificationResponse createUpdateNotificationResponse() {
        return new UpdateNotificationResponse();
    }

    /**
     * Create an instance of {@link UpdateNotificationRequest }
     * 
     */
    public UpdateNotificationRequest createUpdateNotificationRequest() {
        return new UpdateNotificationRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNotificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/UpdateNotificationService/v1_0/UpdateNotificationService", name = "updateNotificationRequest")
    public JAXBElement<UpdateNotificationRequest> createUpdateNotificationRequest(UpdateNotificationRequest value) {
        return new JAXBElement<UpdateNotificationRequest>(_UpdateNotificationRequest_QNAME, UpdateNotificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/UpdateNotificationService/v1_0/UpdateNotificationService", name = "updateNotificationResponse")
    public JAXBElement<UpdateNotificationResponse> createUpdateNotificationResponse(UpdateNotificationResponse value) {
        return new JAXBElement<UpdateNotificationResponse>(_UpdateNotificationResponse_QNAME, UpdateNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/UpdateNotificationService/v1_0/UpdateNotificationService", name = "status", scope = UpdateNotificationResponse.class)
    public JAXBElement<String> createUpdateNotificationResponseStatus(String value) {
        return new JAXBElement<String>(_UpdateNotificationResponseStatus_QNAME, String.class, UpdateNotificationResponse.class, value);
    }

}
