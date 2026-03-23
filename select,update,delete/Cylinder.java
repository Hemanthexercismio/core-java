class Cylinder {
	
	String[] types;
	int currenctIndex = 0;

	Cylinder(String[] types)
	{
		this.types = types;
	}

	void save(String type)
	{
		System.out.println("executing createin Cylinder:");
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
		System.out.println("executing search in Cylinder");

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
						System.out.println("cylinder name:" + type);
						return true;
					}
				}
			}
		}
		return false;
	}

	boolean delet(String value)
	{
		System.out.println("executing delete operation in Cylinder using string value");
		System.out.println("value:"+value);
		if(value!=null){
			for(int i=0;i<=this.types.length-1;i++){
				if(this.types[i]!=null && this.types[i].equals(value)){
					this.types[i]=null;
					return true;
				}
			}
		}
		return false;
	}
}