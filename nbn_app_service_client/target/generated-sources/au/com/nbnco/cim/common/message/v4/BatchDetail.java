
package au.com.nbnco.cim.common.message.v4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.com.nbnco.cim.common.rootbusinessentity.v3.RootEntity;
import au.com.nbnco.cim.common.rootbusinessentity.v3.TimePeriod;


/**
 * Details of the Batch
 * 
 * <p>Java class for BatchDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}RootEntity">
 *       &lt;sequence>
 *         &lt;element name="batchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessSeekerBatchID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}TimePeriod" minOccurs="0"/>
 *         &lt;element name="BatchStatisticsInformation" type="{http://www.nbnco.com.au/cim/common/message/v4}BatchStatisticsInformation" minOccurs="0"/>
 *         &lt;element name="Document" type="{http://www.nbnco.com.au/cim/common/message/v4}Document" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchDetail", propOrder = {
    "batchType",
    "accessSeekerBatchID",
    "status",
    "date",
    "batchStatisticsInformation",
    "document"
})
public class BatchDetail
    extends RootEntity
{

    protected String batchType;
    protected String accessSeekerBatchID;
    protected String status;
    protected TimePeriod date;
    @XmlElement(name = "BatchStatisticsInformation")
    protected BatchStatisticsInformation batchStatisticsInformation;
    @XmlElement(name = "Document")
    protected List<Document> document;

    /**
     * Gets the value of the batchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchType() {
        return batchType;
    }

    /**
     * Sets the value of the batchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchType(String value) {
        this.batchType = value;
    }

    /**
     * Gets the value of the accessSeekerBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessSeekerBatchID() {
        return accessSeekerBatchID;
    }

    /**
     * Sets the value of the accessSeekerBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessSeekerBatchID(String value) {
        this.accessSeekerBatchID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setDate(TimePeriod value) {
        this.date = value;
    }

    /**
     * Gets the value of the batchStatisticsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BatchStatisticsInformation }
     *     
     */
    public BatchStatisticsInformation getBatchStatisticsInformation() {
        return batchStatisticsInformation;
    }

    /**
     * Sets the value of the batchStatisticsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchStatisticsInformation }
     *     
     */
    public void setBatchStatisticsInformation(BatchStatisticsInformation value) {
        this.batchStatisticsInformation = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document }
     * 
     * 
     */
    public List<Document> getDocument() {
        if (document == null) {
            document = new ArrayList<Document>();
        }
        return this.document;
    }

}
