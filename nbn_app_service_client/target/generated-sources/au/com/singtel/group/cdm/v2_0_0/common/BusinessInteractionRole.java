
package au.com.singtel.group.cdm.v2_0_0.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessInteractionRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessInteractionRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interactionRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementAuthorizationForBusinessInteractionRole" type="{http://www.group.singtel.com.au/cdm/v2_0_0/common}AgreementAuthorization" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInteractionRole", propOrder = {
    "id",
    "interactionRole",
    "action",
    "agreementAuthorizationForBusinessInteractionRole"
})
@XmlSeeAlso({
    CustomerAccountInteractionRole.class,
    PartyInteractionRole.class
})
public class BusinessInteractionRole {

    protected String id;
    protected String interactionRole;
    protected String action;
    protected List<AgreementAuthorization> agreementAuthorizationForBusinessInteractionRole;

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
     * Gets the value of the interactionRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractionRole() {
        return interactionRole;
    }

    /**
     * Sets the value of the interactionRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractionRole(String value) {
        this.interactionRole = value;
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
     * Gets the value of the agreementAuthorizationForBusinessInteractionRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreementAuthorizationForBusinessInteractionRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreementAuthorizationForBusinessInteractionRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgreementAuthorization }
     * 
     * 
     */
    public List<AgreementAuthorization> getAgreementAuthorizationForBusinessInteractionRole() {
        if (agreementAuthorizationForBusinessInteractionRole == null) {
            agreementAuthorizationForBusinessInteractionRole = new ArrayList<AgreementAuthorization>();
        }
        return this.agreementAuthorizationForBusinessInteractionRole;
    }

}
