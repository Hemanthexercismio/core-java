class Carpainter
{
	int price;
	String behavior;
	
	Carpainter(int price,String behavior)
	{
		this.price=price;
		this.behavior=behavior;
	}
	void InfoOfCarpainter()
	{
		System.out.println("price if Carpainter :"+this.price);
		System.out.println("name of Carpainter  :"+this.behavior);
		
	}
}