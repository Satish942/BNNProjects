
package au.com.optus.mcas.sdp.nbnapp.exception;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The error codes returned with this exception will be in the range 009000 to 009999
 *             
 * 
 * <p>Java class for MessageReplayException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageReplayException">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nbnco.com.au/cim/common/exception/v3}MessageException">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageReplayException")
public class MessageReplayException
    extends MessageException
{


}
