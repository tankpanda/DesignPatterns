package com.hhd.patterns.factory.abstracts;

/**
 * 抽象工厂 方便扩展产品族
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory carFactory = new CarFactory();
        carFactory.createFood();
        carFactory.createVehicle();

        AbstractFactory trainFactory = new TrainFactory();
        trainFactory.createFood();
        trainFactory.createVehicle();
    }
}
