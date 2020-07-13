package com.hhd.patterns.bridge;

/**
 * 以聚合代替继承
 * 抽象类和实际类并行发展
 */
public class Main {
    public static void main(String[] args) {
        Animal warmDog = new WarmAnimal(new Dog());
        Animal coldCat = new WarmAnimal(new Cat());
    }
}
