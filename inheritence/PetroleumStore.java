class PetroleumStore
{
	String [] names;
	int presentIndex=0;
	PetroleumStore(String[] names)
	{
		this.names=names;
	}
	void save(String name)
	{
		System.out.println("we are in save method of petroleumstore");
		System.out.println("name argument:"+name);
		if(this.names!=null)
		{
		 System.out.println("checking to store");
		int namesindex=this.names.length-1;
		if(this.presentIndex<=namesindex)
		{
		 System.out.println("storing in index :"+this.presentIndex);
		 this.names[this.presentIndex]=name;
		 this.presentIndex++;
		}
		else
		{
			System.out.println("array is full , cannot store more names ");
		}
		
		}
		 else{
			 System.out.println("Names are not initionalised with array");
		 }
		}
	}
