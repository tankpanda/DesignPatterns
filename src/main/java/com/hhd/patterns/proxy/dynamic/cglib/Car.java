package com.hhd.patterns.proxy.dynamic.cglib;

import java.util.Random;

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
