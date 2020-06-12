package com.hhd.patterns.factory.simple;

import com.hhd.patterns.factory.Moveable;

public class Main {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Moveable m = factory.createCar();
        m.go();
    }
}
