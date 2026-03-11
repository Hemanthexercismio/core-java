class Parliament
{
	ParliamentType parliamentType;
	String state;
	Members members;
	
	Parliament(ParliamentType parliamentType,String state,Members members)
	{
	this.parliamentType=parliamentType;
	this.state=state;
	this.members=members;
	}
	
	void getparliamentinfo()
	{
		System.out.println("parliamentType:"+this.parliamentType);
		System.out.println("state :"+this.state);
		if(this.members!=null)
		{
			this.members.getMembersInfo();
		}
		else
		{
			System.out.println("members cannot be null");
		}
	}
}