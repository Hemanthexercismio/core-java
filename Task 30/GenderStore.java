class GenderStore
{
	String[] genders;
	int index;

	GenderStore(String[] genders)
	{
		this.genders = genders;
	}

	
	void storeInfo(String gender)
	{
		if(index < genders.length)
		{
			genders[index] = gender;
			index++;
		}
		else
		{
			System.out.println("Array got full");
		}
	}

	
	void display()
	{
		for(int i = 0; i < genders.length; i++)
		{
			System.out.println(genders[i]);
		}
		System.out.println("##########################");
	}

	
	void sortAscendingOrder()
	{
		for(int i = 0; i < genders.length; i++)
		{
		for(int j = i + 1; j < genders.length; j++)
			{
			if(genders[i].compareTo(genders[j]) > 0)
			{
				System.out.println("comparing i and j");
					String temp = genders[i];
					genders[i] = genders[j];
					genders[j] = temp;
			}
			}
		}
	}

	
	void sortDescendingOrder()
	{
	for(int i = 0; i < genders.length; i++)
		{
			 for(int j = i + 1; j < genders.length; j++)
			{
			if(genders[i].compareTo(genders[j]) < 0)
			{
					String temp = genders[i];
					genders[i] = genders[j];
					genders[j] = temp;
			}
		}
		}
	}
}