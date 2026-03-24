class CloudSoftwareStore
{
	CloudSoftware[] cloudSoftwares;
	int currentindex;
	
	CloudSoftwareStore(CloudSoftware[] cloudSoftwares)
	{
		this.cloudSoftwares=cloudSoftwares;
	}
	void save(CloudSoftware cloudSoftware)
	{
		System.out.println("saving CloudSoftwares info in CloudSoftwareStore");
		if(cloudSoftware!=null && this.cloudSoftwares!=null)
		{
			int index=this.cloudSoftwares.length-1;
			if(currentindex<=index)
			{
				this.cloudSoftwares[currentindex]=cloudSoftware;
				cloudSoftware.cloudSoftwareInfo();
				this.currentindex++;
			}
		}
	}
	
}