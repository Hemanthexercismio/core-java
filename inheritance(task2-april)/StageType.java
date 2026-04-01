class StageType extends Stage
{
	StageType()
	{
		super(40.0,"Wood",true);
	}
	
	StageType(double length,String material,boolean isIndoor)
	{
		super(length,material,isIndoor);
	}
	
	StageType(double length,String material)
	{
		super(length,material,false);
	}
}