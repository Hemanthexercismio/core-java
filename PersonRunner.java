class PersonRunner{
	public static void main(String[] args){
		String[] name = {"Akasha","Shashank","Rahul"};
		String[] emails ={"akash@gmail.com","shashank@gmail.com","rhahul@gmail.com"}; 
		long[] mobileNumbers = {3205304530l,3645249752l,3472025343l};
	    String address = "bengaluru";
	   
	    Person.contactInfo(name,emails,mobileNumbers,address);
		System.out.println("");
		
		
		String dish = "Maggi";
		String[] ingredients = {"Noodles","Maggi masala","Water"};
		
		Person.foodDish(dish,ingredients);
		System.out.println("");
		
		
		String brand = "Apple";
		String modle = "iPad Pro";
		String[] ports = {"Usb","HDMI"};
		String[] countriesOfWarranty = {"India, USA, UK"};
		
		Person.laptop(brand,modle,ports,countriesOfWarranty);
		
		System.out.println("");
	}
}