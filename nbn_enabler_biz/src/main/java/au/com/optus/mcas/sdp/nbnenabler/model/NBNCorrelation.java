package au.com.optus.mcas.sdp.nbnenabler.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * @author ms00365975
 *
 */
@Entity
@Table(name="OSSF_NBN_CORRELATION")
public class NBNCorrelation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "OSSF_NBN_CORRELATION_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "OSSF_NBN_CORRELATION_SEQ")
	private int id;
	
	@DateTimeFormat(pattern="yyyy/MM/dd hh:mm:ss") 
	@Column(name = "CREATED_DATE", nullable = false)	
	private Date createdDateTime;
	
	@Column(name = "TRANSACTION_ID", nullable = false)
	private String transactionId;
	
	@Column(name = "CONVERSATION_ID", nullable = false)	
	private String conversationId;
	
	@Column(name = "OPERATION_NAME", nullable = false)
	private String operationName;
	
	@Column(name = "DESTINATION", nullable = false)
	private String destination;
	
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
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
}
