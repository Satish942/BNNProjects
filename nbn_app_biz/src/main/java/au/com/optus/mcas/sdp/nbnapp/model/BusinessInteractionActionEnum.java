
package au.com.optus.mcas.sdp.nbnapp.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessInteractionActionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessInteractionActionEnum">
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
@XmlType(name = "BusinessInteractionActionEnum")
@XmlEnum
public enum BusinessInteractionActionEnum {

    ADD("ADD"),
    UPDATE("UPDATE"),
    CANCEL("CANCEL"),
    NOCHANGE("NOCHANGE"),
    @XmlEnumValue("OPT-OUT")
    OPT_OUT("OPT-OUT"),
    DELETE("DELETE"),
    MODIFY("MODIFY");
    private final String value;

    BusinessInteractionActionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusinessInteractionActionEnum fromValue(String v) {
        for (BusinessInteractionActionEnum c: BusinessInteractionActionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
