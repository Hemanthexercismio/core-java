package com.xworkz.country;

public class District {
    String name;
    Collector collector;

    public District(String name, Collector collector) {
        this.name = name;
        this.collector = collector;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", collector=" + collector +
                '}';
    }
}
