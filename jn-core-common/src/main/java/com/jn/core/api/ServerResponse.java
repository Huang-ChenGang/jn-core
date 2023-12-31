package com.jn.core.api;

import com.jn.core.exception.JNError;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class ServerResponse<T> {

    private String code;

    private String message;

    private T data;

    public static <T> ServerResponse<T> success() {
        return new ServerResponse<>("0", "处理成功", null);
    }

    public static <T> ServerResponse<T> success(T data) {
        return new ServerResponse<>("0", "处理成功", data);
    }

    public static <T> ServerResponse<T> error(JNError error) {
        return new ServerResponse<>(error.getResponseCode(), error.getErrorMessage(), null);
    }

    public static <T> ServerResponse<T> error(JNError error, String message) {
        return new ServerResponse<>(error.getResponseCode(), message, null);
    }

}
