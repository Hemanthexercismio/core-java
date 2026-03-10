class Court{
	
	CourtType courtType;
	
	Court(CourtType courtType)
	{
		this.courtType=courtType;
	}
	void getinfo()
	{
		System.out.println("courtType :"+this.courtType);
	}
}