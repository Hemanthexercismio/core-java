class RideFareCalculator{

    double distance;
    String time;
    boolean isSurgePricing;
    int minutes;

    RideFareCalculator(double distance, String time, boolean isSurgePricing, int minutes){
        this.distance = distance;
        this.time = time;
        this.isSurgePricing = isSurgePricing;
        this.minutes = minutes;
    }

    double calculateBaseFare() {
        double baseFare;

        if (distance <= 2) {
            baseFare = 5;
        } else {
            baseFare = 5 + (distance - 2) * 1.5;
        }

        System.out.println("Base Fare:" + baseFare);
        return baseFare;
    }

    double applyTimeSurcharge(double baseFare){
        double surcharge = 0;

        if (time.equals("11 PM") || time.equals("5 AM")){
            surcharge = baseFare * 0.25;
            System.out.println("Night Surcharge Applied (25%)");
        } 
        else if (time.equals("7 AM") || time.equals("9 AM") 
              || time.equals("5 PM") || time.equals("7 PM")) {
            surcharge = baseFare * 0.15;
            System.out.println("Peak Hour Surcharge Applied (15%)");
        } 
        else {
            System.out.println("No Time Surcharge");
        }

        return baseFare + surcharge;
    }

    double applyWaitingCharges(double fareAfterTime) {
        double waitingCharge = 0;

        if (minutes > 2) {
            waitingCharge = (minutes - 2) * 0.50;
            System.out.println("Waiting Charge Applied: " + waitingCharge);
        } else {
            System.out.println("No Waiting Charge");
        }

        return fareAfterTime + waitingCharge;
    }

    void calculateFinalFare() {
        double baseFare = calculateBaseFare();
        double fareAfterTime = applyTimeSurcharge(baseFare);
        double finalFare = applyWaitingCharges(fareAfterTime);

        System.out.println("Final Fare:"+ finalFare);
    }
}