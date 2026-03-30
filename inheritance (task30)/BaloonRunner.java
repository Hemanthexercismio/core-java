class BaloonRunner{
	public static void main(String[] args){
		
		Baloon baloon=new Baloon();
		System.out.println("Printing baloon Information ");
		
		baloon.color="black";
		System.out.println("Color:"+ baloon.color);
		
		baloon.price=39;
		System.out.println("Price:"+ baloon.price);
		
		baloon.ispremium=true;
		System.out.println("premimum or not :"+ baloon.ispremium);

	
		baloon.getThikness();
		baloon.saveAirPressure();
		
		System.out.println("---------------------------------");
		InfoBaloon infoBaloon=new InfoBaloon();
		System.out.println("Printing Clcok Information using Inheritance");
		

		
		infoBaloon.shape="round";
		System.out.println("shape:"+ infoBaloon.shape);
		
		infoBaloon.gasType="nitrogen";
		System.out.println("gasType:"+ infoBaloon.gasType);
		
		infoBaloon.quantity=30;
		System.out.println("quantity:"+ infoBaloon.quantity);
		
		infoBaloon.material="Rubber";
		System.out.println("material:"+ infoBaloon.material);		

		
		System.out.println("-----------------------------------");
		infoBaloon.getThikness();
		infoBaloon.saveAirPressure();
		infoBaloon.Products();
	
	}
	
}