package com.hhd.patterns.proxy.dynamic.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component("timeProxy1")
public class TimeProxy {

    @Before("execution (void com.hhd.patterns.proxy.dynamic.aop.annotation.Car.move())")
    public void before() {
        System.out.println("annotation before.." + System.currentTimeMillis());
    }

    @After("execution (void com.hhd.patterns.proxy.dynamic.aop.annotation.Car.move())")
    public void after() {
        System.out.println("annotation after.." + System.currentTimeMillis());
    }

}
