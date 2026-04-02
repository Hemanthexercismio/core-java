class StairRunner extends StairType
{
	public static void main(String[] args)
	{
		StairType stair1 = new StairType();
		System.out.println(stair1.steps);
		System.out.println(stair1.type);
		System.out.println(stair1.hasRail);
		
		StairType stair2 = new StairType(20,"Wood",true);
		System.out.println(stair2.steps);
		System.out.println(stair2.type);
		System.out.println(stair2.hasRail);
		
		StairType stair3 = new StairType(10,"Iron");
		System.out.println(stair3.steps);
		System.out.println(stair3.type);
		System.out.println(stair3.hasRail);
	}
}