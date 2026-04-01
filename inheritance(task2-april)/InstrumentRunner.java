class InstrumentRunner extends InstrumentTypeMusicInstrument
{
	public static void main(String[] args)
	{
		InstrumentTypeMusicInstrument instrument1 = new InstrumentTypeMusicInstrument();
		System.out.println(instrument1.price);
		System.out.println(instrument1.brand);
		System.out.println(instrument1.iselectric);
		
		InstrumentTypeMusicInstrument instrument2 = new InstrumentTypeMusicInstrument(2500,"Casio",true);
		System.out.println(instrument2.price);
		System.out.println(instrument2.brand);
		System.out.println(instrument2.iselectric);
		
		InstrumentTypeMusicInstrument instrument3 = new InstrumentTypeMusicInstrument(1200.5,"Roland");
		System.out.println(instrument3.price);
		System.out.println(instrument3.brand);
		System.out.println(instrument3.iselectric);
	}
}