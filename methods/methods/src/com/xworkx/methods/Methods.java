package com.xworkx.methods;

import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        int number1;
        String player="Rohith";
String player2="Virat";
        String name = player.toLowerCase();
        System.out.println(name);

        String method= player.toUpperCase();
        System.out.println(method);

        String method2=player.toLowerCase(Locale.ROOT)
;        System.out.println(method2);
        String newmethod=player.trim();
        System.out.println(newmethod);
        String num= String.valueOf(player.compareTo(player2));
        System.out.println(num);

    }
}
