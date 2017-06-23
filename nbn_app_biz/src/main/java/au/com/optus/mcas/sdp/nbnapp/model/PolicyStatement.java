
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyVariable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyCondition" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PolicyCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="policyAction" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PolicyAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyStatement", propOrder = {
    "id",
    "opType",
    "policyValue",
    "policyVariable",
    "policyCondition",
    "policyAction"
})
public class PolicyStatement {

    protected String id;
    protected String opType;
    protected String policyValue;
    protected String policyVariable;
    protected List<PolicyCondition> policyCondition;
    protected List<PolicyAction> policyAction;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the opType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpType() {
        return opType;
    }

    /**
     * Sets the value of the opType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpType(String value) {
        this.opType = value;
    }

    /**
     * Gets the value of the policyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyValue() {
        return policyValue;
    }

    /**
     * Sets the value of the policyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyValue(String value) {
        this.policyValue = value;
    }

    /**
     * Gets the value of the policyVariable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyVariable() {
        return policyVariable;
    }

    /**
     * Sets the value of the policyVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyVariable(String value) {
        this.policyVariable = value;
    }

    /**
     * Gets the value of the policyCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyCondition }
     * 
     * 
     */
    public List<PolicyCondition> getPolicyCondition() {
        if (policyCondition == null) {
            policyCondition = new ArrayList<PolicyCondition>();
        }
        return this.policyCondition;
    }

    /**
     * Gets the value of the policyAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyAction }
     * 
     * 
     */
    public List<PolicyAction> getPolicyAction() {
        if (policyAction == null) {
            policyAction = new ArrayList<PolicyAction>();
        }
        return this.policyAction;
    }

}
