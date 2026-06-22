package com.frozen.exception;

public class UncheckedEvent {
    public void event(String name) throws NullPointerException {
        System.out.println("Event is running");
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
        System.out.println("Name is valid" + name);


    }
}
