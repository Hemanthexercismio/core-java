package com.xworkz.mobile;

public class Sim {
    String company;
    String price;
    boolean isIntRooming;

    public Sim(String company, String price, boolean isIntRooming) {
        this.company = company;
        this.price = price;
        this.isIntRooming = isIntRooming;
    }


    @Override
    public String toString() {
        return "Sim{" + "company='" + company + ", price='" + price + ", isintrooming=" + isIntRooming + '}';

    }
    @Override
    public boolean equals(Object obj){
        Sim current=this;
        if(obj instanceof Sim ) {
            Sim other =(Sim) obj;

            if (current.company.equals(other.company) &&
                    current.price.equals( other.price) &&
                    current.isIntRooming)
            {
                return true;

        }
        }
        return super.equals(obj);

    }

}


