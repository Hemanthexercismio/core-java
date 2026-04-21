package com.xworkz.country;

public class President {
    String name;
    int age;
    Address address;

    public President(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;


    }

    @Override
    public String toString() {
        return "President{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
