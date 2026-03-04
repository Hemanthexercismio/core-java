class MusuemCreator{
	
	static void getMusuem()
	{
	System.out.println("creating Musuem");
	Musuem musuem=new Musuem("international");
	System.out.println("Musuem name:"+musuem.name);
    System.out.println("Musuem is creacted successfully...");	
	System.out.println("=======================");
	
	}
	
	static void getMusuem(String name)
	{
	System.out.println("creacting anonther Musuem")	;
	Musuem musuem = new Musuem(name);
	System.out.println("musuem name:"+musuem.name);
	System.out.println("creacting Musuem using name");
	System.out.println("=======================");
	
	}
	
	
	static void getMusuem(String name,int price)
	{
		
		System.out.println("again musuem creacted");
		Musuem musuem=new Musuem(name,price);
		System.out.println("musuem name:"+ musuem.name+ "musuementry price:"+musuem.price);
		System.out.println("creacted Musuem using name,price");
	}
	
	
	
}