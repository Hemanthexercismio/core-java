class MusicInstrument
{
	double price;
	String brand;
	boolean iselectric;
	
	MusicInstrument(double price,String brand,boolean iselectric)
	{
		this.price=price;
		this.brand=brand;
		this.iselectric=iselectric;
	}
	
	MusicInstrument()
	{
		System.out.println("executing MusicInstrument constructor");
	}
	
	void playSound()
	{
		System.out.println("Executing playSound in MusicInstrument class");
	}
}