/**
 * 
 */
package au.com.optus.mcas.sdp.nbnenabler.service.dao;

import au.com.optus.mcas.sdp.nbnenabler.model.NBNCorrelation;
import au.com.optus.mcas.sdp.nbnenabler.model.NBNNotification;


/**
 * @author ms00365975
 *
 */
public interface NbnEnablerServiceDAOIF {
	
	void persistOssfNbnNotification(NBNNotification nbnNotification);
	
	NBNNotification getNotificationById(String transactionId);
	
	String generateCheckAvailableAppointmentId();
	
	String generateCreateAppointmentId();
	
	void persistOssfNbnCorrelation(NBNCorrelation nbnCorrelation);
	
	NBNCorrelation getCorrelationById(String transactionId, String systemIdentity);

}
