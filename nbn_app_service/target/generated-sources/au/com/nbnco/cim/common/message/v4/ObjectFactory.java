
package au.com.nbnco.cim.common.message.v4;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.com.nbnco.cim.common.message.v4 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.com.nbnco.cim.common.message.v4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BatchStatisticsInformation }
     * 
     */
    public BatchStatisticsInformation createBatchStatisticsInformation() {
        return new BatchStatisticsInformation();
    }

    /**
     * Create an instance of {@link OperationRequest }
     * 
     */
    public OperationRequest createOperationRequest() {
        return new OperationRequest();
    }

    /**
     * Create an instance of {@link OperationResponse }
     * 
     */
    public OperationResponse createOperationResponse() {
        return new OperationResponse();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link OperationNotification }
     * 
     */
    public OperationNotification createOperationNotification() {
        return new OperationNotification();
    }

    /**
     * Create an instance of {@link BatchDetail }
     * 
     */
    public BatchDetail createBatchDetail() {
        return new BatchDetail();
    }

}
