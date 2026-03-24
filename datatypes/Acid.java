class Acid
{
	String name;
	String formula;
	double phValue;
	boolean isStrong;
	String colour;
	
	Acid(String name,String formula,double phValue,boolean isStrong,String colour)
	{
		this.name=name;
		this.formula=formula;
		this.phValue=phValue;
		this.isStrong=isStrong;
		this.colour=colour;
	}
	
	void acidInfo()
	{
		System.out.println("executing  acidInfo method");
		System.out.println("acid name   :"+this.name);
		System.out.println("formula    :"+this.formula);
		System.out.println("ph value  of acid  :"+this.phValue);
		System.out.println("is strong    :"+this.isStrong);
		System.out.println("colour       :"+this.colour);
	}
}