
package au.com.singtel.group.cdm.v2_0_0.product;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type of ProductSpecification that does not have any
 *                 subordinate ProductSpecifications, that is, an AtomicProductSpecification is a leaf-level
 *                 ProductSpecification.
 *             
 * 
 * <p>Java class for AtomicProductSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtomicProductSpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductSpecification">
 *       &lt;sequence>
 *         &lt;element name="atomicProductSpecification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atomicProductUsageSpec" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}AtomicProductUsageSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtomicProductSpecification", propOrder = {
    "atomicProductSpecification",
    "atomicProductUsageSpec"
})
public class AtomicProductSpecification
    extends ProductSpecification
{

    protected String atomicProductSpecification;
    protected List<AtomicProductUsageSpec> atomicProductUsageSpec;

    /**
     * Gets the value of the atomicProductSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtomicProductSpecification() {
        return atomicProductSpecification;
    }

    /**
     * Sets the value of the atomicProductSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtomicProductSpecification(String value) {
        this.atomicProductSpecification = value;
    }

    /**
     * Gets the value of the atomicProductUsageSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atomicProductUsageSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtomicProductUsageSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtomicProductUsageSpec }
     * 
     * 
     */
    public List<AtomicProductUsageSpec> getAtomicProductUsageSpec() {
        if (atomicProductUsageSpec == null) {
            atomicProductUsageSpec = new ArrayList<AtomicProductUsageSpec>();
        }
        return this.atomicProductUsageSpec;
    }

}
