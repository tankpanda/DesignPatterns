package com.hhd.patterns.bridge;

/**
 * 已聚合代替继承
 */
public class Main {
    public static void main(String[] args) {
        Animal warmDog = new WarmAnimal(new Dog());
        Animal coldCat = new WarmAnimal(new Cat());
    }
}
