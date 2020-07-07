package com.hhd.patterns.flyweight;

import java.util.UUID;

public class Car {
    private UUID id = UUID.randomUUID();
    private boolean used = true;

    public UUID getId() {
        return id;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public boolean isUsed() {
        return used;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
