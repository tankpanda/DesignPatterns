package com.hhd.patterns.factory.abstracts;

public class TrainFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new Noodle();
    }

    @Override
    public Vehicle createVehicle() {
        return new Train() ;
    }
}
