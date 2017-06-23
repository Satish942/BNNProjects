
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Collection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Collection">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}RootEntity">
 *       &lt;sequence>
 *         &lt;element name="orderMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collection", propOrder = {
    "orderMethod"
})
@XmlSeeAlso({
    PolicyEvent.class
})
public abstract class Collection
    extends RootEntity
{

    protected String orderMethod;

    /**
     * Gets the value of the orderMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderMethod() {
        return orderMethod;
    }

    /**
     * Sets the value of the orderMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderMethod(String value) {
        this.orderMethod = value;
    }

}
