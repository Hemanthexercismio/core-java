class Factory
{
	String factoryName;
	String location;
	int workersCount;
	
	Factory()
	{
		System.out.println("Creating no argument constructor Factory");
	}
	
	void produceGoods()
	{
		System.out.println("Executing produceGoods in Factory");
	}
	
	void manageWorkers()
	{
		System.out.println("Executing manageWorkers in Factory");
	}
}