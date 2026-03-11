class Paint{
	String color;
	double price;
	
	Paint(String color,double price){
		this.color = color;
		this.price = price;
	}
	
	void getPaint(){
		System.out.println("The paint color:"+this.color);
		System.out.println("The paint price:"+this.price);
	}
}