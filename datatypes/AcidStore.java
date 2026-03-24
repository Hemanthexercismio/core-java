class AcidStore
{
	Acid[] acids;
	int currentIndex;
	
	AcidStore(Acid[] acids)
	{
		this.acids=acids;
	}
	
	void save(Acid acid)
	{
		System.out.println("saving acid info in store");
		
		if(acid!=null && this.acids!=null)
		{
			int lastIndex=this.acids.length-1;
			
			if(this.currentIndex<=lastIndex)
			{
				this.acids[this.currentIndex]=acid;
				acid.acidInfo();
				this.currentIndex++;
			}
			else
			{
				System.out.println("storage is fulllllllllllll");
			}
		}
	}
}