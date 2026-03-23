class TreeRunner
{
	public static void main(String... values)
	{
		String[] types = new String[6];

		Tree tree = new Tree(types);

		tree.save("apple");
		tree.save("Mango");
		tree.save("Banyan");
		tree.save("Peepal");

		System.out.println("-----------------------------------------------");
	
		boolean found = tree.search("Peepal");
		System.out.println("tree found:" + found);
		
		boolean update1 = tree.update(3, "Coconut");
		System.out.println("array updated :"+update1);
	
		boolean valueupdate = tree.updates("apple", "Teak");
		System.out.println("name updated :"+valueupdate);
		
		boolean deletingindex = tree.delet(2);
		System.out.println("deleted :"+deletingindex);
		
		boolean deletingstring = tree.delet("Coconut");
		System.out.println("removed :"+deletingstring);
	}
}