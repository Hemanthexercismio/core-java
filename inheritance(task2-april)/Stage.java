class Stage
{
	double length;
	String material;
	boolean isIndoor;
	
	Stage(double length,String material,boolean isIndoor)
	{
		this.length=length;
		this.material=material;
		this.isIndoor=isIndoor;
	}
	
	Stage()
	{
		System.out.println("executing Stage constructor");
	}
	
	void perform()
	{
		System.out.println("Executing perform in Stage class");
	}
}