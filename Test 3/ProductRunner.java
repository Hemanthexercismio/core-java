class ProductRunner
{
	public static void main(String[] args)
	{
		Product product=new Product("id98867","grocery",15,4000,15,"masala",0.9);
		product.calculateDiscountedPrice();
		product.addToCart();
	}
}