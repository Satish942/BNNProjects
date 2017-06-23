
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A detailed description of a product usage event. It represents
 *                 customer's transaction as a whole or its autonomously billable part.
 *             
 * 
 * <p>Java class for ProductUsageSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductUsageSpec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}UsageSpecification">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductUsageSpec")
@XmlSeeAlso({
    AtomicProductUsageSpec.class
})
public abstract class ProductUsageSpec
    extends UsageSpecification
{


}
