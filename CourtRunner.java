class CourtRunner{
	
	public static void main(String... anything)
	
	{
		
		CourtType type=CourtType.CIVIL;
		Court court=new Court(type);
		court.getinfo();
		
	}
}