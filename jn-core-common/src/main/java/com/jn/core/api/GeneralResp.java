package com.jn.core.api;

import lombok.Data;

@Data
public class GeneralResp {

    /** 主键id **/
    private String id;

    /** 是否删除
     * 0:未删除 1:已删除
     */
    private String isDelete;
}
