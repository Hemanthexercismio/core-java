class Trophy {

    String trophyName;
    String material;
    String color;
    double weight;
    double height;
    String shape;
    String eventName;
    int year;
    String winnerName;
    String category;
    boolean engraved;
    double price;
    String manufacturer;
    String country;
    String designType;
    boolean customMade;
    String sponsorName;
    int quantity;
    String awardLevel;
    String finishType;
	
	Trophy(String trophyName, String material, String color, double weight,double height,
    String shape,String eventName,int year,String winnerName,String category,boolean engraved,double price,
    String manufacturer, String country, String designType,boolean customMade, String sponsorName, int quantity, String awardLevel,String finishType)
	{
	this.trophyName=trophyName;
	this.material=material;
	this.color=color;
	this.weight=weight;
	this.height=height;
	this.shape=shape;
	this.eventName=eventName;
	this.year=year;
	this.winnerName=winnerName;
	this.category=category;
	this.engraved=engraved;
	this.price=price;
	this.manufacturer=manufacturer;
	this.country=country;
	this.designType=designType;
	this.customMade=customMade;
	this.sponsorName=sponsorName;
	this.quantity=quantity;
	this.awardLevel=awardLevel;
	this.finishType=finishType;
	}
	
	void homePage()
	{
		System.out.println("trophyName:"+trophyName);
		System.out.println("material:"+material);
		System.out.println("color:"+color);
		System.out.println("weight:"+weight);
		System.out.println("height:"+height);
		System.out.println("shape:"+shape);
		System.out.println("eventName:"+eventName);
		System.out.println("year:"+year);
		System.out.println("winnerName:"+winnerName);
		System.out.println("category:"+category);
		System.out.println("engraved:"+engraved);
		System.out.println("price:"+price);
		System.out.println("manufacturer:"+manufacturer);
		System.out.println("country:"+country);
		System.out.println("designType:"+designType);
		System.out.println("customMade:"+customMade);
		System.out.println("sponsorName:"+sponsorName);
		System.out.println("quantity:"+quantity);
		System.out.println("awardLevel:"+awardLevel);
		System.out.println("finishType:"+finishType);
			
	}

}