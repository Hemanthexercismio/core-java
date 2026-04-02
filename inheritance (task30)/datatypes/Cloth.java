class Cloth
{
	String brand;
	String type;
	double price;
	String size;
	boolean isCotton;
	
	Cloth(String brand,String type,double price,String size,boolean isCotton)
	{
		this.brand=brand;
		this.type=type;
		this.price=price;
		this.size=size;
		this.isCotton=isCotton;
	}
	
	void clothInformation()
	{
		System.out.println("||executing clothInfo method in cloth class ||");
		System.out.println("brand name     :"+this.brand);
		System.out.println("type of cloth  :"+this.type);
		System.out.println("price of cloth     :"+this.price);
		System.out.println("size  of cloth     :"+this.size);
		System.out.println("is cotton  or not :"+this.isCotton);
	}
}