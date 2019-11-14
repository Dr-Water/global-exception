package com.ratel.exception.controller;

import com.ratel.exception.common.ExceptionEnum;
import com.ratel.exception.common.ExceptionHandle;
import com.ratel.exception.common.Result;
import com.ratel.exception.common.ResultUtil;
import com.ratel.exception.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @业务描述：
 * @package_name： com.ratel.exception.controller
 * @project_name： global-exception
 * @author： ratelfu@qq.com
 * @create_time： 2019-11-14 14:36
 * @copyright (c) ratelfu 版权所有
 */
@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ExceptionHandle exceptionHandle;

    /**
     * 返回体测试
     * @param name
     * @param pwd
     * @return
     */
    @RequestMapping(value = "/getResult",method = RequestMethod.POST)
    public Result getResult(@RequestParam("name") String name, @RequestParam("pwd") String pwd){
        Result result = ResultUtil.success();
        try {
            if (name.equals("zzp")){
                result =  ResultUtil.success(new UserInfo());
            }else if (name.equals("pzz")){
                result =  ResultUtil.error(ExceptionEnum.USER_NOT_FIND);
            }else{
                int i = 1/0;
            }
        }catch (Exception e){
            result =  exceptionHandle.exceptionGet(e);
        }
        return result;
    }
}
