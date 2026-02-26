class StrawberryRunner {

    public static void main(String[] args) {

        Strawberry s1 = new Strawberry();
        System.out.println("Strawberry 1");
        System.out.println("Origin: " + s1.origin);
        System.out.println("Weight: " + s1.weight);
        System.out.println("Color: " + s1.color);
        System.out.println("Organic: " + s1.organic);
        System.out.println("PricePerKg: " + s1.pricePerKg);
        System.out.println("=========================");

        Strawberry s2 = new Strawberry("India");
        System.out.println("Strawberry 2");
        System.out.println("Origin: " + s2.origin);
        System.out.println("Weight: " + s2.weight);
        System.out.println("Color: " + s2.color);
        System.out.println("Organic: " + s2.organic);
        System.out.println("PricePerKg: " + s2.pricePerKg);
        System.out.println("=========================");

        Strawberry s3 = new Strawberry("USA", 0.5);
        System.out.println("Strawberry 3");
        System.out.println("Origin: " + s3.origin);
        System.out.println("Weight: " + s3.weight);
        System.out.println("Color: " + s3.color);
        System.out.println("Organic: " + s3.organic);
        System.out.println("PricePerKg: " + s3.pricePerKg);
        System.out.println("=========================");

        Strawberry s4 = new Strawberry("Spain", 1.0, "Red");
        System.out.println("Strawberry 4");
        System.out.println("Origin: " + s4.origin);
        System.out.println("Weight: " + s4.weight);
        System.out.println("Color: " + s4.color);
        System.out.println("Organic: " + s4.organic);
        System.out.println("PricePerKg: " + s4.pricePerKg);
        System.out.println("=========================");

        Strawberry s5 = new Strawberry("Australia", 1.5, "Dark Red", true);
        System.out.println("Strawberry 5");
        System.out.println("Origin: " + s5.origin);
        System.out.println("Weight: " + s5.weight);
        System.out.println("Color: " + s5.color);
        System.out.println("Organic: " + s5.organic);
        System.out.println("PricePerKg: " + s5.pricePerKg);
        System.out.println("=========================");

        Strawberry s6 = new Strawberry("Japan", 2.0, "Bright Red", true, 1200);
        System.out.println("Strawberry 6");
        System.out.println("Origin: " + s6.origin);
        System.out.println("Weight: " + s6.weight);
        System.out.println("Color: " + s6.color);
        System.out.println("Organic: " + s6.organic);
        System.out.println("PricePerKg: " + s6.pricePerKg);
        System.out.println("=========================");
    }
}