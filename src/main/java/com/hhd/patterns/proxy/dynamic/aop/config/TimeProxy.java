package com.hhd.patterns.proxy.dynamic.aop.config;

public class TimeProxy {

    public void before() {
        System.out.println("xml before.." + System.currentTimeMillis());
    }

    public void after() {
        System.out.println("xml after.." + System.currentTimeMillis());
    }
}
