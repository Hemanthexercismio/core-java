package com.xworkz.mobile;

public class SimRunner {
    public static void main(String[] args) {


        Sim sim1 = new Sim("Airtel", "500rs", true);
        Sim sim2 = new Sim("Airtel","500",true);
        System.out.println(sim1);
        System.out.println(sim2);
        boolean check = sim1.equals(sim2);
        System.out.println("result b/w sim1 and sim2 "+check);
    }
}
