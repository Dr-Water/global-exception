package com.ratel.exception.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @业务描述：
 * @package_name： com.ratel.exception.common
 * @project_name： global-exception
 * @author： ratelfu@qq.com
 * @create_time： 2019-11-14 14:34
 * @copyright (c) ratelfu 版权所有
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

    /**
     * 判断错误是否是已定义的已知错误，不是则由未知错误代替，同时记录在log中
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result exceptionGet(Exception e){
        if(e instanceof DescribeException){
            DescribeException MyException = (DescribeException) e;
            return ResultUtil.error(MyException.getCode(),MyException.getMessage());
        }

        LOGGER.error("【系统异常】{}",e);
        return ResultUtil.error(ExceptionEnum.UNKNOW_ERROR);
    }
}
