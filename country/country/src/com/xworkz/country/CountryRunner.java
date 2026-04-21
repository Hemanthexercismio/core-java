package com.xworkz.country;

import java.util.Arrays;

public class CountryRunner {
    public static void main(String[] args) {
        Collector collector1 = new Collector("Chaitra", 1);
        Collector collector2 = new Collector("priya", 2);
        Collector collector3 = new Collector("hemanth", 3);
        District district1 = new District("davangere", collector1);
        District district2 = new District("shivmogga", collector2);
        District district3 = new District("davangere", collector3);
        District[] dst1 = {district1, district2};
        District[] dst2 = {district3};
        District districts3 = new District("hospete", collector3);
        City city1 = new City("Hospete", 5, dst1);
        City city2 = new City("Shivmoga", 5, dst2);
        City[] cit1 = {city1, city2};
        State state1 = new State("karnataka", 56969, cit1);
        State[] stat1 = {state1};
        Address address = new Address(1, 577001, state1);
        President president = new President("droupadhi", 70, address);
        Country country1 = new Country("india", president, stat1);
        Country[] count1 = new Country[10];
        CountryStore countryStore1 = new CountryStore(count1);
        countryStore1.save(country1);
        System.out.println(country1);
       Country result=countryStore1.findByName("chaina");
        System.out.println(result);
State result2=countryStore1.findByStateName("karnataka");
        System.out.println(result2);
City[] cities = countryStore1.findAllCityByStateName("karnataka");
        System.out.println(Arrays.toString(cities));


    }

}

