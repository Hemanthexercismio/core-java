class PowerBankInfo extends PowerBank
{
	int ports;
	String color;
	boolean fastCharging;
	String model;
	
	PowerBankInfo()
	{
		super();
		System.out.println("explicitly Creating PowerBankInfo constructor");
	}
	
	void displayPowerDetails()
	{
		System.out.println("Running displayPowerDetails in PowerBankInfo");
	}
}