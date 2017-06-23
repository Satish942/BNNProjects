
package au.com.singtel.group.cdm.v2_0_0.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.Opportunity;


/**
 * <p>Java class for CustomerQuote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerQuote">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}InquiryResponse">
 *       &lt;sequence>
 *         &lt;element name="opportunity" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Opportunity" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerQuote", propOrder = {
    "opportunity"
})
public class CustomerQuote
    extends InquiryResponse
{

    protected List<Opportunity> opportunity;

    /**
     * Gets the value of the opportunity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Opportunity }
     * 
     * 
     */
    public List<Opportunity> getOpportunity() {
        if (opportunity == null) {
            opportunity = new ArrayList<Opportunity>();
        }
        return this.opportunity;
    }

}
