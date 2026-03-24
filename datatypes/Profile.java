class Profile
{
	String username;
	int age;
	String email;
	long phoneNumber;
	boolean isVerified;
	
	Profile(String username,int age,String email,long phoneNumber,boolean isVerified)
	{
		this.username=username;
		this.age=age;
		this.email=email;
		this.phoneNumber=phoneNumber;
		this.isVerified=isVerified;
	}
	
	void profileInfo()
	{
		
		System.out.println("executing profileInfo methodd");
		System.out.println("username is    :"+this.username);
		System.out.println("age          :"+this.age);
		System.out.println("email       :"+this.email);
		System.out.println("phone number :"+this.phoneNumber);
		System.out.println("is verified  :"+this.isVerified);
		
	}
}