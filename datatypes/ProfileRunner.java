class ProfileRunner
{
	public static void main(String[] args)
	{
		Profile[] profiles=new Profile[10];
		
		ProfileStore store=new ProfileStore(profiles);
		
		Profile p1=new Profile("Hemanth",22,"hemanth@gmail.com",9876543210L,true);
		Profile p2=new Profile("Ravi",25,"ravi@gmail.com",9123456780L,false);
		Profile p3=new Profile("Sneha",21,"sneha@gmail.com",9988776655L,true);
		Profile p4=new Profile("Kiran",24,"kiran@gmail.com",9090909090L,false);
		Profile p5=new Profile("Anjali",23,"anjali@gmail.com",8888888888L,true);
		Profile p6=new Profile("Manoj",26,"manoj@gmail.com",9777777777L,false);
		Profile p7=new Profile("Divya",22,"divya@gmail.com",9666666666L,true);
		Profile p8=new Profile("Arjun",27,"arjun@gmail.com",9555555555L,false);
		Profile p9=new Profile("Pooja",20,"pooja@gmail.com",9444444444L,true);
		Profile p10=new Profile("Vikram",28,"vikram@gmail.com",9333333333L,false);
		
		store.save(p1);
		store.save(p2);
		store.save(p3);
		store.save(p4);
		store.save(p5);
		store.save(p6);
		store.save(p7);
		store.save(p8);
		store.save(p9);
		store.save(p10);
	}
}