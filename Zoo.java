class Zoo{
	String animal;
	int count;

	Zoo (String animal)
	{
		this.animal=animal;
		System.out.println("Created ZOO");
	}

	Zoo (String animal,int count)
	{
		this.animal=animal;
		this.count=count;
		System.out.println("Created ZOO with animal and count");
	}

}