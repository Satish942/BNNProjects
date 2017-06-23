/**
 * 
 */
package au.com.singtel.group.sdp.appointment.service.util;

import org.apache.commons.lang.RandomStringUtils;

/**
 * @author ms00365975
 *
 */
public class AppointmentServiceUtil {
	
	public static String generateInteractionId(String prefix) {
		
		String interactionID = prefix.concat("_").concat(RandomStringUtils.randomAlphanumeric(8));
		
		return interactionID;
	}

}
