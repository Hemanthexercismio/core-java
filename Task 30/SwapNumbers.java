class SwapNumbers
{
	public static void main(String[] args)
	{
		int x = 30;   
		int y = 50;   
		
		System.out.println("Before swaping a and b :");
		System.out.println("a = " + x);
		System.out.println("b = " + y);

		
		x = x + y;
		y = x - y;  
		x = x - y;   

		System.out.println("After swap:");
		System.out.println("a = " + x);
		System.out.println("b = " + y);
	}
}