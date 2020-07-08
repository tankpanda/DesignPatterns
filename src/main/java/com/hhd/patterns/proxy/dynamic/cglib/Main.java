package com.hhd.patterns.proxy.dynamic.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Car.class);
        enhancer.setCallback(new LogMethodInterceptor());
        Car car = (Car) enhancer.create();
        car.move();
    }
}
