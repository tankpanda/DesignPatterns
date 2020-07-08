package com.hhd.patterns.proxy.dynamic.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        // config with annotation & app.xml -> aop:aspectj-autoproxy & context:component-scan
        Car car = (Car) context.getBean("car1");
        car.move();
    }

}
