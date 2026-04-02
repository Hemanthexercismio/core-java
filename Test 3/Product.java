class Product
{
	String productID;
	String name;
	int quantity;
	double price;
	int quantityAvilable;
	String category;
	double discountPercentage;
	
	Product(String productID,String name,int quantity,double price,
	int quantityAvilable,String category,double discountPercentage)
	{
		this.productID=productID;
		this.name=name;
		this.price=price;
		this.quantityAvilable=quantityAvilable;
		this.category=category;
		this.discountPercentage=discountPercentage;
	}
	 double calculateDiscountedPrice()
	{
		if(price>=3000) 
		{
			System.out.println("you got some discount for this price");
			price = price * ( discountPercentage);
			System.out.println("price after discount ="+price);
			
		}
		
		else
		{
			System.out.println("no discount for this amount"+price);
		}
		return price;
		
	}
	int addToCart()
	{
		if(quantity<=20)
		{
		System.out.println("the given item"+ name +" is avilable ="+quantityAvilable);	
		
		}
		return quantityAvilable;
	}
	
	/*boolean addToCart()
	{
		if()
	}
	*/
}