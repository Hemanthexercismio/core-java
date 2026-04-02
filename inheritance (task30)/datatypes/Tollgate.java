class Tollgate
{
	String location;
	int lines;
	int avgvehicles;
	boolean isaidetection;
	String managername;
	
	Tollgate(String location,int lines,int avgvehicles,boolean isaidetection,String managername)
	{
	this.location=location;
	this.lines=lines;
	this.avgvehicles=avgvehicles;
	this.isaidetection=isaidetection;
	this.managername=managername;
	}
	void toolGateinfo()
	{
		System.out.println("executing tollgateinfo method for info of tollgate");
		System.out.println("location of tollgate  :"+this.location);
		System.out.println("lines in Tollgate     :"+this.lines);
		System.out.println("average vehicles a day:"+this.avgvehicles);
		System.out.println("is there ai detection :"+this.isaidetection);
		System.out.println("name  of manager      :"+this.managername);
	}
	
}