
package au.com.nbnco.cim.common.exception.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.nbnco.cim.common.exception.v3 package. 
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

    private final static QName _RecordNotFoundException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "RecordNotFoundException");
    private final static QName _InvalidAppointmentException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "InvalidAppointmentException");
    private final static QName _LimitExceededException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "LimitExceededException");
    private final static QName _ValidationException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "ValidationException");
    private final static QName _MessageReplayException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "MessageReplayException");
    private final static QName _AccountNotFoundException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "AccountNotFoundException");
    private final static QName _InvalidAddressException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "InvalidAddressException");
    private final static QName _NotAllowedException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "NotAllowedException");
    private final static QName _AccountHierarchyViolationException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "AccountHierarchyViolationException");
    private final static QName _AccountNotActiveException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "AccountNotActiveException");
    private final static QName _InvalidOrderException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "InvalidOrderException");
    private final static QName _ProductNotBillableException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "ProductNotBillableException");
    private final static QName _TechnicalException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "TechnicalException");
    private final static QName _InvalidProductException_QNAME = new QName("http://www.nbnco.com.au/cim/common/exception/v3", "InvalidProductException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.nbnco.cim.common.exception.v3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageException }
     * 
     */
    public MessageException createMessageException() {
        return new MessageException();
    }

    /**
     * Create an instance of {@link InvalidOrderException }
     * 
     */
    public InvalidOrderException createInvalidOrderException() {
        return new InvalidOrderException();
    }

    /**
     * Create an instance of {@link InvalidAppointmentException }
     * 
     */
    public InvalidAppointmentException createInvalidAppointmentException() {
        return new InvalidAppointmentException();
    }

    /**
     * Create an instance of {@link ApplicationException }
     * 
     */
    public ApplicationException createApplicationException() {
        return new ApplicationException();
    }

    /**
     * Create an instance of {@link LimitExceededException }
     * 
     */
    public LimitExceededException createLimitExceededException() {
        return new LimitExceededException();
    }

    /**
     * Create an instance of {@link MessageReplayException }
     * 
     */
    public MessageReplayException createMessageReplayException() {
        return new MessageReplayException();
    }

    /**
     * Create an instance of {@link TechnicalException }
     * 
     */
    public TechnicalException createTechnicalException() {
        return new TechnicalException();
    }

    /**
     * Create an instance of {@link AccountNotActiveException }
     * 
     */
    public AccountNotActiveException createAccountNotActiveException() {
        return new AccountNotActiveException();
    }

    /**
     * Create an instance of {@link InvalidProductException }
     * 
     */
    public InvalidProductException createInvalidProductException() {
        return new InvalidProductException();
    }

    /**
     * Create an instance of {@link RecordNotFoundException }
     * 
     */
    public RecordNotFoundException createRecordNotFoundException() {
        return new RecordNotFoundException();
    }

    /**
     * Create an instance of {@link NotAllowedException }
     * 
     */
    public NotAllowedException createNotAllowedException() {
        return new NotAllowedException();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AccountHierarchyViolationException }
     * 
     */
    public AccountHierarchyViolationException createAccountHierarchyViolationException() {
        return new AccountHierarchyViolationException();
    }

    /**
     * Create an instance of {@link ProductNotBillableException }
     * 
     */
    public ProductNotBillableException createProductNotBillableException() {
        return new ProductNotBillableException();
    }

    /**
     * Create an instance of {@link InvalidAddressException }
     * 
     */
    public InvalidAddressException createInvalidAddressException() {
        return new InvalidAddressException();
    }

    /**
     * Create an instance of {@link ValidationException }
     * 
     */
    public ValidationException createValidationException() {
        return new ValidationException();
    }

    /**
     * Create an instance of {@link AccountNotFoundException }
     * 
     */
    public AccountNotFoundException createAccountNotFoundException() {
        return new AccountNotFoundException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecordNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "RecordNotFoundException")
    public JAXBElement<RecordNotFoundException> createRecordNotFoundException(RecordNotFoundException value) {
        return new JAXBElement<RecordNotFoundException>(_RecordNotFoundException_QNAME, RecordNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidAppointmentException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "InvalidAppointmentException")
    public JAXBElement<InvalidAppointmentException> createInvalidAppointmentException(InvalidAppointmentException value) {
        return new JAXBElement<InvalidAppointmentException>(_InvalidAppointmentException_QNAME, InvalidAppointmentException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LimitExceededException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "LimitExceededException")
    public JAXBElement<LimitExceededException> createLimitExceededException(LimitExceededException value) {
        return new JAXBElement<LimitExceededException>(_LimitExceededException_QNAME, LimitExceededException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "ValidationException")
    public JAXBElement<ValidationException> createValidationException(ValidationException value) {
        return new JAXBElement<ValidationException>(_ValidationException_QNAME, ValidationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageReplayException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "MessageReplayException")
    public JAXBElement<MessageReplayException> createMessageReplayException(MessageReplayException value) {
        return new JAXBElement<MessageReplayException>(_MessageReplayException_QNAME, MessageReplayException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "AccountNotFoundException")
    public JAXBElement<AccountNotFoundException> createAccountNotFoundException(AccountNotFoundException value) {
        return new JAXBElement<AccountNotFoundException>(_AccountNotFoundException_QNAME, AccountNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidAddressException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "InvalidAddressException")
    public JAXBElement<InvalidAddressException> createInvalidAddressException(InvalidAddressException value) {
        return new JAXBElement<InvalidAddressException>(_InvalidAddressException_QNAME, InvalidAddressException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotAllowedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "NotAllowedException")
    public JAXBElement<NotAllowedException> createNotAllowedException(NotAllowedException value) {
        return new JAXBElement<NotAllowedException>(_NotAllowedException_QNAME, NotAllowedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountHierarchyViolationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "AccountHierarchyViolationException")
    public JAXBElement<AccountHierarchyViolationException> createAccountHierarchyViolationException(AccountHierarchyViolationException value) {
        return new JAXBElement<AccountHierarchyViolationException>(_AccountHierarchyViolationException_QNAME, AccountHierarchyViolationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNotActiveException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "AccountNotActiveException")
    public JAXBElement<AccountNotActiveException> createAccountNotActiveException(AccountNotActiveException value) {
        return new JAXBElement<AccountNotActiveException>(_AccountNotActiveException_QNAME, AccountNotActiveException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidOrderException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "InvalidOrderException")
    public JAXBElement<InvalidOrderException> createInvalidOrderException(InvalidOrderException value) {
        return new JAXBElement<InvalidOrderException>(_InvalidOrderException_QNAME, InvalidOrderException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductNotBillableException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "ProductNotBillableException")
    public JAXBElement<ProductNotBillableException> createProductNotBillableException(ProductNotBillableException value) {
        return new JAXBElement<ProductNotBillableException>(_ProductNotBillableException_QNAME, ProductNotBillableException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "TechnicalException")
    public JAXBElement<TechnicalException> createTechnicalException(TechnicalException value) {
        return new JAXBElement<TechnicalException>(_TechnicalException_QNAME, TechnicalException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidProductException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.nbnco.com.au/cim/common/exception/v3", name = "InvalidProductException")
    public JAXBElement<InvalidProductException> createInvalidProductException(InvalidProductException value) {
        return new JAXBElement<InvalidProductException>(_InvalidProductException_QNAME, InvalidProductException.class, null, value);
    }

}
