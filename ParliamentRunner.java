class ParliamentRunner{
	
	public static void main (String... args)
	{
		
	
	ParliamentType parliamentType=ParliamentType.BICAMERAL;
	Members members=new Members(10);
	Parliament parliament=new Parliament(parliamentType,"karnataka",members);
	parliament.getparliamentinfo();
	
	ParliamentType parliamentType1=ParliamentType.RAJYASABHA;
	Members members1=new Members(20);
	Parliament parliament1=new Parliament(parliamentType1,"tamil nadu",members1);
	parliament1.getparliamentinfo();
	
	ParliamentType parliamentType2=ParliamentType.LOKHASABA;
	Members members2=new Members(29);
	Parliament parliament2=new Parliament(parliamentType2,"Andra",members2);
	parliament2.getparliamentinfo();
	
		ParliamentType parliamentType3=ParliamentType.LOKHASABA;
	Members members3=new Members(28);
	Parliament parliament3=new Parliament(parliamentType2,"Andra",members3);
	parliament3.getparliamentinfo();
	
	
	
	}
}