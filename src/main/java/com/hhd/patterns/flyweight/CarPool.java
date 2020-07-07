package com.hhd.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CarPool {
    private List<Car> cars = new ArrayList<>();

    {
        for (int i = 0; i < 5; i++) {
            cars.add(new Car());
        }
    }

    public Car getCar() {
        for (int i = 0; i < 5; i++) {
            Car car = cars.get(i);
            if (!car.isUsed()) {
                return car;
            }
        }
        return new Car();
    }
}
