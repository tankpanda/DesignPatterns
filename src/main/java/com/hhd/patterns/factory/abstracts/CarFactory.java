package com.hhd.patterns.factory.abstracts;

public class CarFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Vehicle creatVehicle() {
        return new Car();
    }
}
