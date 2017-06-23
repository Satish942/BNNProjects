
package au.com.optus.mcas.sdp.nbnapp.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppliedCustomerBillingCharge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppliedCustomerBillingCharge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}AtomicAppliedCustomerBillingRate">
 *       &lt;sequence>
 *         &lt;element name="prodPriceCharge" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedCustomerBillingCharge", propOrder = {
    "prodPriceCharge"
})
@XmlSeeAlso({
    AppliedCustomerBillingProductCharge.class
})
public abstract class AppliedCustomerBillingCharge
    extends AtomicAppliedCustomerBillingRate
{

    protected List<String> prodPriceCharge;

    /**
     * Gets the value of the prodPriceCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodPriceCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdPriceCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProdPriceCharge() {
        if (prodPriceCharge == null) {
            prodPriceCharge = new ArrayList<String>();
        }
        return this.prodPriceCharge;
    }

}
