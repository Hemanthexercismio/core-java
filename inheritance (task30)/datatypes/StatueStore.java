class StatueStore
{
	Statue[] statues;
	int currentIndex;
	
	StatueStore(Statue[] statues)
	{
		this.statues=statues;
	}
	
	void save(Statue statue)
	{
		System.out.println("saving statue info in store");
		
		if(statue!=null && this.statues!=null)
		{
			int lastIndex=this.statues.length-1;
			
			if(this.currentIndex<=lastIndex)
			{
				this.statues[this.currentIndex]=statue;
				statue.statueInfo();
				this.currentIndex++;
			}
			else
			{
				System.out.println("storage is full");
			}
		}
	}
}