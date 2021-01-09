package com.jn.core.exception;

import com.jn.core.enums.ServerResponseEnum;

public class JNException extends RuntimeException {

    private final Integer code;

    public JNException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public JNException(ServerResponseEnum serverResponseEnum) {
        super(serverResponseEnum.getMsg());
        this.code = serverResponseEnum.getCode();
    }
}
