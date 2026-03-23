class PastaRunner
{
	public static void main(String... values)
	{
		String[] types = new String[7];

		Pasta pasta = new Pasta(types);

		pasta.save("White pasta");
		pasta.save("Red pasta");
		pasta.save("ghee pasta");
		pasta.save("strowberry pasta");

		System.out.println("-----------------------------------------------");
	
		boolean found = pasta.search("ghee pasta");
		System.out.println("pasta found:" + found);
		
		boolean update1 = pasta.update(1, "american pasta");
		System.out.println("array updated :"+update1);
	
		boolean valueupdate = pasta.updates("red pasta", "us pasta");
		System.out.println("name updated :"+valueupdate);
		
		boolean deletingindex = pasta.delet(2);
		System.out.println("deleted :"+deletingindex);
		
		boolean deletingstring = pasta.delet("ghee pasta");
		System.out.println("removed :"+deletingstring);
	}
}