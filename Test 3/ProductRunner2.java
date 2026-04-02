class ProductRunner2
{
	public static void main(String[] args)
	{
		Product product = new Product("id98867","grocery",4000,false,"masala",0.8);
		
		product.calculateDiscountedPrice();   
	}
}

class Product
{
	String productID;
	String name;
	double price;
	boolean quantityAvilable;
	String category;
	double discountPercentage;
	
	Product(String productID,String name,double price,
	boolean quantityAvilable,String category,double discountPercentage)
	{
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.quantityAvilable = quantityAvilable;
		this.category = category;
		this.discountPercentage = discountPercentage;
	}
	
	double calculateDiscountedPrice()
	{
		if(price >= 3000)
		{
			System.out.println("You got some discount for this price");
			price = price * (1 - discountPercentage);   
			System.out.println("Price after discount = " + price);
		}
		else
		{
			System.out.println("No discount for this amount " + price);
		}
		return price;
	}
}