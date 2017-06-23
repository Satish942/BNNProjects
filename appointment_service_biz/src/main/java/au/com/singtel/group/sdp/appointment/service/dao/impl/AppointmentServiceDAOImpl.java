package au.com.singtel.group.sdp.appointment.service.dao.impl;

import org.hibernate.Query;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.com.singtel.group.sdp.appointment.service.dao.AppointmentServiceDAOIF;
import au.com.singtel.group.sdp.appointment.service.model.NBNCorrelation;
import au.com.singtel.group.sdp.appointment.service.model.NBNNotification;
import au.com.singtel.group.sdp.appointment.service.util.AppointmentServiceConstants;

/**
 * @author ms00365975
 *
 */
public class AppointmentServiceDAOImpl implements AppointmentServiceDAOIF{

	private static final Logger logger = LoggerFactory.getLogger(AppointmentServiceDAOImpl.class);

    private SessionFactory sessionFactory;
    private String checkAvailableAppointmentInteractionId;
    private String createAppointmentNotificationId;
    
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
   
    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
    
    public String getCreateAppointmentNotificationId() {
		return createAppointmentNotificationId;
	}
    
    public String getCheckAvailableAppointmentInteractionId() {
		return checkAvailableAppointmentInteractionId;
	}

	public void setCheckAvailableAppointmentInteractionId(
			String checkAvailableAppointmentInteractionId) {
		this.checkAvailableAppointmentInteractionId = checkAvailableAppointmentInteractionId;
	}

	public void setCreateAppointmentNotificationId(
			String createAppointmentNotificationId) {
		this.createAppointmentNotificationId = createAppointmentNotificationId;
	}

	/**
	 * @param NBNNotification
	 * @return void
	 *  Function to persist notification record to in ossf_nbn_notification table  
     */
    public void persistOssfNbnNotification(NBNNotification nbnNotification) {
    	
    	logger.info("***Inside persistOssfNbnNotification method***");
		
    	Session session = getSessionFactory().openSession();
		
    	try 
    	{
	    	session.beginTransaction();
	    	session.save(nbnNotification);
	    	session.getTransaction().commit();
    	}
    	catch(HibernateException he) {
    		logger.error(he.getMessage());
    	} 
    	finally {
    		 session.close();
    	} 
    	
    	logger.info("***Exiting persistOssfNbnNotification method***");
	}
    
    /**
     * @param String
     * @return NBNNotification
     *  Method to retrieve NBN notification for a given transaction id
     */
	public NBNNotification getNotificationById(String transactionId) {
		
    	logger.info("***Inside getNotificationById method***");	
    	
		Session session = getSessionFactory().openSession();
		
		Query query = session.createQuery(AppointmentServiceConstants.GET_NOTIFICATION_BY_ID_SQL);
        
		query.setString(1,transactionId);
        
        NBNNotification notification = (NBNNotification) query.uniqueResult();
        
    	logger.info("***Exiting getNotificationById method***");
    	
        return notification;
	}

	/**
	 * @param nil
	 * @return String
	 * method to generate interaction id for check available appointment operation.
	 * This method makes use of Oracle Sequence to format the interaction Id.
	 */
	public String generateCheckAvailableAppointmentId() {
		
    	logger.info("***Inside generateCheckAvailableAppointmentId method***");	
    	
    	String interactionId = null;

		Session session = getSessionFactory().openSession();

		try {

				SQLQuery query = session.createSQLQuery(createAppointmentNotificationId);
	
				logger.debug("SQL Query=" + createAppointmentNotificationId);
	
				interactionId = (String) query.uniqueResult();
				
				logger.debug("Interaction Id = " + interactionId);

		} catch (HibernateException he) {

			logger.error("Error occurred! ",he);

		} finally {
			session.close();
		}
		
    	logger.info("***Exiting generateCheckAvailableAppointmentId method***");
		
    	return interactionId;
	}
	
	/**
	 * @param nil
	 * @return String
	 * method to generate interaction id for create appointment operation.
	 * This method makes use of Oracle Sequence to format the interaction Id.
	 */
	public String generateCreateAppointmentId() {
		
    	logger.info("***Inside generateCreateAppointmentId method***");	
    	
		String interactionId = null;

		Session session = getSessionFactory().openSession();

		try {

				SQLQuery query = session.createSQLQuery(checkAvailableAppointmentInteractionId);
	
				interactionId = (String) query.uniqueResult();
				
				logger.debug("Interaction ID = " + interactionId);


		} catch (HibernateException he) {

			logger.error("Error occurred! ",he);

		} finally {
			session.close();
		}

    	logger.info("***Exiting generateCreateAppointmentId method***");
    	
		return interactionId;
	}

	/**
	 * @param NBNCorrelation
	 * @return void
	 *  Function to persist correlation record to in ossf_nbn_correlation table  
     */
	public void persistOssfNbnCorrelation(NBNCorrelation nbnCorrelation) {
		
    	logger.info("***Inside persistOssfNbnCorrelation method***");	
    			
		Session session = getSessionFactory().openSession();
		
    	try 
    	{
	    	session.beginTransaction();
	    	session.save(nbnCorrelation);
	    	session.getTransaction().commit();
    	}
    	catch(HibernateException he) {
    		logger.error("Hibernate Exception occurred in persistOssfNbnCorrelation" , he);
    	} 
    	finally {
    		 session.close();
    	} 
    	
    	logger.info("***Exiting persistOssfNbnCorrelation method***");
	}

    /**
     * @param String
     * @return NBNCorrelation
     *  Method to retrieve NBN correlation for a given transaction id and systemIdentity(i.e. destination)
     */
	public NBNCorrelation getCorrelationById(String transactionId,
			String systemIdentity) {
		
    	logger.info("***Inside getCorrelationById method***");	
    	
		Session session = getSessionFactory().openSession();
		Query query = session.createQuery(AppointmentServiceConstants.GET_CORRELATION_BY_ID_SQL);
        query.setString(1,transactionId);
        query.setString(2,systemIdentity);
        
        NBNCorrelation correlation = (NBNCorrelation) query.uniqueResult();
        
    	logger.info("***Exiting getCorrelationById method***");
        
        return correlation;
	}
}
