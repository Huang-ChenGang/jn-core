package com.jn.core.api;

import lombok.Data;
import lombok.ToString;

/**
 * 查询基本参数
 */
@Data
@ToString
public class QueryReq {

    /** 当前页数 **/
    private Integer pageNo;

    /** 每页条数 **/
    private Integer pageSize;

    /** 是否删除
     * 0:未删除 1:已删除
     */
    private String isDelete;
}
