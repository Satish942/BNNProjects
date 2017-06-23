
package au.com.singtel.group.ops.ff.crm.orderhandling.v2_0.addressservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.AustralianPropertyAddress;
import au.com.singtel.group.cdm.v2_0_0.common.BaseDto;


/**
 * <p>Java class for queryAddressRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryAddressRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BaseDto">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}AustralianPropertyAddress" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryAddressRequest", propOrder = {
    "address"
})
public class QueryAddressRequest
    extends BaseDto
{

    @XmlElement(required = true)
    protected List<AustralianPropertyAddress> address;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AustralianPropertyAddress }
     * 
     * 
     */
    public List<AustralianPropertyAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<AustralianPropertyAddress>();
        }
        return this.address;
    }

}
