class ArrayLoopIncrement{
public static void main(String[] args){
	long phoneNumbers[]={7865219076L,9045196721L,7290482614L,9865109328L,7975617913L};
	for(int a=0;a<phoneNumbers.length;a++)
	System.out.println("PhoneNumber:"+phoneNumbers[a]);

	char grade[]={'A','B','C','A','c','A','B'};
	for(int d=0;d<grade.length;d++)
	System.out.println("Grade:"+grade[d]);
	
	boolean wonGame[]={true,false,false,true,true,false};
	for(int e=0;e<wonGame.length;e++)
	System.out.println("WonGame:"+wonGame[e]);
	
	String shuttlePlayer[]={"Anand","Bob","Charan","Darshan","Harshith","Gurav","Jeevith"};
	for(int f=0;f<shuttlePlayer.length;f++)
	System.out.println("ShuttlePlayer:"+shuttlePlayer[f]);
	
	String cities[]={"Benagluru","Mysuru","Chennai","Mangaluru","Hyderabad"};
	for(int g=0;g<cities.length;g++)
	System.out.println("Cities:"+cities[g]);
	
	boolean powerStatus[]={true,false,true,true,false,true,false};
	for(int h=0;h<powerStatus.length;h++)
	System.out.println("PowerStatus:"+powerStatus[h]);
	
	double salaries[]={35000.00,42000.75,50000.00,45000.75,40000.50};
	for(int k=0;k<salaries.length;k++)
	System.out.println("Salaries:"+salaries[k]);
	
	int marks[]={85,90,91,95,99,93,92,88,84};
	for(int l=0;l<marks.length;l++)
	System.out.println("Marks:"+marks[l]);
	
	String fruits[]={"Apple","Mango","Orange","Papaya","Pineapple","Banana","Strawberry"};
	for(int m=0;m<fruits.length;m++)
	System.out.println("Fruits:"+fruits[m]);
	
	String mobileBrands[]={"Samsung","Apple","Realme","Vivo","Oppo","OnePlus","Xiaomi"};
	for(int n=0;n<mobileBrands.length;n++)
	System.out.println("MobileBrands:"+mobileBrands[n]);
}
}