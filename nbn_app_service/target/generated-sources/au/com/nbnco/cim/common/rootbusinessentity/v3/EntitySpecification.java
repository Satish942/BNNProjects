
package au.com.nbnco.cim.common.rootbusinessentity.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The template having associated invariant characteristics of a managed entity
 *             
 * 
 * <p>Java class for EntitySpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitySpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}Specification">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharacteristicSpecification" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}Characteristic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EntitySpecificationRelationship" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}EntitySpecificationRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitySpecification", propOrder = {
    "type",
    "category",
    "characteristicSpecification",
    "entitySpecificationRelationship"
})
public class EntitySpecification
    extends Specification
{

    protected String type;
    protected String category;
    @XmlElement(name = "CharacteristicSpecification")
    protected List<Characteristic> characteristicSpecification;
    @XmlElement(name = "EntitySpecificationRelationship")
    protected List<EntitySpecificationRelationship> entitySpecificationRelationship;

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

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the characteristicSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristicSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Characteristic }
     * 
     * 
     */
    public List<Characteristic> getCharacteristicSpecification() {
        if (characteristicSpecification == null) {
            characteristicSpecification = new ArrayList<Characteristic>();
        }
        return this.characteristicSpecification;
    }

    /**
     * Gets the value of the entitySpecificationRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entitySpecificationRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntitySpecificationRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntitySpecificationRelationship }
     * 
     * 
     */
    public List<EntitySpecificationRelationship> getEntitySpecificationRelationship() {
        if (entitySpecificationRelationship == null) {
            entitySpecificationRelationship = new ArrayList<EntitySpecificationRelationship>();
        }
        return this.entitySpecificationRelationship;
    }

}
