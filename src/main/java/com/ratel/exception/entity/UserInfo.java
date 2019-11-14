package com.ratel.exception.entity;

import java.io.Serializable;

/**
 * @业务描述：
 * @package_name： com.ratel.exception.entity
 * @project_name： global-exception
 * @author： ratelfu@qq.com
 * @create_time： 2019-11-14 14:36
 * @copyright (c) ratelfu 版权所有
 */
public class UserInfo implements Serializable{
    private String name;
    private Integer age;

    public UserInfo() {
    }

    public UserInfo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
