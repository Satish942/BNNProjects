
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Director complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Director">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}PartyRole">
 *       &lt;sequence>
 *         &lt;element name="directorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Director", propOrder = {
    "directorType"
})
public class Director
    extends PartyRole
{

    protected String directorType;

    /**
     * Gets the value of the directorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorType() {
        return directorType;
    }

    /**
     * Sets the value of the directorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorType(String value) {
        this.directorType = value;
    }

}
