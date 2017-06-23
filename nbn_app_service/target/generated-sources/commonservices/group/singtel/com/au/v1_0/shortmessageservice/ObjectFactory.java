
package commonservices.group.singtel.com.au.v1_0.shortmessageservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the commonservices.group.singtel.com.au.v1_0.shortmessageservice package. 
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

    private final static QName _SendSmsRequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/ShortMessageService", "sendSmsRequest");
    private final static QName _ReceiveSmsResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/ShortMessageService", "receiveSmsResponse");
    private final static QName _SendSmsResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/ShortMessageService", "sendSmsResponse");
    private final static QName _ReceiveSmsRequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/ShortMessageService", "receiveSmsRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: commonservices.group.singtel.com.au.v1_0.shortmessageservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendSmsResponseDto }
     * 
     */
    public SendSmsResponseDto createSendSmsResponseDto() {
        return new SendSmsResponseDto();
    }

    /**
     * Create an instance of {@link ReceiveSmsRequestDto }
     * 
     */
    public ReceiveSmsRequestDto createReceiveSmsRequestDto() {
        return new ReceiveSmsRequestDto();
    }

    /**
     * Create an instance of {@link ReceiveSmsResponseDto }
     * 
     */
    public ReceiveSmsResponseDto createReceiveSmsResponseDto() {
        return new ReceiveSmsResponseDto();
    }

    /**
     * Create an instance of {@link SendSmsRequestDto }
     * 
     */
    public SendSmsRequestDto createSendSmsRequestDto() {
        return new SendSmsRequestDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsRequestDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/ShortMessageService", name = "sendSmsRequest")
    public JAXBElement<SendSmsRequestDto> createSendSmsRequest(SendSmsRequestDto value) {
        return new JAXBElement<SendSmsRequestDto>(_SendSmsRequest_QNAME, SendSmsRequestDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveSmsResponseDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/ShortMessageService", name = "receiveSmsResponse")
    public JAXBElement<ReceiveSmsResponseDto> createReceiveSmsResponse(ReceiveSmsResponseDto value) {
        return new JAXBElement<ReceiveSmsResponseDto>(_ReceiveSmsResponse_QNAME, ReceiveSmsResponseDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendSmsResponseDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/ShortMessageService", name = "sendSmsResponse")
    public JAXBElement<SendSmsResponseDto> createSendSmsResponse(SendSmsResponseDto value) {
        return new JAXBElement<SendSmsResponseDto>(_SendSmsResponse_QNAME, SendSmsResponseDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveSmsRequestDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/ShortMessageService", name = "receiveSmsRequest")
    public JAXBElement<ReceiveSmsRequestDto> createReceiveSmsRequest(ReceiveSmsRequestDto value) {
        return new JAXBElement<ReceiveSmsRequestDto>(_ReceiveSmsRequest_QNAME, ReceiveSmsRequestDto.class, null, value);
    }

}
