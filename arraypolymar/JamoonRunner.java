class JamoonRunner{
	public static void main(String[] args){
		
		String[] name = {"krishna","Shashank","Rahul","Naga","benakesh"};
		
	
	
		Jamoon jamoon1 = new Jamoon(89,"flour");
		Jamoon jamoon2 = new Jamoon(80,"weet");
		Jamoon jamoon3 = new Jamoon(45,"ragi");

		Jamoon[] jamoon = new Jamoon[3];
		jamoon[0] = jamoon1;
		jamoon[1] = jamoon2;
		jamoon[2] = jamoon3;
		
		Ingredient ingredient = new Ingredient(name, jamoon);
		ingredient.Displying();
}
}