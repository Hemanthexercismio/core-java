class UmbrellaRunner{
    public static void main(String... args){

        Umbrella umbrella1 = new Umbrella();
        System.out.println("Umbrella 1");
        System.out.println("Brand:"+umbrella1.brand);
        System.out.println("Price:"+umbrella1.price);
        System.out.println("Color:"+umbrella1.color);
        System.out.println("Foldable:"+umbrella1.foldable);
        System.out.println("Ribs:"+umbrella1.ribs);
		System.out.println("==========================");

        Umbrella umbrella2 = new Umbrella("Puma");
        System.out.println("Umbrella 2");
        System.out.println("Brand:"+umbrella2.brand);
        System.out.println("Price:"+umbrella2.price);
        System.out.println("Color:"+umbrella2.color);
        System.out.println("Foldable:"+umbrella2.foldable);
        System.out.println("Ribs:"+umbrella2.ribs);
		System.out.println("==========================");

        Umbrella umbrella3 = new Umbrella("Nike", 1200);
        System.out.println("Umbrella 3");
        System.out.println("Brand:"+umbrella3.brand);
        System.out.println("Price:"+umbrella3.price);
        System.out.println("Color:"+umbrella3.color);
        System.out.println("Foldable:"+umbrella3.foldable);
        System.out.println("Ribs:"+umbrella3.ribs);
		System.out.println("==========================");

        Umbrella umbrella4 = new Umbrella("VIP", 1500, "Black");
        System.out.println("Umbrella 4");
        System.out.println("Brand:"+umbrella4.brand);
        System.out.println("Price:"+umbrella4.price);
        System.out.println("Color:"+umbrella4.color);
        System.out.println("Foldable:"+umbrella4.foldable);
        System.out.println("Ribs:"+umbrella4.ribs);
		System.out.println("==========================");

        Umbrella umbrella5 = new Umbrella("Sky", 1800, "Blue", true);
        System.out.println("Umbrella 5");
        System.out.println("Brand:"+umbrella5.brand);
        System.out.println("Price:"+umbrella5.price);
        System.out.println("Color:"+umbrella5.color);
        System.out.println("Foldable:"+umbrella5.foldable);
        System.out.println("Ribs:"+umbrella5.ribs);
		System.out.println("==========================");

        Umbrella umbrella6 = new Umbrella("Royal", 2000, "Red", false, 10);
        System.out.println("Umbrella 6");
        System.out.println("Brand:"+umbrella6.brand);
        System.out.println("Price:"+umbrella6.price);
        System.out.println("Color:"+umbrella6.color);
        System.out.println("Foldable:"+umbrella6.foldable);
        System.out.println("Ribs:"+umbrella6.ribs);
		System.out.println("==========================");
    }
}