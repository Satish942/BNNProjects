
package au.com.singtel.group.cdm.v2_0_0.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MASTER"/>
 *     &lt;enumeration value="AMEX"/>
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="CHEQUE"/>
 *     &lt;enumeration value="BPAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodTypeEnum")
@XmlEnum
public enum PaymentMethodTypeEnum {

    VISA,
    MASTER,
    AMEX,
    CASH,
    CHEQUE,
    BPAY;

    public String value() {
        return name();
    }

    public static PaymentMethodTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
