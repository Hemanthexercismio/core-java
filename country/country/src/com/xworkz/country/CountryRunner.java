package com.xworkz.country;

public class CountryRunner {
    public static void main(String[] args) {
        Collector collector1=new Collector("Chaitra",1);
        Collector collector2=new Collector("priya",2);
        District district1=new District("davangere",collector1);
District district2=new District("shivmogga",collector2);
}
}