
package au.com.nbnco.cim.common.message.v4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Batch statistics information including batchPriority, number Of Batch records processed,
 *                 records with errors and records with valid and invalid data.
 * 
 * <p>Java class for BatchStatisticsInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchStatisticsInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalNumberOfBatchRecords" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="numberOfBatchRecordsProcessed" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="numberOfBatchRecordsWithErrors" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="numberOfBatchRecordsWithInvalidData" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="numberOfBatchRecordsWithValidData" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="batchPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchStatisticsInformation", propOrder = {
    "totalNumberOfBatchRecords",
    "numberOfBatchRecordsProcessed",
    "numberOfBatchRecordsWithErrors",
    "numberOfBatchRecordsWithInvalidData",
    "numberOfBatchRecordsWithValidData",
    "batchPriority"
})
public class BatchStatisticsInformation {

    protected BigInteger totalNumberOfBatchRecords;
    protected BigInteger numberOfBatchRecordsProcessed;
    protected BigInteger numberOfBatchRecordsWithErrors;
    protected BigInteger numberOfBatchRecordsWithInvalidData;
    protected BigInteger numberOfBatchRecordsWithValidData;
    protected String batchPriority;

    /**
     * Gets the value of the totalNumberOfBatchRecords property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfBatchRecords() {
        return totalNumberOfBatchRecords;
    }

    /**
     * Sets the value of the totalNumberOfBatchRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfBatchRecords(BigInteger value) {
        this.totalNumberOfBatchRecords = value;
    }

    /**
     * Gets the value of the numberOfBatchRecordsProcessed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBatchRecordsProcessed() {
        return numberOfBatchRecordsProcessed;
    }

    /**
     * Sets the value of the numberOfBatchRecordsProcessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBatchRecordsProcessed(BigInteger value) {
        this.numberOfBatchRecordsProcessed = value;
    }

    /**
     * Gets the value of the numberOfBatchRecordsWithErrors property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBatchRecordsWithErrors() {
        return numberOfBatchRecordsWithErrors;
    }

    /**
     * Sets the value of the numberOfBatchRecordsWithErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBatchRecordsWithErrors(BigInteger value) {
        this.numberOfBatchRecordsWithErrors = value;
    }

    /**
     * Gets the value of the numberOfBatchRecordsWithInvalidData property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBatchRecordsWithInvalidData() {
        return numberOfBatchRecordsWithInvalidData;
    }

    /**
     * Sets the value of the numberOfBatchRecordsWithInvalidData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBatchRecordsWithInvalidData(BigInteger value) {
        this.numberOfBatchRecordsWithInvalidData = value;
    }

    /**
     * Gets the value of the numberOfBatchRecordsWithValidData property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBatchRecordsWithValidData() {
        return numberOfBatchRecordsWithValidData;
    }

    /**
     * Sets the value of the numberOfBatchRecordsWithValidData property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBatchRecordsWithValidData(BigInteger value) {
        this.numberOfBatchRecordsWithValidData = value;
    }

    /**
     * Gets the value of the batchPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchPriority() {
        return batchPriority;
    }

    /**
     * Sets the value of the batchPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchPriority(String value) {
        this.batchPriority = value;
    }

}
