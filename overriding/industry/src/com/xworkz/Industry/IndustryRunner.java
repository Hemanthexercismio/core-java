package com.xworkz.Industry;

public class IndustryRunner {
    public static void main(String[] args)
    {
        Industry obj1 = new Industry("davangere", 9000000.0, false);
        Industry obj2 = new Industry("shivmogga", 12000000.0, true);
        Industry obj3 = new Industry("davangere", 9000000.0, false);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        boolean result1 = obj1.equals(obj2);
        System.out.println("Result between obj1 & obj2 = " + result1);

        boolean result2 = obj1.equals(obj3);
        System.out.println("Result between obj1 & obj3 = " + result2);
    }
}
