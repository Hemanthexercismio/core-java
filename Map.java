class Map {
    String mapName;
    String country;
    String state;
    String city;
    String mapType;
    int scale;
    double area;
    boolean digital;
    String language;
    String publisher;
    int publishedYear;
    String continent;
    boolean satelliteView;
    String format;
    int numberOfPages;
    double price;
    String colorTheme;
    boolean gpsEnabled;
    String version;
    String createdBy;
	
	Map( String mapName,String country,String state,String city,String mapType,int scale,double area,boolean digital,
		String language,String publisher,int publishedYear,String continent,boolean satelliteView,String format,
		int numberOfPages,double price,String colorTheme, boolean gpsEnabled,String version,String createdBy)
	{
		this.mapName=mapName;
		this.country=country;
		this.state=state;
		this.city=city;
		this.mapType=mapType;
		this.scale=scale;
		this.area=area;
		this.digital=digital;
		this.language=language;
		this.publisher=publisher;
		this.publishedYear=publishedYear;
		this.continent=continent;
		this.satelliteView=satelliteView;
		this.format=format;
		this.numberOfPages=numberOfPages;
		this.price=price;
		this.colorTheme=colorTheme;
		this.gpsEnabled=gpsEnabled;
		this.version=version;
		this.createdBy=createdBy;
	}
		
		
		void dashBoard()
		{
			System.out.println("displaying info of map in dashBoard....");
			System.out.println("mapName:"+this.mapName);
			System.out.println("country:"+this.country);
			System.out.println("state:"+this.state);
			System.out.println("city:"+this.city);
			System.out.println("mapType:"+this.mapType);
			System.out.println("scale:"+this.scale);
			System.out.println("area:"+this.area);
			System.out.println("digital:"+this.digital);
			System.out.println("language:"+this.language);
			System.out.println("publisher:"+this.publisher);
			System.out.println("publishedYear:"+this.publishedYear);
			System.out.println("continent:"+this.continent);
			System.out.println("satelliteView:"+this.satelliteView);
			System.out.println("format:"+this.format);
			System.out.println("numberOfPages:"+this.numberOfPages);
			System.out.println("price:"+this.price);
			System.out.println("colorTheme:"+this.colorTheme);
			System.out.println("gpsEnabled:"+this.gpsEnabled);
			System.out.println("version:"+this.version);
			System.out.println("createdBy:"+this.createdBy);
						
		}
	
	}