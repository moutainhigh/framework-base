package com.base.framework.core.exceptions;

/**
 * @Description   : 内部错误
 * @Project       : framework-core
 * @Program Name  : com.yirun.framework.core.exception.InnerErrorException.java
 * @Author        : zc.ding@foxmail.com
 */
public class InnerErrorException extends BaseException {

    private static final long serialVersionUID = -680887204493573535L;

    public InnerErrorException() {
        super();
    }

    public InnerErrorException(String message) {
        super(message);
    }

    public InnerErrorException(Throwable cause) {
        super(cause);
    }

    public InnerErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public InnerErrorException(String message, Throwable cause, String code, Object[] values) {
        super(message, cause, code, values);
    }

}
