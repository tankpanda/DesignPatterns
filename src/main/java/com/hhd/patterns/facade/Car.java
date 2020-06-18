package com.hhd.patterns.facade;

public class Car {

    private Engine engine;
    private Tyre tyre;
    private SteeringWheel steeringWheel;

    public Car() {
        engine = new Engine();
        tyre = new Tyre();
        steeringWheel = new SteeringWheel();
    }

    public void run() {
        System.out.println("car begin");
        engine.ready();
        tyre.ready();
        steeringWheel.ready();
        System.out.println("car run");
    }

}
