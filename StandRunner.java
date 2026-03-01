class StandRunner{
	
	public static void main(String...things)
	{
		Stand s1=new Stand("Laptop Stand", "Aluminum", "Silver", 25.0, 30.0, 1.5, "Office", true,
		"Dell", 49.99, 2, "USA", "LS100", true, "Rectangular", "Matte", 10, "2022-05-10", true, "BestBuy");
		s1.display();
		System.out.println("....=====.....====....=====....");
		
		
		Stand s2  = new Stand("Mobile Stand", "Plastic", "Black", 15.0, 10.0, 0.3, "Home", false, "Samsung", 9.99, 1,
		 "India", "MS200", true, "Square", "Glossy", 2, "2021-11-20", true, "Reliance Digital");
		 s2.display();
		System.out.println("....=====.....====....=====....");
		 
		 
		Stand s3  = new Stand("TV Stand", "Wood", "Brown", 120.0, 150.0, 25.0, "Living Room", false, "Ikea", 199.99, 5,
		 "Sweden", "TVS300", false, "Rectangular", "Polished", 80, "2020-03-15", false, "Ikea");
		 s3.display();
		System.out.println("....=====.....====....=====....");
		 
		 
		Stand s4  = new Stand("Mic Stand", "Steel", "Black", 150.0, 40.0, 5.0, "Stage", true, "Shure", 89.99, 3, 
		"USA", "MCS400", true, "Round", "Matte", 15, "2022-07-01", true, "Amazon");
		s4.display();
		System.out.println("....=====.....====....=====....");
		

		Stand s5  = new Stand("Speaker Stand", "Iron", "Black", 100.0, 30.0, 8.0, "Concert", false,
		 "Bose", 129.99, 2, "Germany", "SP500", true, "Square", "Glossy", 25, "2021-09-12", true, "Flipkart");
		 s5.display();
		System.out.println("....=====.....====....=====....");
		 
		 
		Stand s6  = new Stand("Projector Stand", "Aluminum", "White", 90.0, 40.0, 6.0, "Office", true, "Epson", 79.99, 2,
		 "Japan", "PJ600", true, "Rectangular", "Matte", 20, "2022-01-05", true, "Croma");
		 s6.display();
		System.out.println("....=====.....====....=====....");
		 
		 
		Stand s7  = new Stand("Monitor Stand", "Plastic", "Grey", 20.0, 50.0, 2.0, "Office", false, "HP", 39.99, 1,
		 "USA", "MN700", true, "Rectangular", "Glossy", 15, "2021-06-18", true, "HP Store");
		 s7.display();
		System.out.println("....=====.....====....=====....");
		 
		 
		Stand s8  = new Stand("Camera Tripod", "Carbon Fiber", "Black", 160.0, 50.0, 3.0, "Photography", true, "Canon",
		 149.99, 3, "Japan", "CT800", true, "Triangular", "Matte", 10, "2022-02-22", true, "Canon Store");
		 s8.display();
		 
		Stand s9  = new Stand("Fan Stand", "Steel", "White", 120.0, 40.0, 7.0, "Home", false, "Usha", 59.99, 2, 
		"India", "FS900", false, "Round", "Glossy", 20, "2020-08-30", false, "Reliance Digital");
		s9.display();
		System.out.println("....=====.....====....=====....");
		

		Stand s10 = new Stand("Plant Stand", "Wood", "Brown", 60.0, 30.0, 4.0, "Garden", false, "Ikea", 29.99, 1, 
		"Sweden", "PL1000", false, "Square", "Polished", 10, "2021-04-25", true, "Ikea");
		s10.display();
		System.out.println("....=====.....====....=====....");
	

		Stand s11 = new Stand("Book Stand", "Plastic", "Blue", 25.0, 20.0, 1.0, "Study", true, "Oxford", 19.99, 1, 
		"UK", "BS1100", true, "Rectangular", "Matte", 5, "2022-03-14", true, "Amazon");
		s11.display();
		System.out.println("....=====.....====....=====....");
		

		Stand s12 = new Stand("Tablet Stand", "Aluminum", "Silver", 30.0, 25.0, 1.2, "Office", true,
		 "Apple", 59.99, 2, "USA", "TS1200", true, "Rectangular", "Glossy", 5, "2022-06-10", true, "Apple Store");
		 s12.display();
		System.out.println("....=====.....====....=====....");
		 
		 
		Stand s13 = new Stand("Music Stand", "Steel", "Black", 140.0, 40.0, 4.0, "Stage", true, "Yamaha", 69.99, 3, 
		"Japan", "MS1300", true, "Rectangular", "Matte", 10, "2021-12-01", true, "Yamaha Store");
		s13.display();
		System.out.println("....=====.....====....=====....");
		

		Stand s14 = new Stand("Bike Stand", "Iron", "Black", 50.0, 20.0, 6.0, "Garage", false, "Hero", 39.99, 2,
		 "India", "BS1400", false, "Rectangular", "Glossy", 50, "2020-05-05", false, "Hero Showroom");
		 s14.display();
		System.out.println("....=====.....====....=====....");
		 
		 
		Stand s15 = new Stand("Drum Stand", "Steel", "Black", 80.0, 40.0, 10.0, "Stage", false, "Pearl", 99.99, 3, 
		"USA", "DS1500", true, "Round", "Polished", 30, "2021-07-07", true, "Amazon");
		s15.display();
		System.out.println("....=====.....====....=====....");
		

		Stand s16 = new Stand("Keyboard Stand", "Aluminum", "Silver", 100.0, 50.0, 8.0, "Music", true, "Casio", 89.99, 2, "Japan",
		 "KS1600", true, "Rectangular", "Matte", 25, "2022-09-09", true, "Casio Store");
		 s16.display();
		System.out.println("....=====.....====....=====....");
		 
		 
		Stand s17 = new Stand("Printer Stand", "Plastic", "Grey", 40.0, 60.0, 5.0, "Office", false, "Canon", 49.99, 2, 
		"Japan", "PS1700", false, "Rectangular", "Glossy", 20, "2021-10-10", true, "Canon Store");
		s17.display();
		System.out.println("....=====.....====....=====....");
		

		Stand s18 = new Stand("Workstation Stand", "Steel", "Black", 150.0, 80.0, 20.0, "Office", false, "Lenovo",
		 299.99, 5, "China", "WS1800", true, "Rectangular", "Polished", 100, "2020-12-12", false, "Lenovo Store");
		 s18.display();
		System.out.println("....=====.....====....=====....");
		 
		 
		Stand s19 = new Stand("Exhibition Stand", "Aluminum", "White", 200.0, 100.0, 30.0, "Events", true, "ExpoPro", 399.99, 3,
		 "Germany", "ES1900", true, "Rectangular", "Glossy", 150, "2022-11-11", true, "ExpoPro");
		 s19.display();
		System.out.println("....=====.....====....=====....");
		 
		 
		Stand s20 = new Stand("Gaming Console Stand", "Plastic", "Black", 25.0, 40.0, 2.5, "Home", false, "Sony", 59.99, 2,
		 "Japan", "GS2000", true, "Rectangular", "Matte", 10, "2021-08-08", true, "Sony Store");
		 s20.display();
		System.out.println("....=====.....====....=====....");
		 
		
			}
		
}