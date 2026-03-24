class AcidRunner
{
	public static void main(String[] args)
	{
		Acid[] acids=new Acid[10];
		
		AcidStore store=new AcidStore(acids);
		
		Acid a1=new Acid("Hydrochloric","HCl",1.2,true,"Colorless");
		Acid a2=new Acid("Sulfuric","H2SO4",0.8,true,"Colorless");
		Acid a3=new Acid("Nitric","HNO3",1.0,true,"Yellowish");
		Acid a4=new Acid("Acetic","CH3COOH",3.5,false,"Colorless");
		Acid a5=new Acid("Citric","C6H8O7",3.2,false,"White");
		Acid a6=new Acid("Phosphoric","H3PO4",2.1,false,"Colorless");
		Acid a7=new Acid("Formic","CH2O2",2.8,false,"Colorless");
		Acid a8=new Acid("Oxalic","C2H2O4",1.5,true,"White");
		Acid a9=new Acid("Lactic","C3H6O3",3.8,false,"Colorless");
		Acid a10=new Acid("Carbonic","H2CO3",4.2,false,"Colorless");
		
		store.save(a1);
		store.save(a2);
		store.save(a3);
		store.save(a4);
		store.save(a5);
		store.save(a6);
		store.save(a7);
		store.save(a8);
		store.save(a9);
		store.save(a10);
	}
}