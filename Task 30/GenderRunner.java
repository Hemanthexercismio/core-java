class GenderRunner
{
	public static void main(String[] args)
	{
		String[] genders = new String[3];

		GenderStore storeInfo = new GenderStore(genders);

		storeInfo.storeInfo("Female");
		storeInfo.storeInfo("Male");
		storeInfo.storeInfo("Others");

		System.out.println("Raw data :");
		storeInfo.display();

		System.out.println("Ascending Order:");
		storeInfo.sortAscendingOrder();
		storeInfo.display();

		System.out.println("Descending Order:");
		storeInfo.sortDescendingOrder();
		storeInfo.display();
	}
}