
package au.com.optus.mcas.sdp.nbnenabler.exception;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorResponseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorResponseItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="defaultErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descriptionVariables" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://www.group.singtel.com.au/cdm/v1_0_0/exception}sourceSystemFault" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorResponseItem", propOrder = {
    "defaultErrorDescription",
    "descriptionVariables",
    "errorCode",
    "sourceSystemFault"
})
public class ErrorResponseItem {

    protected String defaultErrorDescription;
    protected List<String> descriptionVariables;
    protected String errorCode;
    protected SourceSystemFault sourceSystemFault;

    /**
     * Gets the value of the defaultErrorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultErrorDescription() {
        return defaultErrorDescription;
    }

    /**
     * Sets the value of the defaultErrorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultErrorDescription(String value) {
        this.defaultErrorDescription = value;
    }

    /**
     * Gets the value of the descriptionVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescriptionVariables() {
        if (descriptionVariables == null) {
            descriptionVariables = new ArrayList<String>();
        }
        return this.descriptionVariables;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the sourceSystemFault property.
     * 
     * @return
     *     possible object is
     *     {@link SourceSystemFault }
     *     
     */
    public SourceSystemFault getSourceSystemFault() {
        return sourceSystemFault;
    }

    /**
     * Sets the value of the sourceSystemFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceSystemFault }
     *     
     */
    public void setSourceSystemFault(SourceSystemFault value) {
        this.sourceSystemFault = value;
    }

}
