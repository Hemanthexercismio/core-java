class DMart
{
	DMartType dMartType;
	String city;
	Products products;
	
	DMart(DMartType dMartType,String city,Products products)
	{
		this.dMartType=dMartType;
		this.city=city;
		this.products=products;
	}
	
	void getDMartInfo()
	{
		System.out.println("DMart Type :"+this.dMartType);
		System.out.println("City :"+this.city);
		
		if(this.products!=null)
		{
			this.products.getProductsInfo();
		}
		else
		{
			System.out.println("Products cannot be null");
		}
	}
}