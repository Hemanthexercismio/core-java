package com.xwork.Room;

import java.util.Arrays;

public class Room {

    Temperature roomClimate;
    int[] sectionCount;
    WindowType windowDesign;
    double ceilingHeight;
    double floorArea;

    public Room(Temperature roomClimate, int[] sectionCount, WindowType windowDesign, double ceilingHeight, double floorArea) {
        this.roomClimate = roomClimate;
        this.sectionCount = sectionCount;
        this.windowDesign = windowDesign;
        this.ceilingHeight = ceilingHeight;
        this.floorArea = floorArea;
    }

    public Room() {

    }

    public void store() {
        System.out.println("we can store items");
    }

    public void bulidinginfo() {
        System.out.println("building is made up of cement");
    }


    public String toString() {
        return "Climate: " + roomClimate + ", Sections: " + Arrays.toString(sectionCount) + ", WindowDesign: " + windowDesign +", CeilingHeight: " + ceilingHeight +", FloorArea: " + floorArea;
    }
}