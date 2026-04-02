class FactoryRunner
{
	public static void main(String[] args)
	{
		Factory factory = new Factory();
		System.out.println("Printing Factory Information");
		
		factory.factoryName = "ABC Industries";
		System.out.println("Factory Name: " + factory.factoryName);
		
		factory.location = "Bangalore";
		System.out.println("Location: " + factory.location);
		
		factory.workersCount = 150;
		System.out.println("Workers Count: " + factory.workersCount);
		
		factory.produceGoods();
		factory.manageWorkers();
		
		System.out.println("---------------------------------");
		
		FactoryInfo infoFactory = new FactoryInfo();
		System.out.println("Printing Factory Information using Inheritance");
		
		infoFactory.productType = "Electronics";
		System.out.println("Product Type: " + infoFactory.productType);
		
		infoFactory.machinesCount = 50;
		System.out.println("Machines Count: " + infoFactory.machinesCount);
		
		infoFactory.ownerName = "Ravi Kumar";
		System.out.println("Owner Name: " + infoFactory.ownerName);
		
		infoFactory.shiftType = "Day Shift";
		System.out.println("Shift Type: " + infoFactory.shiftType);
		
		infoFactory.factoryName = "hemanth";
		System.out.println("--------factoryName:"+infoFactory.factoryName)
		
		System.out.println("-----------------------------------");
		
		infoFactory.produceGoods();    
		infoFactory.manageWorkers();   
		infoFactory.displayFactoryDetails();
}}