
package commonservices.group.singtel.com.au.v1_0.sossqservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import au.com.singtel.group.cdm.v2_0_0.service.ServiceOrder;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the commonservices.group.singtel.com.au.v1_0.sossqservice package. 
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

    private final static QName _PerformServiceQualificationResponse_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/SOSSQService", "performServiceQualificationResponse");
    private final static QName _PerformServiceQualificationRequest_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/SOSSQService", "performServiceQualificationRequest");
    private final static QName _PerformServiceQualificationResponseDtoStatus_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/SOSSQService", "status");
    private final static QName _PerformServiceQualificationResponseDtoServiceOrder_QNAME = new QName("http://au.com.singtel.group.commonservices/v1_0/SOSSQService", "serviceOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: commonservices.group.singtel.com.au.v1_0.sossqservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PerformServiceQualificationRequestDto }
     * 
     */
    public PerformServiceQualificationRequestDto createPerformServiceQualificationRequestDto() {
        return new PerformServiceQualificationRequestDto();
    }

    /**
     * Create an instance of {@link PerformServiceQualificationResponseDto }
     * 
     */
    public PerformServiceQualificationResponseDto createPerformServiceQualificationResponseDto() {
        return new PerformServiceQualificationResponseDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformServiceQualificationResponseDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/SOSSQService", name = "performServiceQualificationResponse")
    public JAXBElement<PerformServiceQualificationResponseDto> createPerformServiceQualificationResponse(PerformServiceQualificationResponseDto value) {
        return new JAXBElement<PerformServiceQualificationResponseDto>(_PerformServiceQualificationResponse_QNAME, PerformServiceQualificationResponseDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerformServiceQualificationRequestDto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/SOSSQService", name = "performServiceQualificationRequest")
    public JAXBElement<PerformServiceQualificationRequestDto> createPerformServiceQualificationRequest(PerformServiceQualificationRequestDto value) {
        return new JAXBElement<PerformServiceQualificationRequestDto>(_PerformServiceQualificationRequest_QNAME, PerformServiceQualificationRequestDto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/SOSSQService", name = "status", scope = PerformServiceQualificationResponseDto.class)
    public JAXBElement<String> createPerformServiceQualificationResponseDtoStatus(String value) {
        return new JAXBElement<String>(_PerformServiceQualificationResponseDtoStatus_QNAME, String.class, PerformServiceQualificationResponseDto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://au.com.singtel.group.commonservices/v1_0/SOSSQService", name = "serviceOrder", scope = PerformServiceQualificationResponseDto.class)
    public JAXBElement<ServiceOrder> createPerformServiceQualificationResponseDtoServiceOrder(ServiceOrder value) {
        return new JAXBElement<ServiceOrder>(_PerformServiceQualificationResponseDtoServiceOrder_QNAME, ServiceOrder.class, PerformServiceQualificationResponseDto.class, value);
    }

}
