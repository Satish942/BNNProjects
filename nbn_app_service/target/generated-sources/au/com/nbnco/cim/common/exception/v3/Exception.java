
package au.com.nbnco.cim.common.exception.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import au.com.nbnco.cim.common.rootbusinessentity.v3.Entity;


/**
 * Contains the exception which has occurred.
 * 
 * <p>Java class for Exception complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exception">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}Entity">
 *       &lt;sequence>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="resultingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferencesException" type="{http://www.nbnco.com.au/cim/common/exception/v3}Exception" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReferencesApplicationException" type="{http://www.nbnco.com.au/cim/common/exception/v3}ApplicationException" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exception", propOrder = {
    "timestamp",
    "resultingState",
    "referencesException",
    "referencesApplicationException"
})
public class Exception
    extends Entity
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    protected String resultingState;
    @XmlElement(name = "ReferencesException")
    protected List<Exception> referencesException;
    @XmlElement(name = "ReferencesApplicationException")
    protected ApplicationException referencesApplicationException;

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the resultingState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultingState() {
        return resultingState;
    }

    /**
     * Sets the value of the resultingState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultingState(String value) {
        this.resultingState = value;
    }

    /**
     * Gets the value of the referencesException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencesException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencesException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Exception }
     * 
     * 
     */
    public List<Exception> getReferencesException() {
        if (referencesException == null) {
            referencesException = new ArrayList<Exception>();
        }
        return this.referencesException;
    }

    /**
     * Gets the value of the referencesApplicationException property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationException }
     *     
     */
    public ApplicationException getReferencesApplicationException() {
        return referencesApplicationException;
    }

    /**
     * Sets the value of the referencesApplicationException property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationException }
     *     
     */
    public void setReferencesApplicationException(ApplicationException value) {
        this.referencesApplicationException = value;
    }

}
