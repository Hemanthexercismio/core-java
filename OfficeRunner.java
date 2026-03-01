class OfficeRunner{

	public static void main (String... args)
	{
	Office office1 = new Office("INFOSYS3432579","INFOSYS","BANGLORE","BHARATH",300000,3000,69,false,1988,500003456);
	office1.ShowingData();
	System.out.println("----------- END OF OFFICE 1 -----------");
	
	Office office2 = new Office("TCS9876543","TCS","MUMBAI","INDIA",200000,2500,50,true,1975,400000000);
	office2.ShowingData();
	System.out.println("*********** OFFICE 2 COMPLETED ***********");

	Office office3 = new Office("WIPRO1122334","WIPRO","HYDERABAD","INDIA",150000,1800,40,true,1945,300000000);
	office3.ShowingData();
	System.out.println("<<<<<<<<<< DATA OF OFFICE 3 >>>>>>>>>>");

	Office office4 = new Office("HCL5566778","HCL","NOIDA","INDIA",120000,1500,35,false,1976,250000000);
	office4.ShowingData();
	System.out.println("########## OFFICE 4 DETAILS ##########");

	Office office5 = new Office("TECHM7788990","TECHM","PUNE","INDIA",10000,1200,30,true,1986,200000000);
	office5.ShowingData();
	System.out.println("~~~~~~~~~~ OFFICE 5 FINISHED ~~~~~~~~~~");

	Office office6 = new Office("IBM1234567","IBM","DELHI","INDIA",250000,2200,60,true,1911,600000000);
	office6.ShowingData();
	System.out.println(">>>>>>>>> OFFICE 6 RECORD DISPLAYED <<<<<<<<<");

	Office office7 = new Office("ACC9988776","ACCENTURE","CHENNAI","INDIA",180000,2100,45,true,1989,350000000);
	office7.ShowingData();
	System.out.println("+++++++ END OF ACCENTURE DATA +++++++");
	
	Office office8 = new Office("CAPG4455667","CAPGEMINI","KOLKATA","INDIA",130000,1400,33,false,1967,220000000);
	office8.ShowingData();
	System.out.println("======= OFFICE 8 SUMMARY =======");

	Office office9 = new Office("DELL7766554","DELL","JAIPUR","		INDIA",90000,1000,20,true,1984,150000000);
	office9.ShowingData();
	System.out.println("~~~~~~ RECORD 9 CLOSED ~~~~~~");

	Office office10 = new Office("HP1122446","HP","AHMEDABAD","INDIA",85000,950,18,false,1939,140000000);
	office10.ShowingData();
	System.out.println("::: OFFICE 10 PROCESS DONE :::");

	Office office11 = new Office("ORC5544332","ORACLE","MYSOrE","INDIA",110000,1300,28,true,1977,210000000);
	office11.ShowingData();
	System.out.println("=== ORACLE DATA DISPLAYED ===");

	Office office12 = new Office("SAP9988112","SAP","COIMBATORE","INDIA",95000,900,25,true,1972,175000000);
	office12.ShowingData();
	System.out.println("*** SAP OFFICE INFO END ***");

	Office office13 = new Office("GOOG4433221","GOOGLE","GURGAON","INDIA",300000,5000,100,true,1998,900000000);
	office13.ShowingData();
	System.out.println("### GOOGLE OFFICE COMPLETED ###");

	Office office14 = new Office("META6677889","META","BANGLORE","INDIA",280000,4500,95,true,2004,850000000);
	office14.ShowingData();	
	System.out.println(">>> META DATA SUCCESSFULLY PRINTED <<<");

	Office office15 = new Office("AMZ1234432","AMAZON","HYDERABAD","INDIA",260000,4200,85,true,1994,800000000);
	office15.ShowingData();
	System.out.println("$$$ AMAZON OFFICE DATA CLOSED $$$");

	Office office16 = new Office("MSFT8899001","MICROSOFT","PUNE","INDIA",240000,3900,80,true,1975,750000000);
	office16.ShowingData();
	System.out.println("||| MICROSOFT RECORD COMPLETE |||");

	Office office17 = new Office("ADBE1122993","ADOBE","DELHI","INDIA",170000,2000,55,true,1982,320000000);
	office17.ShowingData();
	System.out.println("%%% ADOBE OFFICE DATA FINISHED %%%");

	Office office18 = new Office("INTL7766123","INTEL","MUMBAI","INDIA",190000,2300,65,true,1968,410000000);
	office18.ShowingData();
	System.out.println("+++ INTEL DETAILS PRINTED +++");

	Office office19 = new Office("CTS3344556","COGNIZANT","CHENNAI","INDIA",160000,1750,42,false,1994,280000000);
	office19.ShowingData();
	System.out.println("=== COGNIZANT OFFICE END ===");

	Office office20 = new Office("LT9988770","LTI","KOLKATA","INDIA",140000,1600,38,true,1997,260000000);
	office20.ShowingData();
	System.out.println("******** ALL OFFICE DATA DISPLAYED ********");
	}
}