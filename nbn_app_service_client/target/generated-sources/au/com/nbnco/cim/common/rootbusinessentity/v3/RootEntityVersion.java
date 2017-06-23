
package au.com.nbnco.cim.common.rootbusinessentity.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This class represents the ability to distinguish between different instances of Entity or
 *                 EntitySpecification. It represents a particular form or variety of an Entity or EntitySpecification that
 *                 is different from others or from the original. The form represents differences in attributes, methods,
 *                 relationships, and/or constraints that characterize this particular Entity or EntitySpecification, but
 *                 which are not enough to warrant creating a new Entity or EntitySpecification.
 *             
 * 
 * <p>Java class for RootEntityVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RootEntityVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="revisionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revisionFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revisionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revisionSemantics" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="revisionTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="revisionValidityPeriod" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}TimePeriod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RootEntityVersion", propOrder = {
    "revisionName",
    "revisionFormat",
    "revisionNumber",
    "revisionReason",
    "revisionSemantics",
    "revisionTimestamp",
    "revisionValidityPeriod"
})
public class RootEntityVersion {

    protected String revisionName;
    protected String revisionFormat;
    protected String revisionNumber;
    protected String revisionReason;
    protected String revisionSemantics;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar revisionTimestamp;
    protected TimePeriod revisionValidityPeriod;

    /**
     * Gets the value of the revisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionName() {
        return revisionName;
    }

    /**
     * Sets the value of the revisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionName(String value) {
        this.revisionName = value;
    }

    /**
     * Gets the value of the revisionFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionFormat() {
        return revisionFormat;
    }

    /**
     * Sets the value of the revisionFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionFormat(String value) {
        this.revisionFormat = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
    }

    /**
     * Gets the value of the revisionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionReason() {
        return revisionReason;
    }

    /**
     * Sets the value of the revisionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionReason(String value) {
        this.revisionReason = value;
    }

    /**
     * Gets the value of the revisionSemantics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionSemantics() {
        return revisionSemantics;
    }

    /**
     * Sets the value of the revisionSemantics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionSemantics(String value) {
        this.revisionSemantics = value;
    }

    /**
     * Gets the value of the revisionTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevisionTimestamp() {
        return revisionTimestamp;
    }

    /**
     * Sets the value of the revisionTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevisionTimestamp(XMLGregorianCalendar value) {
        this.revisionTimestamp = value;
    }

    /**
     * Gets the value of the revisionValidityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getRevisionValidityPeriod() {
        return revisionValidityPeriod;
    }

    /**
     * Sets the value of the revisionValidityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setRevisionValidityPeriod(TimePeriod value) {
        this.revisionValidityPeriod = value;
    }

}
