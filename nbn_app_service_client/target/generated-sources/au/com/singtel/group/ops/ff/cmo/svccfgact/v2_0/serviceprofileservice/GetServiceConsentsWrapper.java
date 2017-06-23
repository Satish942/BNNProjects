
package au.com.singtel.group.ops.ff.cmo.svccfgact.v2_0.serviceprofileservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.com.singtel.group.cdm.v2_0_0.common.Consent;
import au.com.singtel.group.cdm.v2_0_0.service.Service;


/**
 * <p>Java class for GetServiceConsentsWrapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServiceConsentsWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consent" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}Consent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="service" type="{http://www.group.singtel.com.au/cdm/v2_0_0/service}Service" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServiceConsentsWrapper", propOrder = {
    "consent",
    "service"
})
public class GetServiceConsentsWrapper {

    @XmlElement(nillable = true)
    protected List<Consent> consent;
    @XmlElement(nillable = true)
    protected List<Service> service;

    /**
     * Gets the value of the consent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Consent }
     * 
     * 
     */
    public List<Consent> getConsent() {
        if (consent == null) {
            consent = new ArrayList<Consent>();
        }
        return this.consent;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Service }
     * 
     * 
     */
    public List<Service> getService() {
        if (service == null) {
            service = new ArrayList<Service>();
        }
        return this.service;
    }

}
