class PowerBankRunner
{
	public static void main(String[] args)
	{
		PowerBank powerBank = new PowerBank();
		System.out.println("Printing PowerBank Information");
		
		powerBank.brand = "Mi";
		System.out.println("Brand: " + powerBank.brand);
		
		powerBank.capacity = 20000;
		System.out.println("Capacity: " + powerBank.capacity);
		
		powerBank.price = 1499;
		System.out.println("Price: " + powerBank.price);
		
		powerBank.chargeDevice();
		powerBank.showStatus();
		
		System.out.println("---------------------------------");
		
		PowerBankInfo infoPower = new PowerBankInfo();
		System.out.println("Printing PowerBank Info using Inheritance");
		
		infoPower.ports = 2;
		System.out.println("Ports: " + infoPower.ports);
		
		infoPower.color = "Black";
		System.out.println("Color: " + infoPower.color);
		
		infoPower.fastCharging = true;
		System.out.println("Fast Charging: " + infoPower.fastCharging);
		
		infoPower.model = "PB200";
		System.out.println("Model: " + infoPower.model);
		
		System.out.println("-----------------------------------");
		
		infoPower.chargeDevice();      
		infoPower.showStatus();       
		infoPower.displayPowerDetails(); 
	}
}