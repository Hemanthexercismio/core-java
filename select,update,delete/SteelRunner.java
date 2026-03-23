class SteelRunner
{
	public static void main(String... values)
	{
		String[] types = new String[9];

		Steel steel = new Steel(types);

		steel.save("Alloy steel");
		steel.save("Carbon steel");
		steel.save("Tool steel");
		steel.save("Stainless steel");
		steel.save("iron steel");

		System.out.println("-----------------------------------------------");
	
		boolean found = steel.search("iron steel");
		System.out.println("steel found:" + found);
		
		boolean update1 = steel.update(2, "Spring steel");
		System.out.println("array updated :"+update1);
	
		boolean valueupdate = steel.updates("iron steel", "Mild steel");
		System.out.println("name updated :"+valueupdate);
		
		boolean deletingindex = steel.delet(4);
		System.out.println("deleted :"+deletingindex);
		
		boolean deletingstring = steel.delet("iron steel");
		System.out.println("removed :"+deletingstring);
	}
}