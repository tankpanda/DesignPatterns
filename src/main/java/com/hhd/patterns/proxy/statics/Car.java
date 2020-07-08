package com.hhd.patterns.proxy.statics;

import java.util.Random;

public class Car implements Movable {
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
