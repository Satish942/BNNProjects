
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueNetworkRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueNetworkRole">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PartyRole">
 *       &lt;sequence>
 *         &lt;element name="valueNetworkRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueNetworkRole", propOrder = {
    "valueNetworkRole"
})
@XmlSeeAlso({
    ServiceProvider.class,
    FunctionOrProcessProvider.class
})
public abstract class ValueNetworkRole
    extends PartyRole
{

    protected String valueNetworkRole;

    /**
     * Gets the value of the valueNetworkRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueNetworkRole() {
        return valueNetworkRole;
    }

    /**
     * Sets the value of the valueNetworkRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueNetworkRole(String value) {
        this.valueNetworkRole = value;
    }

}
