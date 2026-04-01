class InstrumentTypeMusicInstrument extends MusicInstrument
{
	InstrumentTypeMusicInstrument()
	{
		super(5000.0,"Yamaha",true);
	}
	
	InstrumentTypeMusicInstrument(double price,String brand,boolean iselectric)
	{
		super(price,brand,iselectric);
	}
	
	InstrumentTypeMusicInstrument(double price,String brand)
	{
		super(price,brand,false);
	}
}