
package au.com.singtel.group.sdp.appointment.service.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ErrorResponse implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String exceptionClass;
    protected String exceptionMessage;
    protected List<ErrorResponseItem> errorResponseItems;
    protected String stackTrace;

    /**
     * Gets the value of the exceptionClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionClass() {
        return exceptionClass;
    }

    /**
     * Sets the value of the exceptionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionClass(String value) {
        this.exceptionClass = value;
    }

    /**
     * Gets the value of the exceptionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Sets the value of the exceptionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMessage(String value) {
        this.exceptionMessage = value;
    }

    /**
     * Gets the value of the errorResponseItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorResponseItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorResponseItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorResponseItem }
     * 
     * 
     */
    public List<ErrorResponseItem> getErrorResponseItems() {
        if (errorResponseItems == null) {
            errorResponseItems = new ArrayList<ErrorResponseItem>();
        }
        return this.errorResponseItems;
    }

    /**
     * Gets the value of the stackTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Sets the value of the stackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTrace(String value) {
        this.stackTrace = value;
    }

}
