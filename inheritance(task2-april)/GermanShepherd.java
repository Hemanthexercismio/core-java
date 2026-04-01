class GermanShepherd
{
	double height;
	String name;
	boolean isdanger;
	
	GermanShepherd(double height,String name,boolean isdanger)
	{
		this.height=height;
		this.name=name;
		this.isdanger=isdanger;
		
	}
	GermanShepherd()
	{
		System.out.println("executing GermanShepherd method in GermanShepherd class");
	}
	void guarding()
	{
		System.out.println("Executing guarding in class GermanShepherd");
	}
}