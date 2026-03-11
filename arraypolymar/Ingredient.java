class Ingredient
{
	String[] name;
	Jamoon[] jamoon;
	
	Ingredient(String[] name,Jamoon[] jamoon)
	{
		this.name=name;
		this.jamoon=jamoon;
		
	}
	void Displying()
	{
		System.out.println("Executing displlay method in ingredients ");
		if(this.name!=null)
		{
		System.out.println("no of ingredients :"+this.name.length);
		for(String name:this.name)
			
		System.out.println("name of ingredients "+name);	
	}
	
	else{
		System.out.println("name is null");
	}
	if(this.jamoon!=null)
		{
			System.out.println("total no of jamoon :" +this.jamoon.length);
			for(Jamoon jam:this.jamoon)
				jam.InfoOfJamoon();
				}
		else{		
		    System.out.println("The jamoon is null.");

		}
	
}
}

