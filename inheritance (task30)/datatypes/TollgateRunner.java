class TollgateRunner
{
	public static void main(String[] args)
	{
		Tollgate[] tollgates=new Tollgate[10];
		
		TollStore tollStore=new TollStore(tollgates);
		
		Tollgate tollgate=new Tollgate("tumkur",4,15000,true,"Omkar");
		Tollgate tollgate2=new Tollgate("Sira",3,14000,false,"sahil");
		Tollgate tollgate3=new Tollgate("hiriyuru",7,54000,true,"srujen");
		Tollgate tollgate4=new Tollgate("chitradurga",9,14000,false,"bharath");
		Tollgate tollgate5=new Tollgate("baramsagara",8,19000,false,"prasad");
		Tollgate tollgate6=new Tollgate("davangere",7,45000,false,"revanth");
		Tollgate tollgate7=new Tollgate("harihara",6,1000,true,"krihshna");
		Tollgate tollgate8=new Tollgate("ranebennur",67,54367,false,"shashank");
		Tollgate tollgate9=new Tollgate("badgy",34,6000,false,"priya");
		Tollgate tollgate10=new Tollgate("dharwad",7,18000,true,"ajay");
		tollStore.save(tollgate);
		tollStore.save(tollgate2);
		tollStore.save(tollgate3);
		tollStore.save(tollgate4);
		tollStore.save(tollgate5);
		tollStore.save(tollgate6);
		tollStore.save(tollgate7);
		tollStore.save(tollgate8);
		tollStore.save(tollgate9);
		tollStore.save(tollgate10);
	}
}