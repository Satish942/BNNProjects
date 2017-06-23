/**
 * 
 */
package au.com.optus.mcas.sdp.nbnenabler.service.util;

import org.apache.commons.lang.RandomStringUtils;

/**
 * @author satish
 *
 */
public class NbnEnablerServiceUtil {
	
	public static String generateInteractionId(String prefix) {
		
		String interactionID = prefix.concat("_").concat(RandomStringUtils.randomAlphanumeric(8));
		
		return interactionID;
	}

}
