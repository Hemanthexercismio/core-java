class Umbrella{
    String brand;
    double price;
    String color;
    boolean foldable;
    int ribs;

    Umbrella(){
    }

    Umbrella(String brand){
        this.brand = brand;
    }

    Umbrella(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    Umbrella(String brand, double price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    Umbrella(String brand, double price, String color, boolean foldable){
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.foldable = foldable;
    }

    Umbrella(String brand, double price, String color, boolean foldable, int ribs){
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.foldable = foldable;
        this.ribs = ribs;
    }
}