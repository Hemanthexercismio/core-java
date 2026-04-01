class DogGermanShepherdRunner extends DogGermanShepherd
{
	public static void main (String[] args)
	{
		DogGermanShepherd dogGermanShepherd1=new DogGermanShepherd();
		System.out.println(dogGermanShepherd1.height);
		System.out.println(dogGermanShepherd1.name);
		System.out.println(dogGermanShepherd1.isdanger);
		
		DogGermanShepherd dogGermanShepherd2=new DogGermanShepherd(34,"rubby",true);
		System.out.println(dogGermanShepherd2.height);
		System.out.println(dogGermanShepherd2.name);
		System.out.println(dogGermanShepherd2.isdanger);
		
		DogGermanShepherd dogGermanShepherd3 = new DogGermanShepherd(70.8,"blacky");
		System.out.println(dogGermanShepherd3.height);
		System.out.println(dogGermanShepherd3.name);
		System.out.println(dogGermanShepherd3.isdanger);
		
	}
}