package com.jn.core.exception;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class JNException extends RuntimeException {
    private final JNError error;

    public JNException(@NotNull JNError error) {
        super(error.getErrorMessage());
        this.error = error;
    }

    public JNException(@NotNull JNError error, Throwable cause) {
        super(cause);
        this.error = error;
    }

    public JNException(@NotNull JNError error, @NotBlank String message) {
        super(message);
        this.error = error;
    }

    public JNError getJNError() {
        return this.error;
    }
}
