
package com.frozen.exception;

public class Exceptions {

    public  void checkAge(int age) throws InvalidAgeException {

        if (  age <18 ) {
            System.out.println("Invalid agw");

            throw new InvalidAgeException("age must be between more than 18 ");
        }

        System.out.println("age is valid");
    }


    }


