
package au.com.singtel.group.sdp.appointment.service.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ErrorResponseItem implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
