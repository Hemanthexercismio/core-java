class Painter{
	
	String[] name;
	Paint[] paint;
	
	Painter(String[] name,Paint[] paint){
		this.name = name;
		this.paint = paint;
	}
	
	
	void display(){
		System.out.println("The exicuting the display method in painter.");
		
		
		if(this.name != null){
			System.out.println("The totle number of panters:" +this.name.length);
			for(String name:this.name){
				System.out.println("The painter name:"+name);
			}
		}else{
			System.out.println("The name is null.");
		}
		
		if(this.paint != null){
			System.out.println("The totle number of colors:" +this.paint.length);
			for(Paint paints:this.paint){
				paints.getPaint();
			}
			
		}else{
			System.out.println("The paint is null.");
		}
	}
	
}