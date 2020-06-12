package com.hhd.patterns.factory.simple;

import com.hhd.patterns.factory.Car;
import com.hhd.patterns.factory.Train;

public class SimpleFactory {
    public Car createCar() {
        return new Car();
    }

    public Train createTrain() {
        return new Train();
    }
}
