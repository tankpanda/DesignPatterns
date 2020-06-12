package com.hhd.patterns.factory;

public class Car implements Moveable{
    @Override
    public void go() {
        System.out.println("car go...");
    }
}
