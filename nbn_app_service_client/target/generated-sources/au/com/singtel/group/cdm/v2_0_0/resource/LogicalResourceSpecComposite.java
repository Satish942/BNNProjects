
package au.com.singtel.group.cdm.v2_0_0.resource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LogicalResourceSpecComposite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalResourceSpecComposite">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}LogicalResourceSpec">
 *       &lt;sequence>
 *         &lt;element name="logicalResourceSpec" type="{http://www.group.singtel.com.au/cdm/v2_0_0/resource}LogicalResourceSpec" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalResourceSpecComposite", propOrder = {
    "logicalResourceSpec"
})
public class LogicalResourceSpecComposite
    extends LogicalResourceSpec
{

    protected List<LogicalResourceSpec> logicalResourceSpec;

    /**
     * Gets the value of the logicalResourceSpec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logicalResourceSpec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogicalResourceSpec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicalResourceSpec }
     * 
     * 
     */
    public List<LogicalResourceSpec> getLogicalResourceSpec() {
        if (logicalResourceSpec == null) {
            logicalResourceSpec = new ArrayList<LogicalResourceSpec>();
        }
        return this.logicalResourceSpec;
    }

}
