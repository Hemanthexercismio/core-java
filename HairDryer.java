class HairDryer {

    String brand;
    int wattage;
    String color;
    boolean cordless;
    double price;

    HairDryer(String brand, int wattage, String color, boolean cordless, double price) {
        this.brand = brand;
        this.wattage = wattage;
        this.color = color;
        this.cordless = cordless;
        this.price = price;
    }

    HairDryer(String brand, int wattage, String color, boolean cordless) {
        this.brand = brand;
        this.wattage = wattage;
        this.color = color;
        this.cordless = cordless;
    }

    HairDryer(String brand, int wattage, String color) {
        this.brand = brand;
        this.wattage = wattage;
        this.color = color;
    }

    HairDryer(String brand, int wattage) {
        this.brand = brand;
        this.wattage = wattage;
    }

    HairDryer(String brand) {
        this.brand = brand;
    }

    HairDryer() {
    }
}