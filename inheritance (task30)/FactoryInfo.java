class FactoryInfo extends Factory
{
	String productType;
	int machinesCount;
	String ownerName;
	String shiftType;
	
	FactoryInfo()
	{
		super();
		System.out.println("explicitly Creating FactoryInfo constructor");
	}
	
	void displayFactoryDetails()
	{
		System.out.println("Running displayFactoryDetails in FactoryInfo");
	}
}