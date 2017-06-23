/**
 * 
 */
package au.com.singtel.group.sdp.appointment.service.dao;

import au.com.singtel.group.sdp.appointment.service.model.NBNCorrelation;
import au.com.singtel.group.sdp.appointment.service.model.NBNNotification;

/**
 * @author ms00365975
 *
 */
public interface AppointmentServiceDAOIF {
	
	void persistOssfNbnNotification(NBNNotification nbnNotification);
	
	NBNNotification getNotificationById(String transactionId);
	
	String generateCheckAvailableAppointmentId();
	
	String generateCreateAppointmentId();
	
	void persistOssfNbnCorrelation(NBNCorrelation nbnCorrelation);
	
	NBNCorrelation getCorrelationById(String transactionId, String systemIdentity);

}
