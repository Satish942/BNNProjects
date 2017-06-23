
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Optus - GeographicAddress has AbstractGeographicAddress
 *             
 * 
 * <p>Java class for GeographicSubAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicSubAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subUnitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subUnitNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="privateStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locationDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildingNameMinor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildingNameMajor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryComplexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complexRoadNumber1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complexRoadNumber2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complexRoadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complexRoadTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complexRoadSuffixCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicSubAddress", propOrder = {
    "subUnitType",
    "subUnitNr",
    "levelType",
    "levelNr",
    "buildingName",
    "privateStreetName",
    "locationDescriptor",
    "buildingNameMinor",
    "buildingNameMajor",
    "secondaryComplexName",
    "complexRoadNumber1",
    "complexRoadNumber2",
    "complexRoadName",
    "complexRoadTypeCode",
    "complexRoadSuffixCode"
})
public class GeographicSubAddress {

    protected String subUnitType;
    protected String subUnitNr;
    protected String levelType;
    protected String levelNr;
    protected String buildingName;
    protected String privateStreetName;
    protected String locationDescriptor;
    protected String buildingNameMinor;
    protected String buildingNameMajor;
    protected String secondaryComplexName;
    protected String complexRoadNumber1;
    protected String complexRoadNumber2;
    protected String complexRoadName;
    protected String complexRoadTypeCode;
    protected String complexRoadSuffixCode;

    /**
     * Gets the value of the subUnitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubUnitType() {
        return subUnitType;
    }

    /**
     * Sets the value of the subUnitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubUnitType(String value) {
        this.subUnitType = value;
    }

    /**
     * Gets the value of the subUnitNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubUnitNr() {
        return subUnitNr;
    }

    /**
     * Sets the value of the subUnitNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubUnitNr(String value) {
        this.subUnitNr = value;
    }

    /**
     * Gets the value of the levelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelType() {
        return levelType;
    }

    /**
     * Sets the value of the levelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelType(String value) {
        this.levelType = value;
    }

    /**
     * Gets the value of the levelNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelNr() {
        return levelNr;
    }

    /**
     * Sets the value of the levelNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelNr(String value) {
        this.levelNr = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingName(String value) {
        this.buildingName = value;
    }

    /**
     * Gets the value of the privateStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateStreetName() {
        return privateStreetName;
    }

    /**
     * Sets the value of the privateStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateStreetName(String value) {
        this.privateStreetName = value;
    }

    /**
     * Gets the value of the locationDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationDescriptor() {
        return locationDescriptor;
    }

    /**
     * Sets the value of the locationDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationDescriptor(String value) {
        this.locationDescriptor = value;
    }

    /**
     * Gets the value of the buildingNameMinor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNameMinor() {
        return buildingNameMinor;
    }

    /**
     * Sets the value of the buildingNameMinor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNameMinor(String value) {
        this.buildingNameMinor = value;
    }

    /**
     * Gets the value of the buildingNameMajor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNameMajor() {
        return buildingNameMajor;
    }

    /**
     * Sets the value of the buildingNameMajor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNameMajor(String value) {
        this.buildingNameMajor = value;
    }

    /**
     * Gets the value of the secondaryComplexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryComplexName() {
        return secondaryComplexName;
    }

    /**
     * Sets the value of the secondaryComplexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryComplexName(String value) {
        this.secondaryComplexName = value;
    }

    /**
     * Gets the value of the complexRoadNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexRoadNumber1() {
        return complexRoadNumber1;
    }

    /**
     * Sets the value of the complexRoadNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexRoadNumber1(String value) {
        this.complexRoadNumber1 = value;
    }

    /**
     * Gets the value of the complexRoadNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexRoadNumber2() {
        return complexRoadNumber2;
    }

    /**
     * Sets the value of the complexRoadNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexRoadNumber2(String value) {
        this.complexRoadNumber2 = value;
    }

    /**
     * Gets the value of the complexRoadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexRoadName() {
        return complexRoadName;
    }

    /**
     * Sets the value of the complexRoadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexRoadName(String value) {
        this.complexRoadName = value;
    }

    /**
     * Gets the value of the complexRoadTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexRoadTypeCode() {
        return complexRoadTypeCode;
    }

    /**
     * Sets the value of the complexRoadTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexRoadTypeCode(String value) {
        this.complexRoadTypeCode = value;
    }

    /**
     * Gets the value of the complexRoadSuffixCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexRoadSuffixCode() {
        return complexRoadSuffixCode;
    }

    /**
     * Sets the value of the complexRoadSuffixCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexRoadSuffixCode(String value) {
        this.complexRoadSuffixCode = value;
    }

}
