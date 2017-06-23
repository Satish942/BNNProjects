
package au.com.singtel.group.cdm.v2_0_0.product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A detailed description of the usage of a product, described by
 *                 AtomicProductSpecification
 *             
 * 
 * <p>Java class for AtomicProductUsageSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtomicProductUsageSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductUsageSpec">
 *       &lt;sequence>
 *         &lt;element name="atomicProductUsageSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtomicProductUsageSpec", propOrder = {
    "atomicProductUsageSpec"
})
public class AtomicProductUsageSpec
    extends ProductUsageSpec
{

    protected String atomicProductUsageSpec;

    /**
     * Gets the value of the atomicProductUsageSpec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtomicProductUsageSpec() {
        return atomicProductUsageSpec;
    }

    /**
     * Sets the value of the atomicProductUsageSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtomicProductUsageSpec(String value) {
        this.atomicProductUsageSpec = value;
    }

}
