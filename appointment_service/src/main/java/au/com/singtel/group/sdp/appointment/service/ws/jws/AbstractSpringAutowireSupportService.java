/**
 * FileName      : $Id: AbstractSpringAutowireSupportService.java$
 *
 * Copyright Notice: ©2004 Singapore Telecom Pte Ltd -- Confidential and Proprietary
 *
 * All rights reserved.
 * This software is the confidential and proprietary information of SingTel Pte Ltd
 * ("Confidential Information"). You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license agreement you
 * entered into with SingTel.
 */
package au.com.singtel.group.sdp.appointment.service.ws.jws;

import au.com.optus.mcas.core.exception.CheckedException;
import au.com.optus.mcas.core.exception.CoreServiceExceptionInfo;
import au.com.optus.mcas.core.exception.ServiceExceptionInfo;
import au.com.optus.mcas.core.exception.UncheckedException;
import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import javax.xml.ws.soap.SOAPFaultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;


/**
 * SpringBeanAutowiringSupport  enables the Autowire of the biz components. This class is a mimic of
 * JAXWSAbstractService (exception handling) and it extends SpringBeanAutowiringSupport to provides
 * autowiring capabilities.
 *
 * @author Sivasubramanian R
 *
 */
public abstract class AbstractSpringAutowireSupportService extends SpringBeanAutowiringSupport {

    /**
     * This is used as the fault actor for <code>SOAPFaultExceptions</code> if
     * the service URI cannot be determined.
     */
    public static final String UNKNOWN_FAULT_ACTOR = "Unknown fault actor";

    /** The logger. */
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractSpringAutowireSupportService.class);


    /**
     * Converts a exception to a <code>SOAPFaultException</code> and throws it.
     * The <code>SOAPFaultException</code> detail property is set to the exception itself,
     * using<code>FaultUtil.newDetail( throwable ex)</code>.<p>
     *
     * If the exception is an instance of <code>UncheckedException</code> then its application
     * specific <code>ServiceExceptionInfo</code> information will be used as the
     * <code>SOAPFaultException</code> faultCode and faultString properties.<p>
     *
     * For all other run-time exceptions the default<code>ServiceExceptionInfo</code>
     * information for an<code>UncheckedException</code> will be used as the<code>SOAPFaultException
     * </code> faultCode and faultString properties.<p>Note that the <code>SOAPFaultException</code>
     * faultCode uses the standard'soapenv' namespace, so the returned fault element is of the form:
     * <code>&lt;faultcode&gt;soapenv:ApplicationFaultCode&lt;/faultcode&gt;</code>
     *
     * @param exception checked exception to be converted and thrown
     * @throws SOAPFaultException wrapped soap fault exception
     */
    public void raiseSOAPFaultException(Exception exception)
        throws SOAPFaultException {
        ServiceExceptionInfo exceptionInfo = null;

        if (exception instanceof CheckedException) {
            exceptionInfo = ((CheckedException) exception).getExceptionInfo();
        } else {
            exceptionInfo = CoreServiceExceptionInfo.CO10001;
        }

        internalRaiseSOAPFaultException(exceptionInfo, exception);
    }


    /**
     * Converts a run-time exception to a <code>SOAPFaultException</code> and throws it.
     * The <code>SOAPFaultException</code> detail property is set to the exception itself,
     * using<code>FaultUtil.newDetail( throwable ex)</code>.<p>
     *
     * If the exception is an instance of <code>UncheckedException</code> then its application
     * specific <code>ServiceExceptionInfo</code> information will be used as the
     * <code>SOAPFaultException</code> faultCode and faultString properties.<p>
     *
     * For all other run-time exceptions the default<code>ServiceExceptionInfo</code>
     * information for an<code>UncheckedException</code> will be used as the<code>SOAPFaultException
     * </code> faultCode and faultString properties.<p>Note that the <code>SOAPFaultException</code>
     * faultCode uses the standard'soapenv' namespace, so the returned fault element is of the form:
     * <code>&lt;faultcode&gt;soapenv:ApplicationFaultCode&lt;/faultcode&gt;</code>
     *
     * @param runtimeEx runTimeEx unchecked run-time exception to be converted and thrown
     * @throws SOAPFaultException wrapped soap fault exception
     */
    public void raiseSOAPFaultException(RuntimeException runtimeEx)
        throws SOAPFaultException {
        ServiceExceptionInfo exceptionInfo = null;

        if (runtimeEx instanceof UncheckedException) {
            exceptionInfo = ((UncheckedException) runtimeEx).getExceptionInfo();
        } else {
            exceptionInfo = CoreServiceExceptionInfo.CO10001;
        }

        internalRaiseSOAPFaultException(exceptionInfo, runtimeEx);
    }

    /**
     * Converts a checked exception to a <code>SOAPFaultException</code> and throws it.
     *
     * <p>
     * The exception's application specific <code>ServiceExceptionInfo</code>
     * information is inserted into the <code>SOAPFaultException</code>
     * faultCode and faultString properties.
     *
     * <p>
     * The <code>SOAPFaultException</code> detail property is set to the
     * exception itself, using <code>FaultUtil.newDetail( throwable ex)</code>.
     *
     * <p>
     * Note that the <code>SOAPFaultException</code> faultCode uses the standard
     * 'soapenv' namespace, so the returned fault element is of the form:
     * <code>&lt;faultcode&gt;soapenv:ApplicationFaultCode&lt;/faultcode&gt;</code>
     *
     * @param checkedEx
     *            checked exception to be converted and thrown.
     *
     * @throws SOAPFaultException wrapped soap fault exception
     */
    public void raiseSOAPFaultException(CheckedException checkedEx)
        throws SOAPFaultException {
        internalRaiseSOAPFaultException(checkedEx.getExceptionInfo(), checkedEx);
    }

    /**
     * Internal method for raising the actual <code>SOAPFaultException</code>.
     *
     * @param exInfo
     *            is the error code/string informatiion associated with the
     *            exception.
     * @param throwable
     *            exception to be converted to a <code>SOAPFaultException</code>
     */
    private void internalRaiseSOAPFaultException(ServiceExceptionInfo exInfo,
        Throwable throwable) {
        // determine the fault actor based on the service URI
        String faultActor = UNKNOWN_FAULT_ACTOR;

        WebService webService = getClass().getAnnotation(WebService.class);

        if (webService != null) {
            faultActor = webService.serviceName();
        }

        // create the faultCode using the SOAP 1.1 envelope namespace
        QName faultCode = new QName(SOAPConstants.URI_NS_SOAP_1_1_ENVELOPE,
            exInfo.getFaultCode());

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug(
                "Raising SOAPFaultException:\n\tfaultCode:{} \n\tfaultString: {} \n\tfaultActor:{} \n\texception:{}",
                new Object[] {faultCode, exInfo.getFaultString(), faultActor, throwable.toString()});
        }

        LOGGER.error("unexpected exception", throwable);

        javax.xml.soap.SOAPFault soapFault = null;

        try {
            soapFault = SOAPFactory.newInstance().createFault();
            LOGGER.debug("creating soapFault...");
            soapFault.setFaultCode(faultCode);
            LOGGER.debug("setting soapFault...");
            soapFault.setFaultActor(faultActor);
            LOGGER.debug("setting FaultActor...");
            soapFault.setFaultString(exInfo.getFaultString());

            LOGGER.debug("adding soap fault detail ");

        } catch (SOAPException e) {
            LOGGER.error("unable to create fault", e);
        }
        LOGGER.error("throwing before SOAPFaultException exception ");
        throw new SOAPFaultException(soapFault);
    }
}
