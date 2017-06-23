/**
 * 
 */
package au.com.singtel.group.sdp.appointment.service.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.com.optus.mcas.core.exception.CheckedException;

/**
 * @author ms00365975
 *
 */
public class AppointmentServiceException  extends CheckedException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 /** Logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(AppointmentServiceException.class);
    
    /**
     * Creates an exception using the specified information and the exception
     * that caused the error.
     *
     * @param exceptionInfo
     *            Exception information returned in the SOAP fault to the
     *            client.
     * @param cause
     *            Exception that caused the error in the first place.
     */
    public AppointmentServiceException(final AppointmentServiceExceptionInfo exceptionInfo,
        final Throwable cause) {
        super(exceptionInfo, cause);
    }

    /**
     * Creates an exception using the specified information.
     *
     * @param exceptionInfo
     *            Exception information returned in the SOAP fault to the
     *            client.
     */
    public AppointmentServiceException(final AppointmentServiceExceptionInfo exceptionInfo) {
        super(exceptionInfo);
    }

    /**
     * Creates an exception using the specified information.
     * @param exceptionInfo
     *          AppointmentServiceExceptionInfo
     * @param message
     *          SOAP fault message
     */
    public AppointmentServiceException(final AppointmentServiceExceptionInfo exceptionInfo, final String message) {
        super(exceptionInfo, message);
    }


}
