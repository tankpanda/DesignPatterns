package com.hhd.patterns.state;

public class Person {
    String name;
    PersonState state;

    public void smile() {
        state.smile();
    }

    public void say() {
        state.say();
    }

    public void cry() {
        state.cry();
    }
}
