class ProfileRunner
{
	
	public static void main(String[] args)
	{
		
		
		Profile[] profiles=new Profile[10];
		
		
		ProfileStore store=new ProfileStore(profiles);
		
		
		Profile profile1=new Profile("Hemanth",22,"hemanth@gmail.com",9876543210L,true);
		Profile profile2=new Profile("Ravi",25,"raju@gmail.com",9123456780L,false);
		Profile profile3=new Profile("Sneha",21,"sahil@gmail.com",9988776655L,true);
		Profile profile4=new Profile("Kiran",24,"kiran@gmail.com",9090909090L,false);
		Profile profile5=new Profile("Anjali",23,"krishna@gmail.com",8888888888L,true);
		Profile profile6=new Profile("Manoj",26,"devnath@gmail.com",9777777777L,false);
		Profile profile7=new Profile("Divya",22,"divya@gmail.com",9666666666L,true);
		Profile profile8=new Profile("Arjun",27,"arjun@gmail.com",9555555555L,false);
		Profile profile9=new Profile("Pooja",20,"akash@gmail.com",9444444444L,true);
		Profile profile10=new Profile("Vikram",28,"akasha@gmail.com",9333333333L,false);
		
		
		store.save(profile1); 
		store.save(profile2); 
		store.save(profile3); 
		store.save(profile4); 
		store.save(profile5); 
		store.save(profile6); 
		store.save(profile7); 
		store.save(profile8); 
		store.save(profile9); 
		store.save(profile10); 
		
		
	}
}