class ScooterRunner
{
	public static void main(String... values)
	{
		String[] types = new String[5];

		Scooter scooter = new Scooter(types);

		scooter.save("tvs");
		scooter.save("Jupiter");
		scooter.save("Access");
		scooter.save("Fascino");
		scooter.save("Ather");

		System.out.println("-----------------------------------------------");
	
		boolean found = scooter.search("tvs");
		System.out.println("scooter found:" + found);
		
		boolean update1 = scooter.update(3, "NTorq");
		System.out.println("array updated :"+update1);
	
		boolean valueupdate = scooter.updates("tvs", "Dio");
		System.out.println("name updated :"+valueupdate);
		
		boolean deletingindex = scooter.delet(2);
		System.out.println("deleted :"+deletingindex);
		
		boolean deletingstring = scooter.delet("tvs");
		System.out.println("removed :"+deletingstring);
	}
}