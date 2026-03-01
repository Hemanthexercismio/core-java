class Office
{
	 String officeId;
     String officeName;            
     String city;                  
     String country;               
     double totalCapacity;            
     int currentEmployeeCount;     
     int totalMeetingRooms;        
     boolean wifiEnabled;          
     int establishedDate;   
     double rentAmount; 
	 
	 Office (String officeId,String officeName,String city,String country,double totalCapacity,int currentEmployeeCount,
	 int totalMeetingRooms,boolean wifiEnabled,int establishedDate,double rentAmount)
	 {
		this.officeId=officeId;
		this.officeName=officeName;
		this.city=city;
		this.country=country;
		this.totalCapacity=totalCapacity;
		this.currentEmployeeCount=currentEmployeeCount;
		this.totalMeetingRooms=totalMeetingRooms;
		this.wifiEnabled=wifiEnabled;
		this.establishedDate=establishedDate;
		this.rentAmount=rentAmount;
	 }
	 void ShowingData()
	 {
		 System.out.println("officeId :"+officeId);
		 System.out.println("officeName :"+officeName);
		 System.out.println("city:"+city);
		 System.out.println("country :"+country);
		 System.out.println("totalCapacity:"+totalCapacity);
		 System.out.println("currentEmployeeCount :"+currentEmployeeCount);
		 System.out.println("totalMeetingRooms :"+totalMeetingRooms);
		 System.out.println("wifiEnabled :"+wifiEnabled);
		 System.out.println("establishedDate :"+establishedDate);
	     System.out.println("rentAmount :"+rentAmount);
	 }
	 
}