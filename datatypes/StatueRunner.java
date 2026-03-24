class StatueRunner
{
	public static void main(String[] args)
	{
		Statue[] statues=new Statue[10];
		
		StatueStore store=new StatueStore(statues);
		
		Statue s1=new Statue(" Liberty","USA",93,"Copper",true);
		Statue s2=new Statue("Unity","India",182,"Iron",true);
		Statue s3=new Statue("Christ ","Brazil",30,"Concrete",true);
		Statue s4=new Statue("Buddha","Japan" ,15,"Bronze",false);
		Statue s5=new Statue("David","Italy",5.1,"Marble",true);
		Statue s6=new Statue("Mother"," India",12,"Stone",false);
		Statue s7=new Statue("Genghis","Mongolia",40,"Steel",true);
		Statue s8=new Statue("Lincoln ","USA",9,"Marble",true);
		Statue s9=new Statue("Shiva","India",34,"Granite",false);
		Statue s10=new Statue("Merlion","Singapore",8.6,"Cement",false);
		
		store.save(s1);
		store.save(s2);
		store.save(s3);
		store.save(s4);
		store.save(s5);
		store.save(s6);
		store.save(s7);
		store.save(s8);
		store.save(s9);
		store.save(s10);
	}
}