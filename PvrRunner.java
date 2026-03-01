class PvrRunner{
	
	public static void main(String...things)
	{
		Pvr p1  = new Pvr("PVR Koramangala", "Koramangala", "Bengaluru", 8, 1200, true, true, "Food Street",
		350.0, "3D", "Ajay Bijli", 2005, "080-12345678", "koramangala@pvr.com", true, 150, "www.pvrkoramangala.com",
		"IMAX", true, "BLR001");
		p1.monitor();
		
		
		Pvr p2  = new Pvr("PVR Phoenix Marketcity", "Whitefield", "Bengaluru", 12, 2000, true, true, "Phoenix Food Court", 400.0, "IMAX",
		 "Ajay Bijli", 2010, "080-87654321", "phoenix@pvr.com", true, 200, "www.pvrphoenix.com", "Dolby Atmos", true, "BLR002");
		 p2.monitor();
		 
		Pvr p3  = new Pvr("PVR Forum Mall", "Koramangala", "Bengaluru", 6, 900, false, true, "Forum Food Court", 300.0, "2D", 
		"Ajay Bijli", 2003, "080-11223344", "forum@pvr.com", true, 120, "www.pvrforum.com", "Standard", true, "BLR003");
		p3.monitor();

		Pvr p4  = new Pvr("PVR Orion Mall", "Rajajinagar", "Bengaluru", 10, 1500, true, true, "Orion Food Court", 380.0, "3D", 
		"Ajay Bijli", 2012, "080-55667788", "orion@pvr.com", true, 180, "www.pvrorion.com", "IMAX", true, "BLR004");
		p4.monitor();

		Pvr p5  = new Pvr("PVR Vega City", "Bannerghatta Road", "Bengaluru", 9, 1300, true, false, "Vega Food Court", 320.0, "2D", 
		"Ajay Bijli", 2017, "080-99887766", "vega@pvr.com", true, 160, "www.pvrvega.com", "Dolby Atmos", true, "BLR005");
		p5.monitor();


		Pvr p6  = new Pvr("PVR Lulu Mall", "Edappally", "Kochi", 7, 1100, true, true, "Lulu Food Court", 280.0, "3D", "Ajay Bijli",
		 2015, "0484-1234567", "lulu@pvr.com", true, 140, "www.pvrlulu.com", "Standard", true, "KOCH001");
		 p6.monitor();
		 
		Pvr p7  = new Pvr("PVR Express Avenue", "Mount Road", "Chennai", 10, 1600, true, true, "EA Food Court", 350.0, "IMAX",
		 "Ajay Bijli", 2011, "044-7654321", "ea@pvr.com", true, 190, "www.pvrexpress.com", "Dolby Atmos", true, "CHE001");
		 p7.monitor();
		 
		Pvr p8  = new Pvr("PVR Inorbit Mall", "Madhapur", "Hyderabad", 8, 1200, true, false, "Inorbit Food Court", 300.0, "2D", 
		"Ajay Bijli", 2014, "040-1234567", "inorbit@pvr.com", true, 150, "www.pvrinorbit.com", "Standard", true, "HYD001");
		p8.monitor();

		Pvr p9  = new Pvr("PVR Ambience Mall", "Gurgaon", "Delhi NCR", 12, 2200, true, true, "Ambience Food Court", 450.0, "IMAX", 
		"Ajay Bijli", 2008, "011-9876543", "ambience@pvr.com", true, 210, "www.pvrambience.com", "Dolby Atmos", true, "DEL001");
		p9.monitor();
		
		
		Pvr p10 = new Pvr("PVR Select Citywalk", "Saket", "Delhi", 9, 1400, true, true, "SCW Food Court", 370.0, "3D", "Ajay Bijli",
		 2007, "011-22334455", "scw@pvr.com", true, 170, "www.pvrscw.com", "IMAX", true, "DEL002");
		 p10.monitor();
		 
		Pvr p11 = new Pvr("PVR Infinity Mall", "Malad", "Mumbai", 8, 1300, true, true, "Infinity Food Court", 360.0, "3D", "Ajay Bijli",
		 2009, "022-33445566", "infinity@pvr.com", true, 160, "www.pvrinfinity.com", "Dolby Atmos", true, "MUM001");
		 p11.monitor();
		 
		Pvr p12 = new Pvr("PVR Oberoi Mall", "Goregaon", "Mumbai", 10, 1700, true, true, "Oberoi Food Court", 400.0, "IMAX", "Ajay Bijli",
		 2013, "022-44556677", "oberoi@pvr.com", true, 200, "www.pvroberoi.com", "Dolby Atmos", true, "MUM002");
		 p12.monitor();
		 
		Pvr p13 = new Pvr("PVR Acropolis Mall", "Kasba", "Kolkata", 7, 1000, false, true, "Acropolis Food Court", 280.0, "2D", "Ajay Bijli",
		 2016, "033-55667788", "acropolis@pvr.com", true, 130, "www.pvracropolis.com", "Standard", true, "KOL001");
		 p13.monitor();
		 
		Pvr p14 = new Pvr("PVR Mani Square", "Kankurgachi", "Kolkata", 9, 1400, true, true, "Mani Food Court", 330.0, "3D", "Ajay Bijli", 
		2010, "033-66778899", "mani@pvr.com", true, 160, "www.pvrmani.com", "Dolby Atmos", true, "KOL002");
		p14.monitor();
		
		Pvr p15 = new Pvr("PVR Treasure Island", "MG Road", "Indore", 6, 900, false, true, "TI Food Court", 250.0, "2D", "Ajay Bijli",
		 2018, "0731-123456", "ti@pvr.com", true, 110, "www.pvrti.com", "Standard", true, "IND001");
		 p15.monitor();
		 
		Pvr p16 = new Pvr("PVR Central Mall", "JP Nagar", "Bengaluru", 5, 800, false, false, "Central Food Court", 220.0, "2D", "Ajay Bijli",
		 2019, "080-33445566", "central@pvr.com", true, 100, "www.pvrcentral.com", "Standard", true, "BLR006");
		 p16.monitor();
		 
		Pvr p17 = new Pvr("PVR Grand Mall", "Velachery", "Chennai", 7, 1100, true, true, "Grand Food Court", 310.0, "3D", "Ajay Bijli",
		 2015, "044-55667788", "grand@pvr.com", true, 140, "www.pvrgrand.com", "Dolby Atmos", true, "CHE002");
		 p17.monitor();
		 
		Pvr p18 = new Pvr("PVR City Centre", "Salt Lake", "Kolkata", 8, 1200, true, false, "City Food Court", 290.0, "2D", "Ajay Bijli",
		 2012, "033-77889900", "city@pvr.com", true, 150, "www.pvrcity.com", "Standard", true, "KOL003");
		 p18.monitor();
		 
		Pvr p19 = new Pvr("PVR Galaxy Mall", "Hinjewadi", "Pune", 9, 1400, true, true, "Galaxy Food Court", 340.0, "3D", "Ajay Bijli",
		 2017, "020-1234567", "galaxy@pvr.com", true, 160, "www.pvrgalaxy.com", "Dolby Atmos", true, "PUN001");
		 p19.monitor();
		 
		Pvr p20 = new Pvr("PVR Seasons Mall", "Magarpatta", "Pune", 10, 1600, true, true, "Seasons Food Court", 360.0, "IMAX", "Ajay Bijli",
		 2014, "020-7654321", "seasons@pvr.com", true, 180, "www.pvrseasons.com", "IMAX", true, "PUN002");
		 p20.monitor();

				
		
		
	}
	
	
	
	
	
	
	
	
}