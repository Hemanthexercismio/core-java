class StageRunner extends StageType
{
	public static void main(String[] args)
	{
		StageType stage1 = new StageType();
		System.out.println(stage1.length);
		System.out.println(stage1.material);
		System.out.println(stage1.isIndoor);
		
		StageType stage2 = new StageType(60,"Steel",true);
		System.out.println(stage2.length);
		System.out.println(stage2.material);
		System.out.println(stage2.isIndoor);
		
		StageType stage3 = new StageType(25.5,"Plastic");
		System.out.println(stage3.length);
		System.out.println(stage3.material);
		System.out.println(stage3.isIndoor);
	}
}