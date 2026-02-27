class Stadium {

    String name;
    int dailyVisitors;
	
	Stadium (String name)
	
	{
		
		this.name = name;
		System.out.println("creating museum using only String ");
	}
	
	Stadium(String name,int dailyVisitors)
	{
		
		this.name = name;
		this.dailyVisitors = dailyVisitors;
		System.out.println("creating museum using only String,String const..");
		
	}
}
    