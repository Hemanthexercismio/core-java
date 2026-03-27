class ProductStore
{
	Product[] products;
	int currentindex=0;
	
	ProductStore(Product[] products)
	{
		this.products=products;
	}
	
	
	void store(Product product)
	{
		System.out.println("executing store method in productstore ");
		  if(product!=null && this.products!=null )  
		{
			if(this.currentindex<=products.length)
			{
			System.out.println("value is stored  in index:"+this.currentindex);
			
			this.products[this.currentindex]=product;
			
			this.currentindex++;
			System.out.println("NEXT INDEX:"+this.currentindex);
			
			product.display();
			
			}
			else
			{
			System.out.println("product array is FULL");
			}
	}
	else{
		System.out.println("product or array is null");
	}
	}


void store(Product[]product)
{
	System.out.println("executing save in prodstore");
	if(product!=null && this.products!=null ){
		System.out.println("product and array are not mull");
		if(this.products.length<10)
		{
		for(Product produ:this.products)
			produ.display();
		}
	}
	else{
		System.out.println("the productnamearray is null");
	}
}


	
	
	boolean search(int id)
	{
		System.out.println("searching products using unique id "+id);
	   boolean found=false;
	   
	   if(this.products!=null )
	   {
		   System.out.println("array is not nullll");
		   
        for(Product produ:this.products)
		{
			System.out.println("Comparing with ID : "+produ.uniqueId);
	       if(products!=null)
			{
				if(produ.uniqueId==id)
				{
					found = true;
					System.out.println("product is found");
					break;
				}
			}	
		}	
			
	   }
		else{
			System.out.println("array is nullll");
			
			
		}
		return found;
	}
	
boolean search(String searchByName,int id)
	{
		System.out.println("searching products using unique id and name ");
	   boolean found=false;
	   
	   if(this.products!=null  && searchByName!=null)
	   {
		   System.out.println("array is not nullll");
		  
        for(Product produ:this.products)
		{
			System.out.println("Comparing with ID : "+produ.uniqueId);
			System.out.println("Comparing with name: "+produ.name);
			
	       if(products!=null)
			{
				if(produ.name == searchByName && produ.uniqueId==id  )
				{
					found = true;
					System.out.println("product is found");
					break;
				}
			}	
		}	
			
			
	   }
		else{
			System.out.println("array is nullll");
			
			
		}
		return found;
	}	
	
	
	boolean search(String searchByName,int id,String country)
	{
		System.out.println("searching products using unique id , name , country ");
	   boolean found=false;
	   
	   if(this.products!=null  && searchByName!=null && country!=null)
	   {
		   System.out.println("array is not nullll");
		   
        for(Product produ:this.products)
		{
			System.out.println("Comparing with ID : "+produ.uniqueId);
			System.out.println("Comparing with name: "+produ.name);
			System.out.println("Comparing with name: "+produ.originCountry);
			
	       if(products!=null)
			{
				if(produ.name == searchByName && produ.uniqueId==id && produ.originCountry==country )
				{
					found = true;
					System.out.println("product is found");
					break;
				}
			}	
		}	
			
	   }
		else{
			System.out.println("array is nullll");
			
			
		}
		return found;
	}	
	
	void displayinfo()
	{
		
		System.out.println("display method is executing inside clas product");
		if(this.products!=null)
		{
			for(Product produ:this.products)
			{
				if(produ!=null)
				{
					produ.display();
					
				}
			}
		}
		else{
			System.out.println("array is null ");
		}
	}
	
	void getAllOriginCountry(String originCountry)
	{
		System.out.println("getting all info of product by  origin country ");
		if(this.products!=null && originCountry!=null)
		{
			System.out.println("product arrays and counrtry are not null");
			for(Product produ:this.products)
			{
				if(produ!=null)
				{
				System.out.println("now comparing with country :"+produ.originCountry);
				{
					if(produ.originCountry == originCountry)
					{
						produ.display();
						break;
					}
				}
			}
			
		}
		
			}
	
	else{
			System.out.println("array is null");
	
	}
	}
	
	
	void getAllByWarrantyYears(WarrantyYears warrantyYears )
	{
		System.out.println("getting info by warranty years and warranty years is"+warrantyYears);
		
		if(this.products!=null && warrantyYears!=null)
		{
			System.out.println("product arrays and warranty are not null");
			for(Product produ:this.products)
			{
				if(produ!=null)
				{
				System.out.println("now comparing with country :"+produ.warrantyYears);
				{
					if(produ.warrantyYears == warrantyYears)
					{
						produ.display();
						currentindex++;
					}
				}
			}
		}
		
			
	}
	else{
			System.out.println("array is null");
	}
	}
	
	
	void getAllByType(ProductType productType  )
	{
		System.out.println("getting info by producttype "+productType);
		
		if(this.products!=null && productType!=null)
		{
			System.out.println("product arrays and ProductType are not null");
			for(Product produ:this.products)
			{
				if(produ!=null)
				{
				System.out.println("now comparing with productType :"+produ.productType);
				{
					if(produ.productType == productType)
					{
						produ.display();
						currentindex++;
					}
				}
			}
			
		}
		
			
	}
	else{
			System.out.println("array is null");
	}
	}
	
	
	
	
}
	

	

	