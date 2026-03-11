class Carpainting
{
	String[] name;
	Carpainter[] carpainter;
	
	Carpainting(String[] name,Carpainter[] carpainter)
	{
		this.name=name;
		this.carpainter=carpainter;
	}
	
	void Display()
	{
		
			
		System.out.println("Executing the display method in carpainter ");
		if(this.name!=null)
		{
		System.out.println("total no of names :"+this.name.length);
		for(String name:this.name)
			
		System.out.println("name of the Carpainter "+name);
		}
		else
		{
		System.out.println("the name is null");
		}
		if(this.carpainter!=null)
		{
			System.out.println("The total no of Carpainter:" +this.carpainter.length);
			for(Carpainter carpainters:this.carpainter)
				carpainters.InfoOfCarpainter();
				}
		else{		
		    System.out.println("The paint is null.");

		}
		
	}
}