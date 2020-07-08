package com.hhd.patterns.proxy.dynamic.jdk;

import java.util.Random;

public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("car move");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
