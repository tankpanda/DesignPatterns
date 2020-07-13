package com.hhd.patterns.prototype.shallow;

public class Main {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p2);
        p2.getHouse().setArea(15L);
        System.out.println(p1);
    }
}
