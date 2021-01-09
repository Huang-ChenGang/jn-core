package com.jn.core.resp;

import com.jn.core.enums.ServerResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 服务端响应返回值
 * @param <T>
 */
@Data
@AllArgsConstructor
public class ServerResponse<T> {

    /**
     * 0:成功
     * 非0:失败
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

    public static <T> ServerResponse<T> success() {
        return new ServerResponse<>(0, "处理成功", null);
    }

    public static <T> ServerResponse<T> success(T data) {
        return new ServerResponse<>(0, "处理成功", data);
    }

    public static <T> ServerResponse<T> success(String msg) {
        return new ServerResponse<>(0, msg, null);
    }

    public static <T> ServerResponse<T> success(String msg, T data) {
        return new ServerResponse<>(0, msg, data);
    }

    public static <T> ServerResponse<T> error(ServerResponseEnum responseEnum) {
        return new ServerResponse<>(responseEnum.getCode(), responseEnum.getMsg(), null);
    }

    public static <T> ServerResponse<T> error(Integer code, String msg) {
        return new ServerResponse<>(code, msg, null);
    }
}
