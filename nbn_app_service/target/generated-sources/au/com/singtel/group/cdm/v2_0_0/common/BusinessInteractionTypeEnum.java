
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessInteractionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BusinessInteractionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INQUIRY"/>
 *     &lt;enumeration value="QUOTE"/>
 *     &lt;enumeration value="PROBLEM_REPORT"/>
 *     &lt;enumeration value="CONNECT"/>
 *     &lt;enumeration value="DISCONNECT"/>
 *     &lt;enumeration value="MODIFY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BusinessInteractionTypeEnum")
@XmlEnum
public enum BusinessInteractionTypeEnum {

    INQUIRY,
    QUOTE,
    PROBLEM_REPORT,
    CONNECT,
    DISCONNECT,
    MODIFY;

    public String value() {
        return name();
    }

    public static BusinessInteractionTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
