package com.xworkz.country;

public class Address {
    int no;
    int pincode;
    State state;

    public Address(int no, int pincode, State state) {
        this.no = no;
        this.pincode = pincode;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "no=" + no +
                ", pincode=" + pincode +
                ", state=" + state +
                '}';
    }
}
