
package au.com.nbnco.cim.common.message.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.com.nbnco.cim.common.accessseeker.v3.AccessSeeker;
import au.com.nbnco.cim.common.exception.v3.Exception;
import au.com.nbnco.cim.common.rootbusinessentity.v3.RootEntity;


/**
 * Specification for messages that supports scalable transactions and operates on a
 *                 participant.
 * 
 * <p>Java class for MessageSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageSpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}RootEntity">
 *       &lt;sequence>
 *         &lt;element name="AccessSeeker" type="{http://www.nbnco.com.au/cim/common/accessSeeker/v3}AccessSeeker" minOccurs="0"/>
 *         &lt;element name="BatchDetail" type="{http://www.nbnco.com.au/cim/common/message/v4}BatchDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageInteractionException" type="{http://www.nbnco.com.au/cim/common/exception/v3}Exception" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageSpecification", propOrder = {
    "accessSeeker",
    "batchDetail",
    "messageInteractionException"
})
@XmlSeeAlso({
    OperationRequest.class,
    OperationNotification.class,
    OperationResponse.class
})
public abstract class MessageSpecification
    extends RootEntity
{

    @XmlElement(name = "AccessSeeker")
    protected AccessSeeker accessSeeker;
    @XmlElement(name = "BatchDetail")
    protected List<BatchDetail> batchDetail;
    @XmlElement(name = "MessageInteractionException")
    protected Exception messageInteractionException;

    /**
     * Gets the value of the accessSeeker property.
     * 
     * @return
     *     possible object is
     *     {@link AccessSeeker }
     *     
     */
    public AccessSeeker getAccessSeeker() {
        return accessSeeker;
    }

    /**
     * Sets the value of the accessSeeker property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessSeeker }
     *     
     */
    public void setAccessSeeker(AccessSeeker value) {
        this.accessSeeker = value;
    }

    /**
     * Gets the value of the batchDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchDetail }
     * 
     * 
     */
    public List<BatchDetail> getBatchDetail() {
        if (batchDetail == null) {
            batchDetail = new ArrayList<BatchDetail>();
        }
        return this.batchDetail;
    }

    /**
     * Gets the value of the messageInteractionException property.
     * 
     * @return
     *     possible object is
     *     {@link Exception }
     *     
     */
    public Exception getMessageInteractionException() {
        return messageInteractionException;
    }

    /**
     * Sets the value of the messageInteractionException property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exception }
     *     
     */
    public void setMessageInteractionException(Exception value) {
        this.messageInteractionException = value;
    }

}
