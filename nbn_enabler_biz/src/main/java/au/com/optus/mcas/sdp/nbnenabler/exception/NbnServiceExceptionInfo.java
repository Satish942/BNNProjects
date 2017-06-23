/**
 * FileName      : $Id: NbnServiceExceptionInfo.java 2014-11-19 06:51:25Z $
 *
 * Copyright Notice: ©2004 Singapore Telecom Pte Ltd -- Confidential and Proprietary
 *
 * All rights reserved.
 * This software is the confidential and proprietary information of SingTel Pte Ltd
 * ("Confidential Information"). You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license agreement you
 * entered into with SingTel.
 */
package au.com.optus.mcas.sdp.nbnenabler.exception;

import au.com.optus.mcas.core.exception.ServiceExceptionInfo;
import au.com.optus.mcas.core.util.ToStringBuilder;
import java.io.Serializable;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


public class NbnServiceExceptionInfo implements Serializable,
    ServiceExceptionInfo {
    
    /**
     * Exceptions Related to HeaderMessages
     */
    public static final NbnServiceExceptionInfo HNB101 = new NbnServiceExceptionInfo("HNB101",
        "Required Header field %s cannot be empty or null");
    
    
    public static final NbnServiceExceptionInfo BIZ_ERROR_001 = new NbnServiceExceptionInfo("BIZ-Error-001",
        "Input message not valid against schema");
    
    public static final NbnServiceExceptionInfo BIZ_ERROR_002 = new NbnServiceExceptionInfo("BIZ-Error-002",
        "Exception thrown from downstream systems");
    
    public static final NbnServiceExceptionInfo BIZ_ERROR_003 = new NbnServiceExceptionInfo("BIZ-Error-003",
        "Unexpected exception thrown from downstream systems");
    
    
    public static final NbnServiceExceptionInfo SVC_Error_001 = new NbnServiceExceptionInfo("SVC-Error-001",
        "One or more downstream system(s) not available");
    
    public static final NbnServiceExceptionInfo SVC_Error_002 = new NbnServiceExceptionInfo("SVC-Error-002",
        "Access denied");
    
    
    public static final NbnServiceExceptionInfo NB101 = new NbnServiceExceptionInfo("NB101",
        "%s Object Null");
    
    public static final NbnServiceExceptionInfo NB102 = new NbnServiceExceptionInfo("NB102",
        "Required value %s cannot be there in the InteractioParamList.");
    
    public static final NbnServiceExceptionInfo NB103 = new NbnServiceExceptionInfo("NB103",
        "Required List %s cannot be empty.");
    
    
    public static final NbnServiceExceptionInfo NB104 = new NbnServiceExceptionInfo("NB104",
        "Required field %s cannot be empty.");
    
    public static final NbnServiceExceptionInfo NB105 = new NbnServiceExceptionInfo("NB105",
        "Required field %s cannot be empty.");
    
    public static final NbnServiceExceptionInfo NB106 = new NbnServiceExceptionInfo("NB106",
        "Required field %s cannot be empty.");
    
    public static final NbnServiceExceptionInfo NB107 = new NbnServiceExceptionInfo("NB107",
        "Required field %s cannot be as required.");
    
    public static final NbnServiceExceptionInfo NB108 = new NbnServiceExceptionInfo("NB108",
        "Required field %s  can not to be empty or null.");

    /** Internal serialisation version identifier for instances of this class. */
    private static final long serialVersionUID = 6264159726750658117L;

    /**
     * Holds the fault code property.
     */
    private final String mFaultCode;

    /**
     * Holds the fault string property.
     */
    private String mFaultString;

    /**
     * Create and initialises a new instance of <code>NbnServiceExceptionInfo</code> using the specified
     * faultCode and faultString parameters.
     * <p>
     * This is a private constructor.
     *
     * @param faultCode Either an application-specific error code or one raised by a remote webservice method call
     * @param faultString Carries an application-specific error message or one raised by a remote webservice method
     *        call
     */
    private NbnServiceExceptionInfo(final String faultCode,
        final String faultString) {
        mFaultCode = faultCode;
        mFaultString = faultString;
    }

    /**
     * Helper method that can be used to dynamically sets any variable arguments present on the internal
     * <code>faultString</code> property of this instance of <code>NbnServiceExceptionInfo</code>.
     *
     * @param errorInfo Instance of NbnServiceExceptionInfo whose faultString is to be enriched with
     *         the specified arguments
     * @param args
     *         Arguments referenced by the format specifiers in the <code>faultString</code> string.
     * @return The <code>errorInfo</code> instance passed in to this method
     */
    public static NbnServiceExceptionInfo formatFaultString(
        final NbnServiceExceptionInfo errorInfo, final Object... args) {
        final NbnServiceExceptionInfo newErrorInfo = new NbnServiceExceptionInfo(errorInfo.getFaultCode(),
            errorInfo.getFaultString());

        if (!ArrayUtils.isEmpty(args)) {
            newErrorInfo.setFaultString(String.format(
                errorInfo.getFaultString(), args));
        }

        return newErrorInfo;
    }

    /**
     * {@inheritDoc}
     */
    public String getFaultCode() {
        return mFaultCode;
    }

    /**
     * {@inheritDoc}
     */
    public String getFaultString() {
        return mFaultString;
    }

    protected void setFaultString(final String faultString) {
        mFaultString = faultString;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mFaultCode).hashCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final NbnServiceExceptionInfo other = (NbnServiceExceptionInfo) obj;
        final EqualsBuilder builder = new EqualsBuilder();
        builder.append(mFaultCode, other.mFaultCode);

        return builder.isEquals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final ToStringBuilder builder = new ToStringBuilder(this);
        builder.append("faultCode", mFaultCode);
        builder.append("faultString", mFaultString);

        return builder.toString();
    }
}
