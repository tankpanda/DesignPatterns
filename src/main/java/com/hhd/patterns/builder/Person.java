package com.hhd.patterns.builder;

public class Person {
    private String name;
    private int id;
    private int age;
    private int weight;
    private String mobile;
    private House house;

    static class PersonBuilder {
        Person p = new Person();

        public PersonBuilder buildBasicInfo(int id, String name, int age) {
            p.age = age;
            p.id = id;
            p.name = name;
            return this;
        }

        public PersonBuilder buildMobile(String mobile) {
            p.mobile = mobile;
            return this;
        }

        public PersonBuilder buildWeight(int weight) {
            p.weight = weight;
            return this;
        }

        public PersonBuilder buildHouse(String address, double area) {
            House house = new House();
            house.setAddress(address);
            house.setArea(area);
            p.house = house;
            return this;
        }

        public Person build() {
            return p;
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id=").append(id);
        sb.append(", age=").append(age);
        sb.append(", weight=").append(weight);
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append(", house=").append(house);
        sb.append('}');
        return sb.toString();
    }
}

class House {
    private String address;
    private double area;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
