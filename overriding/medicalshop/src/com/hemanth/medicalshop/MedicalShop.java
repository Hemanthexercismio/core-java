package com.hemanth.medicalshop;
import java.util.*;
public class MedicalShop {
    Employe employe;
    Location location;
    boolean isopen;
    String noOfEmploye;

    public MedicalShop(Location location, Employe employe, boolean isopen, String noOfemploye) {
        this.location = location;
        this.employe = employe;
        this.isopen = isopen;
        this.noOfEmploye = noOfemploye;
    }

    public void shopInfo(){
        System.out.println("we have some offer in our medical shop");
    }
    public void getmedicin(){
        System.out.println("dolo 650 in madical sgop");
    }
@Override
    public String toString(){

        return "employedetails:"+employe+"Location:"+location+"isitopen:"+isopen+"noOfempl:"+noOfEmploye;
}



}
