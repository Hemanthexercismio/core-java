package com.xworkz.country;

import java.util.Arrays;

public class City {
    String name;
    int noOfDistricts;
    District[] districts;

    public City(String name, int noOfDistricts, District[] districts) {
        this.name = name;
        this.noOfDistricts = noOfDistricts;
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", noOfDistricts=" + noOfDistricts +
                ", districts=" + Arrays.toString(districts) +
                '}';
    }
}
