package com.xwork.Room;

public class Runner {
    public static void main(String[] args) {


        Temperature temperature = new Temperature("cold", "250 F");
        int[] sectionCount = {2, 3, 4, 5};
        Room room = new Room(temperature, sectionCount, WindowType.SLIDING, 7685.6, 457.9);
        room.store();
        room.bulidinginfo();
        System.out.println(room.toString());
        System.out.println();

        SpecialRoom special=new SpecialRoom(temperature,sectionCount,WindowType.GLASS,78.7,98,15,"eight");
        special.store();
        special.bulidinginfo();

        System.out.println();
        System.out.println(special.toString());

    }
}
