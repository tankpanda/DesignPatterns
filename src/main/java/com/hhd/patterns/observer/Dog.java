package com.hhd.patterns.observer;

public class Dog implements Observer {
    public void run() {
        System.out.println("dog run with wang");
    }

    @Override
    public void actionOnEvent(Event e) {
        System.out.println("dog get message");
        run();
    }
}
