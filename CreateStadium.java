class CreateStadium
{
	
	static void getStadium(String name)
	{
		System.out.println("Creating new museum");
		Stadium stadium=new Stadium(name);
	    System.out.println("stadium name"+stadium.name);
		System.out.println("stadium is created");
		
	}
	
	static void getStadium(String name,int dailyVisitors)
	{
		
        System.out.println("Creating new museum");	
		Stadium stadium=new Stadium(name,dailyVisitors);
		System.out.println("name of stadium"+stadium.name+"dailyVisitors for Stadium"+stadium.dailyVisitors);
		System.out.println("above is stadium name and dailyVisitors");
		
		
	}
	static void getStadium()
	{
		
        System.out.println("Creating new museum");	
		Stadium stadium=new Stadium("chinnna");
		System.out.println("name of stadium"+stadium.name);
		System.out.println("above is stadium name and dailyVisitors");
}		
}
								