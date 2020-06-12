package com.hhd.patterns.factory.methods;

import com.hhd.patterns.factory.Car;
import com.hhd.patterns.factory.Moveable;

public class CarFactory {
    public Moveable create() {
        return new Car();
    }
}
