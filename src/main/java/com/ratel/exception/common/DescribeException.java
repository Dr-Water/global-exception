package com.ratel.exception.common;

/**
 * @业务描述：
 * @package_name： com.ratel.exception.common
 * @project_name： global-exception
 * @author： ratelfu@qq.com
 * @create_time： 2019-11-14 14:34
 * @copyright (c) ratelfu 版权所有
 */
public class DescribeException extends RuntimeException{

    private Integer code;

    /**
     * 继承exception，加入错误状态值
     * @param exceptionEnum
     */
    public DescribeException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMsg());
        this.code = exceptionEnum.getCode();
    }

    /**
     * 自定义错误信息
     * @param message
     * @param code
     */
    public DescribeException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

