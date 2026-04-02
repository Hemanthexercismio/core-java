class ClothRunner
{
	public static void main(String[] args)
	{
		Cloth[] cloths=new Cloth[5];
		
		ClothStore store=new ClothStore(cloths);
		
		Cloth cloth1=new Cloth("Nike","Tshirt",1200,"M",true);
		Cloth cloth2=new Cloth("Adidas","Trackpant",1800,"L",false);
		Cloth cloth3=new Cloth("Puma","Shorts",900,"S",true);
		Cloth cloth4=new Cloth("Zara","Shirt",2200,"XL",false);
		Cloth cloth5=new Cloth("Levis","Jeans",2500,"M",false);
		Cloth cloth6=new Cloth("H&M","Jacket",3000,"L",false);
		Cloth cloth7=new Cloth("AllenSolly","FormalShirt",2000,"M",true);
		Cloth cloth8=new Cloth("Roadster","Hoodie",1600,"S",false);
		Cloth cloth9=new Cloth("Wrangler","Denim",2700,"XL",false);
		
		store.save(cloth1);
		store.save(cloth2);
		store.save(cloth3);
		store.save(cloth4);
		store.save(cloth5);
		store.save(cloth6);
		store.save(cloth7);
		store.save(cloth8);
		store.save(cloth9);
		
	}
}