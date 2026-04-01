class StageRunner extends StageType
{
	public static void main(String[] args)
	{
		StageType s1 = new StageType();
		System.out.println(s1.length);
		System.out.println(s1.material);
		System.out.println(s1.isIndoor);
		
		StageType s2 = new StageType(60,"Steel",true);
		System.out.println(s2.length);
		System.out.println(s2.material);
		System.out.println(s2.isIndoor);
		
		StageType s3 = new StageType(25.5,"Plastic");
		System.out.println(s3.length);
		System.out.println(s3.material);
		System.out.println(s3.isIndoor);
	}
}