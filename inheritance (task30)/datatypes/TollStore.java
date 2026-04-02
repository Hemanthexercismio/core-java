class TollStore
{
	Tollgate[] tollgates;
	int currentindex;
	
	TollStore(Tollgate[] tollgates)
	{
		this.tollgates=tollgates;		
	}
	void save(Tollgate tollgate)
	{
		System.out.println("saving tollgates info in tollgatestore");
		if(tollgate!=null && this.tollgates!=null)
		{
			int index=this.tollgates.length-1;
			if(currentindex<=index)
			{
				this.tollgates[currentindex]=tollgate;
			    tollgate.toolGateinfo();
				this.currentindex++;
			}
		}
	}
	
}