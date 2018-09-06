package com.demo;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @Author zhaogw
 * @Date 2018/9/6 15:26
 */
public interface IExample {
    void setName(@Param("nnnnn")String name, int b);

    Map<String, Object> getName();

    void setDesc(String description);

    String getDesc();
}
