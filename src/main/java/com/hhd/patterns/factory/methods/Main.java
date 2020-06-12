package com.hhd.patterns.factory.methods;

import com.hhd.patterns.factory.Moveable;

/**
 * 方法工厂 方便扩展产品
 */
public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Moveable m = carFactory.create();
        m.go();
    }
}
