class PetroleumRunner{
	public static void main(String[] values)
	{
		String[] names=new String[5];
		PetroleumStore petroleumStore = new PetroleumStore(names);
		
		petroleumStore.save(" indian ");
		petroleumStore.save(" relance ");
		petroleumStore.save(" HP " );
		petroleumStore.save(" shell ");
		petroleumStore.save(" bharath ");
		petroleumStore.save(" shell ");
		

	}
}