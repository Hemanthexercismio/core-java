package com.xworkz.country;

import java.util.Arrays;

public class Country {

        String name;
        President president;
        State[] states;

        public Country(String name, President president, State[] states) {
            this.name = name;
            this.president = president;
            this.states = states;
        }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", president=" + president +
                ", states=" + Arrays.toString(states) +
                '}';
    }
}


