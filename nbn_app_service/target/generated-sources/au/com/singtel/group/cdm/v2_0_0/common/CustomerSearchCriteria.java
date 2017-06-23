
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerSearchCriteria.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerSearchCriteria">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INDIVIDUAL"/>
 *     &lt;enumeration value="ORGANIZATION"/>
 *     &lt;enumeration value="SERVICE"/>
 *     &lt;enumeration value="ADDRESS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerSearchCriteria")
@XmlEnum
public enum CustomerSearchCriteria {

    INDIVIDUAL,
    ORGANIZATION,
    SERVICE,
    ADDRESS;

    public String value() {
        return name();
    }

    public static CustomerSearchCriteria fromValue(String v) {
        return valueOf(v);
    }

}
