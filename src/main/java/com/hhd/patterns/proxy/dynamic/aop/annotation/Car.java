package com.hhd.patterns.proxy.dynamic.aop.annotation;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component("car1")
public class Car {
    public void move() {
        System.out.println("car move");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
