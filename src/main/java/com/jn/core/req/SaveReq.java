package com.jn.core.req;

import lombok.Data;

/**
 * 保存基本参数
 */
@Data
public class SaveReq {

    /**
     * 操作类型
     */
    private String operType;

    /** 主键id **/
    private String id;
    private String ids;

    /** 是否删除
     * 0:未删除 1:已删除
     */
    private String isDelete;
}
