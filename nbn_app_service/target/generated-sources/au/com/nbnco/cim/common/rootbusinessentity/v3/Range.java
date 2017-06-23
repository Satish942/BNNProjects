
package au.com.nbnco.cim.common.rootbusinessentity.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Range of values
 * 
 * <p>Java class for Range complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Range">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lowerValue" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}Quantity" minOccurs="0"/>
 *         &lt;element name="upperValue" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}Quantity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Range", propOrder = {
    "lowerValue",
    "upperValue"
})
public class Range {

    protected Quantity lowerValue;
    protected Quantity upperValue;

    /**
     * Gets the value of the lowerValue property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getLowerValue() {
        return lowerValue;
    }

    /**
     * Sets the value of the lowerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setLowerValue(Quantity value) {
        this.lowerValue = value;
    }

    /**
     * Gets the value of the upperValue property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getUpperValue() {
        return upperValue;
    }

    /**
     * Sets the value of the upperValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setUpperValue(Quantity value) {
        this.upperValue = value;
    }

}
