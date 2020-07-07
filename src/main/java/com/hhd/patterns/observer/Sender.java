package com.hhd.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Sender {
    private boolean s;

    private List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Cat());
        observers.add(new Dog());
    }

    public void sendMessage() {
        for (Observer observer : observers) {
            observer.actionOnEvent(new Event("event1",System.currentTimeMillis(),this));
        }
    }
}
