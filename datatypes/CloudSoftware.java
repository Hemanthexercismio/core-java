class CloudSoftware
{
	String softwareName;
	String providerName;
	double monthlyCost;
	int numberOfUsers;
	boolean isAutoScaling;
	String region;
	
	CloudSoftware(String softwareName,String providerName,double monthlyCost,
	int numberOfUsers,boolean isAutoScaling,String region)
	{
		this.softwareName=softwareName;
		this.providerName=providerName;
		this.monthlyCost=monthlyCost;
		this.numberOfUsers=numberOfUsers;
		this.isAutoScaling=isAutoScaling;
		this.region=region;
	}
	
	void cloudSoftwareInfo()
	{
		System.out.println("executing cloudSoftwareInfo method");
		System.out.println("software name     :"+this.softwareName);
		System.out.println("provider name     :"+this.providerName);
		System.out.println("monthly cost      :"+this.monthlyCost);
		System.out.println("number of users   :"+this.numberOfUsers);
		System.out.println("auto scaling      :"+this.isAutoScaling);
		System.out.println("region            :"+this.region);
	}
}
