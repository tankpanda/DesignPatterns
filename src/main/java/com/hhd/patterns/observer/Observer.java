package com.hhd.patterns.observer;

public interface Observer {

    // can do something with e.getSource().function()
    void actionOnEvent(Event e);
}
