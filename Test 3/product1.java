class Product1 {

    String productId;
    String productName;
    double price;
    int quantityAvailable;
    String category;
    double discountPercentage;

    Product(String productId, String productName, double price, int quantityAvailable, String category, double discountPercentage) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.category = category;
        this.discountPercentage = discountPercentage;
    }

    void getInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity Available: " + quantityAvailable);
        System.out.println("Category: " + category);
        System.out.println("Discount Percentage: " + discountPercentage);
    }

    double calculateDiscountPrice() { countPercentage) / 100;
        double finalPrice = price - discountAmount;
        return finalPrice;
    }

  
    double addToCart(int quantity) {

    if (quantity <= quantityAvailable) {

        quantityAvailable = quantityAvailable - quantity;

        double totalPrice = calculateDiscountPrice() * quantity;

        System.out.println("Items added to cart");
        System.out.println("Total price after discount: " + totalPrice);

        return totalPrice;

    } else {
        System.out.println("Requested quantity not available");
        return -1;
    }
     double addToCart(int quantity,boolean isBulkPurchase){
		 System.out.println("checking bulk Purchase discount");
		 if()
	 
    }
}
}