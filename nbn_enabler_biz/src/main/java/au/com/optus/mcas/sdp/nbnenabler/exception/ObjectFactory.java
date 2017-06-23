
package au.com.optus.mcas.sdp.nbnenabler.exception;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.singtel.group.cdm.v1_0_0.exception package. 
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

    private final static QName _ErrorResponse_QNAME = new QName("http://www.group.singtel.com.au/cdm/v1_0_0/exception", "errorResponse");
    private final static QName _SourceSystemFault_QNAME = new QName("http://www.group.singtel.com.au/cdm/v1_0_0/exception", "sourceSystemFault");
    private final static QName _ServiceException_QNAME = new QName("http://www.group.singtel.com.au/cdm/v1_0_0/exception", "ServiceException");
    private final static QName _BusinessException_QNAME = new QName("http://www.group.singtel.com.au/cdm/v1_0_0/exception", "BusinessException");
    private final static QName _ErrorResponseItem_QNAME = new QName("http://www.group.singtel.com.au/cdm/v1_0_0/exception", "errorResponseItem");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.singtel.group.cdm.v1_0_0.exception
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SourceSystemFault }
     * 
     */
    public SourceSystemFault createSourceSystemFault() {
        return new SourceSystemFault();
    }

    /**
     * Create an instance of {@link ErrorResponse }
     * 
     */
    public ErrorResponse createErrorResponse() {
        return new ErrorResponse();
    }

    /**
     * Create an instance of {@link ErrorResponseItem }
     * 
     */
    public ErrorResponseItem createErrorResponseItem() {
        return new ErrorResponseItem();
    }

    /**
     * Create an instance of {@link BusinessException }
     * 
     */
    public BusinessException createBusinessException() {
        return new BusinessException();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/cdm/v1_0_0/exception", name = "errorResponse")
    public JAXBElement<ErrorResponse> createErrorResponse(ErrorResponse value) {
        return new JAXBElement<ErrorResponse>(_ErrorResponse_QNAME, ErrorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceSystemFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/cdm/v1_0_0/exception", name = "sourceSystemFault")
    public JAXBElement<SourceSystemFault> createSourceSystemFault(SourceSystemFault value) {
        return new JAXBElement<SourceSystemFault>(_SourceSystemFault_QNAME, SourceSystemFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/cdm/v1_0_0/exception", name = "ServiceException")
    public JAXBElement<ServiceException> createServiceException(ServiceException value) {
        return new JAXBElement<ServiceException>(_ServiceException_QNAME, ServiceException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/cdm/v1_0_0/exception", name = "BusinessException")
    public JAXBElement<BusinessException> createBusinessException(BusinessException value) {
        return new JAXBElement<BusinessException>(_BusinessException_QNAME, BusinessException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorResponseItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.group.singtel.com.au/cdm/v1_0_0/exception", name = "errorResponseItem")
    public JAXBElement<ErrorResponseItem> createErrorResponseItem(ErrorResponseItem value) {
        return new JAXBElement<ErrorResponseItem>(_ErrorResponseItem_QNAME, ErrorResponseItem.class, null, value);
    }

}
