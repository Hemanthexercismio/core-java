class ArrayLoop{
public static void main(String[] args)
{
	byte studentAge[]={21,22,19,23,20,35,22};
	for(int i=studentAge.length-1;i>=0;i--)
	System.out.println("StudentAge:"+studentAge[i]);
	
	short classroomNumbers[]={101,102,103,104,105,106};
	for(int j=classroomNumbers.length-1;j>=0;j--)
	System.out.println("ClassroomNumber:"+classroomNumbers[j]);
	
	int dailySteps[]={7000,6000,5000,8000,10000};
	for(int k=dailySteps.length-1;k>=0;k--)
	System.out.println("DailySteps:"+dailySteps[k]);
	
	long phoneNumbers[]={7865219076L,9045196721L,7290482614L,9865109328L,7975617913L};
	for(int a=phoneNumbers.length-1;a>=0;a--)
	System.out.println("PhoneNumber:"+phoneNumbers[a]);
	
	float temperature[]={28.5F,30F,29F,29.8F,27F,26F,26.9F,27.8F};
	for(int b=temperature.length-1;b>=0;b--)
	System.out.println("Temperature"+temperature[b]);
	
	double productPrices[]={4000.00,329.95,467.901,199.89,800.90,999.99};
	for(int c=productPrices.length-1;c>=0;c--)
	System.out.println("ProductPrice:"+productPrices[c]);

    char grade[]={'A','B','C','A','c','A','B'};
	for(int d=grade.length-1;d>=0;d--)
	System.out.println("Grade:"+grade[d]);
	
	boolean wonGame[]={true,false,false,true,true,false};
	for(int e=wonGame.length-1;e>=0;e--)
	System.out.println("WonGame:"+wonGame[e]);
	
	String shuttlePlayer[]={"Anand","Bob","Charan","Darshan","Harshith","Gurav","Jeevith"};
	for(int f=shuttlePlayer.length-1;f>=0;f--)
	System.out.println("ShuttlePlayer:"+shuttlePlayer[f]);

	String cities[]={"Benagluru","Mysuru","Chennai","Mangaluru","Hyderabad"};
	for(int g=cities.length-1;g>=0;g--)
	System.out.println("Cities:"+cities[g]);
	
}
}