class DogGermanShepherd extends GermanShepherd
{
	DogGermanShepherd()
	{
		super(50.0,"bubbly",false);
	}
	DogGermanShepherd(double height,String name,boolean isdanger)
	{
		super(height,name,isdanger);
	}	
		DogGermanShepherd(double height,String name)
		{
			super(height,name,true);
		}
	}
