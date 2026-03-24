class ClothStore
{
	Cloth[] cloths;
	int currentIndex;
	
	ClothStore(Cloth[] cloths)
	{
		this.cloths=cloths;
	}
	
	void save(Cloth cloth)
	{
		System.out.println("execiting save method of cloth info in store");
		
		if(cloth!=null && this.cloths!=null)
		{
			int lastIndex=this.cloths.length-1;
			
			if(this.currentIndex<=lastIndex)
			{
				this.cloths[this.currentIndex]=cloth;
				cloth.clothInformation();
				this.currentIndex++;
			}
			else
			{
				System.out.println("clothstore storage is full");
			}
		}
	}
}