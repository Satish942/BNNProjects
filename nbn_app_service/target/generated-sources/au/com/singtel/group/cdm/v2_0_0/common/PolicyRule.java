
package au.com.singtel.group.cdm.v2_0_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyRule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Policy">
 *       &lt;sequence>
 *         &lt;element name="isMandatoryEvaluation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCNF" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="policyRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyCondition" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PolicyCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="policyAction" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PolicyAction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyRule", propOrder = {
    "isMandatoryEvaluation",
    "usage",
    "isCNF",
    "policyRule",
    "policyCondition",
    "policyAction"
})
public class PolicyRule
    extends Policy
{

    protected Boolean isMandatoryEvaluation;
    protected String usage;
    protected Boolean isCNF;
    protected String policyRule;
    protected List<PolicyCondition> policyCondition;
    protected List<PolicyAction> policyAction;

    /**
     * Gets the value of the isMandatoryEvaluation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMandatoryEvaluation() {
        return isMandatoryEvaluation;
    }

    /**
     * Sets the value of the isMandatoryEvaluation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMandatoryEvaluation(Boolean value) {
        this.isMandatoryEvaluation = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the isCNF property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCNF() {
        return isCNF;
    }

    /**
     * Sets the value of the isCNF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCNF(Boolean value) {
        this.isCNF = value;
    }

    /**
     * Gets the value of the policyRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyRule() {
        return policyRule;
    }

    /**
     * Sets the value of the policyRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyRule(String value) {
        this.policyRule = value;
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
