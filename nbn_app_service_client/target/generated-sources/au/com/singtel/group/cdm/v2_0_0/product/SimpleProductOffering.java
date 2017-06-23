
package au.com.singtel.group.cdm.v2_0_0.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type of ProductOffering that does not have any subordinate
 *                 ProductOfferings, that is, an SimpleProductOffering is a leaf-level ProductOffering.
 *             
 * 
 * <p>Java class for SimpleProductOffering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleProductOffering">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductOffering">
 *       &lt;sequence>
 *         &lt;element name="simpleProductOffering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleProductOffering", propOrder = {
    "simpleProductOffering"
})
public class SimpleProductOffering
    extends ProductOffering
{

    protected String simpleProductOffering;

    /**
     * Gets the value of the simpleProductOffering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleProductOffering() {
        return simpleProductOffering;
    }

    /**
     * Sets the value of the simpleProductOffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleProductOffering(String value) {
        this.simpleProductOffering = value;
    }

}
