package com.jn.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 值对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValueDto {

    /** 值 **/
    private String value;
}
