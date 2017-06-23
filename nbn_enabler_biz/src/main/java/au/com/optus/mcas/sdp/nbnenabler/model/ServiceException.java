
package au.com.optus.mcas.sdp.nbnenabler.model;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ServiceException", targetNamespace = "http://www.group.singtel.com.au/cdm/v1_0_0/exception")
public class ServiceException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private au.com.singtel.group.cdm.v1_0_0.exception.ServiceException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ServiceException(String message, au.com.singtel.group.cdm.v1_0_0.exception.ServiceException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ServiceException(String message, au.com.singtel.group.cdm.v1_0_0.exception.ServiceException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: au.com.singtel.group.cdm.v1_0_0.exception.ServiceException
     */
    public au.com.singtel.group.cdm.v1_0_0.exception.ServiceException getFaultInfo() {
        return faultInfo;
    }

}