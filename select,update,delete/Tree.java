class Tree {
	
	String[] types;
	int currenctIndex = 0;

	Tree(String[] types)
	{
		this.types = types;
	}

	void save(String type)
	{
		System.out.println("executing createin Tree:");
		System.out.println("type:" + type);

		if(this.types != null)
		{
			System.out.println("checking to store");
			int typesIndex = this.types.length - 1;

			if(this.currenctIndex <= typesIndex)
			{
				System.out.println("storing in index:" + this.currenctIndex);
				this.types[this.currenctIndex] = type;
				this.currenctIndex++;
				System.out.println("Storing in next index:" + this.currenctIndex);
			}
			else{
				System.out.println("array is full cannot store more types");
			}
		}
		else{
			System.out.println("types are not inital with array");
		}
	}

	boolean search(String type)
	{
		System.out.println("executing search in Tree");

		if(type != null)
		{
			System.out.println("name is not null");

			if(this.types != null)
			{
				for(String turbo : this.types)
				{
					System.out.println("comparing with types:" + turbo);

					if(turbo !=null && turbo.equals(type))
					{
						System.out.println("treename:" + type);
						return true;
					}
				}
			}
		}

		return false;
	}
	
	boolean update(int index, String name)
	{
		System.out.println("executing update in Tree index and string");
		System.out.println("index:"+index);
		System.out.println("name:"+name);
		
		if(name!=null)
		{
			System.out.println("name is not null u can update");
			
			if(types!=null)
			{
				System.out.println("array is existed");
				
				if(index>=0 && index<=this.types.length-1)
				{
					this.types[index]=name;
					System.out.println("name is updated");
					return true;
				}
				else{
					System.out.println("Invalid index");
				}
				
			}else
			{
				System.out.println("not found array");
			}
			
		}else{
			System.out.println("name is null");
		}
		
		return false;
	}
		
		
	boolean  updates(String oldName, String newName)
	{
		System.out.println("executing update in Tree by old name to new name ");
		if(oldName!=null)
		{
			System.out.println("old name is not null u can update");
				if(newName!=null)
				{
					System.out.println("new name is not null u can update new name");
					
					System.out.println("oldName:"+oldName);
					System.out.println("newName:"+newName);
					for(int i=0;i<=this.types.length-1;i++){
						
						if(this.types[i]!=null && this.types[i].equals(oldName)){
							
							this.types[i]=newName;
							
							return true;
						}
						
					}

				}
		}
		return false;
	}
	
	boolean delet (int dltvalue)
	{
		System.out.println("executing delete operation in Tree using index");
		System.out.println("dltvalue:"+dltvalue);
		if(dltvalue!=0){
			System.out.println("deleting currenctIndex");
				for(int index=0; index<=this.types.length-1;index++){
						if(index== dltvalue){
							this.types[index] = null;
							return true;
						}
				}
					
		}
		return false ;
	}
	
	boolean delet (String value)
	{
		System.out.println("executing delete operation in Tree using string value");
		System.out.println("value:"+value);
		if(value!=null){
			System.out.println("deleting currenctIndex");
			for(int i=0; i<=this.types.length-1;i++){
				
				if(this.types[i]!=null && this.types[i].equals(value)){
					this.types[i]=null;
					
					return true;
				}
			}
		}
		
		return false;
	}
}