package com.hhd.patterns.prototype.shallow;

public class Person implements Cloneable{
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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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

class House {
    private String address;
    private double area;

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
