class StairCase
{
	int steps;
	String type;
	boolean hasRail;
	
	StairCase(int steps,String type,boolean hasRail)
	{
		this.steps=steps;
		this.type=type;
		this.hasRail=hasRail;
	}
	
	StairCase()
	{
		System.out.println("executing StairCase constructor");
	}
	
	void climb()
	{
		System.out.println("Executing climb in StairCase class");
	}
}