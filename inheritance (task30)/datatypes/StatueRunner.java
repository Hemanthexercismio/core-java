class StatueRunner
{
	public static void main(String[] args)
	{
		Statue[] statues=new Statue[10];
		
		StatueStore store=new StatueStore(statues);
		
		Statue statue1=new Statue(" Liberty","USA",93,"Copper",true);
		Statue statue2=new Statue("Unity","India",182,"Iron",true);
		Statue statue3=new Statue("Christ ","Brazil",30,"Concrete",true);
		Statue statue4=new Statue("Buddha","Japan" ,15,"Bronze",false);
		Statue statue5=new Statue("David","Italy",5.1,"Marble",true);
		Statue statue6=new Statue("Mother"," India",12,"Stone",false);
		Statue statue7=new Statue("Genghis","Mongolia",40,"Steel",true);
		Statue statue8=new Statue("Lincoln ","USA",9,"Marble",true);
		Statue statue9=new Statue("Shiva","India",34,"Granite",false);
		Statue statue10=new Statue("Merlion","Singapore",8.6,"Cement",false);
		
		store.save(statue1);
		store.save(statue2);
		store.save(statue3);
		store.save(statue4);
		store.save(statue5);
		store.save(statue6);
		store.save(statue7);
		store.save(statue8);
		store.save(statue9);
		store.save(statue10);
	}
}