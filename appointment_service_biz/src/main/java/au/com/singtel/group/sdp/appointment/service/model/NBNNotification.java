package au.com.singtel.group.sdp.appointment.service.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * @author ms00365975
 *
 */
@Entity
@Table(name="OSSF_NBN_NOTIFICATION")
public class NBNNotification implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "OSSF_NBN_NOTIFICATION_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "OSSF_NBN_NOTIFICATION_SEQ")
	private int id;
	
	@DateTimeFormat(pattern="yyyy/MM/dd hh:mm:ss") 
	@Column(name = "CREATED_DATE", nullable = false)	
	private Date createdDateTime;
	
	@Column(name = "TRANSACTION_ID", nullable = true)
	private String transactionId;
	
	@Column(name = "CONVERSATION_ID", nullable = true)	
	private String conversationId;
	
	@Lob
	@Column(name = "NOTIFICATION_PAYLOAD", nullable = false)
	private String notificationPayload;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getConversationId() {
		return conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	public String getNotificationPayload() {
		return notificationPayload;
	}
	public void setNotificationPayload(String notificationPayload) {
		this.notificationPayload = notificationPayload;
	}
}
