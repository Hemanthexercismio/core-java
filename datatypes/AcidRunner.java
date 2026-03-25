class AcidRunner
{
	public static void main(String[] args)
	{
		Acid[] acids=new Acid[10];
		
		AcidStore store=new AcidStore(acids);
		
		Acid acid1=new Acid("Hydrochloric","HCl",1.2,true,"Colorless");	
		Acid acid2=new Acid("Sulfuric","H2SO4",0.8,true,"Colorless");	
		Acid acid3=new Acid("Nitric","HNO3",1.0,true,"Yellowish");		
		Acid acid4=new Acid("Acetic","CH3COOH",3.5,false,"Colorless");	
		Acid acid5=new Acid("Citric","C6H8O7",3.2,false,"White");	
		Acid acid6=new Acid("Phosphoric","H3PO4",2.1,false,"Colorless");	
		Acid acid7=new Acid("Formic","CH2O2",2.8,false,"Colorless");	
		Acid acid8=new Acid("Oxalic","C2H2O4",1.5,true,"White");	
		Acid acid9=new Acid("Lactic","C3H6O3",3.8,false,"Colorless");	
		Acid acid10=new Acid("Carbonic","H2CO3",4.2,false,"Colorless");	
						
		store.save(acid1);
		store.save(acid2);
		store.save(acid3);
		store.save(acid4);
		store.save(acid5);
		store.save(acid6);
		store.save(acid7);
		store.save(acid8);
		store.save(acid9);
		store.save(acid10);
	}
}