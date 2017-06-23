
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgreementItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionItem">
 *       &lt;sequence>
 *         &lt;element name="termOrCondition" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}AgreementTermOrCondition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementItem", propOrder = {
    "termOrCondition"
})
public class AgreementItem
    extends BusinessInteractionItem
{

    protected AgreementTermOrCondition termOrCondition;

    /**
     * Gets the value of the termOrCondition property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementTermOrCondition }
     *     
     */
    public AgreementTermOrCondition getTermOrCondition() {
        return termOrCondition;
    }

    /**
     * Sets the value of the termOrCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementTermOrCondition }
     *     
     */
    public void setTermOrCondition(AgreementTermOrCondition value) {
        this.termOrCondition = value;
    }

}
