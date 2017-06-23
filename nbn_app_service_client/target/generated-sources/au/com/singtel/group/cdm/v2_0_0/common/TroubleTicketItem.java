
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TroubleTicketItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TroubleTicketItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.group.singtel.com.au/cdm/v2_0_0/common}BusinessInteractionItem">
 *       &lt;sequence>
 *         &lt;element name="troubleTicketItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="style" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TroubleTicketItem", propOrder = {
    "troubleTicketItem",
    "style"
})
public class TroubleTicketItem
    extends BusinessInteractionItem
{

    protected String troubleTicketItem;
    protected String style;

    /**
     * Gets the value of the troubleTicketItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTroubleTicketItem() {
        return troubleTicketItem;
    }

    /**
     * Sets the value of the troubleTicketItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTroubleTicketItem(String value) {
        this.troubleTicketItem = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

}
