class CloudSoftwareRunner
{
	public static void main(String[] args)
	{
		CloudSoftware[] cloudSoftwares=new CloudSoftware[10];
		
		CloudSoftwareStore cloudSoftwareStore=new CloudSoftwareStore(cloudSoftwares);
		
		CloudSoftware cloudSoftware=new CloudSoftware("github","google",900000,999,false,"indian");
		CloudSoftware cloudSoftware2=new CloudSoftware("AWS EC2","Amazon",4500,120,true,"Mumbai");
		CloudSoftware cloudSoftware3=new CloudSoftware("Google Cloud Storage","Google",3800,95,true,"Delhi");
		CloudSoftware cloudSoftware4=new CloudSoftware("Microsoft Azure VM","Microsoft",5200,150,true,"Hyderabad");
		CloudSoftware cloudSoftware5=new CloudSoftware("Oracle Cloud","Oracle",4700,110,false,"Pune");
		CloudSoftware cloudSoftware6=new CloudSoftware("IBM Cloud","IBM",6000,180,true,"Chennai");
		CloudSoftware cloudSoftware7=new CloudSoftware("Heroku Platform","Salesforce",3000,75,true,"Kolkata");
		CloudSoftware cloudSoftware8=new CloudSoftware("Alibaba Cloud ECS","Alibaba",4100,105,false,"Singapore");
		CloudSoftware cloudSoftware9=new CloudSoftware("Tencent Cloud","Tencent",3900,100,false,"HongKong");
		CloudSoftware cloudSoftware10=new CloudSoftware("VMware Cloud","VMware",7000,230,false,"California");
		cloudSoftwareStore.save(cloudSoftware);
		cloudSoftwareStore.save(cloudSoftware2);
		cloudSoftwareStore.save(cloudSoftware3);
		cloudSoftwareStore.save(cloudSoftware4);
		cloudSoftwareStore.save(cloudSoftware5);
		cloudSoftwareStore.save(cloudSoftware6);
		cloudSoftwareStore.save(cloudSoftware7);
		cloudSoftwareStore.save(cloudSoftware8);
		cloudSoftwareStore.save(cloudSoftware9);
		cloudSoftwareStore.save(cloudSoftware10);
}
}