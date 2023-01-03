package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Json封装体CommonResult
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    //状态码
    private Integer code;
    //消息
    private String message;
    //返回的数据
    private T data;

    //数据为空的情况
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
