package com.hhd.patterns.builder;

/**
 * 复杂对象的构建
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder()
                .buildBasicInfo(1, "hhd", 18)
                .buildMobile("13345678901")
                .buildWeight(180)
                .buildHouse("addr", 10D)
                .build();
        System.out.println(person);
    }
}
