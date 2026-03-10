class Fort
{
	FortType fortType;
	String place;
	Soldiers soldiers;
	
	Fort(FortType fortType,String place,Soldiers soldiers)
	{
		this.fortType=fortType;
		this.place=place;
		this.soldiers=soldiers;
	}
	
	void getFortInfo()
	{
		System.out.println("Fort Type :"+this.fortType);
		System.out.println("Place :"+this.place);
		
		if(this.soldiers!=null)
		{
			this.soldiers.getSoldiersInfo();
		}
		else
		{
			System.out.println("Soldiers cannot be null");
		}
	}
}