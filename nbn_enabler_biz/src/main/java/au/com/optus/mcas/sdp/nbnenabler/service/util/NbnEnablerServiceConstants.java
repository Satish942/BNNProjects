/**
 * 
 */
package au.com.optus.mcas.sdp.nbnenabler.service.util;

/**
 * @author satish
 *
 */
public class NbnEnablerServiceConstants {
	
	public static final String NBN_TRANSACTION_PREFIX = "OptusB2BTxNum_";
	public static final String CHECK_AVAILABLE_APPOINTMENT = "CHECK_AVAILABLE_APPOINTMENT";
	public static final String CREATE_APPOINTMENT = "CREATE_APPOINTMENT";
	public static final String CHECK_AVAILABLE_APPOINTMENT_NOTIFICATION_PREFIX = "ChkAvlApptNotif";
	public static final String STATUS = "Success";
	public static final String CREATE_APPOINTMENT_NOTIFICATION_PREFIX = "CreAppNotif_";
	public static final String GET_NOTIFICATION_BY_ID_SQL="select * from ossf_nbn_notification where transaction_id= :transaction_id";
	public static final String GET_CORRELATION_BY_ID_SQL="select * from ossf_nbn_correlation where transaction_id= :transaction_id and destination= :destination";
	
}
