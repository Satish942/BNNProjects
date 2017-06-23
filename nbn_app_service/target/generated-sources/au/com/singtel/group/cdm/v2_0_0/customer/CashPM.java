
package au.com.singtel.group.cdm.v2_0_0.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashPM complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashPM">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/customer}PaymentMethod">
 *       &lt;sequence>
 *         &lt;element name="cashierInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashPM", propOrder = {
    "cashierInfo"
})
public class CashPM
    extends PaymentMethod
{

    protected String cashierInfo;

    /**
     * Gets the value of the cashierInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashierInfo() {
        return cashierInfo;
    }

    /**
     * Sets the value of the cashierInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashierInfo(String value) {
        this.cashierInfo = value;
    }

}
