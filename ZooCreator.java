class ZooCreator {
	
	static void getZoo()
	
	{
		System.out.println("Create a new Zoo");
		Zoo zoo=new Zoo("Bhanerghatta");
		System.out.println("zoo name: "+ zoo.animal);
		System.out.println("Zoo Is created");
	    System.out.println("=======================");
		
	}
	
	static void getZoo(String animal)
	{
		System.out.println("Created another new zoo");
		Zoo zoo=new Zoo(animal);
		System.out.println("zoo name: "+ zoo.animal);
		System.out.println("Another zoo is created");
	    System.out.println("=======================");
		
	}

	static void getZoo(String animal, int Count)
	{
		System.out.println("Again Zoo is Created");
		Zoo zoo=new Zoo(animal,Count);
		System.out.println("zoo name: "+ zoo.animal);
		System.out.println("zoo Count: "+ zoo.count);
		System.out.println("Another zoo with name and Count is created ");
	    System.out.println("=======================");
		
	}
}