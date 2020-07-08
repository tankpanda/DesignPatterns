package com.hhd.patterns.proxy.dynamic.aop.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        // config with app.xml
        Car car = (Car) context.getBean("car");
        car.move();
    }
}
