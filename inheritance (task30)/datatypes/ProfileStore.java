class ProfileStore
{
	Profile[] profiles;
	int currentIndex;
	
	ProfileStore(Profile[] profiles)
	{
		this.profiles=profiles;
	}
	
	void save(Profile profile)
	{
		System.out.println("saving  profile  info  in  store ");
		
	if(profile!=null && this.profiles!=null)
		{
		int lastIndex=this.profiles.length-1;
			
		if(this.currentIndex<=lastIndex)
			{
				this.profiles[this.currentIndex]=profile;
				profile.profileInfo();
				this.currentIndex++;
			}
		else
			{
				System.out.println("storageeee is full");
			}
		}
	}
}