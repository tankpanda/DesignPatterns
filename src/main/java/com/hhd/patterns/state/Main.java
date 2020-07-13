package com.hhd.patterns.state;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "hhd";
        person.state = new HappyState();
        person.smile();
        person.state = new SadState();
        person.say();
    }
}
