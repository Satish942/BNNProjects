
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AtomicAppliedCustomerBillingRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtomicAppliedCustomerBillingRate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}AppliedCustomerBillingRate">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtomicAppliedCustomerBillingRate")
@XmlSeeAlso({
    AppliedCustomerBillingCredit.class,
    AppliedCustomerBillingCharge.class,
    AppliedCustomerBillingTaxRate.class
})
public abstract class AtomicAppliedCustomerBillingRate
    extends AppliedCustomerBillingRate
{


}
