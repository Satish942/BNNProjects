/**
 * 
 */
package au.com.singtel.group.sdp.appointment.service.exception;

import org.apache.commons.lang.ArrayUtils;

import au.com.optus.mcas.core.exception.ServiceExceptionInfo;

/**
 * @author ms00365975
 * 
 */
public class AppointmentServiceExceptionInfo implements ServiceExceptionInfo {

	/**
	 * Holds the faultCode.
	 */
	private String mfaultCode;

	/**
	 * Holds the faultString.
	 */
	private String mfaultString;

	/**
	 * Constructs AppointmentServiceExceptionInfo.
	 * 
	 * @param faultCode
	 *            String fault code
	 * @param faultString
	 *            String fault msg
	 */
	private AppointmentServiceExceptionInfo(String faultCode, String faultString) {
		this.mfaultCode = faultCode;
		this.mfaultString = faultString;
	}

	public String getFaultCode() {
		return mfaultCode;
	}

	public String getFaultString() {
		return mfaultString;
	}

	/**
	 * Helper method that can be used to dynamically sets any variable arguments
	 * present on the internal <code>faultString</code> property of this
	 * instance of <code>AppointmentServiceExceptionInfo</code>.
	 * 
	 * @param errorInfo
	 *            Instance of AppointmentServiceExceptionInfo whose faultString
	 *            is to be enriched with the specified arguments
	 * @param args
	 *            Arguments referenced by the format specifiers in the
	 *            <code>faultString</code> string.
	 * @return The <code>errorInfo</code> instance passed in to this method
	 */
	public static AppointmentServiceExceptionInfo formatFaultString(
			final AppointmentServiceExceptionInfo errorInfo,
			final Object... args) {

		final AppointmentServiceExceptionInfo newErrorInfo = new AppointmentServiceExceptionInfo(
				errorInfo.getFaultCode(), errorInfo.getFaultString());

		if (!ArrayUtils.isEmpty(args)) {
			newErrorInfo.mfaultString = String.format(
					errorInfo.getFaultString(), args);
		}

		return newErrorInfo;
	}

	public static final AppointmentServiceExceptionInfo BIZ_Error_001 = new AppointmentServiceExceptionInfo(
			"BIZ_Error_001", "Input message not valid against schema");

	public static final AppointmentServiceExceptionInfo BIZ_Error_002 = new AppointmentServiceExceptionInfo(
			"BIZ_Error_002", "Exception thrown from downstream systems");

	public static final AppointmentServiceExceptionInfo BIZ_Error_003 = new AppointmentServiceExceptionInfo(
			"BIZ_Error_003",
			"Unexpected exception thrown from downstream systems");

	public static final AppointmentServiceExceptionInfo SVC_Error_001 = new AppointmentServiceExceptionInfo(
			"SVC_Error_001", "One or more downstream system(s) not available");

	public static final AppointmentServiceExceptionInfo SVC_Error_002 = new AppointmentServiceExceptionInfo(
			"SVC_Error_002", "Access denied");
}
