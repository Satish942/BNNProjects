package au.com.optus.mcas.sdp.nbnenabler.exception;

import java.io.Serializable;
import au.com.optus.mcas.core.exception.CheckedException;
import au.com.optus.mcas.core.exception.ServiceExceptionInfo;

public class NbnServiceException extends CheckedException implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private   String code ;
    private   String message ;

    /**
     * Creates a new CmbsEnablerException object.
     *
     * @param exceptionInfo DOCUMENT ME!
     */
    public NbnServiceException(ServiceExceptionInfo exceptionInfo) {
        super(exceptionInfo);
    }
    
    
    public NbnServiceException(final NbnServiceExceptionInfo exceptionInfo,
        final Throwable cause) {
        super(exceptionInfo, cause);
    }

    /**
     * Creates a new CmbsEnablerException object.
     */
    public NbnServiceException() {
    }

    /**
     * Creates a new OietsServiceException object.
     * @param mssage
     *        String
     */
    public NbnServiceException(String mssage) {
        this.message = mssage;
    }

    /**
     * Creates a new OietsServiceException object.
     *
     * @param code String
     * @param message String
     */
    public NbnServiceException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 
     * @param exceptionInfo
     * @param message
     */
    public NbnServiceException(final NbnServiceExceptionInfo exceptionInfo, String message) {
        super(exceptionInfo, message);
    }

    /**
     * getCode
     *
     * @return String
     */
    public String getCode() {
        return this.code;
    }

    /**
     * getMessage.
     *
     * @return String
     */
    public String getMessage() {
        return this.message;
    }

}
