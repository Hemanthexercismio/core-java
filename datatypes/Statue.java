class Statue
{
	String name;
	String location;
	double height;
	String material;
	boolean isHistorical;
	
	Statue(String name,String location,double height,String material,boolean isHistorical)
	{
		this.name=name;
		this.location=location;
		this.height=height;
		this.material=material;
		this.isHistorical=isHistorical;
	}
	
	void statueInfo()
	{
		System.out.println("executing statueInfo method");
		System.out.println("statue name     :"+this.name);
		System.out.println("location        :"+this.location);
		System.out.println("height          :"+this.height);
		System.out.println("material        :"+this.material);
		System.out.println("is historical   :"+this.isHistorical);
	}
}