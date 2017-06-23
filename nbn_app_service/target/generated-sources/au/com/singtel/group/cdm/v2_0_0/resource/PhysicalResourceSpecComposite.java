
package au.com.singtel.group.cdm.v2_0_0.resource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalResourceSpecComposite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalResourceSpecComposite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}PhysicalResourceSpec">
 *       &lt;sequence>
 *         &lt;element name="physicalResourceSpec" type="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}PhysicalResourceSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalResourceSpecComposite", propOrder = {
    "physicalResourceSpec"
})
public class PhysicalResourceSpecComposite
    extends PhysicalResourceSpec
{

    protected List<PhysicalResourceSpec> physicalResourceSpec;

    /**
     * Gets the value of the physicalResourceSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the physicalResourceSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhysicalResourceSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalResourceSpec }
     * 
     * 
     */
    public List<PhysicalResourceSpec> getPhysicalResourceSpec() {
        if (physicalResourceSpec == null) {
            physicalResourceSpec = new ArrayList<PhysicalResourceSpec>();
        }
        return this.physicalResourceSpec;
    }

}
