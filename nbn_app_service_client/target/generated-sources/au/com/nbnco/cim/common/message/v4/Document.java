
package au.com.nbnco.cim.common.message.v4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.com.nbnco.cim.common.rootbusinessentity.v3.Entity;
import au.com.nbnco.cim.common.rootbusinessentity.v3.TimePeriod;
import au.com.nbnco.cim.common.rootbusinessentity.v3.URL;


/**
 * This class provides document file information.
 * 
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}Entity">
 *       &lt;sequence>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="searchDateRange" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}TimePeriod" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}URL" minOccurs="0"/>
 *         &lt;element name="documentSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MIMEType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "documentType",
    "searchDateRange",
    "url",
    "documentSize",
    "mimeType"
})
public class Document
    extends Entity
{

    protected List<String> documentType;
    protected TimePeriod searchDateRange;
    @XmlElement(name = "URL")
    protected URL url;
    protected BigInteger documentSize;
    @XmlElement(name = "MIMEType")
    protected String mimeType;

    /**
     * Gets the value of the documentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDocumentType() {
        if (documentType == null) {
            documentType = new ArrayList<String>();
        }
        return this.documentType;
    }

    /**
     * Gets the value of the searchDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getSearchDateRange() {
        return searchDateRange;
    }

    /**
     * Sets the value of the searchDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setSearchDateRange(TimePeriod value) {
        this.searchDateRange = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link URL }
     *     
     */
    public URL getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link URL }
     *     
     */
    public void setURL(URL value) {
        this.url = value;
    }

    /**
     * Gets the value of the documentSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentSize() {
        return documentSize;
    }

    /**
     * Sets the value of the documentSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentSize(BigInteger value) {
        this.documentSize = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMEType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMEType(String value) {
        this.mimeType = value;
    }

}
