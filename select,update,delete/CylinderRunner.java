class CylinderRunner
{
	public static void main(String[] args)
	{
		String[] types = new String[5];

		Cylinder cylinder = new Cylinder(types);

		cylinder.save("Gas Cylinder");
		cylinder.save("Oxygen Cylinder");
		cylinder.save("Nitrogen Cylinder");

		boolean found = cylinder.search("Gas Cylinder");
		System.out.println("found :"+found);

		boolean delete = cylinder.delet("Oxygen Cylinder");
		System.out.println("deleted :"+delete);
	}
}