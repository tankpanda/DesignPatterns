package com.hhd.patterns.state;

public class HappyState extends PersonState {
    @Override
    void say() {
        System.out.println("happy say");
    }

    @Override
    void smile() {
        System.out.println("happy smile");
    }

    @Override
    void cry() {
        System.out.println("happy cry");
    }
}
