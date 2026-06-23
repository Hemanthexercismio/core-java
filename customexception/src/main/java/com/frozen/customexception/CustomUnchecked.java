package com.frozen.customexception;

public class CustomUnchecked {
    public static void Agecheck (int age){
        if(age < 18){
            throw new InvaliedAgeException("Age is not valid");
        }
        System.out.println("Age is valid access givenn");
    }

}
