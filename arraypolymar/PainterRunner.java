class PainterRunner{
	public static void main(String[] args){
		
		String[] name = {"Akasha","Shashank","Rahul","Naga","Abhi"};
		
	
	
		Paint paint1 = new Paint("Yellow",278.9);
		Paint paint2 = new Paint("SkyBlue",299.99);
		Paint paint3 = new Paint("Green",180.2);

		Paint[] paint = new Paint[3];
		paint[0] = paint1;
		paint[1] = paint2;
		paint[2] = paint3;
		
		
		
		Painter painter1 = new Painter(name,paint);
		painter1.display();
	}
}