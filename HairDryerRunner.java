class HairDryerRunner {

    public static void main(String[] args) {

        HairDryer dryer1 = new HairDryer();
        System.out.println("HairDryer 1");
        System.out.println("Brand: " + dryer1.brand);
        System.out.println("Wattage: " + dryer1.wattage);
        System.out.println("Color: " + dryer1.color);
        System.out.println("Cordless: " + dryer1.cordless);
        System.out.println("Price: " + dryer1.price);
        System.out.println("=========================");

        HairDryer dryer2 = new HairDryer("Philips");
        System.out.println("HairDryer 2");
        System.out.println("Brand: " + dryer2.brand);
        System.out.println("Wattage: " + dryer2.wattage);
        System.out.println("Color: " + dryer2.color);
        System.out.println("Cordless: " + dryer2.cordless);
        System.out.println("Price: " + dryer2.price);
        System.out.println("=========================");

        HairDryer dryer3 = new HairDryer("Panasonic", 1200);
        System.out.println("HairDryer 3");
        System.out.println("Brand: " + dryer3.brand);
        System.out.println("Wattage: " + dryer3.wattage);
        System.out.println("Color: " + dryer3.color);
        System.out.println("Cordless: " + dryer3.cordless);
        System.out.println("Price: " + dryer3.price);
        System.out.println("=========================");

        HairDryer dryer4 = new HairDryer("Nova", 1500, "Black");
        System.out.println("HairDryer 4");
        System.out.println("Brand: " + dryer4.brand);
        System.out.println("Wattage: " + dryer4.wattage);
        System.out.println("Color: " + dryer4.color);
        System.out.println("Cordless: " + dryer4.cordless);
        System.out.println("Price: " + dryer4.price);
        System.out.println("=========================");

        HairDryer dryer5 = new HairDryer("Syska", 1800, "Blue", false);
        System.out.println("HairDryer 5");
        System.out.println("Brand: " + dryer5.brand);
        System.out.println("Wattage: " + dryer5.wattage);
        System.out.println("Color: " + dryer5.color);
        System.out.println("Cordless: " + dryer5.cordless);
        System.out.println("Price: " + dryer5.price);
        System.out.println("=========================");

        HairDryer dryer6 = new HairDryer("Dyson", 2000, "Silver", true, 29999);
        System.out.println("HairDryer 6");
        System.out.println("Brand: " + dryer6.brand);
        System.out.println("Wattage: " + dryer6.wattage);
        System.out.println("Color: " + dryer6.color);
        System.out.println("Cordless: " + dryer6.cordless);
        System.out.println("Price: " + dryer6.price);
        System.out.println("=========================");
    }
}