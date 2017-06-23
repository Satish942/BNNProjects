
package au.com.singtel.group.cdm.v2_0_0.product;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.TimePeriod;


/**
 * A characteristic quality or distinctive feature of a
 *                 ProductSpecification. The characteristic can be take on a discrete value, such as color, can take on a
 *                 range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for
 *                 example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be
 *                 configured during the ordering or some other process.
 *             
 * 
 * <p>Java class for ProductSpecCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unique" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minCardinality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxCardinality" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="extensible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="derivationFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validFor" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}TimePeriod" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCharacteristicValue" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductCharacteristicValue" minOccurs="0"/>
 *         &lt;element name="productSpecCharacteristicValue" type="{http://www.group.singtel.com.au/cdm/v2_0_0/product}ProductSpecCharacteristicValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSpecCharacteristic", propOrder = {
    "id",
    "name",
    "description",
    "unique",
    "valueType",
    "minCardinality",
    "maxCardinality",
    "extensible",
    "derivationFormula",
    "validFor",
    "action",
    "type",
    "productCharacteristicValue",
    "productSpecCharacteristicValue"
})
public class ProductSpecCharacteristic {

    protected String id;
    protected String name;
    protected String description;
    protected String unique;
    protected String valueType;
    protected Integer minCardinality;
    protected Integer maxCardinality;
    protected Boolean extensible;
    protected String derivationFormula;
    protected TimePeriod validFor;
    protected String action;
    protected String type;
    protected ProductCharacteristicValue productCharacteristicValue;
    protected List<ProductSpecCharacteristicValue> productSpecCharacteristicValue;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
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
     * Gets the value of the unique property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnique(String value) {
        this.unique = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueType(String value) {
        this.valueType = value;
    }

    /**
     * Gets the value of the minCardinality property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinCardinality() {
        return minCardinality;
    }

    /**
     * Sets the value of the minCardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinCardinality(Integer value) {
        this.minCardinality = value;
    }

    /**
     * Gets the value of the maxCardinality property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCardinality() {
        return maxCardinality;
    }

    /**
     * Sets the value of the maxCardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCardinality(Integer value) {
        this.maxCardinality = value;
    }

    /**
     * Gets the value of the extensible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtensible() {
        return extensible;
    }

    /**
     * Sets the value of the extensible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtensible(Boolean value) {
        this.extensible = value;
    }

    /**
     * Gets the value of the derivationFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivationFormula() {
        return derivationFormula;
    }

    /**
     * Sets the value of the derivationFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivationFormula(String value) {
        this.derivationFormula = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setValidFor(TimePeriod value) {
        this.validFor = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
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

    /**
     * Gets the value of the productCharacteristicValue property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCharacteristicValue }
     *     
     */
    public ProductCharacteristicValue getProductCharacteristicValue() {
        return productCharacteristicValue;
    }

    /**
     * Sets the value of the productCharacteristicValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCharacteristicValue }
     *     
     */
    public void setProductCharacteristicValue(ProductCharacteristicValue value) {
        this.productCharacteristicValue = value;
    }

    /**
     * Gets the value of the productSpecCharacteristicValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSpecCharacteristicValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSpecCharacteristicValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSpecCharacteristicValue }
     * 
     * 
     */
    public List<ProductSpecCharacteristicValue> getProductSpecCharacteristicValue() {
        if (productSpecCharacteristicValue == null) {
            productSpecCharacteristicValue = new ArrayList<ProductSpecCharacteristicValue>();
        }
        return this.productSpecCharacteristicValue;
    }

}
