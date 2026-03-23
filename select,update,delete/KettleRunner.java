class KettleRunner
{
	public static void main(String... values)
	{
		String[] types = new String[10];

		Kettle kettle = new Kettle(types);

		kettle.save("Electric kettle");
		kettle.save("Steel kettle");
		kettle.save("Travel kettle");
		kettle.save("Glass kettle");
		kettle.save("iron kettle");

		System.out.println("-----------------------------------------------");
	
		boolean found = kettle.search("iron kettle");
		System.out.println("kettle found:" + found);
		
		boolean update1 = kettle.update(1, "Smart kettle");
		System.out.println("array updated :"+update1);
	
		boolean valueupdate = kettle.updates("Electric kettle", "Cordless kettle");
		System.out.println("name updated :"+valueupdate);
		
		boolean deletingindex = kettle.delet(2);
		System.out.println("deleted :"+deletingindex);
		
		boolean deletingstring = kettle.delet("Smart kettle");
		System.out.println("removed :"+deletingstring);
	}
}