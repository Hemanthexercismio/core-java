class ClothRunner
{
	public static void main(String[] args)
	{
		Cloth[] cloths=new Cloth[5];
		
		ClothStore store=new ClothStore(cloths);
		
		Cloth c1=new Cloth("Nike","Tshirt",1200,"M",true);
		Cloth c2=new Cloth("Adidas","Trackpant",1800,"L",false);
		Cloth c3=new Cloth("Puma","Shorts",900,"S",true);
		Cloth c4=new Cloth("Zara","Shirt",2200,"XL",false);
		Cloth c5=new Cloth("Levis","Jeans",2500,"M",false);
		Cloth c6=new Cloth("H&M","Jacket",3000,"L",false);
		Cloth c7=new Cloth("AllenSolly","FormalShirt",2000,"M",true);
		Cloth c8=new Cloth("Roadster","Hoodie",1600,"S",false);
		Cloth c9=new Cloth("Wrangler","Denim",2700,"XL",false);
		
		store.save(c1);
		store.save(c2);
		store.save(c3);
		store.save(c4);
		store.save(c5);
		store.save(c6);
		store.save(c7);
		store.save(c8);
		store.save(c9);
		
	}
}