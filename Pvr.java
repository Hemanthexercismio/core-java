class Pvr {

    String theatreName;
    String location;
    String city;
    int totalScreens;
    int totalSeats;
    boolean imaxAvailable;
    boolean reclinerSeats;
    String foodCourtName;
    double ticketPrice;
    String movieType;
    String ownerName;
    int establishedYear;
    String contactNumber;
    String email;
    boolean parkingAvailable;
    int numberOfEmployees;
    String website;
    String screenType;
    boolean onlineBooking;
    String branchCode;
	
	
	Pvr( String theatreName,String location,String city,int totalScreens,int totalSeats,boolean imaxAvailable,boolean reclinerSeats,
    String foodCourtName,double ticketPrice,String movieType,String ownerName,int establishedYear,String contactNumber,String email,
    boolean parkingAvailable,int numberOfEmployees,String website,String screenType,boolean onlineBooking,String branchCode)
	{
	this.theatreName=theatreName;
	this.location=location;
	this.city=city;
	this.totalScreens=totalScreens;
	this.totalSeats=totalSeats;
	this.imaxAvailable=imaxAvailable;
	this.reclinerSeats=reclinerSeats;
	this.foodCourtName=foodCourtName;
	this.ticketPrice=ticketPrice;
	this.movieType=movieType;
	this.ownerName=ownerName;
	this.establishedYear=establishedYear;
	this.contactNumber=contactNumber;
	this.email=email;
	this.parkingAvailable=parkingAvailable;
	this.numberOfEmployees=numberOfEmployees;
	this.website=website;
	this.screenType=screenType;
	this.onlineBooking=onlineBooking;
	this.branchCode=branchCode;
	}
		void monitor()
		{
			System.out.println("theatreName:"+theatreName);
			System.out.println("location:"+location);
			System.out.println("city:"+city);
			System.out.println("totalScreens:"+totalScreens);
			System.out.println("totalSeats:"+totalSeats);
			System.out.println("imaxAvailable:"+imaxAvailable);
			System.out.println("reclinerSeats:"+reclinerSeats);
			System.out.println("foodCourtName:"+foodCourtName);
			System.out.println("ticketPrice:"+ticketPrice);
			System.out.println("movieType:"+movieType);
			System.out.println("ownerName:"+ownerName);
			System.out.println("establishedYear:"+establishedYear);
			System.out.println("contactNumber:"+contactNumber);
			System.out.println("email:"+email);
			System.out.println("parkingAvailable:"+parkingAvailable);
			System.out.println("numberOfEmployees:"+numberOfEmployees);
			System.out.println("website:"+website);
			System.out.println("screenType:"+screenType);
			System.out.println("onlineBooking:"+onlineBooking);
			System.out.println("branchCode:"+branchCode);
			
			
			
			
		}
	}