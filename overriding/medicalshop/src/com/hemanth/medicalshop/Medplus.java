package com.hemanth.medicalshop;

public class Medplus extends MedicalShop {
    String openTime;
    String closeTime;

    public Medplus(Location location, Employe employe, boolean isopen, String noOfemploye,String openTime,String closeTime)
    {
        super(location, employe, isopen, noOfemploye);
        this.closeTime=closeTime;
        this.openTime=openTime;

    }
    @Override
    public void shopInfo()
    {
        super.shopInfo();
    }
    @Override
    public void getmedicin()
    {
        super.getmedicin();

    }
    @Override
    public String toString()
    {
       return "colsetime:"+closeTime+"  opentime:"+openTime;
    }


}
