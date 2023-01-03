package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
//自定义限流信息处理
public class CustomerBlockHandler
{
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2022,"自定义的限流处理信息......CustomerBlockHandler1");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2022,"自定义的限流处理信息......CustomerBlockHandler2");
    }
}