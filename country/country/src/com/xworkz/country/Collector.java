package com.xworkz.country;

public class Collector {
    String name;
    int batchNo;

    public Collector(String name, int batchNo) {
        this.name = name;
        this.batchNo = batchNo;

    }

    @Override
    public String toString() {
        return "Collector{" +
                "name='" + name + '\'' +
                ", batchNo=" + batchNo +
                '}';
    }
}
