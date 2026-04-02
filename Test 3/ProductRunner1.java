class ProductRunner1 {

    public static void main(String[] args) {

        Product product = new Product("P101", "Hoddy", 1000, 10, "H/m", 20);

        product.getInfo();


        double total = product.addToCart(2);

        System.out.println("Returned Value: " + total);
    }
}