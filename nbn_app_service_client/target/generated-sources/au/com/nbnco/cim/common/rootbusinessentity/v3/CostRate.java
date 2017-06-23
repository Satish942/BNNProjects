
package au.com.nbnco.cim.common.rootbusinessentity.v3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A base / value business entity used to represent a cost per time unit.
 *             
 * 
 * <p>Java class for CostRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numerator" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}Money" minOccurs="0"/>
 *         &lt;element name="denominator" type="{http://www.nbnco.com.au/cim/common/rootBusinessEntity/v3}Duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostRate", propOrder = {
    "numerator",
    "denominator"
})
public class CostRate {

    protected Money numerator;
    protected Duration denominator;

    /**
     * Gets the value of the numerator property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNumerator() {
        return numerator;
    }

    /**
     * Sets the value of the numerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNumerator(Money value) {
        this.numerator = value;
    }

    /**
     * Gets the value of the denominator property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDenominator(Duration value) {
        this.denominator = value;
    }

}
