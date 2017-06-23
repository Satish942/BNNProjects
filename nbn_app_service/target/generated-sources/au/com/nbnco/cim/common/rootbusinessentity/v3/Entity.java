
package au.com.nbnco.cim.common.rootbusinessentity.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.com.nbnco.cim.common.exception.v3.Exception;
import au.com.nbnco.cim.common.message.v4.Document;
import au.com.nbnco.cim.manageservicelimiter.v4.ServiceLimit;


/**
 * This is an abstract base class that is used to represent entities that cannot be directly
 *                 managed (e.g., a hub).
 * 
 * <p>Java class for Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}RootEntity">
 *       &lt;sequence>
 *         &lt;element name="SpecifiedBy" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}EntitySpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EntityRelationship" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}EntityRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity", propOrder = {
    "specifiedBy",
    "entityRelationship",
    "type"
})
@XmlSeeAlso({
    ServiceLimit.class,
    ManagedEntity.class,
    Note.class,
    Document.class,
    Exception.class
})
public abstract class Entity
    extends RootEntity
{

    @XmlElement(name = "SpecifiedBy")
    protected List<EntitySpecification> specifiedBy;
    @XmlElement(name = "EntityRelationship")
    protected List<EntityRelationship> entityRelationship;
    protected String type;

    /**
     * Gets the value of the specifiedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitySpecification }
     * 
     * 
     */
    public List<EntitySpecification> getSpecifiedBy() {
        if (specifiedBy == null) {
            specifiedBy = new ArrayList<EntitySpecification>();
        }
        return this.specifiedBy;
    }

    /**
     * Gets the value of the entityRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityRelationship }
     * 
     * 
     */
    public List<EntityRelationship> getEntityRelationship() {
        if (entityRelationship == null) {
            entityRelationship = new ArrayList<EntityRelationship>();
        }
        return this.entityRelationship;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
