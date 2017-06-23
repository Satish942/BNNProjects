
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessInteractionItemActionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessInteractionItemActionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="CANCEL"/>
 *     &lt;enumeration value="NOCHANGE"/>
 *     &lt;enumeration value="OPT-OUT"/>
 *     &lt;enumeration value="DELETE"/>
 *     &lt;enumeration value="MODIFY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessInteractionItemActionEnum")
@XmlEnum
public enum BusinessInteractionItemActionEnum {

    ADD("ADD"),
    UPDATE("UPDATE"),
    CANCEL("CANCEL"),
    NOCHANGE("NOCHANGE"),
    @XmlEnumValue("OPT-OUT")
    OPT_OUT("OPT-OUT"),
    DELETE("DELETE"),
    MODIFY("MODIFY");
    private final String value;

    BusinessInteractionItemActionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessInteractionItemActionEnum fromValue(String v) {
        for (BusinessInteractionItemActionEnum c: BusinessInteractionItemActionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
