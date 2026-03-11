class AllRunner
{
	public static void main(String... args)
	{
		
		DMartType dt1 = DMartType.GROCERY;
		Products pr1 = new Products(100);
		DMart d1 = new DMart(dt1,"Bangalore",pr1);
		d1.getDMartInfo();

		DMartType dt2 = DMartType.ELECTRONICS;
		Products pr2 = new Products(200);
		DMart d2 = new DMart(dt2,"Hyderabad",pr2);
		d2.getDMartInfo();

		DMartType dt3 = DMartType.CLOTHES;
		Products pr3 = new Products(300);
		DMart d3 = new DMart(dt3,"Chennai",pr3);
		d3.getDMartInfo();

		DMartType dt4 = DMartType.FOOD;
		Products pr4 = new Products(400);
		DMart d4 = new DMart(dt4,"Mumbai",pr4);
		d4.getDMartInfo();




		FortType ft1 = FortType.HILL;
		Soldiers s1 = new Soldiers(50);
		Fort f1 = new Fort(ft1,"Chitradurga",s1);
		f1.getFortInfo();

		FortType ft2 = FortType.SEA;
		Soldiers s2 = new Soldiers(60);
		Fort f2 = new Fort(ft2,"Goa",s2);
		f2.getFortInfo();

		FortType ft3 = FortType.DESERT;
		Soldiers s3 = new Soldiers(70);
		Fort f3 = new Fort(ft3,"Rajasthan",s3);
		f3.getFortInfo();

		FortType ft4 = FortType.LAND;
		Soldiers s4 = new Soldiers(80);
		Fort f4 = new Fort(ft4,"Delhi",s4);
		f4.getFortInfo();




		PumpkinType put1 = PumpkinType.BIG;
		Weight w1 = new Weight(5);
		Pumpkin pu1 = new Pumpkin(put1,"Orange",w1);
		pu1.getPumpkinInfo();

		PumpkinType put2 = PumpkinType.SMALL;
		Weight w2 = new Weight(3);
		Pumpkin pu2 = new Pumpkin(put2,"Yellow",w2);
		pu2.getPumpkinInfo();

		PumpkinType put3 = PumpkinType.ROUND;
		Weight w3 = new Weight(4);
		Pumpkin pu3 = new Pumpkin(put3,"Green",w3);
		pu3.getPumpkinInfo();

		PumpkinType put4 = PumpkinType.SWEET;
		Weight w4 = new Weight(6);
		Pumpkin pu4 = new Pumpkin(put4,"Dark Orange",w4);
		pu4.getPumpkinInfo();

	}
}