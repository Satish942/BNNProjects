
package au.com.nbnco.cim.common.rootbusinessentity.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import au.com.nbnco.cim.common.message.v4.BatchDetail;
import au.com.nbnco.cim.common.message.v4.MessageSpecification;


/**
 * This is the top of the DEN-ng class hierarchy. These properties enable us to name,
 *                 describe, and identify all objects (manageable and unmanageable) in the environment.
 * 
 * <p>Java class for RootEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RootEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescribedBy" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}CharacteristicValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VersionDetails" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}VersionDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RootEntity", propOrder = {
    "id",
    "name",
    "description",
    "describedBy",
    "versionDetails",
    "version"
})
@XmlSeeAlso({
    Specification.class,
    MessageSpecification.class,
    BatchDetail.class,
    Entity.class
})
public abstract class RootEntity {

    @XmlElement(name = "ID")
    protected String id;
    protected String name;
    protected String description;
    @XmlElement(name = "DescribedBy")
    protected List<CharacteristicValue> describedBy;
    @XmlElement(name = "VersionDetails")
    protected List<VersionDetails> versionDetails;
    protected String version;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the describedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the describedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescribedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicValue }
     * 
     * 
     */
    public List<CharacteristicValue> getDescribedBy() {
        if (describedBy == null) {
            describedBy = new ArrayList<CharacteristicValue>();
        }
        return this.describedBy;
    }

    /**
     * Gets the value of the versionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VersionDetails }
     * 
     * 
     */
    public List<VersionDetails> getVersionDetails() {
        if (versionDetails == null) {
            versionDetails = new ArrayList<VersionDetails>();
        }
        return this.versionDetails;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
