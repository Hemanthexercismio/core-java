class Strawberry {

    String origin;
    double weight;
    String color;
    boolean organic;
    double pricePerKg;

    Strawberry(String origin, double weight, String color, boolean organic, double pricePerKg) {
        this.origin = origin;
        this.weight = weight;
        this.color = color;
        this.organic = organic;
        this.pricePerKg = pricePerKg;
    }

    Strawberry(String origin, double weight, String color, boolean organic) {
        this.origin = origin;
        this.weight = weight;
        this.color = color;
        this.organic = organic;
    }

    Strawberry(String origin, double weight, String color) {
        this.origin = origin;
        this.weight = weight;
        this.color = color;
    }

    Strawberry(String origin, double weight) {
        this.origin = origin;
        this.weight = weight;
    }

    Strawberry(String origin) {
        this.origin = origin;
    }

    Strawberry() {
    }
}