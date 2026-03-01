class Stand {

    String standName;
    String material;
    String color;
    double height;
    double width;
    double weight;
    String usageType;
    boolean foldable;
    String brand;
    double price;
    int warrantyYears;
    String country;
    String modelNumber;
    boolean adjustable;
    String shape;
    String finish;
    int loadCapacity;
    String manufacturingDate;
    boolean portable;
    String supplierName;
	
	
	Stand(String standName,String material,String color,double height,double width,double weight,String usageType,
	boolean foldable,String brand,double price,int warrantyYears,String country, String modelNumber,boolean adjustable,
    String shape,String finish,int loadCapacity,String manufacturingDate,boolean portable,String supplierName)
	{
	this.standName=standName;
	this.material=material;
	this.color=color;
	this.height=height;
	this.width=width;
	this.weight=weight;
	this.usageType=usageType;
	this.foldable=foldable;
	this.brand=brand;
	this.price=price;
	this.warrantyYears=warrantyYears;
	this.country=country;
	this.modelNumber=modelNumber;
	this.adjustable=adjustable;
	this.shape=shape;
	this.finish=finish;
	this.loadCapacity=loadCapacity;
	this.manufacturingDate=manufacturingDate;
	this.portable=portable;
	this.supplierName=supplierName;

	}	
	void display()
	{
		System.out.println("standName:"+standName);
		System.out.println("material:"+material);
		System.out.println("color:"+color);
		System.out.println("height:"+height);
		System.out.println("width:"+width);
		System.out.println("weight:"+weight);
		System.out.println("usageType:"+usageType);
		System.out.println("foldable:"+foldable);
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("warrantyYears:"+warrantyYears);
		System.out.println("country:"+country);
		System.out.println("modelNumber:"+modelNumber);
		System.out.println("adjustable:"+adjustable);
		System.out.println("shape:"+shape);
		System.out.println("finish:"+finish);
		System.out.println("loadCapacity:"+loadCapacity);
		System.out.println("manufacturingDate:"+manufacturingDate);
		System.out.println("portable:"+portable);
		System.out.println("supplierName:"+supplierName);
		
	}

}