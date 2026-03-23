class TurbineRunner
{
	public static void main(String... values)
	{
		String[] types = new String[10];

		Turbine turbine = new Turbine(types);

		turbine.save("Steam turbine");
		turbine.save("Gas turbine");
		turbine.save("Water turbine");
		turbine.save("Wind turbine");
		turbine.save("Kaplan turbine");
		turbine.save("Pelton turbine");
		turbine.save("Francis turbine");
		turbine.save("Impulse turbine");
		turbine.save("Reaction turbine");
		turbine.save("Hydraulic turbine");

		System.out.println("-----------------------------------------------");
	
		boolean found = turbine.search("Wind turbine");
		System.out.println("turbine name found:" + found);
		System.out.println("-----------------------------------------------");
		
		boolean update1 = turbine.update(5, "alxel turbain");
		System.out.println("the array is updated :"+update1);
	
	
		boolean valueupdate = turbine.updates("Gas turbine", "oil turbain");
		System.out.println("the new name is updated :"+valueupdate);
		System.out.println("-----------------------------------------------");
		
		boolean deletingindex = turbine.delet(3);
		System.out.println("name is dleted:"+deletingindex);
		System.out.println("-----------------------------------------------");
		
		boolean deletingstring = turbine.delet("water turbine");
		System.out.println("removing value:"+deletingstring);
		System.out.println("-----------------------------------------------");
		
		
		
		
	}
}