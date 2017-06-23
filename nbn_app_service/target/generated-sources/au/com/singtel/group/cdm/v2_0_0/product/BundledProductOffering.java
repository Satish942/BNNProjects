
package au.com.singtel.group.cdm.v2_0_0.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:common="http://www.group.singtel.com.au/cdm/v2_0_0/common" xmlns:product="http://www.group.singtel.com.au/cdm/v2_0_0/product" xmlns:xsd="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BundledProductOffering complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundledProductOffering">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductOffering">
 *       &lt;sequence>
 *         &lt;element name="bundledProductOffering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundledProductOffering", propOrder = {
    "bundledProductOffering"
})
public class BundledProductOffering
    extends ProductOffering
{

    protected String bundledProductOffering;

    /**
     * Gets the value of the bundledProductOffering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundledProductOffering() {
        return bundledProductOffering;
    }

    /**
     * Sets the value of the bundledProductOffering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundledProductOffering(String value) {
        this.bundledProductOffering = value;
    }

}
