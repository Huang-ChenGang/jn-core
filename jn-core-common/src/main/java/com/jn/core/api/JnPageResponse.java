package com.jn.core.api;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class JnPageResponse<T> {
    private List<T> list;
    private long totalElements;

    public static <T> JnPageResponse<T> of(List<T> list, long totalElements) {
        return new JnPageResponse<>(list, totalElements);
    }
}
