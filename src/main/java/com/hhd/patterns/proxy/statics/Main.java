package com.hhd.patterns.proxy.statics;

public class Main {
    public static void main(String[] args) {
        new CarTimeProxy(new CarLogProxy(new Car())).move();
        new CarLogProxy(new CarTimeProxy(new Car())).move();
    }
}
