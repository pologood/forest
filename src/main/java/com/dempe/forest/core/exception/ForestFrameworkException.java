package com.dempe.forest.core.exception;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2016/11/25
 * Time: 17:28
 * To change this template use File | Settings | File Templates.
 */
public class ForestFrameworkException extends ForestAbstractException {
    private static final long serialVersionUID = -1638857395789735293L;

    public ForestFrameworkException() {
        super(ForestErrorMsgConstant.FRAMEWORK_DEFAULT_ERROR);
    }

    public ForestFrameworkException(ForestErrorMsg forestErrorMsg) {
        super(forestErrorMsg);
    }

    public ForestFrameworkException(String message) {
        super(message, ForestErrorMsgConstant.FRAMEWORK_DEFAULT_ERROR);
    }

    public ForestFrameworkException(String message, ForestErrorMsg forestErrorMsg) {
        super(message, forestErrorMsg);
    }

    public ForestFrameworkException(String message, Throwable cause) {
        super(message, cause, ForestErrorMsgConstant.FRAMEWORK_DEFAULT_ERROR);
    }

    public ForestFrameworkException(String message, Throwable cause, ForestErrorMsg forestErrorMsg) {
        super(message, cause, forestErrorMsg);
    }

    public ForestFrameworkException(Throwable cause) {
        super(cause, ForestErrorMsgConstant.FRAMEWORK_DEFAULT_ERROR);
    }

    public ForestFrameworkException(Throwable cause, ForestErrorMsg forestErrorMsg) {
        super(cause, forestErrorMsg);
    }
}