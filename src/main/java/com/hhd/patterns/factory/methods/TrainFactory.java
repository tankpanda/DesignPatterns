package com.hhd.patterns.factory.methods;

import com.hhd.patterns.factory.Moveable;
import com.hhd.patterns.factory.Train;

public class TrainFactory {
    public Moveable create() {
        return new Train();
    }
}
