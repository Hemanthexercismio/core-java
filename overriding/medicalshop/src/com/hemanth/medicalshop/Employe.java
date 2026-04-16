package com.hemanth.medicalshop;

public class Employe {
    String name;
    double salary;

    public Employe(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString()
    {
        return "nameofemploye:"+name+"salary:"+salary;

    }
}
