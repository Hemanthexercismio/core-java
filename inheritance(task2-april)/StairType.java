class StairType extends StairCase
{
	StairType()
	{
		super(15,"Concrete",true);
	}
	
	StairType(int steps,String type,boolean hasRail)
	{
		super(steps,type,hasRail);
	}
	
	StairType(int steps,String type)
	{
		super(steps,type,false);
	}
}