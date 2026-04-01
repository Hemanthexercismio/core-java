class StairRunner extends StairType
{
	public static void main(String[] args)
	{
		StairType st1 = new StairType();
		System.out.println(st1.steps);
		System.out.println(st1.type);
		System.out.println(st1.hasRail);
		
		StairType st2 = new StairType(20,"Wood",true);
		System.out.println(st2.steps);
		System.out.println(st2.type);
		System.out.println(st2.hasRail);
		
		StairType st3 = new StairType(10,"Iron");
		System.out.println(st3.steps);
		System.out.println(st3.type);
		System.out.println(st3.hasRail);
	}
}