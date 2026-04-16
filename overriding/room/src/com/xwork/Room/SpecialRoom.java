package com.xwork.Room;

public class SpecialRoom extends Room {

    int noOFpeople ;
    String noOfwindows;

    public SpecialRoom(Temperature roomClimate, int[] sectionCount, WindowType windowDesign,
                     double ceilingHeight, double floorArea,
                     int noOFpeople, String noOfwindows) {

        super(roomClimate, sectionCount, windowDesign, ceilingHeight, floorArea);
        this.noOFpeople = noOFpeople;
        this.noOfwindows = noOfwindows;
    }


    public void store() {
     super.store();
    }

    public void bulidinginfo() {
super.bulidinginfo();
    }


    public String toString() {
        return "windows: " +noOfwindows + ", noOfpeople: " +noOFpeople;
    }
}