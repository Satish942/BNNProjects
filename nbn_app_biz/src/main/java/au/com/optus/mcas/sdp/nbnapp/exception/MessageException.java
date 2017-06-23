
package au.com.optus.mcas.sdp.nbnapp.exception;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The following fields convey error information: Exception\ID - contains the error code for
 *                 the exception as defined in the List of Values spreadsheet. Exception\description - contains the
 *                 associated text which provides the consumer with information about the error which occurred. Refer to
 *                 the List of Values spreadsheet for the descriptions returned with specific error codes.
 *             
 * 
 * <p>Java class for MessageException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Exception" type="{http://www.nbnco.com.au/cim/common/exception/v3}Exception"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageException", propOrder = {
    "exception"
})
@XmlSeeAlso({
    InvalidProductException.class,
    ValidationException.class,
    RecordNotFoundException.class,
    InvalidOrderException.class,
    InvalidAppointmentException.class,
    InvalidAddressException.class,
    AccountNotActiveException.class,
    LimitExceededException.class,
    NotAllowedException.class,
    TechnicalException.class,
    AccountNotFoundException.class,
    AccountHierarchyViolationException.class,
    MessageReplayException.class,
    ProductNotBillableException.class
})
public class MessageException {

    @XmlElement(name = "Exception", required = true)
    protected Exception exception;

    /**
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link Exception }
     *     
     */
    public Exception getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exception }
     *     
     */
    public void setException(Exception value) {
        this.exception = value;
    }

}
