package com.jn.core.exception;

import jakarta.validation.constraints.NotBlank;

public interface JNError {

    int getServiceCode();

    int getErrorCode();

    @NotBlank
    String getErrorMessage();

    @NotBlank
    default String getResponseCode() {
        return String.format("%02d.%04d", getServiceCode(), getErrorCode());
    }
}
