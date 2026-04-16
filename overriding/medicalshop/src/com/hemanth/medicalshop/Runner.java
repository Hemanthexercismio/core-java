package com.hemanth.medicalshop;

public class Runner {
    public static void main(String[] args) {


        Employe employe = new Employe("Akash", 9787);
        MedicalShop medicalShop = new MedicalShop(Location.BTM, employe, true, "67");
 medicalShop.shopInfo();
 medicalShop.getmedicin();
        System.out.println(medicalShop);
        System.out.println();

        Medplus medplus=new Medplus(Location.HOSAROAD,employe,false,"98","10pm","8am");
medplus.shopInfo();
medplus.getmedicin();
        System.out.println(medplus);
        System.out.println();
        System.out.println(medplus);

    }
}
