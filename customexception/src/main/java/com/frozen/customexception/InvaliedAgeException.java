package com.frozen.customexception;

public class InvaliedAgeException extends RuntimeException {
    public InvaliedAgeException(String message) {
        super(message);
    }
}
