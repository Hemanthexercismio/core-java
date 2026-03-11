class CapainterRunner{
	public static void main(String[] args){
		
		String[] name = {"krishna","Shashank","Rahul","Naga","benakesh"};
		
	
	
		Carpainter carpainter1 = new Carpainter(600,"vinay");
		Carpainter carpainter2 = new Carpainter(500,"akash");
		Carpainter carpainter3 = new Carpainter(800,"naga");

		Carpainter[] carpainter = new Carpainter[3];
		carpainter[0] = carpainter1;
		carpainter[1] = carpainter2;
		carpainter[2] = carpainter3;
		
		
		
		Carpainting carpainte = new Carpainting(name,carpainter);
		carpainte.Display();
	}
}