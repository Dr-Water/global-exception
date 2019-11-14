package com.ratel.exception.common;

/**
 * @业务描述：
 * @package_name： com.ratel.exception.common
 * @project_name： global-exception
 * @author： ratelfu@qq.com
 * @create_time： 2019-11-14 14:32
 * @copyright (c) ratelfu 版权所有
 */
public enum ExceptionEnum {
    UNKNOW_ERROR(-1, "未知错误"),
    USER_NOT_FIND(-101, "用户不存在"),;

    private Integer code;

    private String msg;

    ExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
