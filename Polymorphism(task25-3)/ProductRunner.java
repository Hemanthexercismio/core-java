class ProductRunner
{
	public static void main(String[] args)
	{
	
		   Product[] products = new Product[137];
		    ProductStore productstore = new ProductStore(products);
		
		    Product product1 = new Product("santoorsoap","santoor","20-4-2026",300,ProductType.GROCERY,"Dmart",WarrantyYears.ONEYEAR,true,100,"INDIA");
		    productstore.store(product1);
		
		    Product product2 = new Product("goldwinner","gold","11-6-2026",150,ProductType.GROCERY,"flipkart",WarrantyYears.TWOYEARS,false,101,"CHINA");
 		    productstore.store(product2);
		
            Product product3 = new Product("aashirvaad atta","ITC","1-5-2026",450,ProductType.CLOTHING,"Reliance",WarrantyYears.ONEYEAR,false,103,"JAPAN");
			productstore.store(product3);

			Product product4 = new Product("tata salt","Tata","2-5-2026",25,ProductType.GROCERY,"Dmart",WarrantyYears.ONEYEAR,false,104,"BHUTAN");
			productstore.store(product4);

			Product product5 = new Product("bru coffee","HUL","3-5-2026",180,ProductType.GROCERY,"Flipkart",WarrantyYears.TWOYEARS,false,105,"INDIA");
			productstore.store(product5);

			Product product6 = new Product("goodday biscuit","Britannia","4-5-2026",30,ProductType.CLOTHING,"Dmart",WarrantyYears.ONEYEAR,false,106,"AMERICA");
			productstore.store(product6);

			Product product7 = new Product("maggi noodles","Nestle","5-5-2026",15,ProductType.GROCERY,"Reliance",WarrantyYears.TWOYEARS,false,999,"NEWZELAND");
			productstore.store(product7);

			Product product8 = new Product("parle g","Parle","6-5-2026",10,ProductType.GROCERY,"LocalShop",WarrantyYears.ONEYEAR,false,107,"INDIA");
			productstore.store(product8);

			Product product9 = new Product("surf excel","HUL","7-5-2026",220,ProductType.CLOTHING,"Amazon",WarrantyYears.THREEYEARS,false,108,"AMERICA");
			productstore.store(product9);

			Product product10 = new Product("vim bar","HUL","8-5-2026",35,ProductType.GROCERY,"Dmart",WarrantyYears.ONEYEAR,false,109,"SWIZERLAND");
			productstore.store(product10);

			Product product11 = new Product("colgate paste","Colgate","9-5-2026",95,ProductType.GROCERY,"Flipkart",WarrantyYears.TWOYEARS,false,110,"INDIA");
			productstore.store(product11);

			Product product12 = new Product("dettol soap","Reckitt","10-5-2026",40,ProductType.GROCERY,"Reliance",WarrantyYears.ONEYEAR,false,111,"INDIA");
			productstore.store(product12);

			Product product13 = new Product("lux soap","HUL","11-5-2026",38,ProductType.GROCERY,"LocalShop",WarrantyYears.ONEYEAR,false,112,"CHINA");
			productstore.store(product13);

			Product product14 = new Product("clinic plus","HUL","12-5-2026",210,ProductType.GROCERY,"Amazon",WarrantyYears.TWOYEARS,false,113,"INDIA");
			productstore.store(product14);

			Product product15 = new Product("head and shoulders","P&G","13-5-2026",320,ProductType.GROCERY,"Flipkart",WarrantyYears.THREEYEARS,false,114,"PAKISTHAN");
			productstore.store(product15);

			Product product16 = new Product("dabur honey","Dabur","14-5-2026",260,ProductType.GROCERY,"Dmart",WarrantyYears.FIVEYEARS,false,115,"INDIA");
			productstore.store(product16);

			Product product17 = new Product("fortune oil","Adani","15-5-2026",180,ProductType.GROCERY,"Reliance",WarrantyYears.TWOYEARS,false,116,"PAKISTHAN");
			productstore.store(product17);

			Product product18 = new Product("india gate rice","KRBL","16-5-2026",850,ProductType.GROCERY,"Amazon",WarrantyYears.THREEYEARS,false,117,"INDIA");
			productstore.store(product18);

			Product product19 = new Product("amul butter","Amul","17-5-2026",55,ProductType.GROCERY,"LocalShop",WarrantyYears.ONEYEAR,false,118,"INDIA");
			productstore.store(product19);

			Product product20 = new Product("amul milk","Amul","18-5-2026",30,ProductType.GROCERY,"Dmart",WarrantyYears.ONEYEAR,false,119,"INDIA");
			productstore.store(product20);

			Product product21 = new Product("britannia bread","Britannia","19-5-2026",45,ProductType.GROCERY,"Reliance",WarrantyYears.ONEYEAR,false,120,"INDIA");
			productstore.store(product21);

			Product product22 = new Product("tropicana juice","Pepsi","20-5-2026",110,ProductType.GROCERY,"Amazon",WarrantyYears.TWOYEARS,false,121,"PAKISTHAN");
			productstore.store(product22);

			Product product23 = new Product("red label tea","Tata","21-5-2026",240,ProductType.GROCERY,"Flipkart",WarrantyYears.THREEYEARS,false,122,"INDIA");
			productstore.store(product23);

			Product product24 = new Product("horlicks","HUL","22-5-2026",310,ProductType.GROCERY,"Dmart",WarrantyYears.FIVEYEARS,false,123,"INDIA");
			productstore.store(product24);

			Product product25 = new Product("boost","Nestle","23-5-2026",290,ProductType.GROCERY,"Reliance",WarrantyYears.THREEYEARS,false,124,"INDIA");
			productstore.store(product25);

			Product product26 = new Product("mtr rava","MTR","24-5-2026",75,ProductType.GROCERY,"LocalShop",WarrantyYears.ONEYEAR,false,125,"BHUTAN");
			productstore.store(product26);

			Product product27 = new Product("saffola oats","Marico","25-5-2026",160,ProductType.GROCERY,"Amazon",WarrantyYears.TWOYEARS,false,126,"INDIA");
			productstore.store(product27);

			Product product28 = new Product("sunfeast yippee","ITC","26-5-2026",20,ProductType.GROCERY,"Flipkart",WarrantyYears.ONEYEAR,false,127,"BANGLADESH");
			productstore.store(product28);

			Product product29 = new Product("tata sampann dal","Tata","27-5-2026",140,ProductType.GROCERY,"Dmart",WarrantyYears.TWOYEARS,false,128,"INDIA");
			productstore.store(product29);

			Product product30 = new Product("everest masala","Everest","28-5-2026",90,ProductType.GROCERY,"Reliance",WarrantyYears.THREEYEARS,false,129,"INDIA");
			productstore.store(product30);

			Product product31 = new Product("catch spices","Catch","29-5-2026",85,ProductType.GROCERY,"LocalShop",WarrantyYears.ONEYEAR,false,130,"AFGANISTHAN");
			productstore.store(product31);

			Product product32 = new Product("hajmola","Dabur","30-5-2026",35,ProductType.GROCERY,"Amazon",WarrantyYears.FIVEYEARS,false,131,"NETHERLAND");
			productstore.store(product32);
			
			System.out.println("#############################################################");
			
			
			Product[] Ref1 = new Product[15];
			
			ProductStore productstore1 = new ProductStore(Ref1);
			Ref1[0] = new Product("TV","lucknow","2-6-2026",79,ProductType.ELECTRONICS,"myntra",WarrantyYears.THREEYEARS,true,1234,"SHRILANKHA");
              productstore1.store(Ref1[0]);
			  
			  Ref1[1] = new Product("Mobile","Delhi","3-6-2026",25000,ProductType.ELECTRONICS,"Amazon",WarrantyYears.TWOYEARS,false,1235,"BANGLADESH");
			productstore1.store(Ref1[1]);

			Ref1[2] = new Product("Refrigerator","Mumbai","4-6-2026",32000,ProductType.ELECTRONICS,"Flipkart",WarrantyYears.FIVEYEARS,false,1236,"INDIA");
			productstore1.store(Ref1[2]);

			Ref1[3] = new Product("WashingMachine","Chennai","5-6-2026",28000,ProductType.ELECTRONICS,"Reliance",WarrantyYears.THREEYEARS,false,1237,"CHINA");
			productstore1.store(Ref1[3]);

			Ref1[4] = new Product("MixerGrinder","Bangalore","6-6-2026",4500,ProductType.ELECTRONICS,"Dmart",WarrantyYears.TWOYEARS,false,1238,"INDIA");
			productstore1.store(Ref1[4]);

			Ref1[5] = new Product("RiceBag","Hyderabad","7-6-2026",900,ProductType.GROCERY,"LocalShop",WarrantyYears.ONEYEAR,false,1239,"MAYAYSIA");
			productstore1.store(Ref1[5]);

			Ref1[6] = new Product("CookingOil","Pune","8-6-2026",180,ProductType.GROCERY,"Amazon",WarrantyYears.ONEYEAR,false,1240,"INDIA");
			productstore1.store(Ref1[6]);

			Ref1[7] = new Product("ToothBrush","Kolkata","9-6-2026",60,ProductType.GROCERY,"Flipkart",WarrantyYears.ONEYEAR,false,1241,"AMERICA");
			productstore1.store(Ref1[7]);

			Ref1[8] = new Product("TShirt","Surat","10-6-2026",799,ProductType.CLOTHING,"Myntra",WarrantyYears.ONEYEAR,false,1242,"INDIA");
			productstore1.store(Ref1[8]);

			Ref1[9] = new Product("Jeans","Jaipur","11-6-2026",1599,ProductType.CLOTHING,"Ajio",WarrantyYears.TWOYEARS,false,1243,"PATTAYA");
			productstore1.store(Ref1[9]);

			Ref1[10] = new Product("Bedsheet","Panipat","12-6-2026",999,ProductType.CLOTHING,"Amazon",WarrantyYears.ONEYEAR,false,1244,"INDIA");
			productstore1.store(Ref1[10]);

			Ref1[11] = new Product("Sofa","Noida","13-6-2026",25000,ProductType.FURNITURE,"Pepperfry",WarrantyYears.FIVEYEARS,false,1245,"BANKOCK");
			productstore1.store(Ref1[11]);

			Ref1[12] = new Product("StudyTable","Indore","14-6-2026",6500,ProductType.FURNITURE,"Flipkart",WarrantyYears.THREEYEARS,false,1246,"INDIA");
			productstore1.store(Ref1[12]);

			Ref1[13] = new Product("PlasticChair","Nagpur","15-6-2026",850,ProductType.FURNITURE,"LocalShop",WarrantyYears.TWOYEARS,false,1247,"NETHERLAND");
			productstore1.store(Ref1[13]);

			Ref1[14] = new Product("Cupboard","Coimbatore","16-6-2026",18000,ProductType.FURNITURE,"Amazon",WarrantyYears.FIVEYEARS,false,1248,"INDIA");
			productstore1.store(Ref1[14]);
			
			System.out.println("NOW EXECUTING SEARCHH OPERATION#######################################");
			
					boolean reference = productstore.search(105);
		         System.out.println("The item is found:"+reference);
		         System.out.println("##############################");
				 
				 
				 boolean reference1 = productstore.search("boost",124);
		         System.out.println("The item is found:"+reference1);
		         System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				 
				 
				 productstore.displayinfo();
				 System.out.println("display completed ####################################### ");
				 
				 productstore.getAllOriginCountry("CHINA");
				 
				 
				 productstore.getAllByWarrantyYears(WarrantyYears.TWOYEARS);
				 
				 productstore.getAllByType(ProductType.CLOTHING);
				 
				 
				 boolean reference2 = productstore.search("everest masala",129,"INDIA");
				 System.out.println("The item is found:"+reference2);
				 
				 

				 
				 
				 
				 

				 
				 
				 
			}
			}	
				   
					