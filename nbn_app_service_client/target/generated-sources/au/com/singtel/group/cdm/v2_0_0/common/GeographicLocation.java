
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeographicLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Place">
 *       &lt;sequence>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longitue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geographicAddress" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}GeographicAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicLocation", propOrder = {
    "latitude",
    "longitue",
    "geographicAddress"
})
public abstract class GeographicLocation
    extends Place
{

    protected String latitude;
    protected String longitue;
    protected GeographicAddress geographicAddress;

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitue() {
        return longitue;
    }

    /**
     * Sets the value of the longitue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitue(String value) {
        this.longitue = value;
    }

    /**
     * Gets the value of the geographicAddress property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicAddress }
     *     
     */
    public GeographicAddress getGeographicAddress() {
        return geographicAddress;
    }

    /**
     * Sets the value of the geographicAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicAddress }
     *     
     */
    public void setGeographicAddress(GeographicAddress value) {
        this.geographicAddress = value;
    }

}
