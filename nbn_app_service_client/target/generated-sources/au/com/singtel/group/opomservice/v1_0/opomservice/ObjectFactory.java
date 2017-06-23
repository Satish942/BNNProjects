
package au.com.singtel.group.opomservice.v1_0.opomservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.singtel.group.opomservice.v1_0.opomservice package. 
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

    private final static QName _OpomUpdateNBNNotifStatusResponse_QNAME = new QName("http://www.group.singtel.com.au/OPOMService/v1_0/OPOMService", "opomUpdateNBNNotifStatusResponse");
    private final static QName _OpomUpdateNBNNotifStatusRequest_QNAME = new QName("http://www.group.singtel.com.au/OPOMService/v1_0/OPOMService", "opomUpdateNBNNotifStatusRequest");
    private final static QName _OpomUpdateNBNNotifStatusResponseStatus_QNAME = new QName("http://www.group.singtel.com.au/OPOMService/v1_0/OPOMService", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.singtel.group.opomservice.v1_0.opomservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OpomUpdateNBNNotifStatusRequest }
     * 
     */
    public OpomUpdateNBNNotifStatusRequest createOpomUpdateNBNNotifStatusRequest() {
        return new OpomUpdateNBNNotifStatusRequest();
    }

    /**
     * Create an instance of {@link OpomUpdateNBNNotifStatusResponse }
     * 
     */
    public OpomUpdateNBNNotifStatusResponse createOpomUpdateNBNNotifStatusResponse() {
        return new OpomUpdateNBNNotifStatusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpomUpdateNBNNotifStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/OPOMService/v1_0/OPOMService", name = "opomUpdateNBNNotifStatusResponse")
    public JAXBElement<OpomUpdateNBNNotifStatusResponse> createOpomUpdateNBNNotifStatusResponse(OpomUpdateNBNNotifStatusResponse value) {
        return new JAXBElement<OpomUpdateNBNNotifStatusResponse>(_OpomUpdateNBNNotifStatusResponse_QNAME, OpomUpdateNBNNotifStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpomUpdateNBNNotifStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/OPOMService/v1_0/OPOMService", name = "opomUpdateNBNNotifStatusRequest")
    public JAXBElement<OpomUpdateNBNNotifStatusRequest> createOpomUpdateNBNNotifStatusRequest(OpomUpdateNBNNotifStatusRequest value) {
        return new JAXBElement<OpomUpdateNBNNotifStatusRequest>(_OpomUpdateNBNNotifStatusRequest_QNAME, OpomUpdateNBNNotifStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/OPOMService/v1_0/OPOMService", name = "status", scope = OpomUpdateNBNNotifStatusResponse.class)
    public JAXBElement<String> createOpomUpdateNBNNotifStatusResponseStatus(String value) {
        return new JAXBElement<String>(_OpomUpdateNBNNotifStatusResponseStatus_QNAME, String.class, OpomUpdateNBNNotifStatusResponse.class, value);
    }

}
