class Pumpkin
{
	PumpkinType pumpkinType;
	String color;
	Weight weight;
	
	Pumpkin(PumpkinType pumpkinType,String color,Weight weight)
	{
		this.pumpkinType=pumpkinType;
		this.color=color;
		this.weight=weight;
	}
	
	void getPumpkinInfo()
	{
		System.out.println("Pumpkin Type :"+this.pumpkinType);
		System.out.println("Color :"+this.color);
		
		if(this.weight!=null)
		{
			this.weight.getWeightInfo();
		}
		else
		{
			System.out.println("Weight cannot be null");
		}
	}
}