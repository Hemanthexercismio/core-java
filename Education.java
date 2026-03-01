class Education{
	
		String type;
		int years;
		String institutionName;        
		double percentage;         
		String grade; 
		
		Education(String type,int years,String institutionName,double percentage,String grade)
        {
		this.type=type;
		this.years=years;
		this.institutionName=institutionName;
		this.percentage=percentage;
		this.grade=grade;
		}
		
	    void EducationDisplaying()
		{
		 System.out.println("type :"+type);
		 System.out.println("years :"+years);
		 System.out.println("institutionName:"+institutionName);
		 System.out.println("percentage :"+percentage);
		 System.out.println("grade:"+grade);

		}
	}
