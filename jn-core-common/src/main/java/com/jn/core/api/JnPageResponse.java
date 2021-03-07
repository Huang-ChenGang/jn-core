package com.jn.core.api;

import lombok.Data;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
public class JnPageResponse<T> {
    private List<T> list;

    private Integer totalPages;
    private Long totalElements;
    private Boolean first;
    private Boolean last;
    private Boolean previous;
    private Boolean next;

    public static <T> JnPageResponse<T> of(Page<T> page) {
        JnPageResponse<T> jnPageResponse = new JnPageResponse<>();
        jnPageResponse.setFirst(page.isFirst());
        jnPageResponse.setLast(page.isLast());
        jnPageResponse.setPrevious(page.hasPrevious());
        jnPageResponse.setNext(page.hasNext());
        jnPageResponse.setTotalPages(page.getTotalPages());
        jnPageResponse.setTotalElements(page.getTotalElements());
        jnPageResponse.setList(page.getContent());
        return jnPageResponse;
    }
}
