
package au.com.nbnco.cim.common.rootbusinessentity.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an abstract base class that is used to define the invariant characteristics
 *                 (attributes, methods, and relationships) of a managed entity.
 * 
 * <p>Java class for Specification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Specification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}RootEntity">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specification")
@XmlSeeAlso({
    EntitySpecification.class
})
public abstract class Specification
    extends RootEntity
{


}
