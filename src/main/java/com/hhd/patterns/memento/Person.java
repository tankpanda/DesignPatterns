package com.hhd.patterns.memento;

import java.io.Serializable;

public class Person implements Serializable {
    private String name = "hhd";
    private int age = 18;
    private House house = new House("hhd home", 10D);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", house=").append(house);
        sb.append('}');
        return sb.toString();
    }
}

class House implements Serializable {
    private String address;
    private transient double area;

    public House() {
    }

    public House(String address, double area) {
        this.address = address;
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("House{");
        sb.append("address='").append(address).append('\'');
        sb.append(", area=").append(area);
        sb.append('}');
        return sb.toString();
    }
}
