class Product
{
	String name;
	String make;
	String mfgDate;
	double cost;
	ProductType productType;
	String seller;
	WarrantyYears warrantyYears;
	boolean warrantyExpired;
	int uniqueId;
	String originCountry;
	
	Product(String name,String make,String mfgDate,double cost,
	ProductType productType,String seller,WarrantyYears warrantyYears,
	boolean warrantyExpired,int uniqueId,String originCountry)
	{
		this.name=name;
		this.make=make;
		this.mfgDate=mfgDate;
		this.cost=cost;
		this.productType=productType;
		this.seller=seller;
		this.warrantyYears=warrantyYears;
		this.warrantyExpired=warrantyExpired;
		this.uniqueId=uniqueId;
		this.originCountry=originCountry;
	}
	
	void display()
	{
		System.out.println("Name of product:"+this.name);
		System.out.println("Make by :"+this.make);
		System.out.println("mfgDate :"+this.mfgDate);
		System.out.println("Cost of product :"+this.cost);
		System.out.println("type :"+this.productType);
		System.out.println("Seller :"+this.seller);
		System.out.println("warrantyYears :"+this.warrantyYears);
		System.out.println("warrantyExpired :"+this.warrantyExpired);
		System.out.println("uniqueId :"+this.uniqueId);
		System.out.println("originCountry :"+this.originCountry);

	}
}