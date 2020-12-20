package com.jn.core.enums;

import lombok.Getter;

@Getter
public enum ServerResponseEnum {
    ERROR(1, "处理失败"),
    PARAM_ERROR(10, "参数错误"),
    NO_USER(20, "当前用户不存在"),
    PWD_ERR(21, "用户名或密码错误"),
    NO_DATA(30, "没有数据"),
    GET_DATA_ERROR(40, "获取数据失败"),
    SESSION_OVERDUE(99, "session已过期，请重新登录")
    ;

    private final Integer code;

    private final String msg;

    ServerResponseEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
