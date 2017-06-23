
package au.com.singtel.group.cdm.v2_0_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.service.ServiceSpecification;


/**
 * <p>Java class for Specification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Specification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}RootEntity">
 *       &lt;sequence>
 *         &lt;element name="specificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specificationType" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}SpecificationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specification", propOrder = {
    "specificationName",
    "specificationType"
})
@XmlSeeAlso({
    ServiceSpecification.class
})
public abstract class Specification
    extends RootEntity
{

    protected String specificationName;
    protected List<SpecificationType> specificationType;

    /**
     * Gets the value of the specificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationName() {
        return specificationName;
    }

    /**
     * Sets the value of the specificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationName(String value) {
        this.specificationName = value;
    }

    /**
     * Gets the value of the specificationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificationType }
     * 
     * 
     */
    public List<SpecificationType> getSpecificationType() {
        if (specificationType == null) {
            specificationType = new ArrayList<SpecificationType>();
        }
        return this.specificationType;
    }

}
