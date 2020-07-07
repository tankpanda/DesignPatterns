package com.hhd.patterns.observer;

public class Cat implements Observer {
    public void run() {
        System.out.println("cat run with miao");
    }

    @Override
    public void actionOnEvent(Event e) {
        System.out.println("cat get message");
        run();
    }
}
